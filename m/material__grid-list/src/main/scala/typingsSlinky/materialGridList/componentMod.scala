package typingsSlinky.materialGridList

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialGridList.foundationMod.MDCGridListFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/grid-list/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  
  @js.native
  class MDCGridList () extends MDCComponent[MDCGridListFoundation]
  /* static members */
  @js.native
  object MDCGridList extends js.Object {
    
    def attachTo(root: Element): MDCGridList = js.native
  }
}
