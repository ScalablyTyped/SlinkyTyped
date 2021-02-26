package typingsSlinky.braintreeWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("braintree-web/modules/core", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  @js.native
  trait BraintreeError extends StObject {
    
    /**
      * @description A code that corresponds to specific errors.
      */
    var code: String = js.native
    
    /**
      * @description Additional information about the error, such as an underlying network error response.
      */
    var details: js.Any = js.native
    
    /**
      * @description A short description of the error.
      */
    var message: String = js.native
    
    /**
      * @description The type of error.
      */
    var `type`: BraintreeErrorTypes = js.native
  }
  object BraintreeError {
    
    @scala.inline
    def apply(code: String, details: js.Any, message: String, `type`: BraintreeErrorTypes): BraintreeError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BraintreeError]
    }
    
    @scala.inline
    implicit class BraintreeErrorMutableBuilder[Self <: BraintreeError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetails(value: js.Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: BraintreeErrorTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.braintreeWeb.braintreeWebStrings.CUSTOMER
    - typingsSlinky.braintreeWeb.braintreeWebStrings.MERCHANT
    - typingsSlinky.braintreeWeb.braintreeWebStrings.NETWORK
    - typingsSlinky.braintreeWeb.braintreeWebStrings.INTERNAL
    - typingsSlinky.braintreeWeb.braintreeWebStrings.UNKNOWN
  */
  trait BraintreeErrorTypes extends StObject
  object BraintreeErrorTypes {
    
    @scala.inline
    def CUSTOMER: typingsSlinky.braintreeWeb.braintreeWebStrings.CUSTOMER = "CUSTOMER".asInstanceOf[typingsSlinky.braintreeWeb.braintreeWebStrings.CUSTOMER]
    
    @scala.inline
    def INTERNAL: typingsSlinky.braintreeWeb.braintreeWebStrings.INTERNAL = "INTERNAL".asInstanceOf[typingsSlinky.braintreeWeb.braintreeWebStrings.INTERNAL]
    
    @scala.inline
    def MERCHANT: typingsSlinky.braintreeWeb.braintreeWebStrings.MERCHANT = "MERCHANT".asInstanceOf[typingsSlinky.braintreeWeb.braintreeWebStrings.MERCHANT]
    
    @scala.inline
    def NETWORK: typingsSlinky.braintreeWeb.braintreeWebStrings.NETWORK = "NETWORK".asInstanceOf[typingsSlinky.braintreeWeb.braintreeWebStrings.NETWORK]
    
    @scala.inline
    def UNKNOWN: typingsSlinky.braintreeWeb.braintreeWebStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsSlinky.braintreeWeb.braintreeWebStrings.UNKNOWN]
  }
  
  type callback[T] = js.Function2[/* err */ js.UndefOr[BraintreeError], /* data */ js.UndefOr[T], Unit]
}
