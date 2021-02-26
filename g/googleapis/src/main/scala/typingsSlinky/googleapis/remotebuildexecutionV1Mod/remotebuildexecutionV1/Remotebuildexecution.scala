package typingsSlinky.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
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
  * const remotebuildexecution = google.remotebuildexecution('v1');
  *
  * @namespace remotebuildexecution
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Remotebuildexecution
  */
@JSImport("googleapis/build/src/apis/remotebuildexecution/v1", "remotebuildexecution_v1.Remotebuildexecution")
@js.native
class Remotebuildexecution protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var media: ResourceMedia = js.native
  
  var operations: ResourceOperations = js.native
  
  var projects: ResourceProjects = js.native
  
  var v1: ResourceV1 = js.native
}
