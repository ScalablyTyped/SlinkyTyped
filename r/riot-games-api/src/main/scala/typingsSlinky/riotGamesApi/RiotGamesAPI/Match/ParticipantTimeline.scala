package typingsSlinky.riotGamesApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParticipantTimeline extends js.Object {
  var ancientGolemAssistsPerMinCounts: ParticipantTimelineData = js.native
  var ancientGolemKillsPerMinCounts: ParticipantTimelineData = js.native
  var assistedLaneDeathsPerMinDeltas: ParticipantTimelineData = js.native
  var assistedLaneKillsPerMinDeltas: ParticipantTimelineData = js.native
  var baronAssistsPerMinCounts: ParticipantTimelineData = js.native
  var baronKillsPerMinCounts: ParticipantTimelineData = js.native
  var creepsPerMinDeltas: ParticipantTimelineData = js.native
  var csDiffPerMinDeltas: ParticipantTimelineData = js.native
  var damageTakenDiffPerMinDeltas: ParticipantTimelineData = js.native
  var damageTakenPerMinDeltas: ParticipantTimelineData = js.native
  var dragonAssistsPerMinCounts: ParticipantTimelineData = js.native
  var dragonKillsPerMinCounts: ParticipantTimelineData = js.native
  var elderLizardAssistsPerMinCounts: ParticipantTimelineData = js.native
  var elderLizardKillsPerMinCounts: ParticipantTimelineData = js.native
  var goldPerMinDeltas: ParticipantTimelineData = js.native
  var inhibitorAssistsPerMinCounts: ParticipantTimelineData = js.native
  var inhibitorKillsPerMinCounts: ParticipantTimelineData = js.native
  var lane: String = js.native
  var role: String = js.native
  var towerAssistsPerMinCounts: ParticipantTimelineData = js.native
  var towerKillsPerMinCounts: ParticipantTimelineData = js.native
  var towerKillsPerMinDeltas: ParticipantTimelineData = js.native
  var vilemawAssistsPerMinCounts: ParticipantTimelineData = js.native
  var vilemawKillsPerMinCounts: ParticipantTimelineData = js.native
  var wardsPerMinDeltas: ParticipantTimelineData = js.native
  var xpDiffPerMinDeltas: ParticipantTimelineData = js.native
  var xpPerMinDeltas: ParticipantTimelineData = js.native
}

