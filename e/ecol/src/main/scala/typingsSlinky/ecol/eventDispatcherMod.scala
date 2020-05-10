package typingsSlinky.ecol

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
  }
  
}

