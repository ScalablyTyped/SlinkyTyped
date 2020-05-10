package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access and modify value groups in pivot tables.
  */
@js.native
trait PivotValue extends js.Object {
  def getDisplayType(): PivotValueDisplayType = js.native
  def getFormula(): String | Null = js.native
  def getPivotTable(): PivotTable = js.native
  def getSummarizedBy(): PivotTableSummarizeFunction = js.native
  def setDisplayName(name: String): PivotValue = js.native
  def setFormula(formula: String): PivotValue = js.native
  def showAs(displayType: PivotValueDisplayType): PivotValue = js.native
  def summarizeBy(summarizeFunction: PivotTableSummarizeFunction): PivotValue = js.native
}

object PivotValue {
  @scala.inline
  def apply(
    getDisplayType: () => PivotValueDisplayType,
    getFormula: () => String | Null,
    getPivotTable: () => PivotTable,
    getSummarizedBy: () => PivotTableSummarizeFunction,
    setDisplayName: String => PivotValue,
    setFormula: String => PivotValue,
    showAs: PivotValueDisplayType => PivotValue,
    summarizeBy: PivotTableSummarizeFunction => PivotValue
  ): PivotValue = {
    val __obj = js.Dynamic.literal(getDisplayType = js.Any.fromFunction0(getDisplayType), getFormula = js.Any.fromFunction0(getFormula), getPivotTable = js.Any.fromFunction0(getPivotTable), getSummarizedBy = js.Any.fromFunction0(getSummarizedBy), setDisplayName = js.Any.fromFunction1(setDisplayName), setFormula = js.Any.fromFunction1(setFormula), showAs = js.Any.fromFunction1(showAs), summarizeBy = js.Any.fromFunction1(summarizeBy))
    __obj.asInstanceOf[PivotValue]
  }
  @scala.inline
  implicit class PivotValueOps[Self <: PivotValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDisplayType(value: () => PivotValueDisplayType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFormula(value: () => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormula")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPivotTable(value: () => PivotTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPivotTable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSummarizedBy(value: () => PivotTableSummarizeFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSummarizedBy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDisplayName(value: String => PivotValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisplayName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFormula(value: String => PivotValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFormula")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowAs(value: PivotValueDisplayType => PivotValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSummarizeBy(value: PivotTableSummarizeFunction => PivotValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summarizeBy")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

