package typingsSlinky.maximMazurokGapiClientGames

import typingsSlinky.maximMazurokGapiClientGames.gapi.client.games.AchievementDefinitionsResource
import typingsSlinky.maximMazurokGapiClientGames.gapi.client.games.AchievementsResource
import typingsSlinky.maximMazurokGapiClientGames.gapi.client.games.ApplicationsResource
import typingsSlinky.maximMazurokGapiClientGames.gapi.client.games.EventsResource
import typingsSlinky.maximMazurokGapiClientGames.gapi.client.games.LeaderboardsResource
import typingsSlinky.maximMazurokGapiClientGames.gapi.client.games.MetagameResource
import typingsSlinky.maximMazurokGapiClientGames.gapi.client.games.PlayersResource
import typingsSlinky.maximMazurokGapiClientGames.gapi.client.games.RevisionsResource
import typingsSlinky.maximMazurokGapiClientGames.gapi.client.games.ScoresResource
import typingsSlinky.maximMazurokGapiClientGames.gapi.client.games.SnapshotsExtendedResource
import typingsSlinky.maximMazurokGapiClientGames.gapi.client.games.SnapshotsResource
import typingsSlinky.maximMazurokGapiClientGames.gapi.client.games.StatsResource
import typingsSlinky.maximMazurokGapiClientGames.maximMazurokGapiClientGamesStrings.games
import typingsSlinky.maximMazurokGapiClientGames.maximMazurokGapiClientGamesStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object games {
        
        @JSGlobal("gapi.client.games.achievementDefinitions")
        @js.native
        val achievementDefinitions: AchievementDefinitionsResource = js.native
        
        @JSGlobal("gapi.client.games.achievements")
        @js.native
        val achievements: AchievementsResource = js.native
        
        @JSGlobal("gapi.client.games.applications")
        @js.native
        val applications: ApplicationsResource = js.native
        
        @JSGlobal("gapi.client.games.events")
        @js.native
        val events: EventsResource = js.native
        
        @JSGlobal("gapi.client.games.leaderboards")
        @js.native
        val leaderboards: LeaderboardsResource = js.native
        
        @JSGlobal("gapi.client.games.metagame")
        @js.native
        val metagame: MetagameResource = js.native
        
        @JSGlobal("gapi.client.games.players")
        @js.native
        val players: PlayersResource = js.native
        
        @JSGlobal("gapi.client.games.revisions")
        @js.native
        val revisions: RevisionsResource = js.native
        
        @JSGlobal("gapi.client.games.scores")
        @js.native
        val scores: ScoresResource = js.native
        
        @JSGlobal("gapi.client.games.snapshots")
        @js.native
        val snapshots: SnapshotsResource = js.native
        
        @JSGlobal("gapi.client.games.snapshotsExtended")
        @js.native
        val snapshotsExtended: SnapshotsExtendedResource = js.native
        
        @JSGlobal("gapi.client.games.stats")
        @js.native
        val stats: StatsResource = js.native
      }
      
      /** Load Google Play Game Services v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: games, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: games, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
