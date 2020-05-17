package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.anon.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellFormulaValue extends CellValue {
  var date1904: Boolean = js.native
  var formula: String = js.native
  var result: js.UndefOr[Double | String | js.Date | Error] = js.native
}

object CellFormulaValue {
  @scala.inline
  def apply(date1904: Boolean, formula: String): CellFormulaValue = {
    val __obj = js.Dynamic.literal(date1904 = date1904.asInstanceOf[js.Any], formula = formula.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellFormulaValue]
  }
  @scala.inline
  implicit class CellFormulaValueOps[Self <: CellFormulaValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate1904(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date1904")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormula(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: Double | String | js.Date | Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
  }
  
}

