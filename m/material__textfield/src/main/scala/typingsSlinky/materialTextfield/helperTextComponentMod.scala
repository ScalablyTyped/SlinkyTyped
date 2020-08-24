package typingsSlinky.materialTextfield

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialTextfield.helperTextFoundationMod.MDCTextFieldHelperTextFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/textfield/helper-text/component", JSImport.Namespace)
@js.native
object helperTextComponentMod extends js.Object {
  @js.native
  class MDCTextFieldHelperText () extends MDCComponent[MDCTextFieldHelperTextFoundation] {
    def foundationForTextField: MDCTextFieldHelperTextFoundation = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldHelperText extends js.Object {
    def attachTo(root: Element): MDCTextFieldHelperText = js.native
  }
  
  type MDCTextFieldHelperTextFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCTextFieldHelperTextFoundation], 
    MDCTextFieldHelperText
  ]
}

