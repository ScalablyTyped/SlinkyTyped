package typingsSlinky.reactNavigation.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNavigation.AnonValue
import typingsSlinky.reactNavigation.mod.NavigationProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavigationProvider {
  @JSImport("react-navigation", "NavigationProvider")
  @js.native
  object component extends js.Object
  
  def withProps(p: AnonValue): Default[tag.type, typingsSlinky.reactNavigation.mod.NavigationProvider] = new Default[tag.type, typingsSlinky.reactNavigation.mod.NavigationProvider](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(value: NavigationProp[_]): Default[tag.type, typingsSlinky.reactNavigation.mod.NavigationProvider] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactNavigation.mod.NavigationProvider](js.Array(this.component, __props.asInstanceOf[AnonValue]))
  }
}

