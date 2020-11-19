package typingsSlinky.gapiClientGamesmanagement

import typingsSlinky.gapiClientGamesmanagement.gapi.client.gamesmanagement.AchievementsResource
import typingsSlinky.gapiClientGamesmanagement.gapi.client.gamesmanagement.ApplicationsResource
import typingsSlinky.gapiClientGamesmanagement.gapi.client.gamesmanagement.EventsResource
import typingsSlinky.gapiClientGamesmanagement.gapi.client.gamesmanagement.PlayersResource
import typingsSlinky.gapiClientGamesmanagement.gapi.client.gamesmanagement.QuestsResource
import typingsSlinky.gapiClientGamesmanagement.gapi.client.gamesmanagement.RoomsResource
import typingsSlinky.gapiClientGamesmanagement.gapi.client.gamesmanagement.ScoresResource
import typingsSlinky.gapiClientGamesmanagement.gapi.client.gamesmanagement.TurnBasedMatchesResource
import typingsSlinky.gapiClientGamesmanagement.gapiClientGamesmanagementStrings.gamesmanagement
import typingsSlinky.gapiClientGamesmanagement.gapiClientGamesmanagementStrings.v1management
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
      
      val achievements: AchievementsResource = js.native
      
      val applications: ApplicationsResource = js.native
      
      val events: EventsResource = js.native
      
      /** Load Google Play Game Services Management API v1management */
      def load(name: gamesmanagement, version: v1management): js.Thenable[Unit] = js.native
      def load(name: gamesmanagement, version: v1management, callback: js.Function0[_]): Unit = js.native
      
      val players: PlayersResource = js.native
      
      val quests: QuestsResource = js.native
      
      val rooms: RoomsResource = js.native
      
      val scores: ScoresResource = js.native
      
      val turnBasedMatches: TurnBasedMatchesResource = js.native
    }
  }
}
