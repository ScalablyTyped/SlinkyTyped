package typingsSlinky.antdMobileRn.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.antdMobileRn.popoverIndexNativeMod.PopoverProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Popover
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.antdMobileRn.mod.Popover] {
  @JSImport("antd-mobile-rn", "Popover")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, name */
  def apply(
    overlay: TagMod[Any],
    contextStyle: StyleProp[ViewStyle] = null,
    onSelect: (/* node */ js.Any, /* index */ js.UndefOr[Double]) => Unit = null,
    overlayStyle: StyleProp[ViewStyle] = null,
    renderOverlayComponent: /* values */ js.Any => ReactElement = null,
    style: StyleProp[ViewStyle] = null,
    triggerStyle: StyleProp[ViewStyle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.Popover] = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    if (contextStyle != null) __obj.updateDynamic("contextStyle")(contextStyle.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (renderOverlayComponent != null) __obj.updateDynamic("renderOverlayComponent")(js.Any.fromFunction1(renderOverlayComponent))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (triggerStyle != null) __obj.updateDynamic("triggerStyle")(triggerStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PopoverProps
}

