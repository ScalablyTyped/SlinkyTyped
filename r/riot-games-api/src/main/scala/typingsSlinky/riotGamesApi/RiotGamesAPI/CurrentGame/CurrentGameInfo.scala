package typingsSlinky.riotGamesApi.RiotGamesAPI.CurrentGame

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentGameInfo extends js.Object {
  var bannedChampion: js.Array[BannedChampion] = js.native
  var gameId: Double = js.native
  var gameLength: Double = js.native
  var gameMode: Double = js.native
  var gameQueueConfigId: Double = js.native
  var gameStartTime: Double = js.native
  var gameType: String = js.native
  var mapId: Double = js.native
  var observers: Observer = js.native
  var participants: js.Array[CurrentGameParticipant] = js.native
  var platformId: String = js.native
}

object CurrentGameInfo {
  @scala.inline
  def apply(
    bannedChampion: js.Array[BannedChampion],
    gameId: Double,
    gameLength: Double,
    gameMode: Double,
    gameQueueConfigId: Double,
    gameStartTime: Double,
    gameType: String,
    mapId: Double,
    observers: Observer,
    participants: js.Array[CurrentGameParticipant],
    platformId: String
  ): CurrentGameInfo = {
    val __obj = js.Dynamic.literal(bannedChampion = bannedChampion.asInstanceOf[js.Any], gameId = gameId.asInstanceOf[js.Any], gameLength = gameLength.asInstanceOf[js.Any], gameMode = gameMode.asInstanceOf[js.Any], gameQueueConfigId = gameQueueConfigId.asInstanceOf[js.Any], gameStartTime = gameStartTime.asInstanceOf[js.Any], gameType = gameType.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], observers = observers.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any], platformId = platformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentGameInfo]
  }
  @scala.inline
  implicit class CurrentGameInfoOps[Self <: CurrentGameInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBannedChampion(value: js.Array[BannedChampion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannedChampion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGameId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGameLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGameMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGameQueueConfigId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameQueueConfigId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGameStartTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGameType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObservers(value: Observer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParticipants(value: js.Array[CurrentGameParticipant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatformId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

