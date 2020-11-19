package typingsSlinky.ecol.collectionEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object CollectionEvent {
  
  type Listener[T, SourceT /* <: typingsSlinky.tstl.icontainerMod.IContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: typingsSlinky.tstl.icontainerMod.IContainer.Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: typingsSlinky.tstl.icontainerMod.IContainer.ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] = js.Function1[
    /* event */ typingsSlinky.ecol.collectionEventMod.CollectionEvent[T, SourceT, IteratorT, ReverseT], 
    scala.Unit
  ]
}
