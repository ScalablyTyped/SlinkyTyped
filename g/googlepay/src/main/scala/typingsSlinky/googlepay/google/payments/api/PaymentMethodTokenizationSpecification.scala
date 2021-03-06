package typingsSlinky.googlepay.google.payments.api

import typingsSlinky.googlepay.googlepayStrings.DIRECT
import typingsSlinky.googlepay.googlepayStrings.PAYMENT_GATEWAY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tokenization parameters.
  *
  * These parameters will be used to tokenize/transmit the
  * payment method returned to you in a format you can charge or reference.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googlepay.google.payments.api.PaymentGatewayTokenizationSpecification
  - typingsSlinky.googlepay.google.payments.api.DirectTokenizationSpecification
*/
trait PaymentMethodTokenizationSpecification extends StObject
object PaymentMethodTokenizationSpecification {
  
  @scala.inline
  def DirectTokenizationSpecification(parameters: DirectTokenizationParameters, `type`: DIRECT): typingsSlinky.googlepay.google.payments.api.DirectTokenizationSpecification = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.googlepay.google.payments.api.DirectTokenizationSpecification]
  }
  
  @scala.inline
  def PaymentGatewayTokenizationSpecification(parameters: PaymentGatewayTokenizationParameters, `type`: PAYMENT_GATEWAY): typingsSlinky.googlepay.google.payments.api.PaymentGatewayTokenizationSpecification = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.googlepay.google.payments.api.PaymentGatewayTokenizationSpecification]
  }
}
