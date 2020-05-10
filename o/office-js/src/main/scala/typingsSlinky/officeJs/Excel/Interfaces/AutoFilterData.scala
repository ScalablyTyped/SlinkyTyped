package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.FilterCriteria
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `autoFilter.toJSON()`. */
@js.native
trait AutoFilterData extends js.Object {
  /**
    *
    * An array that holds all the filter criteria in the autofiltered range. Read-Only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var criteria: js.UndefOr[js.Array[FilterCriteria]] = js.native
  /**
    *
    * Indicates if the AutoFilter is enabled or not. Read-Only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    *
    * Indicates if the AutoFilter has filter criteria. Read-Only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isDataFiltered: js.UndefOr[Boolean] = js.native
}

object AutoFilterData {
  @scala.inline
  def apply(): AutoFilterData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoFilterData]
  }
  @scala.inline
  implicit class AutoFilterDataOps[Self <: AutoFilterData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCriteria(value: js.Array[FilterCriteria]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criteria")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDataFiltered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDataFiltered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDataFiltered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDataFiltered")(js.undefined)
        ret
    }
  }
  
}

