package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access filter criteria. To create a new criteria, use SpreadsheetApp.newFilterCriteria() and FilterCriteriaBuilder.
  */
@js.native
trait FilterCriteria extends js.Object {
  def copy(): FilterCriteriaBuilder = js.native
  def getCriteriaType(): BooleanCriteria = js.native
  def getCriteriaValues(): js.Array[_] = js.native
  def getHiddenValues(): js.Array[String] = js.native
  def getVisibleValues(): js.Array[String] = js.native
}

object FilterCriteria {
  @scala.inline
  def apply(
    copy: () => FilterCriteriaBuilder,
    getCriteriaType: () => BooleanCriteria,
    getCriteriaValues: () => js.Array[_],
    getHiddenValues: () => js.Array[String],
    getVisibleValues: () => js.Array[String]
  ): FilterCriteria = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getCriteriaType = js.Any.fromFunction0(getCriteriaType), getCriteriaValues = js.Any.fromFunction0(getCriteriaValues), getHiddenValues = js.Any.fromFunction0(getHiddenValues), getVisibleValues = js.Any.fromFunction0(getVisibleValues))
    __obj.asInstanceOf[FilterCriteria]
  }
  @scala.inline
  implicit class FilterCriteriaOps[Self <: FilterCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopy(value: () => FilterCriteriaBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCriteriaType(value: () => BooleanCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCriteriaType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCriteriaValues(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCriteriaValues")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHiddenValues(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHiddenValues")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVisibleValues(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisibleValues")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

