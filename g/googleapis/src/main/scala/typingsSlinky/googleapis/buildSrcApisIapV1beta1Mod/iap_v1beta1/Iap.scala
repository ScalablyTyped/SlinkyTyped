package typingsSlinky.googleapis.buildSrcApisIapV1beta1Mod.iap_v1beta1

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Identity-Aware Proxy API
  *
  * Controls access to cloud applications running on Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const iap = google.iap('v1beta1');
  *
  * @namespace iap
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Iap
  */
@JSImport("googleapis/build/src/apis/iap/v1beta1", "iap_v1beta1.Iap")
@js.native
class Iap protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var v1beta1: Resource$V1beta1 = js.native
}

