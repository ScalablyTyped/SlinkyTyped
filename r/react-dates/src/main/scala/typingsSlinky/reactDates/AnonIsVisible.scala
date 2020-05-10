package typingsSlinky.reactDates

import typingsSlinky.reactDates.mod.momentPropTypes.momentObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsVisible extends js.Object {
  var isVisible: Boolean = js.native
  var month: momentObj = js.native
  def onMonthSelect(currentMonth: momentObj, newMonthVal: String): Unit = js.native
  def onYearSelect(currentMonth: momentObj, newYearVal: String): Unit = js.native
}

object AnonIsVisible {
  @scala.inline
  def apply(
    isVisible: Boolean,
    month: momentObj,
    onMonthSelect: (momentObj, String) => Unit,
    onYearSelect: (momentObj, String) => Unit
  ): AnonIsVisible = {
    val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], onMonthSelect = js.Any.fromFunction2(onMonthSelect), onYearSelect = js.Any.fromFunction2(onYearSelect))
    __obj.asInstanceOf[AnonIsVisible]
  }
  @scala.inline
  implicit class AnonIsVisibleOps[Self <: AnonIsVisible] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonth(value: momentObj): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnMonthSelect(value: (momentObj, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMonthSelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnYearSelect(value: (momentObj, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onYearSelect")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

