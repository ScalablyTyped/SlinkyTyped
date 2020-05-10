package typingsSlinky.riotGamesApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Team extends js.Object {
  var bans: js.Array[BannedChampion] = js.native
  var baronKills: Double = js.native
  var dominionVictoryScore: Double = js.native
  var dragonKills: Double = js.native
  var firstBaron: Boolean = js.native
  var firstBlood: Boolean = js.native
  var firstDragon: Boolean = js.native
  var firstInhibitor: Boolean = js.native
  var firstTower: Boolean = js.native
  var inhibitorKills: Double = js.native
  var teamId: Double = js.native
  var towerKills: Double = js.native
  var vilemawKills: Double = js.native
  var winner: Boolean = js.native
}

object Team {
  @scala.inline
  def apply(
    bans: js.Array[BannedChampion],
    baronKills: Double,
    dominionVictoryScore: Double,
    dragonKills: Double,
    firstBaron: Boolean,
    firstBlood: Boolean,
    firstDragon: Boolean,
    firstInhibitor: Boolean,
    firstTower: Boolean,
    inhibitorKills: Double,
    teamId: Double,
    towerKills: Double,
    vilemawKills: Double,
    winner: Boolean
  ): Team = {
    val __obj = js.Dynamic.literal(bans = bans.asInstanceOf[js.Any], baronKills = baronKills.asInstanceOf[js.Any], dominionVictoryScore = dominionVictoryScore.asInstanceOf[js.Any], dragonKills = dragonKills.asInstanceOf[js.Any], firstBaron = firstBaron.asInstanceOf[js.Any], firstBlood = firstBlood.asInstanceOf[js.Any], firstDragon = firstDragon.asInstanceOf[js.Any], firstInhibitor = firstInhibitor.asInstanceOf[js.Any], firstTower = firstTower.asInstanceOf[js.Any], inhibitorKills = inhibitorKills.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any], towerKills = towerKills.asInstanceOf[js.Any], vilemawKills = vilemawKills.asInstanceOf[js.Any], winner = winner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Team]
  }
  @scala.inline
  implicit class TeamOps[Self <: Team] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBans(value: js.Array[BannedChampion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaronKills(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baronKills")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDominionVictoryScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dominionVictoryScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragonKills(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragonKills")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstBaron(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstBaron")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstBlood(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstBlood")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstDragon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDragon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstInhibitor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstInhibitor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstTower(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstTower")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInhibitorKills(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inhibitorKills")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeamId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTowerKills(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("towerKills")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVilemawKills(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vilemawKills")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWinner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("winner")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

