package typingsSlinky.samchon.collectionsMod

import typingsSlinky.tstl.icontainerMod.IContainer
import typingsSlinky.tstl.icontainerMod.IContainer.Iterator
import typingsSlinky.tstl.icontainerMod.IContainer.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/collections", "CollectionEvent")
@js.native
class CollectionEvent[T, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] protected ()
  extends typingsSlinky.ecol.mod.CollectionEvent[T, SourceT, IteratorT, ReverseT] {
  def this(`type`: String, first: IteratorT, last: IteratorT) = this()
}
