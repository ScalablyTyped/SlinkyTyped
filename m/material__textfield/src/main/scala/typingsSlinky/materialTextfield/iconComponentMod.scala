package typingsSlinky.materialTextfield

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialTextfield.iconFoundationMod.MDCTextFieldIconFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/textfield/icon/component", JSImport.Namespace)
@js.native
object iconComponentMod extends js.Object {
  
  @js.native
  class MDCTextFieldIcon () extends MDCComponent[MDCTextFieldIconFoundation] {
    
    def foundationForTextField: MDCTextFieldIconFoundation = js.native
  }
  /* static members */
  @js.native
  object MDCTextFieldIcon extends js.Object {
    
    def attachTo(root: Element): MDCTextFieldIcon = js.native
  }
  
  type MDCTextFieldIconFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCTextFieldIconFoundation], 
    MDCTextFieldIcon
  ]
}
