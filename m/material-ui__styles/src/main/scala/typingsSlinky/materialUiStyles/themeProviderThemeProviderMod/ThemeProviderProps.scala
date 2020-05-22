package typingsSlinky.materialUiStyles.themeProviderThemeProviderMod

import slinky.core.TagMod
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeProviderProps[Theme] extends js.Object {
  var children: TagMod[Any]
  var theme: Partial[Theme] | (js.Function1[/* outerTheme */ Theme, Theme])
}

object ThemeProviderProps {
  @scala.inline
  def apply[Theme](
    theme: Partial[Theme] | (js.Function1[/* outerTheme */ Theme, Theme]),
    children: TagMod[Any] = null
  ): ThemeProviderProps[Theme] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProviderProps[Theme]]
  }
}

