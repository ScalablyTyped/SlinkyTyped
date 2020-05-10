package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BonusPayment extends js.Object {
  /**
    * The ID of the assignment associated with this bonus payment.
    */
  var AssignmentId: js.UndefOr[EntityId] = js.native
  var BonusAmount: js.UndefOr[CurrencyAmount] = js.native
  /**
    * The date and time of when the bonus was granted.
    */
  var GrantTime: js.UndefOr[js.Date] = js.native
  /**
    * The Reason text given when the bonus was granted, if any.
    */
  var Reason: js.UndefOr[String] = js.native
  /**
    * The ID of the Worker to whom the bonus was paid.
    */
  var WorkerId: js.UndefOr[CustomerId] = js.native
}

object BonusPayment {
  @scala.inline
  def apply(): BonusPayment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BonusPayment]
  }
  @scala.inline
  implicit class BonusPaymentOps[Self <: BonusPayment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignmentId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentId")(js.undefined)
        ret
    }
    @scala.inline
    def withBonusAmount(value: CurrencyAmount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BonusAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBonusAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BonusAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantTime")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerId(value: CustomerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkerId")(js.undefined)
        ret
    }
  }
  
}

