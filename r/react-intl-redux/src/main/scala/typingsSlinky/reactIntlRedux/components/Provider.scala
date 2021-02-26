package typingsSlinky.reactIntlRedux.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.Context
import typingsSlinky.reactRedux.mod.ProviderProps
import typingsSlinky.reactRedux.mod.ReactReduxContextValue
import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @scala.inline
  def apply[A /* <: Action[js.Any] */](store: Store[_, A]): Builder[A] = {
    val __props = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    new Builder[A](js.Array(this.component, __props.asInstanceOf[ProviderProps[A]]))
  }
  
  @JSImport("react-intl-redux", "Provider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[A /* <: Action[js.Any] */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactIntlRedux.mod.Provider[A]] {
    
    @scala.inline
    def context(value: Context[ReactReduxContextValue[_, AnyAction]]): this.type = set("context", value.asInstanceOf[js.Any])
  }
  
  def withProps[A /* <: Action[js.Any] */](p: ProviderProps[A]): Builder[A] = new Builder[A](js.Array(this.component, p.asInstanceOf[js.Any]))
}
