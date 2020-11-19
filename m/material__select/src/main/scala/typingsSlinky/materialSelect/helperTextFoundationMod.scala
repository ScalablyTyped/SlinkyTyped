package typingsSlinky.materialSelect

import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialSelect.anon.ARIAHIDDEN
import typingsSlinky.materialSelect.anon.HELPERTEXTVALIDATIONMSG
import typingsSlinky.materialSelect.anon.PartialMDCSelectHelperTex
import typingsSlinky.materialSelect.helperTextAdapterMod.MDCSelectHelperTextAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/select/helper-text/foundation", JSImport.Namespace)
@js.native
object helperTextFoundationMod extends js.Object {
  
  @js.native
  class MDCSelectHelperTextFoundation () extends MDCFoundation[MDCSelectHelperTextAdapter] {
    def this(adapter: PartialMDCSelectHelperTex) = this()
    
    /**
      * Sets the content of the helper text field.
      */
    def setContent(content: String): Unit = js.native
    
    /**
      * Sets the helper text to act as a validation message.
      * By default, validation messages are hidden when the select is valid and
      * visible when the select is invalid.
      *
      * @param isValidation True to make the helper text act as an error validation
      *     message.
      */
    def setValidation(isValidation: Boolean): Unit = js.native
    
    /**
      * Sets the persistency of the validation helper text.
      * This keeps the validation message visible even if the select is valid,
      * though it will be displayed in the normal (grey) color.
      */
    def setValidationMsgPersistent(isPersistent: Boolean): Unit = js.native
    
    /**
      * When acting as a validation message, shows/hides the helper text and
      * triggers alerts as necessary based on the select's validity.
      */
    def setValidity(selectIsValid: Boolean): Unit = js.native
    
    /**
      * Makes the helper text visible to screen readers.
      */
    def showToScreenReader(): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCSelectHelperTextFoundation extends js.Object {
    
    def cssClasses: HELPERTEXTVALIDATIONMSG = js.native
    
    /**
      * See {@link MDCSelectHelperTextAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCSelectHelperTextAdapter = js.native
    
    def strings: ARIAHIDDEN = js.native
  }
  
  @js.native
  class default () extends MDCSelectHelperTextFoundation {
    def this(adapter: PartialMDCSelectHelperTex) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def cssClasses: HELPERTEXTVALIDATIONMSG = js.native
    
    /**
      * See {@link MDCSelectHelperTextAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCSelectHelperTextAdapter = js.native
    
    def strings: ARIAHIDDEN = js.native
  }
}
