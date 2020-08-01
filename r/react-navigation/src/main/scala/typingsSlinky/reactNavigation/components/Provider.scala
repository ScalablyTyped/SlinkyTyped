package typingsSlinky.reactNavigation.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.ProviderProps
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigation.mod.NavigationScreenProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Provider {
  @JSImport("react-navigation", "NavigationContext.Provider")
  @js.native
  object component extends js.Object
  
  def withProps(p: ProviderProps[NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(value: NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]]]))
  }
}

