package typingsSlinky.reactDashNavigation.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationProp
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.SceneViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SceneView
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashNavigation.reactDashNavigationMod.SceneView] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.reactDashNavigation.reactDashNavigationMod.SceneView].asInstanceOf[String | js.Object]
  def apply(
    component: ReactComponentClass[js.Object],
    navigation: NavigationProp[_],
    screenProps: js.Any,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashNavigation.reactDashNavigationMod.SceneView] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SceneViewProps
}

