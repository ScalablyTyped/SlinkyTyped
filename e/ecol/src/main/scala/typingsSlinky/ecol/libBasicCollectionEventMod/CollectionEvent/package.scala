package typingsSlinky.ecol.libBasicCollectionEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CollectionEvent {
  import typingsSlinky.tstl.baseIteratorIteratorMod.Iterator
  import typingsSlinky.tstl.tstlMod.base.Container
  import typingsSlinky.tstl.tstlMod.base.ReverseIterator

  type Listener[T, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] = js.Function1[
    /* event */ typingsSlinky.ecol.libBasicCollectionEventMod.CollectionEvent[T, SourceT, IteratorT, ReverseT], 
    Unit
  ]
}
