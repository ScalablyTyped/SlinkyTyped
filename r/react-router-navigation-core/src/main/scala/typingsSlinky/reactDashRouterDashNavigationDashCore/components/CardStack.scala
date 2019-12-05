package typingsSlinky.reactDashRouterDashNavigationDashCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashRouterDashNavigationDashCore.reactDashRouterDashNavigationDashCoreMod.CardStackProps
import typingsSlinky.reactDashRouterDashNavigationDashCore.reactDashRouterDashNavigationDashCoreMod.CardsRendererProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardStack
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashRouterDashNavigationDashCore.reactDashRouterDashNavigationDashCoreMod.CardStack
    ] {
  @JSImport("react-router-navigation-core", "CardStack")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(render: CardsRendererProps => TagMod[Any], _overrides: StringDictionary[js.Any] = null): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashRouterDashNavigationDashCore.reactDashRouterDashNavigationDashCoreMod.CardStack
  ] = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CardStackProps
}

