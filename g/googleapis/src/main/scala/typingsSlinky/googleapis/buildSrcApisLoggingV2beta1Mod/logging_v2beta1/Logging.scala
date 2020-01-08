package typingsSlinky.googleapis.buildSrcApisLoggingV2beta1Mod.logging_v2beta1

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stackdriver Logging API
  *
  * Writes log entries and manages your Logging configuration.
  *
  * @example
  * const {google} = require('googleapis');
  * const logging = google.logging('v2beta1');
  *
  * @namespace logging
  * @type {Function}
  * @version v2beta1
  * @variation v2beta1
  * @param {object=} options Options for Logging
  */
@JSImport("googleapis/build/src/apis/logging/v2beta1", "logging_v2beta1.Logging")
@js.native
class Logging protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var entries: Resource$Entries = js.native
  var monitoredResourceDescriptors: Resource$Monitoredresourcedescriptors = js.native
  var projects: Resource$Projects = js.native
}

