package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specification of accepted payment method.
  */
@js.native
trait PaymentMethodSpecification extends js.Object {
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
  implicit class PaymentMethodSpecificationOps[Self <: PaymentMethodSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameters(value: CardParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokenizationSpecification(value: PaymentMethodTokenizationSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenizationSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: PaymentMethodType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

