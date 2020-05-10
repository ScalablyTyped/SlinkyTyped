package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfferingTransaction extends js.Object {
  /**
    * The cost of an offering transaction.
    */
  var cost: js.UndefOr[MonetaryAmount] = js.native
  /**
    * The date on which an offering transaction was created.
    */
  var createdOn: js.UndefOr[js.Date] = js.native
  /**
    * The ID that corresponds to a device offering promotion.
    */
  var offeringPromotionId: js.UndefOr[OfferingPromotionIdentifier] = js.native
  /**
    * The status of an offering transaction.
    */
  var offeringStatus: js.UndefOr[OfferingStatus] = js.native
  /**
    * The transaction ID of the offering transaction.
    */
  var transactionId: js.UndefOr[TransactionIdentifier] = js.native
}

object OfferingTransaction {
  @scala.inline
  def apply(): OfferingTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OfferingTransaction]
  }
  @scala.inline
  implicit class OfferingTransactionOps[Self <: OfferingTransaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCost(value: MonetaryAmount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cost")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdOn")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferingPromotionId(value: OfferingPromotionIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offeringPromotionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferingPromotionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offeringPromotionId")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferingStatus(value: OfferingStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offeringStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferingStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offeringStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionId(value: TransactionIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionId")(js.undefined)
        ret
    }
  }
  
}

