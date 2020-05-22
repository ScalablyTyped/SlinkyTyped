package typingsSlinky.nivoScales.mod

import typingsSlinky.nivoScales.nivoScalesStrings.day
import typingsSlinky.nivoScales.nivoScalesStrings.hour
import typingsSlinky.nivoScales.nivoScalesStrings.millisecond
import typingsSlinky.nivoScales.nivoScalesStrings.minute
import typingsSlinky.nivoScales.nivoScalesStrings.month
import typingsSlinky.nivoScales.nivoScalesStrings.second
import typingsSlinky.nivoScales.nivoScalesStrings.time
import typingsSlinky.nivoScales.nivoScalesStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeScale extends Scale {
  var format: js.UndefOr[String] = js.undefined
  var precision: js.UndefOr[millisecond | second | minute | hour | month | year | day] = js.undefined
  var `type`: time
}

object TimeScale {
  @scala.inline
  def apply(
    `type`: time,
    format: String = null,
    precision: millisecond | second | minute | hour | month | year | day = null
  ): TimeScale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeScale]
  }
}

