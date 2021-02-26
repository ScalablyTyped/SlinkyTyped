package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playcustomappV1 {
  
  /**
    * Google Play Custom App Publishing API
    *
    * An API to publish custom Android apps.
    *
    * @example
    * const {google} = require('googleapis');
    * const playcustomapp = google.playcustomapp('v1');
    *
    * @namespace playcustomapp
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Playcustomapp
    */
  @JSImport("googleapis", "playcustomapp_v1.Playcustomapp")
  @js.native
  class Playcustomapp protected ()
    extends typingsSlinky.googleapis.playcustomappV1Mod.playcustomappV1.Playcustomapp {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "playcustomapp_v1.Resource$Accounts")
  @js.native
  class ResourceAccounts protected ()
    extends typingsSlinky.googleapis.playcustomappV1Mod.playcustomappV1.ResourceAccounts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "playcustomapp_v1.Resource$Accounts$Customapps")
  @js.native
  class ResourceAccountsCustomapps protected ()
    extends typingsSlinky.googleapis.playcustomappV1Mod.playcustomappV1.ResourceAccountsCustomapps {
    def this(context: APIRequestContext) = this()
  }
}
