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

@js.native
trait TimeScale extends Scale {
  var format: js.UndefOr[String] = js.native
  var precision: js.UndefOr[millisecond | second | minute | hour | month | year | day] = js.native
  var `type`: time = js.native
}

object TimeScale {
  @scala.inline
  def apply(`type`: time): TimeScale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeScale]
  }
  @scala.inline
  implicit class TimeScaleOps[Self <: TimeScale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecision(value: millisecond | second | minute | hour | month | year | day): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
  }
  
}

