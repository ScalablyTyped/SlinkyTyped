package typingsSlinky.antdMobileRn.iconIndexNativeMod

import typingsSlinky.antdMobileRn.antdMobileRnStrings.lg
import typingsSlinky.antdMobileRn.antdMobileRnStrings.md
import typingsSlinky.antdMobileRn.antdMobileRnStrings.sm
import typingsSlinky.antdMobileRn.antdMobileRnStrings.xs
import typingsSlinky.antdMobileRn.antdMobileRnStrings.xxs
import typingsSlinky.antdMobileRn.iconPropsTypeMod.IconPropsType
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps extends IconPropsType {
  var size: js.UndefOr[xxs | xs | sm | md | lg | Double] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    `type`: String,
    color: String = null,
    size: xxs | xs | sm | md | lg | Double = null,
    style: StyleProp[ViewStyle] = null
  ): IconProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
}

