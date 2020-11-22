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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Google Play Game Services v1 */
      def load(name: games, version: v1): js.Thenable[Unit] = js.native
      def load(name: games, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object games extends js.Object {
        
        val achievementDefinitions: AchievementDefinitionsResource = js.native
        
        val achievements: AchievementsResource = js.native
        
        val applications: ApplicationsResource = js.native
        
        val events: EventsResource = js.native
        
        val leaderboards: LeaderboardsResource = js.native
        
        val metagame: MetagameResource = js.native
        
        val players: PlayersResource = js.native
        
        val revisions: RevisionsResource = js.native
        
        val scores: ScoresResource = js.native
        
        val snapshots: SnapshotsResource = js.native
        
        val snapshotsExtended: SnapshotsExtendedResource = js.native
        
        val stats: StatsResource = js.native
      }
    }
  }
}
