package typingsSlinky.googleapis.mod.remotebuildexecutionV2

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Remote Build Execution API
  *
  * Supplies a Remote Execution API service for tools such as bazel.
  *
  * @example
  * const {google} = require('googleapis');
  * const remotebuildexecution = google.remotebuildexecution('v2');
  *
  * @namespace remotebuildexecution
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Remotebuildexecution
  */
@JSImport("googleapis", "remotebuildexecution_v2.Remotebuildexecution")
@js.native
class Remotebuildexecution protected ()
  extends typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Remotebuildexecution {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
