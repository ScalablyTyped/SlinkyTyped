package typingsSlinky.mobxDashTask

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTaskDashGroupMod {
  import typingsSlinky.mobxDashTask.libTaskMod.Task
  import typingsSlinky.std.Pick

  type TaskGroup[A /* <: js.Array[_] */, R] = Pick[Task[A, R], QueryableMethods]
}
