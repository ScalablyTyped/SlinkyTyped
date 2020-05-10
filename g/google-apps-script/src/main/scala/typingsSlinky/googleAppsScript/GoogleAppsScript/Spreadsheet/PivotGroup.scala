package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access and modify pivot table breakout groups.
  */
@js.native
trait PivotGroup extends js.Object {
  def addManualGroupingRule(groupName: String, groupMembers: js.Array[_]): PivotGroup = js.native
  def areLabelsRepeated(): Boolean = js.native
  def clearGroupingRule(): PivotGroup = js.native
  def clearSort(): PivotGroup = js.native
  def getDimension(): Dimension = js.native
  def getIndex(): Integer = js.native
  def getPivotTable(): PivotTable = js.native
  def getSourceDataColumn(): Integer = js.native
  def hideRepeatedLabels(): PivotGroup = js.native
  def isSortAscending(): Boolean = js.native
  def moveToIndex(index: Integer): PivotGroup = js.native
  def remove(): Unit = js.native
  def removeManualGroupingRule(groupName: String): PivotGroup = js.native
  def resetDisplayName(): PivotGroup = js.native
  def setDisplayName(name: String): PivotGroup = js.native
  def setHistogramGroupingRule(minValue: Integer, maxValue: Integer, intervalSize: Integer): PivotGroup = js.native
  def showRepeatedLabels(): PivotGroup = js.native
  def showTotals(showTotals: Boolean): PivotGroup = js.native
  def sortAscending(): PivotGroup = js.native
  def sortBy(value: PivotValue, oppositeGroupValues: js.Array[_]): PivotGroup = js.native
  def sortDescending(): PivotGroup = js.native
  def totalsAreShown(): Boolean = js.native
}

object PivotGroup {
  @scala.inline
  def apply(
    addManualGroupingRule: (String, js.Array[_]) => PivotGroup,
    areLabelsRepeated: () => Boolean,
    clearGroupingRule: () => PivotGroup,
    clearSort: () => PivotGroup,
    getDimension: () => Dimension,
    getIndex: () => Integer,
    getPivotTable: () => PivotTable,
    getSourceDataColumn: () => Integer,
    hideRepeatedLabels: () => PivotGroup,
    isSortAscending: () => Boolean,
    moveToIndex: Integer => PivotGroup,
    remove: () => Unit,
    removeManualGroupingRule: String => PivotGroup,
    resetDisplayName: () => PivotGroup,
    setDisplayName: String => PivotGroup,
    setHistogramGroupingRule: (Integer, Integer, Integer) => PivotGroup,
    showRepeatedLabels: () => PivotGroup,
    showTotals: Boolean => PivotGroup,
    sortAscending: () => PivotGroup,
    sortBy: (PivotValue, js.Array[_]) => PivotGroup,
    sortDescending: () => PivotGroup,
    totalsAreShown: () => Boolean
  ): PivotGroup = {
    val __obj = js.Dynamic.literal(addManualGroupingRule = js.Any.fromFunction2(addManualGroupingRule), areLabelsRepeated = js.Any.fromFunction0(areLabelsRepeated), clearGroupingRule = js.Any.fromFunction0(clearGroupingRule), clearSort = js.Any.fromFunction0(clearSort), getDimension = js.Any.fromFunction0(getDimension), getIndex = js.Any.fromFunction0(getIndex), getPivotTable = js.Any.fromFunction0(getPivotTable), getSourceDataColumn = js.Any.fromFunction0(getSourceDataColumn), hideRepeatedLabels = js.Any.fromFunction0(hideRepeatedLabels), isSortAscending = js.Any.fromFunction0(isSortAscending), moveToIndex = js.Any.fromFunction1(moveToIndex), remove = js.Any.fromFunction0(remove), removeManualGroupingRule = js.Any.fromFunction1(removeManualGroupingRule), resetDisplayName = js.Any.fromFunction0(resetDisplayName), setDisplayName = js.Any.fromFunction1(setDisplayName), setHistogramGroupingRule = js.Any.fromFunction3(setHistogramGroupingRule), showRepeatedLabels = js.Any.fromFunction0(showRepeatedLabels), showTotals = js.Any.fromFunction1(showTotals), sortAscending = js.Any.fromFunction0(sortAscending), sortBy = js.Any.fromFunction2(sortBy), sortDescending = js.Any.fromFunction0(sortDescending), totalsAreShown = js.Any.fromFunction0(totalsAreShown))
    __obj.asInstanceOf[PivotGroup]
  }
  @scala.inline
  implicit class PivotGroupOps[Self <: PivotGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddManualGroupingRule(value: (String, js.Array[_]) => PivotGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addManualGroupingRule")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAreLabelsRepeated(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areLabelsRepeated")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearGroupingRule(value: () => PivotGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearGroupingRule")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearSort(value: () => PivotGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDimension(value: () => Dimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDimension")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIndex(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndex")(js.Any.fromFunction0(value))
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
    def withHideRepeatedLabels(value: () => PivotGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideRepeatedLabels")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSortAscending(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSortAscending")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMoveToIndex(value: Integer => PivotGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveManualGroupingRule(value: String => PivotGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeManualGroupingRule")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetDisplayName(value: () => PivotGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetDisplayName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDisplayName(value: String => PivotGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisplayName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHistogramGroupingRule(value: (Integer, Integer, Integer) => PivotGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHistogramGroupingRule")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withShowRepeatedLabels(value: () => PivotGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRepeatedLabels")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowTotals(value: Boolean => PivotGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTotals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSortAscending(value: () => PivotGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortAscending")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSortBy(value: (PivotValue, js.Array[_]) => PivotGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSortDescending(value: () => PivotGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDescending")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTotalsAreShown(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalsAreShown")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

