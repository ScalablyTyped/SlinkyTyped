package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsAppInstallation extends Entity {
  // The app that is installed.
  var teamsApp: js.UndefOr[TeamsApp] = js.native
  // The details of this version of the app.
  var teamsAppDefinition: js.UndefOr[TeamsAppDefinition] = js.native
}

object TeamsAppInstallation {
  @scala.inline
  def apply(): TeamsAppInstallation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamsAppInstallation]
  }
  @scala.inline
  implicit class TeamsAppInstallationOps[Self <: TeamsAppInstallation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withTeamsAppDefinition(value: TeamsAppDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamsAppDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamsAppDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamsAppDefinition")(js.undefined)
        ret
    }
  }
  
}

