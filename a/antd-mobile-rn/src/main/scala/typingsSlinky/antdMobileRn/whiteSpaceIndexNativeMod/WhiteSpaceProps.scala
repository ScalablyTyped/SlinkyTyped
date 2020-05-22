package typingsSlinky.antdMobileRn.whiteSpaceIndexNativeMod

import typingsSlinky.antdMobileRn.antdMobileRnStrings.lg
import typingsSlinky.antdMobileRn.antdMobileRnStrings.md
import typingsSlinky.antdMobileRn.antdMobileRnStrings.sm
import typingsSlinky.antdMobileRn.antdMobileRnStrings.xl
import typingsSlinky.antdMobileRn.antdMobileRnStrings.xs
import typingsSlinky.antdMobileRn.whiteSpacePropsTypeMod.WhiteSpacePropsType
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhiteSpaceProps extends WhiteSpacePropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object WhiteSpaceProps {
  @scala.inline
  def apply(size: xs | sm | md | lg | xl = null, style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined): WhiteSpaceProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteSpaceProps]
  }
}

