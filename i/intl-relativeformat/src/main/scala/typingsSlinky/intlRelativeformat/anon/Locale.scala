package typingsSlinky.intlRelativeformat.anon

import typingsSlinky.intlRelativeformat.typesMod.STYLE
import typingsSlinky.intlRelativeformat.typesMod.SUPPORTED_FIELD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var locale: String
  var style: STYLE
  var units: js.UndefOr[SUPPORTED_FIELD] = js.undefined
}

object Locale {
  @scala.inline
  def apply(locale: String, style: STYLE, units: SUPPORTED_FIELD = null): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
}

