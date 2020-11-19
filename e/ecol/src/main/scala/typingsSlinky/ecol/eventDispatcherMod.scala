package typingsSlinky.ecol

import typingsSlinky.ecol.ieventdispatcherMod.IEventDispatcher
import typingsSlinky.tstl.icontainerMod.IContainer
import typingsSlinky.tstl.icontainerMod.IContainer.Iterator
import typingsSlinky.tstl.icontainerMod.IContainer.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecol/lib/basic/EventDispatcher", JSImport.Namespace)
@js.native
object eventDispatcherMod extends js.Object {
  
  @js.native
  class EventDispatcher[T, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] () extends IEventDispatcher[T, SourceT, IteratorT, ReverseT] {
    
    /**
      * @hidden
      */
    var listeners_ : js.Any = js.native
  }
}
