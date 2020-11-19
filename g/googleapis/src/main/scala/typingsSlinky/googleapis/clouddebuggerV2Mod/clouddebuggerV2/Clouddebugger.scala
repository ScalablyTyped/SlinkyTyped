package typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stackdriver Debugger API
  *
  * Examines the call stack and variables of a running application without
  * stopping or slowing it down.
  *
  * @example
  * const {google} = require('googleapis');
  * const clouddebugger = google.clouddebugger('v2');
  *
  * @namespace clouddebugger
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Clouddebugger
  */
@JSImport("googleapis/build/src/apis/clouddebugger/v2", "clouddebugger_v2.Clouddebugger")
@js.native
class Clouddebugger protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var controller: ResourceController = js.native
  
  var debugger: ResourceDebugger = js.native
}
