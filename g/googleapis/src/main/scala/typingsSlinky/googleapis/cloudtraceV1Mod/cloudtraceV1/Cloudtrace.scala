package typingsSlinky.googleapis.cloudtraceV1Mod.cloudtraceV1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stackdriver Trace API
  *
  * Sends application trace data to Stackdriver Trace for viewing. Trace data
  * is collected for all App Engine applications by default. Trace data from
  * other applications can be provided using this API. This library is used to
  * interact with the Trace API directly. If you are looking to instrument your
  * application for Stackdriver Trace, we recommend using OpenCensus.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudtrace = google.cloudtrace('v1');
  *
  * @namespace cloudtrace
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Cloudtrace
  */
@JSImport("googleapis/build/src/apis/cloudtrace/v1", "cloudtrace_v1.Cloudtrace")
@js.native
class Cloudtrace protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var projects: ResourceProjects = js.native
}
