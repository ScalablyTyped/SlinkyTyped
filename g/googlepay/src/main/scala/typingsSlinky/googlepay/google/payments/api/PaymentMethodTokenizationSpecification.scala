package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tokenization parameters.
  *
  * These parameters will be used to tokenize/transmit the
  * payment method returned to you in a format you can charge or reference.
  */
@js.native
trait PaymentMethodTokenizationSpecification extends js.Object {
  /**
    * Specific parameters used for tokenization.
    *
    * The values in this object will depend on the value of type set in
    * [[PaymentMethodTokenizationSpecification.type|`type`]]:
    *
    * - [[PaymentMethodTokenizationType|`PAYMENT_GATEWAY`]]:
    *   [[PaymentGatewayTokenizationParameters|`PaymentGatewayTokenizationParameters`]]
    * - [[PaymentMethodTokenizationType|`DIRECT`]]:
    *   [[DirectTokenizationParameters|`DirectTokenizationParameters`]]
    */
  var parameters: PaymentGatewayTokenizationParameters | DirectTokenizationParameters = js.native
  /**
    * The type of payment method tokenization to apply to the selected
    * payment method.
    *
    * This field is required.
    */
  var `type`: PaymentMethodTokenizationType = js.native
}

object PaymentMethodTokenizationSpecification {
  @scala.inline
  def apply(
    parameters: PaymentGatewayTokenizationParameters | DirectTokenizationParameters,
    `type`: PaymentMethodTokenizationType
  ): PaymentMethodTokenizationSpecification = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodTokenizationSpecification]
  }
  @scala.inline
  implicit class PaymentMethodTokenizationSpecificationOps[Self <: PaymentMethodTokenizationSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameters(value: PaymentGatewayTokenizationParameters | DirectTokenizationParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: PaymentMethodTokenizationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

