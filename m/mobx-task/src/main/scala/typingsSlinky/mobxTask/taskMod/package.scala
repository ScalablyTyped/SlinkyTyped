package typingsSlinky.mobxTask

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object taskMod {
  type TaskFunc[A /* <: js.Array[_] */, R] = js.Function1[/* args */ A, js.Promise[R]]
  type Task_[A /* <: js.Array[_] */, R] = (typingsSlinky.mobxTask.taskMod.TaskFunc[A, typingsSlinky.mobxTask.taskMod.WithoutPromise[R]]) with (typingsSlinky.mobxTask.taskMod.TaskState[A, R]) with (typingsSlinky.mobxTask.taskMod.TaskMethods[A, R])
  type WithoutPromise[T] = T
}
