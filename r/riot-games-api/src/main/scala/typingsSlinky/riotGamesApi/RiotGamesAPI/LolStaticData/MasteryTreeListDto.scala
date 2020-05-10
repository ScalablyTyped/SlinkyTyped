package typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MasteryTreeListDto extends js.Object {
  var masteryTreeItems: js.Array[MasteryTreeItemDto] = js.native
}

object MasteryTreeListDto {
  @scala.inline
  def apply(masteryTreeItems: js.Array[MasteryTreeItemDto]): MasteryTreeListDto = {
    val __obj = js.Dynamic.literal(masteryTreeItems = masteryTreeItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasteryTreeListDto]
  }
  @scala.inline
  implicit class MasteryTreeListDtoOps[Self <: MasteryTreeListDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMasteryTreeItems(value: js.Array[MasteryTreeItemDto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masteryTreeItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

