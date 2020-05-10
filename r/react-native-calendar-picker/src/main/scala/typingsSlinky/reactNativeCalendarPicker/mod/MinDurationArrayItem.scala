package typingsSlinky.reactNativeCalendarPicker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinDurationArrayItem extends js.Object {
  var date: MomentParsable = js.native
  var minDuration: Double = js.native
}

object MinDurationArrayItem {
  @scala.inline
  def apply(date: MomentParsable, minDuration: Double): MinDurationArrayItem = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], minDuration = minDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinDurationArrayItem]
  }
  @scala.inline
  implicit class MinDurationArrayItemOps[Self <: MinDurationArrayItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: MomentParsable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDuration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

