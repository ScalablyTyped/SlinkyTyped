package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuppressedDestinationSummary extends js.Object {
  /**
    * The email address that's on the suppression list for your account.
    */
  var EmailAddress: typingsSlinky.awsSdk.sesv2Mod.EmailAddress = js.native
  /**
    * The date and time when the suppressed destination was last updated, shown in Unix time format.
    */
  var LastUpdateTime: js.Date = js.native
  /**
    * The reason that the address was added to the suppression list for your account.
    */
  var Reason: SuppressionListReason = js.native
}

object SuppressedDestinationSummary {
  @scala.inline
  def apply(EmailAddress: EmailAddress, LastUpdateTime: js.Date, Reason: SuppressionListReason): SuppressedDestinationSummary = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any], LastUpdateTime = LastUpdateTime.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuppressedDestinationSummary]
  }
  @scala.inline
  implicit class SuppressedDestinationSummaryOps[Self <: SuppressedDestinationSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmailAddress(value: EmailAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: SuppressionListReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

