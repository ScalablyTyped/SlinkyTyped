package typingsSlinky.maximMazurokGapiClientGamesmanagement

import typingsSlinky.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement.AchievementsResource
import typingsSlinky.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement.ApplicationsResource
import typingsSlinky.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement.EventsResource
import typingsSlinky.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement.PlayersResource
import typingsSlinky.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement.ScoresResource
import typingsSlinky.maximMazurokGapiClientGamesmanagement.maximMazurokGapiClientGamesmanagementStrings.gamesmanagement
import typingsSlinky.maximMazurokGapiClientGamesmanagement.maximMazurokGapiClientGamesmanagementStrings.v1management
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object gamesmanagement {
        
        @JSGlobal("gapi.client.gamesmanagement.achievements")
        @js.native
        val achievements: AchievementsResource = js.native
        
        @JSGlobal("gapi.client.gamesmanagement.applications")
        @js.native
        val applications: ApplicationsResource = js.native
        
        @JSGlobal("gapi.client.gamesmanagement.events")
        @js.native
        val events: EventsResource = js.native
        
        @JSGlobal("gapi.client.gamesmanagement.players")
        @js.native
        val players: PlayersResource = js.native
        
        @JSGlobal("gapi.client.gamesmanagement.scores")
        @js.native
        val scores: ScoresResource = js.native
      }
      
      /** Load Google Play Game Management v1management */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: gamesmanagement, version: v1management): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: gamesmanagement, version: v1management, callback: js.Function0[_]): Unit = js.native
    }
  }
}
