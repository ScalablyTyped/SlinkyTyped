package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access and modify pivot tables.
  */
@js.native
trait PivotTable extends js.Object {
  def addCalculatedPivotValue(name: String, formula: String): PivotValue = js.native
  def addColumnGroup(sourceDataColumn: Integer): PivotGroup = js.native
  def addFilter(sourceDataColumn: Integer, filterCriteria: FilterCriteria): PivotFilter = js.native
  def addPivotValue(sourceDataColumn: Integer, summarizeFunction: PivotTableSummarizeFunction): PivotValue = js.native
  def addRowGroup(sourceDataColumn: Integer): PivotGroup = js.native
  def getAnchorCell(): Range = js.native
  def getColumnGroups(): js.Array[PivotGroup] = js.native
  def getFilters(): js.Array[PivotFilter] = js.native
  def getPivotValues(): js.Array[PivotValue] = js.native
  def getRowGroups(): js.Array[PivotGroup] = js.native
  def getValuesDisplayOrientation(): Dimension = js.native
  def remove(): Unit = js.native
  def setValuesDisplayOrientation(dimension: Dimension): PivotTable = js.native
}

object PivotTable {
  @scala.inline
  def apply(
    addCalculatedPivotValue: (String, String) => PivotValue,
    addColumnGroup: Integer => PivotGroup,
    addFilter: (Integer, FilterCriteria) => PivotFilter,
    addPivotValue: (Integer, PivotTableSummarizeFunction) => PivotValue,
    addRowGroup: Integer => PivotGroup,
    getAnchorCell: () => Range,
    getColumnGroups: () => js.Array[PivotGroup],
    getFilters: () => js.Array[PivotFilter],
    getPivotValues: () => js.Array[PivotValue],
    getRowGroups: () => js.Array[PivotGroup],
    getValuesDisplayOrientation: () => Dimension,
    remove: () => Unit,
    setValuesDisplayOrientation: Dimension => PivotTable
  ): PivotTable = {
    val __obj = js.Dynamic.literal(addCalculatedPivotValue = js.Any.fromFunction2(addCalculatedPivotValue), addColumnGroup = js.Any.fromFunction1(addColumnGroup), addFilter = js.Any.fromFunction2(addFilter), addPivotValue = js.Any.fromFunction2(addPivotValue), addRowGroup = js.Any.fromFunction1(addRowGroup), getAnchorCell = js.Any.fromFunction0(getAnchorCell), getColumnGroups = js.Any.fromFunction0(getColumnGroups), getFilters = js.Any.fromFunction0(getFilters), getPivotValues = js.Any.fromFunction0(getPivotValues), getRowGroups = js.Any.fromFunction0(getRowGroups), getValuesDisplayOrientation = js.Any.fromFunction0(getValuesDisplayOrientation), remove = js.Any.fromFunction0(remove), setValuesDisplayOrientation = js.Any.fromFunction1(setValuesDisplayOrientation))
    __obj.asInstanceOf[PivotTable]
  }
  @scala.inline
  implicit class PivotTableOps[Self <: PivotTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddCalculatedPivotValue(value: (String, String) => PivotValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCalculatedPivotValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddColumnGroup(value: Integer => PivotGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addColumnGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddFilter(value: (Integer, FilterCriteria) => PivotFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFilter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddPivotValue(value: (Integer, PivotTableSummarizeFunction) => PivotValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPivotValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddRowGroup(value: Integer => PivotGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRowGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAnchorCell(value: () => Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnchorCell")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetColumnGroups(value: () => js.Array[PivotGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnGroups")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFilters(value: () => js.Array[PivotFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPivotValues(value: () => js.Array[PivotValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPivotValues")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRowGroups(value: () => js.Array[PivotGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowGroups")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValuesDisplayOrientation(value: () => Dimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValuesDisplayOrientation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetValuesDisplayOrientation(value: Dimension => PivotTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValuesDisplayOrientation")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

