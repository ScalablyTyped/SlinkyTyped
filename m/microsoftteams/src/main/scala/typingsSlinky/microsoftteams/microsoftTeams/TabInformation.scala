package typingsSlinky.microsoftteams.microsoftTeams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabInformation extends js.Object {
  var teamTabs: js.Array[TabInstance] = js.native
}

object TabInformation {
  @scala.inline
  def apply(teamTabs: js.Array[TabInstance]): TabInformation = {
    val __obj = js.Dynamic.literal(teamTabs = teamTabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabInformation]
  }
  @scala.inline
  implicit class TabInformationOps[Self <: TabInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTeamTabs(value: js.Array[TabInstance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamTabs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

