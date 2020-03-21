package typingsSlinky.antDesignReactNative.popoverMod

import slinky.core.TagMod
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.auto
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.antDesignReactNative.popoverStyleMod.PopoverStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeModalPopover.popoverGeometryMod.Placement
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverProps extends WithThemeStyles[PopoverStyle] {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onSelect: js.UndefOr[js.Function2[/* node */ js.Any, /* index */ js.UndefOr[Double], Unit]] = js.undefined
  var overlay: TagMod[Any]
  var placement: js.UndefOr[Placement | auto] = js.undefined
  var renderOverlayComponent: js.UndefOr[js.Function1[/* node */ TagMod[Any], TagMod[Any]]] = js.undefined
  var triggerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object PopoverProps {
  @scala.inline
  def apply(
    overlay: TagMod[Any],
    disabled: js.UndefOr[Boolean] = js.undefined,
    onSelect: (/* node */ js.Any, /* index */ js.UndefOr[Double]) => Unit = null,
    placement: Placement | auto = null,
    renderOverlayComponent: /* node */ TagMod[Any] => TagMod[Any] = null,
    styles: Partial[PopoverStyle] = null,
    triggerStyle: StyleProp[ViewStyle] = null
  ): PopoverProps = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (renderOverlayComponent != null) __obj.updateDynamic("renderOverlayComponent")(js.Any.fromFunction1(renderOverlayComponent))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (triggerStyle != null) __obj.updateDynamic("triggerStyle")(triggerStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverProps]
  }
}

