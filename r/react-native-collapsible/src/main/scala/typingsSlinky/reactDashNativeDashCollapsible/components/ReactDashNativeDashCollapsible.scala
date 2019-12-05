package typingsSlinky.reactDashNativeDashCollapsible.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashCollapsible.reactDashNativeDashCollapsibleMod.CollapsibleProps
import typingsSlinky.reactDashNativeDashCollapsible.reactDashNativeDashCollapsibleMod.EasingMode
import typingsSlinky.reactDashNativeDashCollapsible.reactDashNativeDashCollapsibleMod.default
import typingsSlinky.reactDashNativeDashCollapsible.reactDashNativeDashCollapsibleStrings.bottom
import typingsSlinky.reactDashNativeDashCollapsible.reactDashNativeDashCollapsibleStrings.center
import typingsSlinky.reactDashNativeDashCollapsible.reactDashNativeDashCollapsibleStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashCollapsible
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-collapsible", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    align: top | center | bottom = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    collapsedHeight: Int | Double = null,
    duration: Int | Double = null,
    easing: EasingMode | js.Any = null,
    enablePointerEvents: js.UndefOr[Boolean] = js.undefined,
    onAnimationEnd: () => Unit = null,
    style: StyleProp[ViewStyle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (collapsedHeight != null) __obj.updateDynamic("collapsedHeight")(collapsedHeight.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePointerEvents)) __obj.updateDynamic("enablePointerEvents")(enablePointerEvents.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction0(onAnimationEnd))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CollapsibleProps
}

