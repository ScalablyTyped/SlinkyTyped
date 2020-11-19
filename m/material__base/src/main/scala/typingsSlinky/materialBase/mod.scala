package typingsSlinky.materialBase

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/base", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class MDCComponent[FoundationType /* <: typingsSlinky.materialBase.foundationMod.MDCFoundation[js.Object] */] protected ()
    extends typingsSlinky.materialBase.componentMod.MDCComponent[FoundationType] {
    def this(root: Element, foundation: FoundationType, args: js.Any*) = this()
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
  }
  /* static members */
  @js.native
  object MDCComponent extends js.Object {
    
    def attachTo(root: Element): typingsSlinky.materialBase.componentMod.MDCComponent[typingsSlinky.materialBase.foundationMod.MDCFoundation[js.Object]] = js.native
  }
  
  @js.native
  class MDCFoundation[AdapterType /* <: js.Object */] ()
    extends typingsSlinky.materialBase.foundationMod.MDCFoundation[AdapterType] {
    def this(adapter: AdapterType) = this()
  }
  /* static members */
  @js.native
  object MDCFoundation extends js.Object {
    
    def cssClasses: StringDictionary[String] = js.native
    
    def defaultAdapter: js.Object = js.native
    
    def numbers: StringDictionary[Double] = js.native
    
    def strings: StringDictionary[String] = js.native
  }
}
