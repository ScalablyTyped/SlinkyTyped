package typingsSlinky.muiDatatables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  useDisplayedColumnsOnly  :boolean,   useDisplayedRowsOnly  :boolean}> */
@js.native
trait PartialuseDisplayedColumn extends js.Object {
  var useDisplayedColumnsOnly: js.UndefOr[Boolean] = js.native
  var useDisplayedRowsOnly: js.UndefOr[Boolean] = js.native
}

object PartialuseDisplayedColumn {
  @scala.inline
  def apply(): PartialuseDisplayedColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialuseDisplayedColumn]
  }
  @scala.inline
  implicit class PartialuseDisplayedColumnOps[Self <: PartialuseDisplayedColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseDisplayedColumnsOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDisplayedColumnsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDisplayedColumnsOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDisplayedColumnsOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withUseDisplayedRowsOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDisplayedRowsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDisplayedRowsOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDisplayedRowsOnly")(js.undefined)
        ret
    }
  }
  
}

