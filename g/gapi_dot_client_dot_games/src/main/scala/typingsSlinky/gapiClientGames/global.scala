package typingsSlinky.gapiClientGames

import typingsSlinky.gapiClientGames.gapi.client.games.AchievementDefinitionsResource
import typingsSlinky.gapiClientGames.gapi.client.games.AchievementsResource
import typingsSlinky.gapiClientGames.gapi.client.games.ApplicationsResource
import typingsSlinky.gapiClientGames.gapi.client.games.EventsResource
import typingsSlinky.gapiClientGames.gapi.client.games.LeaderboardsResource
import typingsSlinky.gapiClientGames.gapi.client.games.MetagameResource
import typingsSlinky.gapiClientGames.gapi.client.games.PlayersResource
import typingsSlinky.gapiClientGames.gapi.client.games.PushtokensResource
import typingsSlinky.gapiClientGames.gapi.client.games.QuestMilestonesResource
import typingsSlinky.gapiClientGames.gapi.client.games.QuestsResource
import typingsSlinky.gapiClientGames.gapi.client.games.RevisionsResource
import typingsSlinky.gapiClientGames.gapi.client.games.RoomsResource
import typingsSlinky.gapiClientGames.gapi.client.games.ScoresResource
import typingsSlinky.gapiClientGames.gapi.client.games.SnapshotsResource
import typingsSlinky.gapiClientGames.gapi.client.games.TurnBasedMatchesResource
import typingsSlinky.gapiClientGames.gapiClientGamesStrings.games
import typingsSlinky.gapiClientGames.gapiClientGamesStrings.v1
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
      
      val achievementDefinitions: AchievementDefinitionsResource = js.native
      
      val achievements: AchievementsResource = js.native
      
      val applications: ApplicationsResource = js.native
      
      val events: EventsResource = js.native
      
      val leaderboards: LeaderboardsResource = js.native
      
      /** Load Google Play Game Services API v1 */
      def load(name: games, version: v1): js.Thenable[Unit] = js.native
      def load(name: games, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val metagame: MetagameResource = js.native
      
      val players: PlayersResource = js.native
      
      val pushtokens: PushtokensResource = js.native
      
      val questMilestones: QuestMilestonesResource = js.native
      
      val quests: QuestsResource = js.native
      
      val revisions: RevisionsResource = js.native
      
      val rooms: RoomsResource = js.native
      
      val scores: ScoresResource = js.native
      
      val snapshots: SnapshotsResource = js.native
      
      val turnBasedMatches: TurnBasedMatchesResource = js.native
    }
  }
}
