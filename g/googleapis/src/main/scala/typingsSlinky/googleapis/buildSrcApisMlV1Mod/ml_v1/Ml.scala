package typingsSlinky.googleapis.buildSrcApisMlV1Mod.ml_v1

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Machine Learning Engine
  *
  * An API to enable creating and using machine learning models.
  *
  * @example
  * const {google} = require('googleapis');
  * const ml = google.ml('v1');
  *
  * @namespace ml
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Ml
  */
@JSImport("googleapis/build/src/apis/ml/v1", "ml_v1.Ml")
@js.native
class Ml protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var operations: Resource$Operations = js.native
  var projects: Resource$Projects = js.native
}

