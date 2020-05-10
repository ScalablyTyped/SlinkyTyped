package typingsSlinky.riotGamesApi.RiotGamesAPI.ChampionMastery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChampionMasteryDto extends js.Object {
  var championId: Double = js.native
  var championLevel: Double = js.native
  var championPoints: Double = js.native
  var championPointsSinceLastLevel: Double = js.native
  var championPointsUntilNextLevel: Double = js.native
  var chestGranted: Boolean = js.native
  var highestGrade: String = js.native
  var lastPlayTime: Double = js.native
  var playerId: Double = js.native
}

object ChampionMasteryDto {
  @scala.inline
  def apply(
    championId: Double,
    championLevel: Double,
    championPoints: Double,
    championPointsSinceLastLevel: Double,
    championPointsUntilNextLevel: Double,
    chestGranted: Boolean,
    highestGrade: String,
    lastPlayTime: Double,
    playerId: Double
  ): ChampionMasteryDto = {
    val __obj = js.Dynamic.literal(championId = championId.asInstanceOf[js.Any], championLevel = championLevel.asInstanceOf[js.Any], championPoints = championPoints.asInstanceOf[js.Any], championPointsSinceLastLevel = championPointsSinceLastLevel.asInstanceOf[js.Any], championPointsUntilNextLevel = championPointsUntilNextLevel.asInstanceOf[js.Any], chestGranted = chestGranted.asInstanceOf[js.Any], highestGrade = highestGrade.asInstanceOf[js.Any], lastPlayTime = lastPlayTime.asInstanceOf[js.Any], playerId = playerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChampionMasteryDto]
  }
  @scala.inline
  implicit class ChampionMasteryDtoOps[Self <: ChampionMasteryDto] (val x: Self) extends AnyVal {
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
    def withChampionLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("championLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChampionPoints(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("championPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChampionPointsSinceLastLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("championPointsSinceLastLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChampionPointsUntilNextLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("championPointsUntilNextLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChestGranted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chestGranted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighestGrade(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highestGrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastPlayTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPlayTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayerId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

