package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the FormatProtection object, for use in `formatProtection.set({ ... })`. */
@js.native
trait FormatProtectionUpdateData extends js.Object {
  /**
    *
    * Indicates if Excel hides the formula for the cells in the range. A null value indicates that the entire range doesn't have uniform formula hidden setting.
    *
    * [Api set: ExcelApi 1.2]
    */
  var formulaHidden: js.UndefOr[Boolean] = js.native
  /**
    *
    * Indicates if Excel locks the cells in the object. A null value indicates that the entire range doesn't have uniform lock setting.
    *
    * [Api set: ExcelApi 1.2]
    */
  var locked: js.UndefOr[Boolean] = js.native
}

object FormatProtectionUpdateData {
  @scala.inline
  def apply(): FormatProtectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatProtectionUpdateData]
  }
  @scala.inline
  implicit class FormatProtectionUpdateDataOps[Self <: FormatProtectionUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormulaHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formulaHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormulaHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formulaHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(js.undefined)
        ret
    }
  }
  
}

