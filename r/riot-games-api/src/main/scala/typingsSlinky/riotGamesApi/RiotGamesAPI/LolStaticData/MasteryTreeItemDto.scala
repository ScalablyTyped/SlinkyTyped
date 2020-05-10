package typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MasteryTreeItemDto extends js.Object {
  var masteryId: Double = js.native
  var prereq: String = js.native
}

object MasteryTreeItemDto {
  @scala.inline
  def apply(masteryId: Double, prereq: String): MasteryTreeItemDto = {
    val __obj = js.Dynamic.literal(masteryId = masteryId.asInstanceOf[js.Any], prereq = prereq.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasteryTreeItemDto]
  }
  @scala.inline
  implicit class MasteryTreeItemDtoOps[Self <: MasteryTreeItemDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMasteryId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masteryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrereq(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prereq")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

