package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DbCellValue extends js.Object {
  var displayValue: String = js.native
  var invariantCultureDisplayValue: String = js.native
  var isNull: Boolean = js.native
}

object DbCellValue {
  @scala.inline
  def apply(displayValue: String, invariantCultureDisplayValue: String, isNull: Boolean): DbCellValue = {
    val __obj = js.Dynamic.literal(displayValue = displayValue.asInstanceOf[js.Any], invariantCultureDisplayValue = invariantCultureDisplayValue.asInstanceOf[js.Any], isNull = isNull.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbCellValue]
  }
  @scala.inline
  implicit class DbCellValueOps[Self <: DbCellValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvariantCultureDisplayValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invariantCultureDisplayValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsNull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNull")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

