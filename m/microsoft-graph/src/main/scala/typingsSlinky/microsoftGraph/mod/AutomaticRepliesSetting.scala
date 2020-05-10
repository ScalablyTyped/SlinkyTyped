package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutomaticRepliesSetting extends js.Object {
  /**
    * The set of audience external to the signed-in user's organization who will receive the ExternalReplyMessage, if Status
    * is AlwaysEnabled or Scheduled. The possible values are: none, contactsOnly, all.
    */
  var externalAudience: js.UndefOr[ExternalAudienceScope] = js.native
  // The automatic reply to send to the specified external audience, if Status is AlwaysEnabled or Scheduled.
  var externalReplyMessage: js.UndefOr[String] = js.native
  /**
    * The automatic reply to send to the audience internal to the signed-in user's organization, if Status is AlwaysEnabled
    * or Scheduled.
    */
  var internalReplyMessage: js.UndefOr[String] = js.native
  // The date and time that automatic replies are set to end, if Status is set to Scheduled.
  var scheduledEndDateTime: js.UndefOr[DateTimeTimeZone] = js.native
  // The date and time that automatic replies are set to begin, if Status is set to Scheduled.
  var scheduledStartDateTime: js.UndefOr[DateTimeTimeZone] = js.native
  // Configurations status for automatic replies. The possible values are: disabled, alwaysEnabled, scheduled.
  var status: js.UndefOr[AutomaticRepliesStatus] = js.native
}

object AutomaticRepliesSetting {
  @scala.inline
  def apply(): AutomaticRepliesSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomaticRepliesSetting]
  }
  @scala.inline
  implicit class AutomaticRepliesSettingOps[Self <: AutomaticRepliesSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExternalAudience(value: ExternalAudienceScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalAudience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalAudience: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalAudience")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalReplyMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalReplyMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalReplyMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalReplyMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withInternalReplyMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalReplyMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternalReplyMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalReplyMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledEndDateTime(value: DateTimeTimeZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledEndDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledEndDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledEndDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledStartDateTime(value: DateTimeTimeZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledStartDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledStartDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledStartDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: AutomaticRepliesStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

