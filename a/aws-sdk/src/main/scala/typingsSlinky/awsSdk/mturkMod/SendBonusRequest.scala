package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendBonusRequest extends js.Object {
  /**
    * The ID of the assignment for which this bonus is paid.
    */
  var AssignmentId: EntityId = js.native
  /**
    *  The Bonus amount is a US Dollar amount specified using a string (for example, "5" represents $5.00 USD and "101.42" represents $101.42 USD). Do not include currency symbols or currency codes. 
    */
  var BonusAmount: CurrencyAmount = js.native
  /**
    * A message that explains the reason for the bonus payment. The Worker receiving the bonus can see this message.
    */
  var Reason: String = js.native
  /**
    * A unique identifier for this request, which allows you to retry the call on error without granting multiple bonuses. This is useful in cases such as network timeouts where it is unclear whether or not the call succeeded on the server. If the bonus already exists in the system from a previous call using the same UniqueRequestToken, subsequent calls will return an error with a message containing the request ID.
    */
  var UniqueRequestToken: js.UndefOr[IdempotencyToken] = js.native
  /**
    * The ID of the Worker being paid the bonus.
    */
  var WorkerId: CustomerId = js.native
}

object SendBonusRequest {
  @scala.inline
  def apply(AssignmentId: EntityId, BonusAmount: CurrencyAmount, Reason: String, WorkerId: CustomerId): SendBonusRequest = {
    val __obj = js.Dynamic.literal(AssignmentId = AssignmentId.asInstanceOf[js.Any], BonusAmount = BonusAmount.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any], WorkerId = WorkerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendBonusRequest]
  }
  @scala.inline
  implicit class SendBonusRequestOps[Self <: SendBonusRequest] (val x: Self) extends AnyVal {
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
    def withBonusAmount(value: CurrencyAmount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BonusAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkerId(value: CustomerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniqueRequestToken(value: IdempotencyToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UniqueRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UniqueRequestToken")(js.undefined)
        ret
    }
  }
  
}

