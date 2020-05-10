package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.Backwards
import typingsSlinky.officeJs.officeJsStrings.Forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the search criteria to be used.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait SearchCriteria extends js.Object {
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
  /**
    *
    * Specifies the search direction. Default is forward. See Excel.SearchDirection.
    *
    * [Api set: ExcelApi 1.9]
    */
  var searchDirection: js.UndefOr[SearchDirection | Forward | Backwards] = js.native
}

object SearchCriteria {
  @scala.inline
  def apply(): SearchCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchCriteria]
  }
  @scala.inline
  implicit class SearchCriteriaOps[Self <: SearchCriteria] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withSearchDirection(value: SearchDirection | Forward | Backwards): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchDirection")(js.undefined)
        ret
    }
  }
  
}

