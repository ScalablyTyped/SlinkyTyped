package typingsSlinky.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Web Security Scanner API
  *
  * Scans your Compute and App Engine apps for common web vulnerabilities.
  *
  * @example
  * const {google} = require('googleapis');
  * const websecurityscanner = google.websecurityscanner('v1alpha');
  *
  * @namespace websecurityscanner
  * @type {Function}
  * @version v1alpha
  * @variation v1alpha
  * @param {object=} options Options for Websecurityscanner
  */
@JSImport("googleapis/build/src/apis/websecurityscanner/v1alpha", "websecurityscanner_v1alpha.Websecurityscanner")
@js.native
class Websecurityscanner protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: ResourceProjects = js.native
}

