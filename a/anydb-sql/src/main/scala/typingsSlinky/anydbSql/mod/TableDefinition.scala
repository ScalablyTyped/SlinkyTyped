package typingsSlinky.anydbSql.mod

import typingsSlinky.anydbSql.AnonFrom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableDefinition extends js.Object {
  var columns: Dictionary[ColumnDefinition] = js.native
  var has: js.UndefOr[Dictionary[AnonFrom]] = js.native
  var name: String = js.native
}

object TableDefinition {
  @scala.inline
  def apply(columns: Dictionary[ColumnDefinition], name: String): TableDefinition = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDefinition]
  }
  @scala.inline
  implicit class TableDefinitionOps[Self <: TableDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: Dictionary[ColumnDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas(value: Dictionary[AnonFrom]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.undefined)
        ret
    }
  }
  
}