object ParticipantTimeline {
  @scala.inline
  def apply(
    ancientGolemAssistsPerMinCounts: ParticipantTimelineData,
    ancientGolemKillsPerMinCounts: ParticipantTimelineData,
    assistedLaneDeathsPerMinDeltas: ParticipantTimelineData,
    assistedLaneKillsPerMinDeltas: ParticipantTimelineData,
    baronAssistsPerMinCounts: ParticipantTimelineData,
    baronKillsPerMinCounts: ParticipantTimelineData,
    creepsPerMinDeltas: ParticipantTimelineData,
    csDiffPerMinDeltas: ParticipantTimelineData,
    damageTakenDiffPerMinDeltas: ParticipantTimelineData,
    damageTakenPerMinDeltas: ParticipantTimelineData,
    dragonAssistsPerMinCounts: ParticipantTimelineData,
    dragonKillsPerMinCounts: ParticipantTimelineData,
    elderLizardAssistsPerMinCounts: ParticipantTimelineData,
    elderLizardKillsPerMinCounts: ParticipantTimelineData,
    goldPerMinDeltas: ParticipantTimelineData,
    inhibitorAssistsPerMinCounts: ParticipantTimelineData,
    inhibitorKillsPerMinCounts: ParticipantTimelineData,
    lane: String,
    role: String,
    towerAssistsPerMinCounts: ParticipantTimelineData,
    towerKillsPerMinCounts: ParticipantTimelineData,
    towerKillsPerMinDeltas: ParticipantTimelineData,
    vilemawAssistsPerMinCounts: ParticipantTimelineData,
    vilemawKillsPerMinCounts: ParticipantTimelineData,
    wardsPerMinDeltas: ParticipantTimelineData,
    xpDiffPerMinDeltas: ParticipantTimelineData,
    xpPerMinDeltas: ParticipantTimelineData
  ): ParticipantTimeline = {
    val __obj = js.Dynamic.literal(ancientGolemAssistsPerMinCounts = ancientGolemAssistsPerMinCounts.asInstanceOf[js.Any], ancientGolemKillsPerMinCounts = ancientGolemKillsPerMinCounts.asInstanceOf[js.Any], assistedLaneDeathsPerMinDeltas = assistedLaneDeathsPerMinDeltas.asInstanceOf[js.Any], assistedLaneKillsPerMinDeltas = assistedLaneKillsPerMinDeltas.asInstanceOf[js.Any], baronAssistsPerMinCounts = baronAssistsPerMinCounts.asInstanceOf[js.Any], baronKillsPerMinCounts = baronKillsPerMinCounts.asInstanceOf[js.Any], creepsPerMinDeltas = creepsPerMinDeltas.asInstanceOf[js.Any], csDiffPerMinDeltas = csDiffPerMinDeltas.asInstanceOf[js.Any], damageTakenDiffPerMinDeltas = damageTakenDiffPerMinDeltas.asInstanceOf[js.Any], damageTakenPerMinDeltas = damageTakenPerMinDeltas.asInstanceOf[js.Any], dragonAssistsPerMinCounts = dragonAssistsPerMinCounts.asInstanceOf[js.Any], dragonKillsPerMinCounts = dragonKillsPerMinCounts.asInstanceOf[js.Any], elderLizardAssistsPerMinCounts = elderLizardAssistsPerMinCounts.asInstanceOf[js.Any], elderLizardKillsPerMinCounts = elderLizardKillsPerMinCounts.asInstanceOf[js.Any], goldPerMinDeltas = goldPerMinDeltas.asInstanceOf[js.Any], inhibitorAssistsPerMinCounts = inhibitorAssistsPerMinCounts.asInstanceOf[js.Any], inhibitorKillsPerMinCounts = inhibitorKillsPerMinCounts.asInstanceOf[js.Any], lane = lane.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], towerAssistsPerMinCounts = towerAssistsPerMinCounts.asInstanceOf[js.Any], towerKillsPerMinCounts = towerKillsPerMinCounts.asInstanceOf[js.Any], towerKillsPerMinDeltas = towerKillsPerMinDeltas.asInstanceOf[js.Any], vilemawAssistsPerMinCounts = vilemawAssistsPerMinCounts.asInstanceOf[js.Any], vilemawKillsPerMinCounts = vilemawKillsPerMinCounts.asInstanceOf[js.Any], wardsPerMinDeltas = wardsPerMinDeltas.asInstanceOf[js.Any], xpDiffPerMinDeltas = xpDiffPerMinDeltas.asInstanceOf[js.Any], xpPerMinDeltas = xpPerMinDeltas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantTimeline]
  }
  @scala.inline
  implicit class ParticipantTimelineOps[Self <: ParticipantTimeline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAncientGolemAssistsPerMinCounts(value: ParticipantTimelineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ancientGolemAssistsPerMinCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAncientGolemKillsPerMinCounts(value: ParticipantTimelineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ancientGolemKillsPerMinCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssistedLaneDeathsPerMinDeltas(value: ParticipantTimelineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assistedLaneDeathsPerMinDeltas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssistedLaneKillsPerMinDeltas(value: ParticipantTimelineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assistedLaneKillsPerMinDeltas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaronAssistsPerMinCounts(value: ParticipantTimelineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baronAssistsPerMinCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaronKillsPerMinCounts(value: ParticipantTimelineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baronKillsPerMinCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreepsPerMinDeltas(value: ParticipantTimelineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creepsPerMinDeltas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCsDiffPerMinDeltas(value: ParticipantTimelineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csDiffPerMinDeltas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDamageTakenDiffPerMinDeltas(value: ParticipantTimelineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("damageTakenDiffPerMinDeltas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDamageTakenPerMinDeltas(value: ParticipantTimelineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("damageTakenPerMinDeltas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragonAssistsPerMinCounts(value: ParticipantTimelineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragonAssistsPerMinCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragonKillsPerMinCounts(value: ParticipantTimelineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragonKillsPerMinCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElderLizardAssistsPerMinCounts(value: ParticipantTimelineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elderLizardAssistsPerMinCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElderLizardKillsPerMinCounts(value: ParticipantTimelineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elderLizardKillsPerMinCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoldPerMinDeltas(value: ParticipantTimelineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goldPerMinDeltas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInhibitorAssistsPerMinCounts(value: ParticipantTimelineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inhibitorAssistsPerMinCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInhibitorKillsPerMinCounts(value: ParticipantTimelineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inhibitorKillsPerMinCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLane(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTowerAssistsPerMinCounts(value: ParticipantTimelineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("towerAssistsPerMinCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTowerKillsPerMinCounts(value: ParticipantTimelineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("towerKillsPerMinCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTowerKillsPerMinDeltas(value: ParticipantTimelineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("towerKillsPerMinDeltas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVilemawAssistsPerMinCounts(value: ParticipantTimelineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vilemawAssistsPerMinCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVilemawKillsPerMinCounts(value: ParticipantTimelineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vilemawKillsPerMinCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWardsPerMinDeltas(value: ParticipantTimelineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wardsPerMinDeltas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXpDiffPerMinDeltas(value: ParticipantTimelineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpDiffPerMinDeltas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXpPerMinDeltas(value: ParticipantTimelineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpPerMinDeltas")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

