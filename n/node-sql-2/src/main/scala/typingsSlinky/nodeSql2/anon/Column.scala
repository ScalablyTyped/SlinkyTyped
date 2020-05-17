package typingsSlinky.nodeSql2.anon

import typingsSlinky.nodeSql2.nodeSql2Strings.`no action`
import typingsSlinky.nodeSql2.nodeSql2Strings.`set default`
import typingsSlinky.nodeSql2.nodeSql2Strings.`set null`
import typingsSlinky.nodeSql2.nodeSql2Strings.cascade
import typingsSlinky.nodeSql2.nodeSql2Strings.restrict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Column extends js.Object {
  var column: String = js.native
  var onDelete: js.UndefOr[restrict | cascade | (`no action`) | (`set null`) | (`set default`)] = js.native
  var onUpdate: js.UndefOr[restrict | cascade | (`no action`) | (`set null`) | (`set default`)] = js.native
  var table: String = js.native
}

object Column {
  @scala.inline
  def apply(column: String, table: String): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  @scala.inline
  implicit class ColumnOps[Self <: Column] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDelete(value: restrict | cascade | (`no action`) | (`set null`) | (`set default`)): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdate(value: restrict | cascade | (`no action`) | (`set null`) | (`set default`)): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.undefined)
        ret
    }
  }
  
}

