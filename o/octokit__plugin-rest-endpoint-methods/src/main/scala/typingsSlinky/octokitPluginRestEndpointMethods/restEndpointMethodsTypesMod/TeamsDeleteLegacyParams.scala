package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsDeleteLegacyParams extends js.Object {
  var team_id: Double = js.native
}

object TeamsDeleteLegacyParams {
  @scala.inline
  def apply(team_id: Double): TeamsDeleteLegacyParams = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsDeleteLegacyParams]
  }
  @scala.inline
  implicit class TeamsDeleteLegacyParamsOps[Self <: TeamsDeleteLegacyParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTeam_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

