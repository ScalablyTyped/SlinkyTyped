package typingsSlinky.async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("async", "eachOfLimit")
@js.native
object eachOfLimit extends js.Object {
  
  def apply[T, E](obj: IterableCollection[T], limit: Double, iterator: AsyncForEachOfIterator[T, E]): js.Promise[Unit] = js.native
  def apply[T, E](
    obj: IterableCollection[T],
    limit: Double,
    iterator: AsyncForEachOfIterator[T, E],
    callback: ErrorCallback[E]
  ): Unit = js.native
}
