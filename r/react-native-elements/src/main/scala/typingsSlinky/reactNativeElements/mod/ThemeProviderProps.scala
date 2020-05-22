package typingsSlinky.reactNativeElements.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeProviderProps[T] extends js.Object {
  var children: TagMod[Any]
  var theme: js.UndefOr[Theme[T]] = js.undefined
}

object ThemeProviderProps {
  @scala.inline
  def apply[T](children: TagMod[Any] = null, theme: Theme[T] = null): ThemeProviderProps[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProviderProps[T]]
  }
}

