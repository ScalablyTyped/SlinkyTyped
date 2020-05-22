package typingsSlinky.baseui.mod

import slinky.core.TagMod
import typingsSlinky.baseui.anon.PartialLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleProviderProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var locale: PartialLocale
}

object LocaleProviderProps {
  @scala.inline
  def apply(locale: PartialLocale, children: TagMod[Any] = null): LocaleProviderProps = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleProviderProps]
  }
}

