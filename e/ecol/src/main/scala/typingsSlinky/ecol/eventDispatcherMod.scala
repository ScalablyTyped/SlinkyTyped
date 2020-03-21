package typingsSlinky.ecol

import typingsSlinky.ecol.collectionEventMod.CollectionEvent
import typingsSlinky.ecol.collectionEventMod.CollectionEvent.Listener
import typingsSlinky.ecol.collectionEventMod.CollectionEvent.Type
import typingsSlinky.ecol.ieventdispatcherMod.IEventDispatcher
import typingsSlinky.tstl.mod.base.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/basic/EventDispatcher", JSImport.Namespace)
@js.native
object eventDispatcherMod extends js.Object {
  @js.native
  class EventDispatcher[T, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: js.Iterator[T] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */] () extends IEventDispatcher[T, SourceT, IteratorT, ReverseT] {
    /**
      * @hidden
      */
    var listeners_ : js.Any = js.native
    /* CompleteClass */
    override def addEventListener(`type`: Type, listener: Listener[T, SourceT, IteratorT, ReverseT]): Unit = js.native
    /* CompleteClass */
    override def dispatchEvent(event: CollectionEvent[T, SourceT, IteratorT, ReverseT]): Unit = js.native
    /* CompleteClass */
    override def hasEventListener(`type`: Type): Boolean = js.native
    /* CompleteClass */
    override def removeEventListener(`type`: Type, listener: Listener[T, SourceT, IteratorT, ReverseT]): Unit = js.native
  }
  
}

