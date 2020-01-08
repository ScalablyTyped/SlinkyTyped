package typingsSlinky.atMaterialDashUiStyles.themeProviderThemeProviderMod

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
  def apply[Theme](children: TagMod[Any], theme: Partial[Theme] | (js.Function1[/* outerTheme */ Theme, Theme])): ThemeProviderProps[Theme] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ThemeProviderProps[Theme]]
  }
}

