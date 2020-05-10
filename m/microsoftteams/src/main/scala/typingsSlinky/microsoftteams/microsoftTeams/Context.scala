package typingsSlinky.microsoftteams.microsoftTeams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  /**
    * The Microsoft Teams ID for the channel with which the content is associated.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * The name for the channel with which the content is associated.
    */
  var channelName: js.UndefOr[String] = js.native
  /**
    * The developer-defined unique ID for the entity this content points to.
    */
  var entityId: String = js.native
  /**
    * The Office 365 group ID for the team with which the content is associated.
    * This field is available only when the identity permission is requested in the manifest.
    */
  var groupId: js.UndefOr[String] = js.native
  /**
    * Indication whether the tab is in full-screen mode.
    */
  var isFullScreen: js.UndefOr[Boolean] = js.native
  /**
    * The current locale that the user has configured for the app formatted as
    * languageId-countryId (for example, en-us).
    */
  var locale: String = js.native
  /**
    * The developer-defined unique ID for the sub-entity this content points to.
    * This field should be used to restore to a specific state within an entity, such as scrolling to or activating a specific piece of content.
    */
  var subEntityId: js.UndefOr[String] = js.native
  /**
    * The Microsoft Teams ID for the team with which the content is associated.
    */
  var teamId: js.UndefOr[String] = js.native
  /**
    * The name for the team with which the content is associated.
    */
  var teamName: js.UndefOr[String] = js.native
  /**
    * The type of the team.
    */
  var teamType: js.UndefOr[TeamType] = js.native
  /**
    * The current UI theme.
    */
  var theme: js.UndefOr[String] = js.native
  /**
    * The Azure AD tenant ID of the current user.
    * Because a malicious party can host malicious content in a browser, this value should
    * be used only as a hint as to who the user is and never as proof of identity.
    * This field is available only when the identity permission is requested in the manifest.
    */
  var tid: js.UndefOr[String] = js.native
  /**
    * The UPN of the current user.
    * Because a malicious party can host malicious content in a browser, this value should
    * be used only as a hint as to who the user is and never as proof of identity.
    * This field is available only when the identity permission is requested in the manifest.
    */
  var upn: js.UndefOr[String] = js.native
}

object Context {
  @scala.inline
  def apply(entityId: String, locale: String): Context = {
    val __obj = js.Dynamic.literal(entityId = entityId.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelName")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFullScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFullScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFullScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFullScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withSubEntityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subEntityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubEntityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subEntityId")(js.undefined)
        ret
    }
    @scala.inline
    def withTeamId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamId")(js.undefined)
        ret
    }
    @scala.inline
    def withTeamName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamName")(js.undefined)
        ret
    }
    @scala.inline
    def withTeamType(value: TeamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamType")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tid")(js.undefined)
        ret
    }
    @scala.inline
    def withUpn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upn")(js.undefined)
        ret
    }
  }
  
}

