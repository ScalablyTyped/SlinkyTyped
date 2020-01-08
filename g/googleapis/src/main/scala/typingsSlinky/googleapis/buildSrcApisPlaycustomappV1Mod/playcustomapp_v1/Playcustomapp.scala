package typingsSlinky.googleapis.buildSrcApisPlaycustomappV1Mod.playcustomapp_v1

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("googleapis/build/src/apis/playcustomapp/v1", "playcustomapp_v1.Playcustomapp")
@js.native
class Playcustomapp protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var accounts: Resource$Accounts = js.native
  var context: APIRequestContext = js.native
}

