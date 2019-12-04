package typingsSlinky.reactDashNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.StatusBarProps
import typingsSlinky.reactDashNative.reactDashNativeMod.StatusBarStyle
import typingsSlinky.reactDashNative.reactDashNativeStrings.fade
import typingsSlinky.reactDashNative.reactDashNativeStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatusBar
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashNative.reactDashNativeMod.StatusBar] {
  @JSImport("react-native", "StatusBar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: hidden */
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String = null,
    barStyle: StatusBarStyle = null,
    networkActivityIndicatorVisible: js.UndefOr[Boolean] = js.undefined,
    showHideTransition: fade | slide = null,
    translucent: js.UndefOr[Boolean] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashNative.reactDashNativeMod.StatusBar] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(networkActivityIndicatorVisible)) __obj.updateDynamic("networkActivityIndicatorVisible")(networkActivityIndicatorVisible.asInstanceOf[js.Any])
    if (showHideTransition != null) __obj.updateDynamic("showHideTransition")(showHideTransition.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StatusBarProps
}

