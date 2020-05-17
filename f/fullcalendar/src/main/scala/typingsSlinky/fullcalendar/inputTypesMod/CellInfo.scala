package typingsSlinky.fullcalendar.inputTypesMod

import typingsSlinky.fullcalendar.jqueryHooksMod.global.JQuery
import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellInfo extends js.Object {
  var date: Moment = js.native
  var dayEl: JQuery = js.native
  var hiddenSegs: js.Array[EventSegment] = js.native
  var moreEl: JQuery = js.native
  var segs: js.Array[EventSegment] = js.native
}

object CellInfo {
  @scala.inline
  def apply(
    date: Moment,
    dayEl: JQuery,
    hiddenSegs: js.Array[EventSegment],
    moreEl: JQuery,
    segs: js.Array[EventSegment]
  ): CellInfo = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dayEl = dayEl.asInstanceOf[js.Any], hiddenSegs = hiddenSegs.asInstanceOf[js.Any], moreEl = moreEl.asInstanceOf[js.Any], segs = segs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellInfo]
  }
  @scala.inline
  implicit class CellInfoOps[Self <: CellInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: Moment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayEl(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiddenSegs(value: js.Array[EventSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenSegs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoreEl(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSegs(value: js.Array[EventSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

