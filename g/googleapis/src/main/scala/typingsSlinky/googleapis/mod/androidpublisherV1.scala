package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androidpublisherV1 {
  
  /**
    * Google Play Developer API
    *
    * Accesses Android application developers&#39; Google Play accounts.
    *
    * @example
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v1');
    *
    * @namespace androidpublisher
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Androidpublisher
    */
  @JSImport("googleapis", "androidpublisher_v1.Androidpublisher")
  @js.native
  class Androidpublisher protected ()
    extends typingsSlinky.googleapis.androidpublisherV1Mod.androidpublisherV1.Androidpublisher {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "androidpublisher_v1.Resource$Purchases")
  @js.native
  class ResourcePurchases protected ()
    extends typingsSlinky.googleapis.androidpublisherV1Mod.androidpublisherV1.ResourcePurchases {
    def this(context: APIRequestContext) = this()
  }
}
