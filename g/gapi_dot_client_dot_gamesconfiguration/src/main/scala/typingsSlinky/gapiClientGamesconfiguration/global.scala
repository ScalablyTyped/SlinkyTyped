package typingsSlinky.gapiClientGamesconfiguration

import typingsSlinky.gapiClientGamesconfiguration.gapi.client.gamesconfiguration.AchievementConfigurationsResource
import typingsSlinky.gapiClientGamesconfiguration.gapi.client.gamesconfiguration.ImageConfigurationsResource
import typingsSlinky.gapiClientGamesconfiguration.gapi.client.gamesconfiguration.LeaderboardConfigurationsResource
import typingsSlinky.gapiClientGamesconfiguration.gapiClientGamesconfigurationStrings.gamesconfiguration
import typingsSlinky.gapiClientGamesconfiguration.gapiClientGamesconfigurationStrings.v1configuration
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
      
      val achievementConfigurations: AchievementConfigurationsResource = js.native
      
      val imageConfigurations: ImageConfigurationsResource = js.native
      
      val leaderboardConfigurations: LeaderboardConfigurationsResource = js.native
      
      /** Load Google Play Game Services Publishing API v1configuration */
      def load(name: gamesconfiguration, version: v1configuration): js.Thenable[Unit] = js.native
      def load(name: gamesconfiguration, version: v1configuration, callback: js.Function0[_]): Unit = js.native
    }
  }
}
