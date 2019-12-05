package typingsSlinky.baseui.baseuiMod

import slinky.core.TagMod
import typingsSlinky.dateDashFns.Locale
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleProviderProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var locale: Partial[Locale]
}

object LocaleProviderProps {
  @scala.inline
  def apply(locale: Partial[Locale], children: TagMod[Any] = null): LocaleProviderProps = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleProviderProps]
  }
}

