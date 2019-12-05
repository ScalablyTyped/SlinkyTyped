package typingsSlinky.atNivoScales.atNivoScalesMod

import typingsSlinky.atNivoScales.atNivoScalesStrings.day
import typingsSlinky.atNivoScales.atNivoScalesStrings.hour
import typingsSlinky.atNivoScales.atNivoScalesStrings.millisecond
import typingsSlinky.atNivoScales.atNivoScalesStrings.minute
import typingsSlinky.atNivoScales.atNivoScalesStrings.month
import typingsSlinky.atNivoScales.atNivoScalesStrings.second
import typingsSlinky.atNivoScales.atNivoScalesStrings.time
import typingsSlinky.atNivoScales.atNivoScalesStrings.year
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

