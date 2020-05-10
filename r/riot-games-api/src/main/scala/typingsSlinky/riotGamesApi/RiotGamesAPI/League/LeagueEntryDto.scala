package typingsSlinky.riotGamesApi.RiotGamesAPI.League

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeagueEntryDto extends js.Object {
  var division: String = js.native
  var isFreshBlood: Boolean = js.native
  var isHotStreak: Boolean = js.native
  var isInactive: Boolean = js.native
  var isVeteran: Boolean = js.native
  var leaguePoints: Double = js.native
  var losses: Double = js.native
  var miniSeries: MiniSeriesDto = js.native
  var playerOrTeamId: String = js.native
  var playerOrTeamName: String = js.native
  var wins: Double = js.native
}

object LeagueEntryDto {
  @scala.inline
  def apply(
    division: String,
    isFreshBlood: Boolean,
    isHotStreak: Boolean,
    isInactive: Boolean,
    isVeteran: Boolean,
    leaguePoints: Double,
    losses: Double,
    miniSeries: MiniSeriesDto,
    playerOrTeamId: String,
    playerOrTeamName: String,
    wins: Double
  ): LeagueEntryDto = {
    val __obj = js.Dynamic.literal(division = division.asInstanceOf[js.Any], isFreshBlood = isFreshBlood.asInstanceOf[js.Any], isHotStreak = isHotStreak.asInstanceOf[js.Any], isInactive = isInactive.asInstanceOf[js.Any], isVeteran = isVeteran.asInstanceOf[js.Any], leaguePoints = leaguePoints.asInstanceOf[js.Any], losses = losses.asInstanceOf[js.Any], miniSeries = miniSeries.asInstanceOf[js.Any], playerOrTeamId = playerOrTeamId.asInstanceOf[js.Any], playerOrTeamName = playerOrTeamName.asInstanceOf[js.Any], wins = wins.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeagueEntryDto]
  }
  @scala.inline
  implicit class LeagueEntryDtoOps[Self <: LeagueEntryDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDivision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("division")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFreshBlood(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFreshBlood")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHotStreak(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHotStreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInactive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVeteran(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVeteran")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeaguePoints(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaguePoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLosses(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("losses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiniSeries(value: MiniSeriesDto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miniSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayerOrTeamId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerOrTeamId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayerOrTeamName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerOrTeamName")(value.asInstanceOf[js.Any])
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

