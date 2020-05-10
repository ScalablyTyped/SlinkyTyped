package typingsSlinky.riotGamesApi.RiotGamesAPI.Game

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GameDto extends js.Object {
  var championId: Double = js.native
  var createDate: Double = js.native
  var fellowPlayers: js.Array[PlayerDto] = js.native
  var gameId: Double = js.native
  var gameMode: String = js.native
  var gameType: String = js.native
  var invalid: Boolean = js.native
  var ipEarned: Double = js.native
  var level: Double = js.native
  var mapId: Double = js.native
  var spell1: Double = js.native
  var spell2: Double = js.native
  var stats: RawStatsDto = js.native
  var subType: String = js.native
  var teamId: Double = js.native
}

object GameDto {
  @scala.inline
  def apply(
    championId: Double,
    createDate: Double,
    fellowPlayers: js.Array[PlayerDto],
    gameId: Double,
    gameMode: String,
    gameType: String,
    invalid: Boolean,
    ipEarned: Double,
    level: Double,
    mapId: Double,
    spell1: Double,
    spell2: Double,
    stats: RawStatsDto,
    subType: String,
    teamId: Double
  ): GameDto = {
    val __obj = js.Dynamic.literal(championId = championId.asInstanceOf[js.Any], createDate = createDate.asInstanceOf[js.Any], fellowPlayers = fellowPlayers.asInstanceOf[js.Any], gameId = gameId.asInstanceOf[js.Any], gameMode = gameMode.asInstanceOf[js.Any], gameType = gameType.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], ipEarned = ipEarned.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], spell1 = spell1.asInstanceOf[js.Any], spell2 = spell2.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], subType = subType.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameDto]
  }
  @scala.inline
  implicit class GameDtoOps[Self <: GameDto] (val x: Self) extends AnyVal {
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
    def withCreateDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFellowPlayers(value: js.Array[PlayerDto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fellowPlayers")(value.asInstanceOf[js.Any])
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
    def withGameType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpEarned(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipEarned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpell1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spell1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpell2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spell2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStats(value: RawStatsDto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subType")(value.asInstanceOf[js.Any])
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

