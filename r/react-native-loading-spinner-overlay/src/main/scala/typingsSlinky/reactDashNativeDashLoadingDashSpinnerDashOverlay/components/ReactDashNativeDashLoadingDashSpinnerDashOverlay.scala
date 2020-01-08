package typingsSlinky.reactDashNativeDashLoadingDashSpinnerDashOverlay.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.TextStyle
import typingsSlinky.reactDashNativeDashLoadingDashSpinnerDashOverlay.reactDashNativeDashLoadingDashSpinnerDashOverlayMod.SpinnerProps
import typingsSlinky.reactDashNativeDashLoadingDashSpinnerDashOverlay.reactDashNativeDashLoadingDashSpinnerDashOverlayMod.default
import typingsSlinky.reactDashNativeDashLoadingDashSpinnerDashOverlay.reactDashNativeDashLoadingDashSpinnerDashOverlayStrings.fade
import typingsSlinky.reactDashNativeDashLoadingDashSpinnerDashOverlay.reactDashNativeDashLoadingDashSpinnerDashOverlayStrings.large
import typingsSlinky.reactDashNativeDashLoadingDashSpinnerDashOverlay.reactDashNativeDashLoadingDashSpinnerDashOverlayStrings.none
import typingsSlinky.reactDashNativeDashLoadingDashSpinnerDashOverlay.reactDashNativeDashLoadingDashSpinnerDashOverlayStrings.normal
import typingsSlinky.reactDashNativeDashLoadingDashSpinnerDashOverlay.reactDashNativeDashLoadingDashSpinnerDashOverlayStrings.slide
import typingsSlinky.reactDashNativeDashLoadingDashSpinnerDashOverlay.reactDashNativeDashLoadingDashSpinnerDashOverlayStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashLoadingDashSpinnerDashOverlay
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
  typingsSlinky.reactDashNativeDashLoadingDashSpinnerDashOverlay.reactDashNativeDashLoadingDashSpinnerDashOverlayMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SpinnerProps
}

