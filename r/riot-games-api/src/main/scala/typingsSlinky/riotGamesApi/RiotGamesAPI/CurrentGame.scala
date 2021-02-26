package typingsSlinky.riotGamesApi.RiotGamesAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * current-game-v1.0
  */
object CurrentGame {
  
  @js.native
  trait BannedChampion extends StObject {
    
    var championId: Double = js.native
    
    var pickTurn: Double = js.native
    
    var teamId: Double = js.native
  }
  object BannedChampion {
    
    @scala.inline
    def apply(championId: Double, pickTurn: Double, teamId: Double): BannedChampion = {
      val __obj = js.Dynamic.literal(championId = championId.asInstanceOf[js.Any], pickTurn = pickTurn.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BannedChampion]
    }
    
    @scala.inline
    implicit class BannedChampionMutableBuilder[Self <: BannedChampion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChampionId(value: Double): Self = StObject.set(x, "championId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickTurn(value: Double): Self = StObject.set(x, "pickTurn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamId(value: Double): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CurrentGameInfo extends StObject {
    
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
    implicit class CurrentGameInfoMutableBuilder[Self <: CurrentGameInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBannedChampion(value: js.Array[BannedChampion]): Self = StObject.set(x, "bannedChampion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBannedChampionVarargs(value: BannedChampion*): Self = StObject.set(x, "bannedChampion", js.Array(value :_*))
      
      @scala.inline
      def setGameId(value: Double): Self = StObject.set(x, "gameId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGameLength(value: Double): Self = StObject.set(x, "gameLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGameMode(value: Double): Self = StObject.set(x, "gameMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGameQueueConfigId(value: Double): Self = StObject.set(x, "gameQueueConfigId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGameStartTime(value: Double): Self = StObject.set(x, "gameStartTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGameType(value: String): Self = StObject.set(x, "gameType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapId(value: Double): Self = StObject.set(x, "mapId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObservers(value: Observer): Self = StObject.set(x, "observers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParticipants(value: js.Array[CurrentGameParticipant]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParticipantsVarargs(value: CurrentGameParticipant*): Self = StObject.set(x, "participants", js.Array(value :_*))
      
      @scala.inline
      def setPlatformId(value: String): Self = StObject.set(x, "platformId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CurrentGameParticipant extends StObject {
    
    var bot: Boolean = js.native
    
    var championId: Double = js.native
    
    var masteries: js.Array[Mastery] = js.native
    
    var profileIconId: Double = js.native
    
    var runes: js.Array[Rune] = js.native
    
    var spell1Id: Double = js.native
    
    var spell2Id: Double = js.native
    
    var summonerId: Double = js.native
    
    var summonerName: String = js.native
    
    var teamId: Double = js.native
  }
  object CurrentGameParticipant {
    
    @scala.inline
    def apply(
      bot: Boolean,
      championId: Double,
      masteries: js.Array[Mastery],
      profileIconId: Double,
      runes: js.Array[Rune],
      spell1Id: Double,
      spell2Id: Double,
      summonerId: Double,
      summonerName: String,
      teamId: Double
    ): CurrentGameParticipant = {
      val __obj = js.Dynamic.literal(bot = bot.asInstanceOf[js.Any], championId = championId.asInstanceOf[js.Any], masteries = masteries.asInstanceOf[js.Any], profileIconId = profileIconId.asInstanceOf[js.Any], runes = runes.asInstanceOf[js.Any], spell1Id = spell1Id.asInstanceOf[js.Any], spell2Id = spell2Id.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any], summonerName = summonerName.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentGameParticipant]
    }
    
    @scala.inline
    implicit class CurrentGameParticipantMutableBuilder[Self <: CurrentGameParticipant] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBot(value: Boolean): Self = StObject.set(x, "bot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChampionId(value: Double): Self = StObject.set(x, "championId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasteries(value: js.Array[Mastery]): Self = StObject.set(x, "masteries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasteriesVarargs(value: Mastery*): Self = StObject.set(x, "masteries", js.Array(value :_*))
      
      @scala.inline
      def setProfileIconId(value: Double): Self = StObject.set(x, "profileIconId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunes(value: js.Array[Rune]): Self = StObject.set(x, "runes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunesVarargs(value: Rune*): Self = StObject.set(x, "runes", js.Array(value :_*))
      
      @scala.inline
      def setSpell1Id(value: Double): Self = StObject.set(x, "spell1Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpell2Id(value: Double): Self = StObject.set(x, "spell2Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummonerId(value: Double): Self = StObject.set(x, "summonerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummonerName(value: String): Self = StObject.set(x, "summonerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamId(value: Double): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Mastery extends StObject {
    
    var masterId: Double = js.native
    
    var rank: Double = js.native
  }
  object Mastery {
    
    @scala.inline
    def apply(masterId: Double, rank: Double): Mastery = {
      val __obj = js.Dynamic.literal(masterId = masterId.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mastery]
    }
    
    @scala.inline
    implicit class MasteryMutableBuilder[Self <: Mastery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMasterId(value: Double): Self = StObject.set(x, "masterId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Observer extends StObject {
    
    var encryptionKey: String = js.native
  }
  object Observer {
    
    @scala.inline
    def apply(encryptionKey: String): Observer = {
      val __obj = js.Dynamic.literal(encryptionKey = encryptionKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Observer]
    }
    
    @scala.inline
    implicit class ObserverMutableBuilder[Self <: Observer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncryptionKey(value: String): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Rune extends StObject {
    
    var count: Double = js.native
    
    var runeId: Double = js.native
  }
  object Rune {
    
    @scala.inline
    def apply(count: Double, runeId: Double): Rune = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], runeId = runeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rune]
    }
    
    @scala.inline
    implicit class RuneMutableBuilder[Self <: Rune] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuneId(value: Double): Self = StObject.set(x, "runeId", value.asInstanceOf[js.Any])
    }
  }
}
