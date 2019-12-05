package typingsSlinky.reactDashNativeDashTabDashNavigator.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashTabDashNavigator.reactDashNativeDashTabDashNavigatorMod.TabNavigatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_TabNavigatorProps443291689[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  def apply(
    hidesTabTouch: js.UndefOr[Boolean] = js.undefined,
    sceneStyle: ViewStyle = null,
    tabBarShadowStyle: ViewStyle = null,
    tabBarStyle: ViewStyle = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hidesTabTouch)) __obj.updateDynamic("hidesTabTouch")(hidesTabTouch.asInstanceOf[js.Any])
    if (sceneStyle != null) __obj.updateDynamic("sceneStyle")(sceneStyle.asInstanceOf[js.Any])
    if (tabBarShadowStyle != null) __obj.updateDynamic("tabBarShadowStyle")(tabBarShadowStyle.asInstanceOf[js.Any])
    if (tabBarStyle != null) __obj.updateDynamic("tabBarStyle")(tabBarStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TabNavigatorProps
}

