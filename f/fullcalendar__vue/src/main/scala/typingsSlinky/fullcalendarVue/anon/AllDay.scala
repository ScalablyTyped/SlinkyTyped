package typingsSlinky.fullcalendarVue.anon

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllDay extends js.Object {
  var allDay: Boolean = js.native
  var date: js.Date = js.native
  var dayEl: HTMLElement = js.native
  var hiddenSegs: js.Array[_] = js.native
  var jsEvent: MouseEvent = js.native
  var moreEl: HTMLElement = js.native
  var segs: js.Array[_] = js.native
  var view: js.Any = js.native
}

object AllDay {
  @scala.inline
  def apply(
    allDay: Boolean,
    date: js.Date,
    dayEl: HTMLElement,
    hiddenSegs: js.Array[_],
    jsEvent: MouseEvent,
    moreEl: HTMLElement,
    segs: js.Array[_],
    view: js.Any
  ): AllDay = {
    val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dayEl = dayEl.asInstanceOf[js.Any], hiddenSegs = hiddenSegs.asInstanceOf[js.Any], jsEvent = jsEvent.asInstanceOf[js.Any], moreEl = moreEl.asInstanceOf[js.Any], segs = segs.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDay]
  }
  @scala.inline
  implicit class AllDayOps[Self <: AllDay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllDay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayEl(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiddenSegs(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenSegs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsEvent(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoreEl(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSegs(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

