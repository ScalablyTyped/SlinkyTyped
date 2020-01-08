package typingsSlinky.googleapis.googleapisMod

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "acceleratedmobilepageurl_v1")
@js.native
object acceleratedmobilepageurl_v1 extends js.Object {
  /**
    * Accelerated Mobile Pages (AMP) URL API
    *
    * Retrieves the list of AMP URLs (and equivalent AMP Cache URLs) for a given
    * list of public URL(s).
    *
    * @example
    * const {google} = require('googleapis');
    * const acceleratedmobilepageurl = google.acceleratedmobilepageurl('v1');
    *
    * @namespace acceleratedmobilepageurl
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Acceleratedmobilepageurl
    */
  @js.native
  class Acceleratedmobilepageurl protected ()
    extends typingsSlinky.googleapis.buildSrcApisAcceleratedmobilepageurlV1Mod.acceleratedmobilepageurl_v1.Acceleratedmobilepageurl {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Ampurls protected ()
    extends typingsSlinky.googleapis.buildSrcApisAcceleratedmobilepageurlV1Mod.acceleratedmobilepageurl_v1.Resource$Ampurls {
    def this(context: APIRequestContext) = this()
  }
  
}

