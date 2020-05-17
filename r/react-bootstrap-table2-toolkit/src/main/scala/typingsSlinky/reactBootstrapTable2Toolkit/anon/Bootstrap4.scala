package typingsSlinky.reactBootstrapTable2Toolkit.anon

import typingsSlinky.reactBootstrapTableNext.mod.ColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bootstrap4 extends js.Object {
  var bootstrap4: js.UndefOr[Boolean] = js.native
  var columns: js.Array[ColumnDescription[_, _]] = js.native
  var data: js.Array[_] = js.native
  /**
    * table key field
    */
  var keyField: js.Any = js.native
}

object Bootstrap4 {
  @scala.inline
  def apply(columns: js.Array[ColumnDescription[_, _]], data: js.Array[_], keyField: js.Any): Bootstrap4 = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keyField = keyField.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bootstrap4]
  }
  @scala.inline
  implicit class Bootstrap4Ops[Self <: Bootstrap4] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[ColumnDescription[_, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyField(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBootstrap4(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrap4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootstrap4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrap4")(js.undefined)
        ret
    }
  }
  
}

