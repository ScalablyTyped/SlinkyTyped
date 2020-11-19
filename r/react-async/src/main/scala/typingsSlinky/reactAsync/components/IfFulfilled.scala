package typingsSlinky.reactAsync.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactAsync.anon.Children
import typingsSlinky.reactAsync.mod.AbstractState
import typingsSlinky.reactAsync.mod.AsyncFulfilled
import typingsSlinky.reactAsync.mod.AsyncInitial
import typingsSlinky.reactAsync.mod.AsyncPending
import typingsSlinky.reactAsync.mod.AsyncRejected
import typingsSlinky.reactAsync.mod.FulfilledChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IfFulfilled {
  
  @JSImport("react-async", "IfFulfilled")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T /* <: js.Object */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenFunction2(value: (T, /* state */ AsyncFulfilled[T, AbstractState[T]]) => ReactElement): this.type = set("children", js.Any.fromFunction2(value))
    
    @scala.inline
    def children(value: FulfilledChildren[T]): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def persist(value: Boolean): this.type = set("persist", value.asInstanceOf[js.Any])
  }
  
  def withProps[T /* <: js.Object */](p: Children[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[T /* <: js.Object */](
    state: (AsyncInitial[T, AbstractState[T]]) | (AsyncPending[T, AbstractState[T]]) | (AsyncFulfilled[T, AbstractState[T]]) | (AsyncRejected[T, AbstractState[T]])
  ): Builder[T] = {
    val __props = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[Children[T]]))
  }
}
