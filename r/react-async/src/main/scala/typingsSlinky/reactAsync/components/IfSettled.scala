package typingsSlinky.reactAsync.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactAsync.anon.PersistState
import typingsSlinky.reactAsync.mod.AbstractState
import typingsSlinky.reactAsync.mod.AsyncFulfilled
import typingsSlinky.reactAsync.mod.AsyncInitial
import typingsSlinky.reactAsync.mod.AsyncPending
import typingsSlinky.reactAsync.mod.AsyncRejected
import typingsSlinky.reactAsync.mod.SettledChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IfSettled {
  
  @scala.inline
  def apply[T /* <: js.Object */](
    state: (AsyncInitial[T, AbstractState[T]]) | (AsyncPending[T, AbstractState[T]]) | (AsyncFulfilled[T, AbstractState[T]]) | (AsyncRejected[T, AbstractState[T]])
  ): Builder[T] = {
    val __props = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[PersistState[T]]))
  }
  
  @JSImport("react-async", "IfSettled")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[T /* <: js.Object */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def children(value: SettledChildren[T]): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenFunction1(
      value: /* state */ (AsyncFulfilled[T, AbstractState[T]]) | (AsyncRejected[T, AbstractState[T]]) => ReactElement
    ): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def persist(value: Boolean): this.type = set("persist", value.asInstanceOf[js.Any])
  }
  
  def withProps[T /* <: js.Object */](p: PersistState[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
