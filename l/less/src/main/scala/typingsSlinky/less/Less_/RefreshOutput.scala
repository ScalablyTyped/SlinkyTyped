package typingsSlinky.less.Less_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshOutput extends js.Object {
  var endTime: js.Date = js.native
  var sheets: Double = js.native
  var startTime: js.Date = js.native
  var totalMilliseconds: Double = js.native
}

object RefreshOutput {
  @scala.inline
  def apply(endTime: js.Date, sheets: Double, startTime: js.Date, totalMilliseconds: Double): RefreshOutput = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], sheets = sheets.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], totalMilliseconds = totalMilliseconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshOutput]
  }
  @scala.inline
  implicit class RefreshOutputOps[Self <: RefreshOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSheets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalMilliseconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalMilliseconds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

