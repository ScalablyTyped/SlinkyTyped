package typingsSlinky.officeUiFabricReact.calendarDayMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDayInfo extends js.Object {
  var date: String = js.native
  var isInBounds: Boolean = js.native
  var isInMonth: Boolean = js.native
  var isSelected: Boolean = js.native
  var isToday: Boolean = js.native
  var key: String = js.native
  var originalDate: js.Date = js.native
  def onSelected(ev: SyntheticEvent[Event, HTMLElement]): Unit = js.native
}

object IDayInfo {
  @scala.inline
  def apply(
    date: String,
    isInBounds: Boolean,
    isInMonth: Boolean,
    isSelected: Boolean,
    isToday: Boolean,
    key: String,
    onSelected: SyntheticEvent[Event, HTMLElement] => Unit,
    originalDate: js.Date
  ): IDayInfo = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], isInBounds = isInBounds.asInstanceOf[js.Any], isInMonth = isInMonth.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onSelected = js.Any.fromFunction1(onSelected), originalDate = originalDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDayInfo]
  }
  @scala.inline
  implicit class IDayInfoOps[Self <: IDayInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInBounds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInMonth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsToday(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isToday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnSelected(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOriginalDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalDate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

