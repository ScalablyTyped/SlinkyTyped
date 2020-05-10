package typingsSlinky.riotGamesApi.RiotGamesAPI.Team

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RosterDto extends js.Object {
  var memberList: js.Array[TeamMemberInfoDto] = js.native
  var ownerId: Double = js.native
}

object RosterDto {
  @scala.inline
  def apply(memberList: js.Array[TeamMemberInfoDto], ownerId: Double): RosterDto = {
    val __obj = js.Dynamic.literal(memberList = memberList.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RosterDto]
  }
  @scala.inline
  implicit class RosterDtoOps[Self <: RosterDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMemberList(value: js.Array[TeamMemberInfoDto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

