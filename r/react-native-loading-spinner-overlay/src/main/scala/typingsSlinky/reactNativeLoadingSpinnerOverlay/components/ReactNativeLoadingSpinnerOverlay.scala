package typingsSlinky.reactNativeLoadingSpinnerOverlay.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNativeLoadingSpinnerOverlay.mod.SpinnerProps
import typingsSlinky.reactNativeLoadingSpinnerOverlay.mod.default
import typingsSlinky.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.fade
import typingsSlinky.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.large
import typingsSlinky.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.none
import typingsSlinky.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.normal
import typingsSlinky.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.slide
import typingsSlinky.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeLoadingSpinnerOverlay
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-loading-spinner-overlay", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    animation: none | slide | fade = null,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    overlayColor: String = null,
    size: normal | small | large = null,
    textContent: String = null,
    textStyle: StyleProp[TextStyle] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (textContent != null) __obj.updateDynamic("textContent")(textContent.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactNativeLoadingSpinnerOverlay.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SpinnerProps
}

