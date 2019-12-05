package typingsSlinky.samchonDashFramework.samchonDashFrameworkMod.collections

import typingsSlinky.tstl.baseIteratorIteratorMod.Iterator
import typingsSlinky.tstl.tstlMod.base.Container
import typingsSlinky.tstl.tstlMod.base.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon-framework", "collections.CollectionEvent")
@js.native
class CollectionEvent[T, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] protected ()
  extends typingsSlinky.samchon.samchonMod.collections.CollectionEvent[T, SourceT, IteratorT, ReverseT] {
  def this(`type`: String, first: IteratorT, last: IteratorT) = this()
}

