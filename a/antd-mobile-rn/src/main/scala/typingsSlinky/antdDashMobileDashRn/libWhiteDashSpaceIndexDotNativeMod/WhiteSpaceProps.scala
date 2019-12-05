package typingsSlinky.antdDashMobileDashRn.libWhiteDashSpaceIndexDotNativeMod

import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.lg
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.md
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.sm
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.xl
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.xs
import typingsSlinky.antdDashMobileDashRn.libWhiteDashSpacePropsTypeMod.WhiteSpacePropsType
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhiteSpaceProps extends WhiteSpacePropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object WhiteSpaceProps {
  @scala.inline
  def apply(size: xs | sm | md | lg | xl = null, style: StyleProp[ViewStyle] = null): WhiteSpaceProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteSpaceProps]
  }
}

