package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppCatalogs extends Entity {
  var teamsApps: js.UndefOr[js.Array[TeamsApp]] = js.native
}

object AppCatalogs {
  @scala.inline
  def apply(): AppCatalogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppCatalogs]
  }
  @scala.inline
  implicit class AppCatalogsOps[Self <: AppCatalogs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTeamsApps(value: js.Array[TeamsApp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamsApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamsApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamsApps")(js.undefined)
        ret
    }
  }
  
}

