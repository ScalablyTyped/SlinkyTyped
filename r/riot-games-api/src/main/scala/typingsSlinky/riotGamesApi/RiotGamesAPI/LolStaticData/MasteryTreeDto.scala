package typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MasteryTreeDto extends js.Object {
  var Defense: js.Array[MasteryTreeListDto] = js.native
  var Offense: js.Array[MasteryTreeListDto] = js.native
  var Utility: js.Array[MasteryTreeListDto] = js.native
}

object MasteryTreeDto {
  @scala.inline
  def apply(
    Defense: js.Array[MasteryTreeListDto],
    Offense: js.Array[MasteryTreeListDto],
    Utility: js.Array[MasteryTreeListDto]
  ): MasteryTreeDto = {
    val __obj = js.Dynamic.literal(Defense = Defense.asInstanceOf[js.Any], Offense = Offense.asInstanceOf[js.Any], Utility = Utility.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasteryTreeDto]
  }
  @scala.inline
  implicit class MasteryTreeDtoOps[Self <: MasteryTreeDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefense(value: js.Array[MasteryTreeListDto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Defense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffense(value: js.Array[MasteryTreeListDto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Offense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtility(value: js.Array[MasteryTreeListDto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Utility")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

