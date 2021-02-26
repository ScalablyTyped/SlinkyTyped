package typingsSlinky.materialBase

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/base", "MDCComponent")
  @js.native
  class MDCComponent[FoundationType /* <: typingsSlinky.materialBase.foundationMod.MDCFoundation[js.Object] */] protected ()
    extends typingsSlinky.materialBase.componentMod.MDCComponent[FoundationType] {
    def this(root: Element, foundation: FoundationType, args: js.Any*) = this()
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
  }
  /* static members */
  object MDCComponent {
    
    @JSImport("@material/base", "MDCComponent.attachTo")
    @js.native
    def attachTo(root: Element): typingsSlinky.materialBase.componentMod.MDCComponent[typingsSlinky.materialBase.foundationMod.MDCFoundation[js.Object]] = js.native
  }
  
  @JSImport("@material/base", "MDCFoundation")
  @js.native
  class MDCFoundation[AdapterType /* <: js.Object */] ()
    extends typingsSlinky.materialBase.foundationMod.MDCFoundation[AdapterType] {
    def this(adapter: AdapterType) = this()
  }
}
