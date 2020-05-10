package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An updated request for payment data.
  *
  * This is generated after a callback has been triggered and should be
  * used to patch the old PaymentDataRequest. Note that only the fields
  * that's been changed need to be set in this request update.
  *
  * Note: This interface is currently only for web only.
  */
@js.native
trait PaymentDataRequestUpdate extends js.Object {
  /**
    * Error for the last PaymentData, will be displayed to the user.
    *
    * Note: This field is currently only for web only.
    */
  var error: js.UndefOr[PaymentDataError] = js.native
  /**
    * Contains updated shipping option parameters. All fields in
    * ShippingOptionParameters are allowed in the update.
    *
    * If this field is present it should be the full list of shipping
    * options instead of a delta of any earlier version. Note: This field
    * is currently only for web only.
    */
  var newShippingOptionParameters: js.UndefOr[ShippingOptionParameters] = js.native
  /**
    * Contains updated totals and line items. Only changes in totalPrice,
    * totalPriceStatus, transactionNote, displayItems will be allowed.
    *
    * Note: This field is currently only for web only.
    */
  var newTransactionInfo: js.UndefOr[TransactionInfo] = js.native
}

object PaymentDataRequestUpdate {
  @scala.inline
  def apply(): PaymentDataRequestUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentDataRequestUpdate]
  }
  @scala.inline
  implicit class PaymentDataRequestUpdateOps[Self <: PaymentDataRequestUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: PaymentDataError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withNewShippingOptionParameters(value: ShippingOptionParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newShippingOptionParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewShippingOptionParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newShippingOptionParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withNewTransactionInfo(value: TransactionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTransactionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewTransactionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTransactionInfo")(js.undefined)
        ret
    }
  }
  
}

