package typingsSlinky.blueprintjsTable.esmRegionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRegion extends js.Object {
  /**
    * The first and last column indices in the region, inclusive and
    * zero-indexed. If `cols` is `null`, then all columns are understood to be
    * included in the region.
    */
  var cols: js.UndefOr[ICellInterval | Null] = js.native
  /**
    * The first and last row indices in the region, inclusive and zero-indexed.
    * If `rows` is `null`, then all rows are understood to be included in the
    * region.
    */
  var rows: js.UndefOr[ICellInterval | Null] = js.native
}

object IRegion {
  @scala.inline
  def apply(): IRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRegion]
  }
  @scala.inline
  implicit class IRegionOps[Self <: IRegion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCols(value: ICellInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(js.undefined)
        ret
    }
    @scala.inline
    def withColsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(null)
        ret
    }
    @scala.inline
    def withRows(value: ICellInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withRowsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(null)
        ret
    }
  }
  
}

