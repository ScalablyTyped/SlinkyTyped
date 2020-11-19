package typingsSlinky.async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("async", "selectSeries")
@js.native
object selectSeries extends js.Object {
  
  def apply[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = js.native
  def apply[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
}
