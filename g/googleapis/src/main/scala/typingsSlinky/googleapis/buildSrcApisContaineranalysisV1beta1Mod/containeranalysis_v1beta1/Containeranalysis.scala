package typingsSlinky.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container Analysis API
  *
  * An implementation of the Grafeas API, which stores, and enables querying
  * and retrieval of critical metadata about all of your software artifacts.
  *
  * @example
  * const {google} = require('googleapis');
  * const containeranalysis = google.containeranalysis('v1beta1');
  *
  * @namespace containeranalysis
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Containeranalysis
  */
@JSImport("googleapis/build/src/apis/containeranalysis/v1beta1", "containeranalysis_v1beta1.Containeranalysis")
@js.native
class Containeranalysis protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
}

