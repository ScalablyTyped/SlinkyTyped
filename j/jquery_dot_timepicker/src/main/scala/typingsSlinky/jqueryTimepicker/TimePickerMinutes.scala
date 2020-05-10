package typingsSlinky.jqueryTimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePickerMinutes extends js.Object {
  /** last displayed minute */
  var ends: js.UndefOr[Double] = js.native
  /** interval of displayed minutes */
  var interval: js.UndefOr[Double] = js.native
  /** first displayed minute */
  var starts: js.UndefOr[Double] = js.native
}

object TimePickerMinutes {
  @scala.inline
  def apply(): TimePickerMinutes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerMinutes]
  }
  @scala.inline
  implicit class TimePickerMinutesOps[Self <: TimePickerMinutes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ends")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withStarts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starts")(js.undefined)
        ret
    }
  }
  
}

