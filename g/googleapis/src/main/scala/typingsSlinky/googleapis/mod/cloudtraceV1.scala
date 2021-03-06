package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudtraceV1 {
  
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
  @JSImport("googleapis", "cloudtrace_v1.Cloudtrace")
  @js.native
  class Cloudtrace protected ()
    extends typingsSlinky.googleapis.cloudtraceV1Mod.cloudtraceV1.Cloudtrace {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudtrace_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typingsSlinky.googleapis.cloudtraceV1Mod.cloudtraceV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudtrace_v1.Resource$Projects$Traces")
  @js.native
  class ResourceProjectsTraces protected ()
    extends typingsSlinky.googleapis.cloudtraceV1Mod.cloudtraceV1.ResourceProjectsTraces {
    def this(context: APIRequestContext) = this()
  }
}
