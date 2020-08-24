package typingsSlinky.reactRedux.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.Context
import typingsSlinky.reactRedux.mod.ProviderProps
import typingsSlinky.reactRedux.mod.ReactReduxContextValue
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Provider {
  @JSImport("react-redux", "Provider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: typingsSlinky.redux.mod.Action[js.Any] */ A] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactRedux.mod.Provider[A]] {
    @scala.inline
    def context(value: Context[ReactReduxContextValue[_, AnyAction]]): this.type = set("context", value.asInstanceOf[js.Any])
  }
  
  def withProps[/* <: typingsSlinky.redux.mod.Action[js.Any] */ A](p: ProviderProps[A]): Builder[A] = new Builder[A](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[/* <: typingsSlinky.redux.mod.Action[js.Any] */ A](store: Store[_, A]): Builder[A] = {
    val __props = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    new Builder[A](js.Array(this.component, __props.asInstanceOf[ProviderProps[A]]))
  }
}

