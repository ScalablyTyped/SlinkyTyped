package typingsSlinky.builderUtil

import typingsSlinky.builderUtilRuntime.mod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("builder-util/out/asyncTaskManager", JSImport.Namespace)
@js.native
object asyncTaskManagerMod extends js.Object {
  
  @js.native
  class AsyncTaskManager protected () extends js.Object {
    def this(cancellationToken: CancellationToken) = this()
    
    def add(task: js.Function0[js.Promise[_]]): Unit = js.native
    
    def addTask(promise: js.Promise[_]): Unit = js.native
    
    def awaitTasks(): js.Promise[js.Array[_]] = js.native
    
    def cancelTasks(): Unit = js.native
    
    val cancellationToken: js.Any = js.native
    
    val errors: js.Any = js.native
    
    val tasks: js.Array[js.Promise[_]] = js.native
  }
}
