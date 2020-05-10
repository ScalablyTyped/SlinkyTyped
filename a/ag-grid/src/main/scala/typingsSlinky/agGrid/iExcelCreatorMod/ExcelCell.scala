package typingsSlinky.agGrid.iExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcelCell extends js.Object {
  var data: ExcelData = js.native
  var mergeAcross: js.UndefOr[Double] = js.native
  var styleId: String = js.native
}

object ExcelCell {
  @scala.inline
  def apply(data: ExcelData, styleId: String): ExcelCell = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelCell]
  }
  @scala.inline
  implicit class ExcelCellOps[Self <: ExcelCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: ExcelData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeAcross(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeAcross")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeAcross: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeAcross")(js.undefined)
        ret
    }
  }
  
}

