package typingsSlinky.async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("async", "auto")
@js.native
object auto extends js.Object {
  
  def apply[R /* <: Dictionary[_] */, E](tasks: AsyncAutoTasks[R, E]): Unit = js.native
  def apply[R /* <: Dictionary[_] */, E](tasks: AsyncAutoTasks[R, E], callback: AsyncResultCallback[R, E]): Unit = js.native
  def apply[R /* <: Dictionary[_] */, E](
    tasks: AsyncAutoTasks[R, E],
    concurrency: js.UndefOr[scala.Nothing],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
  def apply[R /* <: Dictionary[_] */, E](tasks: AsyncAutoTasks[R, E], concurrency: Double): Unit = js.native
  def apply[R /* <: Dictionary[_] */, E](tasks: AsyncAutoTasks[R, E], concurrency: Double, callback: AsyncResultCallback[R, E]): Unit = js.native
}
