package typingsSlinky.reactDashNativeDashModalDashPopover.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashModalDashPopover.libPopoverGeometryMod.Placement
import typingsSlinky.reactDashNativeDashModalDashPopover.libPopoverGeometryMod.Rect
import typingsSlinky.reactDashNativeDashModalDashPopover.libPopoverGeometryMod.Size
import typingsSlinky.reactDashNativeDashModalDashPopover.libPopoverMod.Orientation
import typingsSlinky.reactDashNativeDashModalDashPopover.libPopoverMod.PopoverProps
import typingsSlinky.reactDashNativeDashModalDashPopover.reactDashNativeDashModalDashPopoverStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_PopoverProps_2060580334[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  def apply(
    fromRect: Rect,
    arrowSize: Size = null,
    arrowStyle: StyleProp[ViewStyle] = null,
    backgroundStyle: StyleProp[ViewStyle] = null,
    contentStyle: StyleProp[ViewStyle] = null,
    displayArea: Rect = null,
    duration: Int | Double = null,
    easing: /* show */ Boolean => js.Function1[/* value */ Double, Double] = null,
    onClose: () => Unit = null,
    onDismiss: () => Unit = null,
    placement: Placement | auto = null,
    popoverStyle: StyleProp[ViewStyle] = null,
    supportedOrientations: js.Array[Orientation] = null,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(fromRect = fromRect.asInstanceOf[js.Any])
    if (arrowSize != null) __obj.updateDynamic("arrowSize")(arrowSize.asInstanceOf[js.Any])
    if (arrowStyle != null) __obj.updateDynamic("arrowStyle")(arrowStyle.asInstanceOf[js.Any])
    if (backgroundStyle != null) __obj.updateDynamic("backgroundStyle")(backgroundStyle.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (displayArea != null) __obj.updateDynamic("displayArea")(displayArea.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (popoverStyle != null) __obj.updateDynamic("popoverStyle")(popoverStyle.asInstanceOf[js.Any])
    if (supportedOrientations != null) __obj.updateDynamic("supportedOrientations")(supportedOrientations.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PopoverProps
}

