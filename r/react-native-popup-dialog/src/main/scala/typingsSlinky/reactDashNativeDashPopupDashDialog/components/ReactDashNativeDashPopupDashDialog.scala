package typingsSlinky.reactDashNativeDashPopupDashDialog.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashPopupDashDialog.reactDashNativeDashPopupDashDialogMod.DialogProps
import typingsSlinky.reactDashNativeDashPopupDashDialog.reactDashNativeDashPopupDashDialogMod.FadeAnimation
import typingsSlinky.reactDashNativeDashPopupDashDialog.reactDashNativeDashPopupDashDialogMod.OverlayPointerEventTypes
import typingsSlinky.reactDashNativeDashPopupDashDialog.reactDashNativeDashPopupDashDialogMod.ScaleAnimation
import typingsSlinky.reactDashNativeDashPopupDashDialog.reactDashNativeDashPopupDashDialogMod.SlideAnimation
import typingsSlinky.reactDashNativeDashPopupDashDialog.reactDashNativeDashPopupDashDialogMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashPopupDashDialog
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-popup-dialog", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    animationDuration: Int | Double = null,
    containerStyle: StyleProp[ViewStyle] = null,
    dialogAnimation: FadeAnimation | ScaleAnimation | SlideAnimation = null,
    dialogStyle: StyleProp[ViewStyle] = null,
    dialogTitle: js.Any = null,
    footer: js.Any = null,
    hasOverlay: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    onDismiss: () => Unit = null,
    onHardwareBackPress: () => Boolean = null,
    onShow: () => Unit = null,
    onTouchOutside: () => Unit = null,
    overlayBackgroundColor: String = null,
    overlayOpacity: Int | Double = null,
    overlayPointerEvents: OverlayPointerEventTypes = null,
    rounded: js.UndefOr[Boolean] = js.undefined,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (dialogAnimation != null) __obj.updateDynamic("dialogAnimation")(dialogAnimation.asInstanceOf[js.Any])
    if (dialogStyle != null) __obj.updateDynamic("dialogStyle")(dialogStyle.asInstanceOf[js.Any])
    if (dialogTitle != null) __obj.updateDynamic("dialogTitle")(dialogTitle.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(hasOverlay)) __obj.updateDynamic("hasOverlay")(hasOverlay.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onHardwareBackPress != null) __obj.updateDynamic("onHardwareBackPress")(js.Any.fromFunction0(onHardwareBackPress))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (onTouchOutside != null) __obj.updateDynamic("onTouchOutside")(js.Any.fromFunction0(onTouchOutside))
    if (overlayBackgroundColor != null) __obj.updateDynamic("overlayBackgroundColor")(overlayBackgroundColor.asInstanceOf[js.Any])
    if (overlayOpacity != null) __obj.updateDynamic("overlayOpacity")(overlayOpacity.asInstanceOf[js.Any])
    if (overlayPointerEvents != null) __obj.updateDynamic("overlayPointerEvents")(overlayPointerEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashPopupDashDialog.reactDashNativeDashPopupDashDialogMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DialogProps
}

