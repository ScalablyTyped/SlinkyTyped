package typingsSlinky.gapiClientTasks

import typingsSlinky.gapiClientTasks.gapi.client.tasks.TasklistsResource
import typingsSlinky.gapiClientTasks.gapi.client.tasks.TasksResource
import typingsSlinky.gapiClientTasks.gapiClientTasksStrings.tasks
import typingsSlinky.gapiClientTasks.gapiClientTasksStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Tasks API v1 */
      def load(name: tasks, version: v1): js.Thenable[Unit] = js.native
      def load(name: tasks, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object tasks extends js.Object {
        
        val tasklists: TasklistsResource = js.native
        
        val tasks: TasksResource = js.native
      }
    }
  }
}
