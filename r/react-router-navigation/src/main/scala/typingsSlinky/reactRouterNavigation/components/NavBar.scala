package typingsSlinky.reactRouterNavigation.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactRouterNavigation.mod.CardSubViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
object NavBar {
  @JSImport("react-router-navigation", "NavBar")
  @js.native
  object component extends js.Object
  
  def apply(p: CardSubViewProps): Default[tag.type, typingsSlinky.reactRouterNavigation.mod.NavBar] = new Default[tag.type, typingsSlinky.reactRouterNavigation.mod.NavBar](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: NavBar.type): Default[tag.type, typingsSlinky.reactRouterNavigation.mod.NavBar] = new Default[tag.type, typingsSlinky.reactRouterNavigation.mod.NavBar](js.Array(this.component, js.Dictionary.empty))()
}

