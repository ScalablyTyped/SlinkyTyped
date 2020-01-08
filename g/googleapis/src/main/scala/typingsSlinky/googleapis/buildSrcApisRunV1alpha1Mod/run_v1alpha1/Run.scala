package typingsSlinky.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Run API
  *
  * Deploy and manage user provided container images that scale automatically
  * based on HTTP traffic.
  *
  * @example
  * const {google} = require('googleapis');
  * const run = google.run('v1alpha1');
  *
  * @namespace run
  * @type {Function}
  * @version v1alpha1
  * @variation v1alpha1
  * @param {object=} options Options for Run
  */
@JSImport("googleapis/build/src/apis/run/v1alpha1", "run_v1alpha1.Run")
@js.native
class Run protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var namespaces: Resource$Namespaces = js.native
  var projects: Resource$Projects = js.native
}

