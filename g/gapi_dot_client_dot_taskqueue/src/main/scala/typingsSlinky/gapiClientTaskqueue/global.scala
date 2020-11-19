package typingsSlinky.gapiClientTaskqueue

import typingsSlinky.gapiClientTaskqueue.gapi.client.taskqueue.TaskqueuesResource
import typingsSlinky.gapiClientTaskqueue.gapi.client.taskqueue.TasksResource
import typingsSlinky.gapiClientTaskqueue.gapiClientTaskqueueStrings.taskqueue
import typingsSlinky.gapiClientTaskqueue.gapiClientTaskqueueStrings.v1beta2
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
      
      /** Load TaskQueue API v1beta2 */
      def load(name: taskqueue, version: v1beta2): js.Thenable[Unit] = js.native
      def load(name: taskqueue, version: v1beta2, callback: js.Function0[_]): Unit = js.native
      
      val taskqueues: TaskqueuesResource = js.native
      
      val tasks: TasksResource = js.native
    }
  }
}
