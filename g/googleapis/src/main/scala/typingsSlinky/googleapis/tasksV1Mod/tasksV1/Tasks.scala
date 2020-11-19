package typingsSlinky.googleapis.tasksV1Mod.tasksV1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tasks API
  *
  * Manages your tasks and task lists.
  *
  * @example
  * const {google} = require('googleapis');
  * const tasks = google.tasks('v1');
  *
  * @namespace tasks
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Tasks
  */
@JSImport("googleapis/build/src/apis/tasks/v1", "tasks_v1.Tasks")
@js.native
class Tasks protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var tasklists: ResourceTasklists = js.native
  
  var tasks: ResourceTasks = js.native
}
