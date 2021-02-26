package typingsSlinky.riotGamesApi.RiotGamesAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * league-v2.5
  */
object League {
  
  @js.native
  trait LeagueDto extends StObject {
    
    var entries: js.Array[LeagueEntryDto] = js.native
    
    var name: String = js.native
    
    var participantId: String = js.native
    
    var queue: String = js.native
    
    var tier: String = js.native
  }
  object LeagueDto {
    
    @scala.inline
    def apply(
      entries: js.Array[LeagueEntryDto],
      name: String,
      participantId: String,
      queue: String,
      tier: String
    ): LeagueDto = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], participantId = participantId.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], tier = tier.asInstanceOf[js.Any])
      __obj.asInstanceOf[LeagueDto]
    }
    
    @scala.inline
    implicit class LeagueDtoMutableBuilder[Self <: LeagueDto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntries(value: js.Array[LeagueEntryDto]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntriesVarargs(value: LeagueEntryDto*): Self = StObject.set(x, "entries", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParticipantId(value: String): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LeagueEntryDto extends StObject {
    
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
    implicit class LeagueEntryDtoMutableBuilder[Self <: LeagueEntryDto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDivision(value: String): Self = StObject.set(x, "division", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFreshBlood(value: Boolean): Self = StObject.set(x, "isFreshBlood", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHotStreak(value: Boolean): Self = StObject.set(x, "isHotStreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInactive(value: Boolean): Self = StObject.set(x, "isInactive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVeteran(value: Boolean): Self = StObject.set(x, "isVeteran", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeaguePoints(value: Double): Self = StObject.set(x, "leaguePoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLosses(value: Double): Self = StObject.set(x, "losses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiniSeries(value: MiniSeriesDto): Self = StObject.set(x, "miniSeries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayerOrTeamId(value: String): Self = StObject.set(x, "playerOrTeamId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayerOrTeamName(value: String): Self = StObject.set(x, "playerOrTeamName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWins(value: Double): Self = StObject.set(x, "wins", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MiniSeriesDto extends StObject {
    
    var losses: Double = js.native
    
    var progress: String = js.native
    
    var target: Double = js.native
    
    var wins: Double = js.native
  }
  object MiniSeriesDto {
    
    @scala.inline
    def apply(losses: Double, progress: String, target: Double, wins: Double): MiniSeriesDto = {
      val __obj = js.Dynamic.literal(losses = losses.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], wins = wins.asInstanceOf[js.Any])
      __obj.asInstanceOf[MiniSeriesDto]
    }
    
    @scala.inline
    implicit class MiniSeriesDtoMutableBuilder[Self <: MiniSeriesDto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLosses(value: Double): Self = StObject.set(x, "losses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress(value: String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWins(value: Double): Self = StObject.set(x, "wins", value.asInstanceOf[js.Any])
    }
  }
}
