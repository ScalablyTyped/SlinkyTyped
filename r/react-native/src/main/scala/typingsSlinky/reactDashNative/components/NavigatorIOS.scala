package typingsSlinky.reactDashNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.NavigatorIOSProps
import typingsSlinky.reactDashNative.reactDashNativeMod.Route
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavigatorIOS
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashNative.reactDashNativeMod.NavigatorIOS] {
  @JSImport("react-native", "NavigatorIOS")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    initialRoute: Route,
    barTintColor: String = null,
    interactivePopGestureEnabled: js.UndefOr[Boolean] = js.undefined,
    itemWrapperStyle: StyleProp[ViewStyle] = null,
    navigationBarHidden: js.UndefOr[Boolean] = js.undefined,
    shadowHidden: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    tintColor: String = null,
    titleTextColor: String = null,
    translucent: js.UndefOr[Boolean] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashNative.reactDashNativeMod.NavigatorIOS] = {
    val __obj = js.Dynamic.literal(initialRoute = initialRoute.asInstanceOf[js.Any])
    if (barTintColor != null) __obj.updateDynamic("barTintColor")(barTintColor.asInstanceOf[js.Any])
    if (!js.isUndefined(interactivePopGestureEnabled)) __obj.updateDynamic("interactivePopGestureEnabled")(interactivePopGestureEnabled.asInstanceOf[js.Any])
    if (itemWrapperStyle != null) __obj.updateDynamic("itemWrapperStyle")(itemWrapperStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(navigationBarHidden)) __obj.updateDynamic("navigationBarHidden")(navigationBarHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowHidden)) __obj.updateDynamic("shadowHidden")(shadowHidden.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (titleTextColor != null) __obj.updateDynamic("titleTextColor")(titleTextColor.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = NavigatorIOSProps
}

