package typingsSlinky.async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("async", "times")
@js.native
object times extends js.Object {
  
  def apply[T, E](n: Double, iterator: AsyncResultIterator[Double, T, E]): js.Promise[T] = js.native
  def apply[T, E](n: Double, iterator: AsyncResultIterator[Double, T, E], callback: AsyncResultArrayCallback[T, E]): Unit = js.native
}
