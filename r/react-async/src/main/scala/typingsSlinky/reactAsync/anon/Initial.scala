package typingsSlinky.reactAsync.anon

import slinky.core.facade.ReactElement
import typingsSlinky.reactAsync.mod.AbstractState
import typingsSlinky.reactAsync.mod.AsyncFulfilled
import typingsSlinky.reactAsync.mod.AsyncInitial
import typingsSlinky.reactAsync.mod.AsyncPending
import typingsSlinky.reactAsync.mod.AsyncRejected
import typingsSlinky.reactAsync.mod.PendingChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Initial[T /* <: js.Object */] extends StObject {
  
  var children: js.UndefOr[PendingChildren[T]] = js.native
  
  var initial: js.UndefOr[Boolean] = js.native
  
  var state: (AsyncInitial[T, AbstractState[T]]) | (AsyncPending[T, AbstractState[T]]) | (AsyncFulfilled[T, AbstractState[T]]) | (AsyncRejected[T, AbstractState[T]]) = js.native
}
object Initial {
  
  @scala.inline
  def apply[T /* <: js.Object */](
    state: (AsyncInitial[T, AbstractState[T]]) | (AsyncPending[T, AbstractState[T]]) | (AsyncFulfilled[T, AbstractState[T]]) | (AsyncRejected[T, AbstractState[T]])
  ): Initial[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Initial[T]]
  }
  
  @scala.inline
  implicit class InitialMutableBuilder[Self <: Initial[_], T /* <: js.Object */] (val x: Self with Initial[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: PendingChildren[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction1(value: /* state */ AsyncPending[T, AbstractState[T]] => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setInitial(value: Boolean): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    @scala.inline
    def setState(
      value: (AsyncInitial[T, AbstractState[T]]) | (AsyncPending[T, AbstractState[T]]) | (AsyncFulfilled[T, AbstractState[T]]) | (AsyncRejected[T, AbstractState[T]])
    ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
