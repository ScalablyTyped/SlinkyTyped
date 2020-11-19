package typingsSlinky.mobxTask.taskMod

import typingsSlinky.mobxTask.mobxTaskStrings.args
import typingsSlinky.mobxTask.mobxTaskStrings.error
import typingsSlinky.mobxTask.mobxTaskStrings.result
import typingsSlinky.mobxTask.mobxTaskStrings.state
import typingsSlinky.mobxTask.mobxTaskStrings.swallow
import typingsSlinky.std.MethodDecorator
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- js.Function because Already inherited
- typingsSlinky.std.PropertyDecorator because var conflicts: length. Inlined  */ @js.native
trait TaskCreator[K /* <: /* keyof mobx-task.mobx-task/lib/task.TaskOptions<any, any> */ state | error | result | args | swallow */] extends MethodDecorator {
  
  def apply(options: Pick[TaskOptions[_, _], K]): MethodDecorator = js.native
  /**
    * Calls the actual task function.
    */
  def apply[A /* <: js.Array[_] */, R](func: js.Function1[/* args */ A, R]): Task_[A, R] = js.native
  def apply[A /* <: js.Array[_] */, R](func: js.Function1[/* args */ A, R], options: Pick[TaskOptions[A, R], K]): Task_[A, R] = js.native
}
