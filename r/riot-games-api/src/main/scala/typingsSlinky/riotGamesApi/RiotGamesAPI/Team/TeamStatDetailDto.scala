package typingsSlinky.riotGamesApi.RiotGamesAPI.Team

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamStatDetailDto extends js.Object {
  var averageGamesPlayed: Double = js.native
  var losses: Double = js.native
  var teamStatType: String = js.native
  var wins: Double = js.native
}

object TeamStatDetailDto {
  @scala.inline
  def apply(averageGamesPlayed: Double, losses: Double, teamStatType: String, wins: Double): TeamStatDetailDto = {
    val __obj = js.Dynamic.literal(averageGamesPlayed = averageGamesPlayed.asInstanceOf[js.Any], losses = losses.asInstanceOf[js.Any], teamStatType = teamStatType.asInstanceOf[js.Any], wins = wins.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamStatDetailDto]
  }
  @scala.inline
  implicit class TeamStatDetailDtoOps[Self <: TeamStatDetailDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAverageGamesPlayed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageGamesPlayed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLosses(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("losses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeamStatType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamStatType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWins(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wins")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

