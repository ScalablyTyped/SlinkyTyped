package typingsSlinky.mobx

import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/utils/iterable", JSImport.Namespace)
@js.native
object iterableMod extends js.Object {
  def makeIterable[T](iterator: js.Iterator[T]): IterableIterator[T] = js.native
}

