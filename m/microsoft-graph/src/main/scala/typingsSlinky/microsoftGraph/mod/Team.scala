package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Team extends Entity {
  // The collection of channels &amp; messages associated with the team.
  var channels: js.UndefOr[js.Array[Channel]] = js.native
  // Settings to configure use of Giphy, memes, and stickers in the team.
  var funSettings: js.UndefOr[TeamFunSettings] = js.native
  // Settings to configure whether guests can create, update, or delete channels in the team.
  var guestSettings: js.UndefOr[TeamGuestSettings] = js.native
  // The apps installed in this team.
  var installedApps: js.UndefOr[js.Array[TeamsAppInstallation]] = js.native
  // Whether this team is in read-only mode.
  var isArchived: js.UndefOr[Boolean] = js.native
  /**
    * Settings to configure whether members can perform certain actions, for example, create channels and add bots, in the
    * team.
    */
  var memberSettings: js.UndefOr[TeamMemberSettings] = js.native
  // Settings to configure messaging and mentions in the team.
  var messagingSettings: js.UndefOr[TeamMessagingSettings] = js.native
  var operations: js.UndefOr[js.Array[TeamsAsyncOperation]] = js.native
  /**
    * A hyperlink that will go to the team in the Microsoft Teams client. This is the URL that you get when you right-click a
    * team in the Microsoft Teams client and select Get link to team. This URL should be treated as an opaque blob, and not
    * parsed.
    */
  var webUrl: js.UndefOr[String] = js.native
}

object Team {
  @scala.inline
  def apply(): Team = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Team]
  }
  @scala.inline
  implicit class TeamOps[Self <: Team] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannels(value: js.Array[Channel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(js.undefined)
        ret
    }
    @scala.inline
    def withFunSettings(value: TeamFunSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withGuestSettings(value: TeamGuestSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuestSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withInstalledApps(value: js.Array[TeamsAppInstallation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installedApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstalledApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installedApps")(js.undefined)
        ret
    }
    @scala.inline
    def withIsArchived(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isArchived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsArchived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isArchived")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberSettings(value: TeamMemberSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withMessagingSettings(value: TeamMessagingSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagingSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessagingSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagingSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withOperations(value: js.Array[TeamsAsyncOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(js.undefined)
        ret
    }
    @scala.inline
    def withWebUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webUrl")(js.undefined)
        ret
    }
  }
  
}

