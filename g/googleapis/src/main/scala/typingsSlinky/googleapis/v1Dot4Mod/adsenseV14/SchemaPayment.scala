package typingsSlinky.googleapis.v1Dot4Mod.adsenseV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPayment extends js.Object {
  /**
    * Unique identifier of this Payment.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is, in this case adsense#payment.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The amount to be paid.
    */
  var paymentAmount: js.UndefOr[String] = js.native
  /**
    * The currency code for the amount to be paid.
    */
  var paymentAmountCurrencyCode: js.UndefOr[String] = js.native
  /**
    * The date this payment was/will be credited to the user, or none if the
    * payment threshold has not been met.
    */
  var paymentDate: js.UndefOr[String] = js.native
}

object SchemaPayment {
  @scala.inline
  def apply(): SchemaPayment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPayment]
  }
  @scala.inline
  implicit class SchemaPaymentOps[Self <: SchemaPayment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentAmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentAmountCurrencyCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentAmountCurrencyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentAmountCurrencyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentAmountCurrencyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentDate")(js.undefined)
        ret
    }
  }
  
}

