package typingsSlinky.riotGamesApi.RiotGamesAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * championmastery
  */
object ChampionMastery {
  
  @js.native
  trait ChampionMasteryDto extends StObject {
    
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
    implicit class ChampionMasteryDtoMutableBuilder[Self <: ChampionMasteryDto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChampionId(value: Double): Self = StObject.set(x, "championId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChampionLevel(value: Double): Self = StObject.set(x, "championLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChampionPoints(value: Double): Self = StObject.set(x, "championPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChampionPointsSinceLastLevel(value: Double): Self = StObject.set(x, "championPointsSinceLastLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChampionPointsUntilNextLevel(value: Double): Self = StObject.set(x, "championPointsUntilNextLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChestGranted(value: Boolean): Self = StObject.set(x, "chestGranted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighestGrade(value: String): Self = StObject.set(x, "highestGrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastPlayTime(value: Double): Self = StObject.set(x, "lastPlayTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayerId(value: Double): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
    }
  }
}
