package typingsSlinky.antDesignReactNative.cardBodyMod

import typingsSlinky.antDesignReactNative.PickCardStylebody
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardBodyProps extends WithThemeStyles[PickCardStylebody] {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object CardBodyProps {
  @scala.inline
  def apply(style: StyleProp[ViewStyle] = null, styles: Partial[PickCardStylebody] = null): CardBodyProps = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardBodyProps]
  }
}

