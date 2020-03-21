package typingsSlinky.antDesignReactNative.cardFooterMod

import slinky.core.TagMod
import typingsSlinky.antDesignReactNative.PickCardStylefooterConten
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardFooterProps
  extends CardFooterPropsType
     with WithThemeStyles[PickCardStylefooterConten] {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object CardFooterProps {
  @scala.inline
  def apply(
    content: TagMod[Any] = null,
    extra: TagMod[Any] = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[PickCardStylefooterConten] = null
  ): CardFooterProps = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardFooterProps]
  }
}

