package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  manualExpandedKey  :react-table.react-table.IdType<D>,   paginateExpandedRows  :boolean,   expandSubRows  :boolean,   autoResetExpanded ? :boolean}> */
@js.native
trait UseExpandedOptions[D /* <: js.Object */] extends js.Object {
  var autoResetExpanded: js.UndefOr[Boolean] = js.native
  var expandSubRows: js.UndefOr[Boolean] = js.native
  var manualExpandedKey: js.UndefOr[IdType[D]] = js.native
  var paginateExpandedRows: js.UndefOr[Boolean] = js.native
}

object UseExpandedOptions {
  @scala.inline
  def apply[D](): UseExpandedOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseExpandedOptions[D]]
  }
  @scala.inline
  implicit class UseExpandedOptionsOps[Self[d] <: UseExpandedOptions[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withAutoResetExpanded(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResetExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResetExpanded: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResetExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandSubRows(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandSubRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandSubRows: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandSubRows")(js.undefined)
        ret
    }
    @scala.inline
    def withManualExpandedKey(value: IdType[D]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualExpandedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualExpandedKey: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualExpandedKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginateExpandedRows(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginateExpandedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginateExpandedRows: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginateExpandedRows")(js.undefined)
        ret
    }
  }
  
}

