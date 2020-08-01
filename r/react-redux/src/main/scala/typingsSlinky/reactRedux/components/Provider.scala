package typingsSlinky.reactRedux.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.ProviderProps
import typingsSlinky.reactRedux.mod.ReactReduxContextValue
import typingsSlinky.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Provider {
  @JSImport("react-redux", "ReactReduxContext.Provider")
  @js.native
  object component extends js.Object
  
  def withProps(p: ProviderProps[ReactReduxContextValue[js.Any, AnyAction]]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(value: ReactReduxContextValue[js.Any, AnyAction]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[ReactReduxContextValue[js.Any, AnyAction]]]))
  }
}

