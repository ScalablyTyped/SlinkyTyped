package typingsSlinky.ecol.collectionEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CollectionEvent {
  type Listener[T, SourceT /* <: typingsSlinky.tstl.mod.base.Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: js.Iterator[T] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */] = js.Function1[
    /* event */ typingsSlinky.ecol.collectionEventMod.CollectionEvent[T, SourceT, IteratorT, ReverseT], 
    scala.Unit
  ]
}
