package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsTab extends Entity {
  // Container for custom settings applied to a tab. The tab is considered configured only once this property is set.
  var configuration: js.UndefOr[TeamsTabConfiguration] = js.native
  // Name of the tab.
  var displayName: js.UndefOr[String] = js.native
  // The application that is linked to the tab. This cannot be changed after tab creation.
  var teamsApp: js.UndefOr[TeamsApp] = js.native
  // Deep link url of the tab instance. Read only.
  var webUrl: js.UndefOr[String] = js.native
}

object TeamsTab {
  @scala.inline
  def apply(): TeamsTab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamsTab]
  }
  @scala.inline
  implicit class TeamsTabOps[Self <: TeamsTab] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfiguration(value: TeamsTabConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withTeamsApp(value: TeamsApp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamsApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamsApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamsApp")(js.undefined)
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

