package typingsSlinky.reactNavigation.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigation.mod.NavigationScreenProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Consumer {
  @JSImport("react-navigation", "NavigationContext.Consumer")
  @js.native
  object component extends js.Object
  
  def withProps(p: ConsumerProps[NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    children: NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams] => ReactElement
  ): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]]]))
  }
}

