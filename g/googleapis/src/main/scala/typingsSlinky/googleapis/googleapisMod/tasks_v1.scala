package typingsSlinky.googleapis.googleapisMod

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "tasks_v1")
@js.native
object tasks_v1 extends js.Object {
  @js.native
  class Resource$Tasklists protected ()
    extends typingsSlinky.googleapis.buildSrcApisTasksV1Mod.tasks_v1.Resource$Tasklists {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Tasks protected ()
    extends typingsSlinky.googleapis.buildSrcApisTasksV1Mod.tasks_v1.Resource$Tasks {
    def this(context: APIRequestContext) = this()
  }
  
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
  @js.native
  class Tasks protected ()
    extends typingsSlinky.googleapis.buildSrcApisTasksV1Mod.tasks_v1.Tasks {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
}

