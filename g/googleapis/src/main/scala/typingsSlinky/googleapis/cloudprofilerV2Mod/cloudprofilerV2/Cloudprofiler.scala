package typingsSlinky.googleapis.cloudprofilerV2Mod.cloudprofilerV2

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stackdriver Profiler API
  *
  * Manages continuous profiling information.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudprofiler = google.cloudprofiler('v2');
  *
  * @namespace cloudprofiler
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Cloudprofiler
  */
@JSImport("googleapis/build/src/apis/cloudprofiler/v2", "cloudprofiler_v2.Cloudprofiler")
@js.native
class Cloudprofiler protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var projects: ResourceProjects = js.native
}
