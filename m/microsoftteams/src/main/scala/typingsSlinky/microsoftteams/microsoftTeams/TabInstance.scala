package typingsSlinky.microsoftteams.microsoftTeams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabInstance extends js.Object {
  var channelId: js.UndefOr[String] = js.native
  var channelIsFavorite: js.UndefOr[Boolean] = js.native
  var channelName: js.UndefOr[String] = js.native
  var entityId: js.UndefOr[String] = js.native
  var groupId: js.UndefOr[String] = js.native
  var internalTabInstanceId: js.UndefOr[String] = js.native
  var lastViewUnixEpochTime: js.UndefOr[String] = js.native
  var tabName: String = js.native
  var teamId: js.UndefOr[String] = js.native
  var teamIsFavorite: js.UndefOr[Boolean] = js.native
  var teamName: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var websiteUrl: js.UndefOr[String] = js.native
}

object TabInstance {
  @scala.inline
  def apply(tabName: String): TabInstance = {
    val __obj = js.Dynamic.literal(tabName = tabName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabInstance]
  }
  @scala.inline
  implicit class TabInstanceOps[Self <: TabInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTabName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabName")(value.asInstanceOf[js.Any])
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
    def withChannelIsFavorite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelIsFavorite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelIsFavorite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelIsFavorite")(js.undefined)
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
    def withEntityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityId")(js.undefined)
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
    def withInternalTabInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalTabInstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternalTabInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalTabInstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withLastViewUnixEpochTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastViewUnixEpochTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastViewUnixEpochTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastViewUnixEpochTime")(js.undefined)
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
    def withTeamIsFavorite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamIsFavorite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamIsFavorite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamIsFavorite")(js.undefined)
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
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsiteUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsiteUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteUrl")(js.undefined)
        ret
    }
  }
  
}

