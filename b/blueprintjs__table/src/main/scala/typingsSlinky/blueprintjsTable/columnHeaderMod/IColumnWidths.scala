package typingsSlinky.blueprintjsTable.columnHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnWidths extends js.Object {
  var defaultColumnWidth: js.UndefOr[Double] = js.native
  var maxColumnWidth: js.UndefOr[Double] = js.native
  var minColumnWidth: js.UndefOr[Double] = js.native
}

object IColumnWidths {
  @scala.inline
  def apply(): IColumnWidths = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnWidths]
  }
  @scala.inline
  implicit class IColumnWidthsOps[Self <: IColumnWidths] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultColumnWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColumnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColumnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxColumnWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColumnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColumnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinColumnWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColumnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColumnWidth")(js.undefined)
        ret
    }
  }
  
}

