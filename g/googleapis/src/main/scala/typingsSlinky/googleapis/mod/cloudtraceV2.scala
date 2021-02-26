package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudtraceV2 {
  
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
  @JSImport("googleapis", "cloudtrace_v2.Cloudtrace")
  @js.native
  class Cloudtrace protected ()
    extends typingsSlinky.googleapis.cloudtraceV2Mod.cloudtraceV2.Cloudtrace {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudtrace_v2.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typingsSlinky.googleapis.cloudtraceV2Mod.cloudtraceV2.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudtrace_v2.Resource$Projects$Traces")
  @js.native
  class ResourceProjectsTraces protected ()
    extends typingsSlinky.googleapis.cloudtraceV2Mod.cloudtraceV2.ResourceProjectsTraces {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudtrace_v2.Resource$Projects$Traces$Spans")
  @js.native
  class ResourceProjectsTracesSpans protected ()
    extends typingsSlinky.googleapis.cloudtraceV2Mod.cloudtraceV2.ResourceProjectsTracesSpans {
    def this(context: APIRequestContext) = this()
  }
}
