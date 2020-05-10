package typingsSlinky.riotGamesApi.RiotGamesAPI.Team

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchHistorySummaryDto extends js.Object {
  var assists: Double = js.native
  var date: Double = js.native
  var deaths: Double = js.native
  var gameId: Double = js.native
  var gameMode: String = js.native
  var invalid: Boolean = js.native
  var kills: Double = js.native
  var mapId: Double = js.native
  var opposingTeamKills: Double = js.native
  var opposingTeamName: String = js.native
  var win: Boolean = js.native
}

object MatchHistorySummaryDto {
  @scala.inline
  def apply(
    assists: Double,
    date: Double,
    deaths: Double,
    gameId: Double,
    gameMode: String,
    invalid: Boolean,
    kills: Double,
    mapId: Double,
    opposingTeamKills: Double,
    opposingTeamName: String,
    win: Boolean
  ): MatchHistorySummaryDto = {
    val __obj = js.Dynamic.literal(assists = assists.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], deaths = deaths.asInstanceOf[js.Any], gameId = gameId.asInstanceOf[js.Any], gameMode = gameMode.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], kills = kills.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], opposingTeamKills = opposingTeamKills.asInstanceOf[js.Any], opposingTeamName = opposingTeamName.asInstanceOf[js.Any], win = win.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchHistorySummaryDto]
  }
  @scala.inline
  implicit class MatchHistorySummaryDtoOps[Self <: MatchHistorySummaryDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssists(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeaths(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGameId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGameMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKills(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kills")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpposingTeamKills(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opposingTeamKills")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpposingTeamName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opposingTeamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("win")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

