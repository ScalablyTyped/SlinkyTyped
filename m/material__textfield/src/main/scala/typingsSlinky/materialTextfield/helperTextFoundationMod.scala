package typingsSlinky.materialTextfield

import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialTextfield.anon.ARIAHIDDEN
import typingsSlinky.materialTextfield.anon.HELPERTEXTPERSISTENT
import typingsSlinky.materialTextfield.anon.PartialMDCTextFieldHelper
import typingsSlinky.materialTextfield.helperTextAdapterMod.MDCTextFieldHelperTextAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/textfield/helper-text/foundation", JSImport.Namespace)
@js.native
object helperTextFoundationMod extends js.Object {
  
  @js.native
  class MDCTextFieldHelperTextFoundation () extends MDCFoundation[MDCTextFieldHelperTextAdapter] {
    def this(adapter: PartialMDCTextFieldHelper) = this()
    
    /**
      * Sets the content of the helper text field.
      */
    def setContent(content: String): Unit = js.native
    
    /**
      * @param isPersistent Sets the persistency of the helper text.
      */
    def setPersistent(isPersistent: Boolean): Unit = js.native
    
    /**
      * @param isValidation True to make the helper text act as an error validation message.
      */
    def setValidation(isValidation: Boolean): Unit = js.native
    
    /**
      * Sets the validity of the helper text based on the input validity.
      */
    def setValidity(inputIsValid: Boolean): Unit = js.native
    
    /**
      * Makes the helper text visible to the screen reader.
      */
    def showToScreenReader(): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCTextFieldHelperTextFoundation extends js.Object {
    
    def cssClasses: HELPERTEXTPERSISTENT = js.native
    
    /**
      * See {@link MDCTextFieldHelperTextAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCTextFieldHelperTextAdapter = js.native
    
    def strings: ARIAHIDDEN = js.native
  }
  
  @js.native
  class default () extends MDCTextFieldHelperTextFoundation {
    def this(adapter: PartialMDCTextFieldHelper) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def cssClasses: HELPERTEXTPERSISTENT = js.native
    
    /**
      * See {@link MDCTextFieldHelperTextAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCTextFieldHelperTextAdapter = js.native
    
    def strings: ARIAHIDDEN = js.native
  }
}
