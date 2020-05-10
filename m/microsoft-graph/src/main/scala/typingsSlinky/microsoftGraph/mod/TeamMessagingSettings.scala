package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamMessagingSettings extends js.Object {
  // If set to true, @channel mentions are allowed.
  var allowChannelMentions: js.UndefOr[Boolean] = js.native
  // If set to true, owners can delete any message.
  var allowOwnerDeleteMessages: js.UndefOr[Boolean] = js.native
  // If set to true, @team mentions are allowed.
  var allowTeamMentions: js.UndefOr[Boolean] = js.native
  // If set to true, users can delete their messages.
  var allowUserDeleteMessages: js.UndefOr[Boolean] = js.native
  // If set to true, users can edit their messages.
  var allowUserEditMessages: js.UndefOr[Boolean] = js.native
}

object TeamMessagingSettings {
  @scala.inline
  def apply(): TeamMessagingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamMessagingSettings]
  }
  @scala.inline
  implicit class TeamMessagingSettingsOps[Self <: TeamMessagingSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowChannelMentions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowChannelMentions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowChannelMentions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowChannelMentions")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowOwnerDeleteMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOwnerDeleteMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowOwnerDeleteMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOwnerDeleteMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowTeamMentions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTeamMentions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTeamMentions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTeamMentions")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowUserDeleteMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUserDeleteMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUserDeleteMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUserDeleteMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowUserEditMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUserEditMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUserEditMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUserEditMessages")(js.undefined)
        ret
    }
  }
  
}

