package typingsSlinky.mobxTask

import typingsSlinky.mobxTask.taskMod.TaskFactory
import typingsSlinky.mobxTask.taskMod.Task_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-task", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def TaskGroup[A /* <: js.Array[_] */, R](tasks: js.Array[Task_[A, R]]): typingsSlinky.mobxTask.taskGroupMod.TaskGroup[A, R] = js.native
  
  /**
    * Creates a task in the `pending` state.
    */
  val task: TaskFactory = js.native
}
