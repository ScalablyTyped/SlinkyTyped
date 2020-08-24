package typingsSlinky.nivoScales.mod

import typingsSlinky.nivoScales.nivoScalesStrings.auto
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
  var max: js.UndefOr[auto | js.Date] = js.native
  var min: js.UndefOr[auto | js.Date] = js.native
  var precision: js.UndefOr[millisecond | second | minute | hour | month | year | day] = js.native
  var `type`: time = js.native
  var useUTC: js.UndefOr[Boolean] = js.native
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: time): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxDate(value: js.Date): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: auto | js.Date): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMinDate(value: js.Date): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: auto | js.Date): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setPrecision(value: millisecond | second | minute | hour | month | year | day): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setUseUTC(value: Boolean): Self = this.set("useUTC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseUTC: Self = this.set("useUTC", js.undefined)
  }
  
}

