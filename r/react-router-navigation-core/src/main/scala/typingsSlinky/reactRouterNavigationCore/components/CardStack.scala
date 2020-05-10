package typingsSlinky.reactRouterNavigationCore.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactRouterNavigationCore.mod.CardStackProps
import typingsSlinky.reactRouterNavigationCore.mod.CardsRendererProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardStack {
  @JSImport("react-router-navigation-core", "CardStack")
  @js.native
  object component extends js.Object
  
  def withProps(p: CardStackProps): Default[tag.type, typingsSlinky.reactRouterNavigationCore.mod.CardStack] = new Default[tag.type, typingsSlinky.reactRouterNavigationCore.mod.CardStack](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(render: CardsRendererProps => TagMod[Any]): Default[tag.type, typingsSlinky.reactRouterNavigationCore.mod.CardStack] = {
    val __props = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    new Default[tag.type, typingsSlinky.reactRouterNavigationCore.mod.CardStack](js.Array(this.component, __props.asInstanceOf[CardStackProps]))
  }
}

