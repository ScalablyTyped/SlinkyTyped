package typingsSlinky.fullcalendar.dayTableMixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DayTableInterface extends js.Object {
  var colCnt: js.Any = js.native
  var dayDates: js.Any = js.native
  var daysPerRow: js.Any = js.native
  var rowCnt: js.Any = js.native
  def bookendCells(trEl: js.Any): js.Any = js.native
  def getCellDate(row: js.Any, col: js.Any): js.Any = js.native
  def getCellRange(row: js.Any, col: js.Any): js.Any = js.native
  def renderBgTrHtml(row: js.Any): js.Any = js.native
  def renderHeadHtml(): js.Any = js.native
  def renderIntroHtml(): js.Any = js.native
  def sliceRangeByDay(unzonedRange: js.Any): js.Any = js.native
  def sliceRangeByRow(unzonedRange: js.Any): js.Any = js.native
  def updateDayTable(): js.Any = js.native
}

object DayTableInterface {
  @scala.inline
  def apply(
    bookendCells: js.Any => js.Any,
    colCnt: js.Any,
    dayDates: js.Any,
    daysPerRow: js.Any,
    getCellDate: (js.Any, js.Any) => js.Any,
    getCellRange: (js.Any, js.Any) => js.Any,
    renderBgTrHtml: js.Any => js.Any,
    renderHeadHtml: () => js.Any,
    renderIntroHtml: () => js.Any,
    rowCnt: js.Any,
    sliceRangeByDay: js.Any => js.Any,
    sliceRangeByRow: js.Any => js.Any,
    updateDayTable: () => js.Any
  ): DayTableInterface = {
    val __obj = js.Dynamic.literal(bookendCells = js.Any.fromFunction1(bookendCells), colCnt = colCnt.asInstanceOf[js.Any], dayDates = dayDates.asInstanceOf[js.Any], daysPerRow = daysPerRow.asInstanceOf[js.Any], getCellDate = js.Any.fromFunction2(getCellDate), getCellRange = js.Any.fromFunction2(getCellRange), renderBgTrHtml = js.Any.fromFunction1(renderBgTrHtml), renderHeadHtml = js.Any.fromFunction0(renderHeadHtml), renderIntroHtml = js.Any.fromFunction0(renderIntroHtml), rowCnt = rowCnt.asInstanceOf[js.Any], sliceRangeByDay = js.Any.fromFunction1(sliceRangeByDay), sliceRangeByRow = js.Any.fromFunction1(sliceRangeByRow), updateDayTable = js.Any.fromFunction0(updateDayTable))
    __obj.asInstanceOf[DayTableInterface]
  }
  @scala.inline
  implicit class DayTableInterfaceOps[Self <: DayTableInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBookendCells(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookendCells")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColCnt(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colCnt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayDates(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDaysPerRow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysPerRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCellDate(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellDate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetCellRange(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellRange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRenderBgTrHtml(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBgTrHtml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderHeadHtml(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderHeadHtml")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRenderIntroHtml(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderIntroHtml")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRowCnt(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCnt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSliceRangeByDay(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceRangeByDay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSliceRangeByRow(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceRangeByRow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateDayTable(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDayTable")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

