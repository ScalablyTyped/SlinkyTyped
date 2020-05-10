package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuppressedDestination extends js.Object {
  /**
    * An optional value that can contain additional information about the reasons that the address was added to the suppression list for your account.
    */
  var Attributes: js.UndefOr[SuppressedDestinationAttributes] = js.native
  /**
    * The email address that is on the suppression list for your account.
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

object SuppressedDestination {
  @scala.inline
  def apply(EmailAddress: EmailAddress, LastUpdateTime: js.Date, Reason: SuppressionListReason): SuppressedDestination = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any], LastUpdateTime = LastUpdateTime.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuppressedDestination]
  }
  @scala.inline
  implicit class SuppressedDestinationOps[Self <: SuppressedDestination] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withAttributes(value: SuppressedDestinationAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
  }
  
}

