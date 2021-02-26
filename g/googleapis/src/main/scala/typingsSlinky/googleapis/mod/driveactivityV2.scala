package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driveactivityV2 {
  
  /**
    * Drive Activity API
    *
    * Provides a historical view of activity in Google Drive.
    *
    * @example
    * const {google} = require('googleapis');
    * const driveactivity = google.driveactivity('v2');
    *
    * @namespace driveactivity
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Driveactivity
    */
  @JSImport("googleapis", "driveactivity_v2.Driveactivity")
  @js.native
  class Driveactivity protected ()
    extends typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2.Driveactivity {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "driveactivity_v2.Resource$Activity")
  @js.native
  class ResourceActivity protected ()
    extends typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2.ResourceActivity {
    def this(context: APIRequestContext) = this()
  }
}
