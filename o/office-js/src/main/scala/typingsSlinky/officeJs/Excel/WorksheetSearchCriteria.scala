package typingsSlinky.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the worksheet search criteria to be used.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait WorksheetSearchCriteria extends js.Object {
  /**
    *
    * Specifies whether the match needs to be complete or partial.
    A complete match matches the entire contents of the cell. A partial match matches a substring within the content of the cell (e.g., `cat` partially matches `caterpillar` and `scatter`).
    Default is false (partial).
    *
    * [Api set: ExcelApi 1.9]
    */
  var completeMatch: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether the match is case sensitive. Default is false (insensitive).
    *
    * [Api set: ExcelApi 1.9]
    */
  var matchCase: js.UndefOr[Boolean] = js.native
}

object WorksheetSearchCriteria {
  @scala.inline
  def apply(): WorksheetSearchCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetSearchCriteria]
  }
  @scala.inline
  implicit class WorksheetSearchCriteriaOps[Self <: WorksheetSearchCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompleteMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleteMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCase")(js.undefined)
        ret
    }
  }
  
}

