package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data for a payment method.
  */
@js.native
trait PaymentMethodData extends js.Object {
  /**
    * User-facing message to describe the payment method funding this
    * transaction.
    *
    * You are required to show this message to the buyer as confirmation of
    * their funding source. Please refer to the
    * [documentation](https://developers.google.com/pay/api/|documentation)
    * for more information.
    *
    * **IMPORTANT:** Do not attempt to parse the contents of this string as
    * the format, contents, and length may change at any time. If you need
    * additional details, see
    * [[PaymentMethodData.info|`PaymentMethodData.info`]].
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Payment method information.
    *
    * The definition of this field depends
    * on which payment method type was set in
    * [[PaymentMethodData.type|`PaymentMethodData.type`]].
    *
    * - For [[PaymentMethodType|`CARD`]], this field
    *   will be an object conforming to [[CardInfo|`CardInfo`]].
    */
  var info: js.UndefOr[CardInfo] = js.native
  /**
    * Tokenization data for the payment method.
    */
  var tokenizationData: PaymentMethodTokenizationData = js.native
  /**
    * Type of payment method.
    */
  var `type`: PaymentMethodType = js.native
}

object PaymentMethodData {
  @scala.inline
  def apply(tokenizationData: PaymentMethodTokenizationData, `type`: PaymentMethodType): PaymentMethodData = {
    val __obj = js.Dynamic.literal(tokenizationData = tokenizationData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodData]
  }
  @scala.inline
  implicit class PaymentMethodDataOps[Self <: PaymentMethodData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTokenizationData(value: PaymentMethodTokenizationData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenizationData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: PaymentMethodType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: CardInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
  }
  
}

