package typingsSlinky.riotGamesApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  var ascendedType: String = js.native
  var assistingParticipantIds: js.Array[Double] = js.native
  var buildingType: String = js.native
  var creatorId: Double = js.native
  var eventType: String = js.native
  var itemAfter: Double = js.native
  var itemBefore: Double = js.native
  var itemId: Double = js.native
  var killerId: Double = js.native
  var laneType: String = js.native
  var levelUpType: String = js.native
  var monsterType: String = js.native
  var participantId: Double = js.native
  var pointCaptured: String = js.native
  var position: Position = js.native
  var skillSlot: Double = js.native
  var teamId: Double = js.native
  var timestamp: Double = js.native
  var towerType: String = js.native
  var victimId: Double = js.native
  var wardType: String = js.native
}

object Event {
  @scala.inline
  def apply(
    ascendedType: String,
    assistingParticipantIds: js.Array[Double],
    buildingType: String,
    creatorId: Double,
    eventType: String,
    itemAfter: Double,
    itemBefore: Double,
    itemId: Double,
    killerId: Double,
    laneType: String,
    levelUpType: String,
    monsterType: String,
    participantId: Double,
    pointCaptured: String,
    position: Position,
    skillSlot: Double,
    teamId: Double,
    timestamp: Double,
    towerType: String,
    victimId: Double,
    wardType: String
  ): Event = {
    val __obj = js.Dynamic.literal(ascendedType = ascendedType.asInstanceOf[js.Any], assistingParticipantIds = assistingParticipantIds.asInstanceOf[js.Any], buildingType = buildingType.asInstanceOf[js.Any], creatorId = creatorId.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], itemAfter = itemAfter.asInstanceOf[js.Any], itemBefore = itemBefore.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], killerId = killerId.asInstanceOf[js.Any], laneType = laneType.asInstanceOf[js.Any], levelUpType = levelUpType.asInstanceOf[js.Any], monsterType = monsterType.asInstanceOf[js.Any], participantId = participantId.asInstanceOf[js.Any], pointCaptured = pointCaptured.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], skillSlot = skillSlot.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], towerType = towerType.asInstanceOf[js.Any], victimId = victimId.asInstanceOf[js.Any], wardType = wardType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAscendedType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascendedType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssistingParticipantIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assistingParticipantIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildingType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatorId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemBefore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKillerId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLaneType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("laneType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevelUpType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelUpType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonsterType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monsterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParticipantId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointCaptured(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointCaptured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkillSlot(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skillSlot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeamId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTowerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("towerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVictimId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("victimId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWardType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wardType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

