package typingsSlinky.ecol.ieventdispatcherMod

import typingsSlinky.ecol.collectionEventMod.CollectionEvent
import typingsSlinky.ecol.collectionEventMod.CollectionEvent.Listener
import typingsSlinky.ecol.collectionEventMod.CollectionEvent.Type
import typingsSlinky.tstl.mod.base.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventDispatcher[T, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: js.Iterator[T] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */] extends js.Object {
  def addEventListener(`type`: Type, listener: Listener[T, SourceT, IteratorT, ReverseT]): Unit = js.native
  def dispatchEvent(event: CollectionEvent[T, SourceT, IteratorT, ReverseT]): Unit = js.native
  def hasEventListener(`type`: Type): Boolean = js.native
  def removeEventListener(`type`: Type, listener: Listener[T, SourceT, IteratorT, ReverseT]): Unit = js.native
}

object IEventDispatcher {
  @scala.inline
  def apply[T, SourceT, IteratorT, ReverseT](
    addEventListener: (Type, Listener[T, SourceT, IteratorT, ReverseT]) => Unit,
    dispatchEvent: CollectionEvent[T, SourceT, IteratorT, ReverseT] => Unit,
    hasEventListener: Type => Boolean,
    removeEventListener: (Type, Listener[T, SourceT, IteratorT, ReverseT]) => Unit
  ): IEventDispatcher[T, SourceT, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), hasEventListener = js.Any.fromFunction1(hasEventListener), removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[IEventDispatcher[T, SourceT, IteratorT, ReverseT]]
  }
  @scala.inline
  implicit class IEventDispatcherOps[Self[t, sourcet, iteratort, reverset] <: IEventDispatcher[t, sourcet, iteratort, reverset], T, SourceT, IteratorT, ReverseT] (val x: Self[T, SourceT, IteratorT, ReverseT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, SourceT, IteratorT, ReverseT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, SourceT, IteratorT, ReverseT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, SourceT, IteratorT, ReverseT]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, SourceT, IteratorT, ReverseT]) with Other]
    @scala.inline
    def withAddEventListener(value: (Type, Listener[T, SourceT, IteratorT, ReverseT]) => Unit): Self[T, SourceT, IteratorT, ReverseT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDispatchEvent(value: CollectionEvent[T, SourceT, IteratorT, ReverseT] => Unit): Self[T, SourceT, IteratorT, ReverseT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasEventListener(value: Type => Boolean): Self[T, SourceT, IteratorT, ReverseT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasEventListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: (Type, Listener[T, SourceT, IteratorT, ReverseT]) => Unit): Self[T, SourceT, IteratorT, ReverseT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

