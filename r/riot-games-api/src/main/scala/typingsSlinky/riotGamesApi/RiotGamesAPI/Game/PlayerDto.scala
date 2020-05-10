package typingsSlinky.riotGamesApi.RiotGamesAPI.Game

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerDto extends js.Object {
  var championId: Double = js.native
  var summonerId: Double = js.native
  var teamId: Double = js.native
}

object PlayerDto {
  @scala.inline
  def apply(championId: Double, summonerId: Double, teamId: Double): PlayerDto = {
    val __obj = js.Dynamic.literal(championId = championId.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerDto]
  }
  @scala.inline
  implicit class PlayerDtoOps[Self <: PlayerDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChampionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("championId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummonerId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summonerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeamId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

