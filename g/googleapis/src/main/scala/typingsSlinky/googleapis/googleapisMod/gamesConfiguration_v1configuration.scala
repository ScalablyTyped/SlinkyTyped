package typingsSlinky.googleapis.googleapisMod

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "gamesConfiguration_v1configuration")
@js.native
object gamesConfiguration_v1configuration extends js.Object {
  /**
    * Google Play Game Services Publishing API
    *
    * The Publishing API for Google Play Game Services.
    *
    * @example
    * const {google} = require('googleapis');
    * const gamesConfiguration = google.gamesConfiguration('v1configuration');
    *
    * @namespace gamesConfiguration
    * @type {Function}
    * @version v1configuration
    * @variation v1configuration
    * @param {object=} options Options for Gamesconfiguration
    */
  @js.native
  class Gamesconfiguration protected ()
    extends typingsSlinky.googleapis.buildSrcApisGamesConfigurationV1configurationMod.gamesConfiguration_v1configuration.Gamesconfiguration {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Achievementconfigurations protected ()
    extends typingsSlinky.googleapis.buildSrcApisGamesConfigurationV1configurationMod.gamesConfiguration_v1configuration.Resource$Achievementconfigurations {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Imageconfigurations protected ()
    extends typingsSlinky.googleapis.buildSrcApisGamesConfigurationV1configurationMod.gamesConfiguration_v1configuration.Resource$Imageconfigurations {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Leaderboardconfigurations protected ()
    extends typingsSlinky.googleapis.buildSrcApisGamesConfigurationV1configurationMod.gamesConfiguration_v1configuration.Resource$Leaderboardconfigurations {
    def this(context: APIRequestContext) = this()
  }
  
}

