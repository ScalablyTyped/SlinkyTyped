package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservationPlan extends js.Object {
  /**
    * The length of the term of your reserved queue pricing plan commitment.
    */
  var Commitment: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.Commitment] = js.native
  /**
    * The timestamp in epoch seconds for when the current pricing plan term for this reserved queue expires.
    */
  var ExpiresAt: js.UndefOr[js.Date] = js.native
  /**
    * The timestamp in epoch seconds for when you set up the current pricing plan for this reserved queue.
    */
  var PurchasedAt: js.UndefOr[js.Date] = js.native
  /**
    * Specifies whether the term of your reserved queue pricing plan is automatically extended (AUTO_RENEW) or expires (EXPIRE) at the end of the term.
    */
  var RenewalType: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.RenewalType] = js.native
  /**
    * Specifies the number of reserved transcode slots (RTS) for this queue. The number of RTS determines how many jobs the queue can process in parallel; each RTS can process one job at a time. When you increase this number, you extend your existing commitment with a new 12-month commitment for a larger number of RTS. The new commitment begins when you purchase the additional capacity. You can't decrease the number of RTS in your reserved queue.
    */
  var ReservedSlots: js.UndefOr[integer] = js.native
  /**
    * Specifies whether the pricing plan for your reserved queue is ACTIVE or EXPIRED.
    */
  var Status: js.UndefOr[ReservationPlanStatus] = js.native
}

object ReservationPlan {
  @scala.inline
  def apply(): ReservationPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationPlan]
  }
  @scala.inline
  implicit class ReservationPlanOps[Self <: ReservationPlan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommitment(value: Commitment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Commitment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommitment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Commitment")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiresAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpiresAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiresAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpiresAt")(js.undefined)
        ret
    }
    @scala.inline
    def withPurchasedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PurchasedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurchasedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PurchasedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withRenewalType(value: RenewalType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenewalType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenewalType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenewalType")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedSlots(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedSlots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedSlots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedSlots")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ReservationPlanStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

