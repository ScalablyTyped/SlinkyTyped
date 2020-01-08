package typingsSlinky.reactDashNativeDashElements.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.TooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.Tooltip
    ] {
  @JSImport("react-native-elements", "Tooltip")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    backgroundColor: String = null,
    containerStyle: StyleProp[ViewStyle] = null,
    height: Int | Double = null,
    highlightColor: String = null,
    onClose: () => Unit = null,
    onOpen: () => Unit = null,
    overlayColor: String = null,
    pointerColor: String = null,
    popover: ReactElement = null,
    toggleOnPress: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    withOverlay: js.UndefOr[Boolean] = js.undefined,
    withPointer: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.Tooltip
  ] = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (highlightColor != null) __obj.updateDynamic("highlightColor")(highlightColor.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor.asInstanceOf[js.Any])
    if (pointerColor != null) __obj.updateDynamic("pointerColor")(pointerColor.asInstanceOf[js.Any])
    if (popover != null) __obj.updateDynamic("popover")(popover.asInstanceOf[js.Any])
    if (!js.isUndefined(toggleOnPress)) __obj.updateDynamic("toggleOnPress")(toggleOnPress.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(withOverlay)) __obj.updateDynamic("withOverlay")(withOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(withPointer)) __obj.updateDynamic("withPointer")(withPointer.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.Tooltip
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.Tooltip](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TooltipProps
}

