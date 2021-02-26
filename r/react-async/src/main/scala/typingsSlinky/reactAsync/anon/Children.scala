package typingsSlinky.reactAsync.anon

import slinky.core.facade.ReactElement
import typingsSlinky.reactAsync.mod.AbstractState
import typingsSlinky.reactAsync.mod.AsyncFulfilled
import typingsSlinky.reactAsync.mod.AsyncInitial
import typingsSlinky.reactAsync.mod.AsyncPending
import typingsSlinky.reactAsync.mod.AsyncRejected
import typingsSlinky.reactAsync.mod.FulfilledChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children[T /* <: js.Object */] extends StObject {
  
  var children: js.UndefOr[FulfilledChildren[T]] = js.native
  
  var persist: js.UndefOr[Boolean] = js.native
  
  var state: (AsyncInitial[T, AbstractState[T]]) | (AsyncPending[T, AbstractState[T]]) | (AsyncFulfilled[T, AbstractState[T]]) | (AsyncRejected[T, AbstractState[T]]) = js.native
}
object Children {
  
  @scala.inline
  def apply[T /* <: js.Object */](
    state: (AsyncInitial[T, AbstractState[T]]) | (AsyncPending[T, AbstractState[T]]) | (AsyncFulfilled[T, AbstractState[T]]) | (AsyncRejected[T, AbstractState[T]])
  ): Children[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children[T]]
  }
  
  @scala.inline
  implicit class ChildrenMutableBuilder[Self <: Children[_], T /* <: js.Object */] (val x: Self with Children[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: FulfilledChildren[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction2(value: (T, /* state */ AsyncFulfilled[T, AbstractState[T]]) => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    
    @scala.inline
    def setState(
      value: (AsyncInitial[T, AbstractState[T]]) | (AsyncPending[T, AbstractState[T]]) | (AsyncFulfilled[T, AbstractState[T]]) | (AsyncRejected[T, AbstractState[T]])
    ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
