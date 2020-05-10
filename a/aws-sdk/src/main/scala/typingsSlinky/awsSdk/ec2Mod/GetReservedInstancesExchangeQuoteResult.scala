package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReservedInstancesExchangeQuoteResult extends js.Object {
  /**
    * The currency of the transaction.
    */
  var CurrencyCode: js.UndefOr[String] = js.native
  /**
    * If true, the exchange is valid. If false, the exchange cannot be completed.
    */
  var IsValidExchange: js.UndefOr[Boolean] = js.native
  /**
    * The new end date of the reservation term.
    */
  var OutputReservedInstancesWillExpireAt: js.UndefOr[js.Date] = js.native
  /**
    * The total true upfront charge for the exchange.
    */
  var PaymentDue: js.UndefOr[String] = js.native
  /**
    * The cost associated with the Reserved Instance.
    */
  var ReservedInstanceValueRollup: js.UndefOr[ReservationValue] = js.native
  /**
    * The configuration of your Convertible Reserved Instances.
    */
  var ReservedInstanceValueSet: js.UndefOr[ReservedInstanceReservationValueSet] = js.native
  /**
    * The cost associated with the Reserved Instance.
    */
  var TargetConfigurationValueRollup: js.UndefOr[ReservationValue] = js.native
  /**
    * The values of the target Convertible Reserved Instances.
    */
  var TargetConfigurationValueSet: js.UndefOr[TargetReservationValueSet] = js.native
  /**
    * Describes the reason why the exchange cannot be completed.
    */
  var ValidationFailureReason: js.UndefOr[String] = js.native
}

object GetReservedInstancesExchangeQuoteResult {
  @scala.inline
  def apply(): GetReservedInstancesExchangeQuoteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReservedInstancesExchangeQuoteResult]
  }
  @scala.inline
  implicit class GetReservedInstancesExchangeQuoteResultOps[Self <: GetReservedInstancesExchangeQuoteResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrencyCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrencyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrencyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withIsValidExchange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsValidExchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsValidExchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsValidExchange")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputReservedInstancesWillExpireAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputReservedInstancesWillExpireAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputReservedInstancesWillExpireAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputReservedInstancesWillExpireAt")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentDue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaymentDue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentDue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaymentDue")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedInstanceValueRollup(value: ReservationValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedInstanceValueRollup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedInstanceValueRollup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedInstanceValueRollup")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedInstanceValueSet(value: ReservedInstanceReservationValueSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedInstanceValueSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedInstanceValueSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedInstanceValueSet")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetConfigurationValueRollup(value: ReservationValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetConfigurationValueRollup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetConfigurationValueRollup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetConfigurationValueRollup")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetConfigurationValueSet(value: TargetReservationValueSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetConfigurationValueSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetConfigurationValueSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetConfigurationValueSet")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationFailureReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationFailureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationFailureReason")(js.undefined)
        ret
    }
  }
  
}

