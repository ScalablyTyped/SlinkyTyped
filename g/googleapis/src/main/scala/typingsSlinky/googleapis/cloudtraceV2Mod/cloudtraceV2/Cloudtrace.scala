package typingsSlinky.googleapis.cloudtraceV2Mod.cloudtraceV2

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
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
  * const cloudtrace = google.cloudtrace('v2');
  *
  * @namespace cloudtrace
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Cloudtrace
  */
@JSImport("googleapis/build/src/apis/cloudtrace/v2", "cloudtrace_v2.Cloudtrace")
@js.native
class Cloudtrace protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var projects: ResourceProjects = js.native
}
