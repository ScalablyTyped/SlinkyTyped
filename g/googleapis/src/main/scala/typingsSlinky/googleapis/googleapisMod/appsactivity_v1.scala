package typingsSlinky.googleapis.googleapisMod

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "appsactivity_v1")
@js.native
object appsactivity_v1 extends js.Object {
  /**
    * Drive Activity API
    *
    * Provides a historical view of activity.
    *
    * @example
    * const {google} = require('googleapis');
    * const appsactivity = google.appsactivity('v1');
    *
    * @namespace appsactivity
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Appsactivity
    */
  @js.native
  class Appsactivity protected ()
    extends typingsSlinky.googleapis.buildSrcApisAppsactivityV1Mod.appsactivity_v1.Appsactivity {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Activities protected ()
    extends typingsSlinky.googleapis.buildSrcApisAppsactivityV1Mod.appsactivity_v1.Resource$Activities {
    def this(context: APIRequestContext) = this()
  }
  
}

