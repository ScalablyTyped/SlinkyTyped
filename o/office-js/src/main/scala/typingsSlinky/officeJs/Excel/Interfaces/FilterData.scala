package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.FilterCriteria
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `filter.toJSON()`. */
@js.native
trait FilterData extends js.Object {
  /**
    *
    * The currently applied filter on the given column. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  var criteria: js.UndefOr[FilterCriteria] = js.native
}

object FilterData {
  @scala.inline
  def apply(): FilterData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterData]
  }
  @scala.inline
  implicit class FilterDataOps[Self <: FilterData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCriteria(value: FilterCriteria): Self = {
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
  }
  
}

