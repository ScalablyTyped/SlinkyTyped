package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  manualRowSelectedKey  :react-table.react-table.IdType<D>,   autoResetSelectedRows  :boolean,   selectSubRows  :boolean}> */
@js.native
trait UseRowSelectOptions[D /* <: js.Object */] extends js.Object {
  var autoResetSelectedRows: js.UndefOr[Boolean] = js.native
  var manualRowSelectedKey: js.UndefOr[IdType[D]] = js.native
  var selectSubRows: js.UndefOr[Boolean] = js.native
}

object UseRowSelectOptions {
  @scala.inline
  def apply[D](): UseRowSelectOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseRowSelectOptions[D]]
  }
  @scala.inline
  implicit class UseRowSelectOptionsOps[Self[d] <: UseRowSelectOptions[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withAutoResetSelectedRows(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResetSelectedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResetSelectedRows: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResetSelectedRows")(js.undefined)
        ret
    }
    @scala.inline
    def withManualRowSelectedKey(value: IdType[D]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRowSelectedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualRowSelectedKey: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRowSelectedKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectSubRows(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectSubRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectSubRows: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectSubRows")(js.undefined)
        ret
    }
  }
  
}

