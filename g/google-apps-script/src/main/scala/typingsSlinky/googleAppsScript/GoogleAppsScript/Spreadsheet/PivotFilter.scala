package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access and modify pivot table filters.
  */
@js.native
trait PivotFilter extends js.Object {
  def getFilterCriteria(): FilterCriteria = js.native
  def getPivotTable(): PivotTable = js.native
  def getSourceDataColumn(): Integer = js.native
  def remove(): Unit = js.native
  def setFilterCriteria(filterCriteria: FilterCriteria): PivotFilter = js.native
}

object PivotFilter {
  @scala.inline
  def apply(
    getFilterCriteria: () => FilterCriteria,
    getPivotTable: () => PivotTable,
    getSourceDataColumn: () => Integer,
    remove: () => Unit,
    setFilterCriteria: FilterCriteria => PivotFilter
  ): PivotFilter = {
    val __obj = js.Dynamic.literal(getFilterCriteria = js.Any.fromFunction0(getFilterCriteria), getPivotTable = js.Any.fromFunction0(getPivotTable), getSourceDataColumn = js.Any.fromFunction0(getSourceDataColumn), remove = js.Any.fromFunction0(remove), setFilterCriteria = js.Any.fromFunction1(setFilterCriteria))
    __obj.asInstanceOf[PivotFilter]
  }
  @scala.inline
  implicit class PivotFilterOps[Self <: PivotFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetFilterCriteria(value: () => FilterCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilterCriteria")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPivotTable(value: () => PivotTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPivotTable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSourceDataColumn(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSourceDataColumn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFilterCriteria(value: FilterCriteria => PivotFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilterCriteria")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

