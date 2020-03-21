package typingsSlinky.luxon.mod

import typingsSlinky.luxon.luxonStrings.long
import typingsSlinky.luxon.luxonStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneOffsetOptions extends js.Object {
  var format: js.UndefOr[short | long] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
}

object ZoneOffsetOptions {
  @scala.inline
  def apply(format: short | long = null, locale: String = null): ZoneOffsetOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneOffsetOptions]
  }
}

