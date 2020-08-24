package typingsSlinky.materialSelect

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialSelect.iconFoundationMod.MDCSelectIconFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/select/icon/component", JSImport.Namespace)
@js.native
object iconComponentMod extends js.Object {
  @js.native
  class MDCSelectIcon () extends MDCComponent[MDCSelectIconFoundation] {
    def foundationForSelect: MDCSelectIconFoundation = js.native
  }
  
  /* static members */
  @js.native
  object MDCSelectIcon extends js.Object {
    def attachTo(root: Element): MDCSelectIcon = js.native
  }
  
  type MDCSelectIconFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCSelectIconFoundation], 
    MDCSelectIcon
  ]
}

