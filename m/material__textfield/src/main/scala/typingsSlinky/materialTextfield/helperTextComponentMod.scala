package typingsSlinky.materialTextfield

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialTextfield.helperTextFoundationMod.MDCTextFieldHelperTextFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperTextComponentMod {
  
  @JSImport("@material/textfield/helper-text/component", "MDCTextFieldHelperText")
  @js.native
  class MDCTextFieldHelperText protected () extends MDCComponent[MDCTextFieldHelperTextFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCTextFieldHelperTextFoundation, args: js.Any*) = this()
    
    def foundationForTextField: MDCTextFieldHelperTextFoundation = js.native
  }
  /* static members */
  object MDCTextFieldHelperText {
    
    @JSImport("@material/textfield/helper-text/component", "MDCTextFieldHelperText.attachTo")
    @js.native
    def attachTo(root: Element): MDCTextFieldHelperText = js.native
  }
  
  type MDCTextFieldHelperTextFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCTextFieldHelperTextFoundation], 
    MDCTextFieldHelperText
  ]
}
