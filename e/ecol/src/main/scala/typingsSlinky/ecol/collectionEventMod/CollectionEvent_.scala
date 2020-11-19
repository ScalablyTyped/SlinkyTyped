package typingsSlinky.ecol.collectionEventMod

import typingsSlinky.std.Iterable
import typingsSlinky.std.IterableIterator
import typingsSlinky.tstl.icontainerMod.IContainer
import typingsSlinky.tstl.icontainerMod.IContainer.Iterator
import typingsSlinky.tstl.icontainerMod.IContainer.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecol/lib/basic/CollectionEvent", "CollectionEvent")
@js.native
class CollectionEvent_[T, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] protected () extends Iterable[T] {
  def this(`type`: String, first: IteratorT, last: IteratorT) = this()
  
  val first: IteratorT = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator_CollectionEvent_ : js.Function0[IterableIterator[T]] = js.native
  
  val last: IteratorT = js.native
  
  val `type`: String = js.native
}
