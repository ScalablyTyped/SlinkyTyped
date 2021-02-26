package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siteVerificationV1 {
  
  @JSImport("googleapis", "siteVerification_v1.Resource$Webresource")
  @js.native
  class ResourceWebresource protected ()
    extends typingsSlinky.googleapis.siteVerificationV1Mod.siteVerificationV1.ResourceWebresource {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Google Site Verification API
    *
    * Verifies ownership of websites or domains with Google.
    *
    * @example
    * const {google} = require('googleapis');
    * const siteVerification = google.siteVerification('v1');
    *
    * @namespace siteVerification
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Siteverification
    */
  @JSImport("googleapis", "siteVerification_v1.Siteverification")
  @js.native
  class Siteverification protected ()
    extends typingsSlinky.googleapis.siteVerificationV1Mod.siteVerificationV1.Siteverification {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
