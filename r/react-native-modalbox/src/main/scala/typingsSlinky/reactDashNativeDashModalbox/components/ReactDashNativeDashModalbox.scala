package typingsSlinky.reactDashNativeDashModalbox.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashModalbox.reactDashNativeDashModalboxMod.ModalProps
import typingsSlinky.reactDashNativeDashModalbox.reactDashNativeDashModalboxMod.default
import typingsSlinky.reactDashNativeDashModalbox.reactDashNativeDashModalboxStrings.bottom
import typingsSlinky.reactDashNativeDashModalbox.reactDashNativeDashModalboxStrings.center
import typingsSlinky.reactDashNativeDashModalbox.reactDashNativeDashModalboxStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashModalbox
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-modalbox", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    animationDuration: Int | Double = null,
    backButtonClose: js.UndefOr[Boolean] = js.undefined,
    backdrop: js.UndefOr[Boolean] = js.undefined,
    backdropColor: String = null,
    backdropContent: TagMod[Any] = null,
    backdropOpacity: Int | Double = null,
    backdropPressToClose: js.UndefOr[Boolean] = js.undefined,
    coverScreen: js.UndefOr[Boolean] = js.undefined,
    entry: top | bottom | String = null,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    keyboardTopOffset: Int | Double = null,
    onClosed: () => Unit = null,
    onClosingState: /* state */ Boolean => Unit = null,
    onOpened: () => Unit = null,
    position: top | center | bottom | String = null,
    startOpen: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    swipeArea: Int | Double = null,
    swipeThreshold: Int | Double = null,
    swipeToClose: js.UndefOr[Boolean] = js.undefined,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(backButtonClose)) __obj.updateDynamic("backButtonClose")(backButtonClose.asInstanceOf[js.Any])
    if (!js.isUndefined(backdrop)) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (backdropColor != null) __obj.updateDynamic("backdropColor")(backdropColor.asInstanceOf[js.Any])
    if (backdropContent != null) __obj.updateDynamic("backdropContent")(backdropContent.asInstanceOf[js.Any])
    if (backdropOpacity != null) __obj.updateDynamic("backdropOpacity")(backdropOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(backdropPressToClose)) __obj.updateDynamic("backdropPressToClose")(backdropPressToClose.asInstanceOf[js.Any])
    if (!js.isUndefined(coverScreen)) __obj.updateDynamic("coverScreen")(coverScreen.asInstanceOf[js.Any])
    if (entry != null) __obj.updateDynamic("entry")(entry.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (keyboardTopOffset != null) __obj.updateDynamic("keyboardTopOffset")(keyboardTopOffset.asInstanceOf[js.Any])
    if (onClosed != null) __obj.updateDynamic("onClosed")(js.Any.fromFunction0(onClosed))
    if (onClosingState != null) __obj.updateDynamic("onClosingState")(js.Any.fromFunction1(onClosingState))
    if (onOpened != null) __obj.updateDynamic("onOpened")(js.Any.fromFunction0(onOpened))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(startOpen)) __obj.updateDynamic("startOpen")(startOpen.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (swipeArea != null) __obj.updateDynamic("swipeArea")(swipeArea.asInstanceOf[js.Any])
    if (swipeThreshold != null) __obj.updateDynamic("swipeThreshold")(swipeThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeToClose)) __obj.updateDynamic("swipeToClose")(swipeToClose.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ModalProps
}

