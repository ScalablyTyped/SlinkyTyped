package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookFormatProtection extends Entity {
  /**
    * Indicates if Excel hides the formula for the cells in the range. A null value indicates that the entire range doesn't
    * have uniform formula hidden setting.
    */
  var formulaHidden: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if Excel locks the cells in the object. A null value indicates that the entire range doesn't have uniform
    * lock setting.
    */
  var locked: js.UndefOr[Boolean] = js.native
}

object WorkbookFormatProtection {
  @scala.inline
  def apply(): WorkbookFormatProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookFormatProtection]
  }
  @scala.inline
  implicit class WorkbookFormatProtectionOps[Self <: WorkbookFormatProtection] (val x: Self) extends AnyVal {
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

