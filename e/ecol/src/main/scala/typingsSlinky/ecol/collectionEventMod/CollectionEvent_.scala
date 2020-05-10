package typingsSlinky.ecol.collectionEventMod

import typingsSlinky.std.Iterable
import typingsSlinky.std.IterableIterator
import typingsSlinky.tstl.mod.base.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/basic/CollectionEvent", "CollectionEvent")
@js.native
class CollectionEvent_[T, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: js.Iterator[T] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */] protected () extends Iterable[T] {
  def this(`type`: String, first: IteratorT, last: IteratorT) = this()
  val first: IteratorT = js.native
  @JSName(js.Symbol.iterator)
  var iterator_CollectionEvent_ : js.Function0[IterableIterator[T]] = js.native
  val last: IteratorT = js.native
  val `type`: String = js.native
}

