package typingsSlinky.antdMobileRn.cardHeaderNativeMod

import slinky.core.TagMod
import typingsSlinky.antdMobileRn.cardPropsTypeMod.CardHeaderPropsType
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardHeaderProps extends CardHeaderPropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
  var thumbStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
}

object CardHeaderProps {
  @scala.inline
  def apply(
    extra: TagMod[Any] = null,
    style: StyleProp[ViewStyle] = null,
    styles: js.Any = null,
    thumb: TagMod[Any] = null,
    thumbStyle: StyleProp[ImageStyle] = null,
    title: TagMod[Any] = null
  ): CardHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (thumbStyle != null) __obj.updateDynamic("thumbStyle")(thumbStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardHeaderProps]
  }
}

