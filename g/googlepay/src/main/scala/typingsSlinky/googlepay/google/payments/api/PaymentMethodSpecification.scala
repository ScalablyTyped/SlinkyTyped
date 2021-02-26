package typingsSlinky.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specification of accepted payment method for use in `loadPaymentData`.
  */
@js.native
trait PaymentMethodSpecification extends StObject {
  
  /**
    * Payment method parameters.
    *
    * The parameters set here affect which payment methods will be
    * available for the user to choose from.
    */
  var parameters: CardParameters = js.native
  
  /**
    * Tokenization parameters.
    *
    * These parameters will be used to tokenize/transmit the
    * payment method returned to you in a format you can charge or
    * reference.
    */
  var tokenizationSpecification: PaymentMethodTokenizationSpecification = js.native
  
  /**
    * Type of payment method.
    *
    * This field is required.
    */
  var `type`: PaymentMethodType = js.native
}
object PaymentMethodSpecification {
  
  @scala.inline
  def apply(
    parameters: CardParameters,
    tokenizationSpecification: PaymentMethodTokenizationSpecification,
    `type`: PaymentMethodType
  ): PaymentMethodSpecification = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], tokenizationSpecification = tokenizationSpecification.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodSpecification]
  }
  
  @scala.inline
  implicit class PaymentMethodSpecificationMutableBuilder[Self <: PaymentMethodSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: CardParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenizationSpecification(value: PaymentMethodTokenizationSpecification): Self = StObject.set(x, "tokenizationSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PaymentMethodType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
