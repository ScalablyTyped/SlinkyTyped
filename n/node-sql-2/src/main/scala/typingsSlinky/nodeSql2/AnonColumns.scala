package typingsSlinky.nodeSql2

import typingsSlinky.nodeSql2.nodeSql2Strings.`no action`
import typingsSlinky.nodeSql2.nodeSql2Strings.`set default`
import typingsSlinky.nodeSql2.nodeSql2Strings.`set null`
import typingsSlinky.nodeSql2.nodeSql2Strings.cascade
import typingsSlinky.nodeSql2.nodeSql2Strings.restrict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColumns[Row] extends js.Object {
  var columns: js.Array[/* keyof Row */ String] = js.native
  var onDelete: js.UndefOr[restrict | cascade | (`no action`) | (`set null`) | (`set default`)] = js.native
  var onUpdate: js.UndefOr[restrict | cascade | (`no action`) | (`set null`) | (`set default`)] = js.native
  var refColumns: js.Array[String] = js.native
  var table: String = js.native
}

object AnonColumns {
  @scala.inline
  def apply[Row](columns: js.Array[/* keyof Row */ String], refColumns: js.Array[String], table: String): AnonColumns[Row] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], refColumns = refColumns.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumns[Row]]
  }
  @scala.inline
  implicit class AnonColumnsOps[Self[row] <: AnonColumns[row], Row] (val x: Self[Row]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Row] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Row]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Row] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Row] with Other]
    @scala.inline
    def withColumns(value: js.Array[/* keyof Row */ String]): Self[Row] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefColumns(value: js.Array[String]): Self[Row] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTable(value: String): Self[Row] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDelete(value: restrict | cascade | (`no action`) | (`set null`) | (`set default`)): Self[Row] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDelete: Self[Row] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdate(value: restrict | cascade | (`no action`) | (`set null`) | (`set default`)): Self[Row] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnUpdate: Self[Row] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.undefined)
        ret
    }
  }
  
}

