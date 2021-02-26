package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object acceleratedmobilepageurlV1 {
  
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
  @JSImport("googleapis", "acceleratedmobilepageurl_v1.Acceleratedmobilepageurl")
  @js.native
  class Acceleratedmobilepageurl protected ()
    extends typingsSlinky.googleapis.acceleratedmobilepageurlV1Mod.acceleratedmobilepageurlV1.Acceleratedmobilepageurl {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "acceleratedmobilepageurl_v1.Resource$Ampurls")
  @js.native
  class ResourceAmpurls protected ()
    extends typingsSlinky.googleapis.acceleratedmobilepageurlV1Mod.acceleratedmobilepageurlV1.ResourceAmpurls {
    def this(context: APIRequestContext) = this()
  }
}
