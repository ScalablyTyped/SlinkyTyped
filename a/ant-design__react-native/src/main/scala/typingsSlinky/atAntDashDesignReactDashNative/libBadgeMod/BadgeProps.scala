package typingsSlinky.atAntDashDesignReactDashNative.libBadgeMod

import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.large
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.small
import typingsSlinky.atAntDashDesignReactDashNative.libBadgeStyleMod.BadgeStyle
import typingsSlinky.atAntDashDesignReactDashNative.libStyleMod.WithThemeStyles
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps extends WithThemeStyles[BadgeStyle] {
  var corner: js.UndefOr[Boolean] = js.undefined
  var dot: js.UndefOr[Boolean] = js.undefined
  var overflowCount: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[large | small] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var text: js.UndefOr[js.Any] = js.undefined
}

object BadgeProps {
  @scala.inline
  def apply(
    corner: js.UndefOr[Boolean] = js.undefined,
    dot: js.UndefOr[Boolean] = js.undefined,
    overflowCount: Int | Double = null,
    size: large | small = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[BadgeStyle] = null,
    text: js.Any = null
  ): BadgeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(corner)) __obj.updateDynamic("corner")(corner.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.asInstanceOf[js.Any])
    if (overflowCount != null) __obj.updateDynamic("overflowCount")(overflowCount.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeProps]
  }
}

