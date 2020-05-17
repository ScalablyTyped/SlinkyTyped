package typingsSlinky.pgPromise.pgSubsetMod

import typingsSlinky.pgPromise.anon.Binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResult extends js.Object {
  var _parsers: js.Array[js.Function] = js.native
  var _types: Binary = js.native
  var command: String = js.native
  var fields: js.Array[IColumn] = js.native
  // properties below are not available within Native Bindings:
  var rowAsArray: Boolean = js.native
  var rowCount: Double = js.native
  var rows: js.Array[_] = js.native
}

object IResult {
  @scala.inline
  def apply(
    _parsers: js.Array[js.Function],
    _types: Binary,
    command: String,
    fields: js.Array[IColumn],
    rowAsArray: Boolean,
    rowCount: Double,
    rows: js.Array[_]
  ): IResult = {
    val __obj = js.Dynamic.literal(_parsers = _parsers.asInstanceOf[js.Any], _types = _types.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], rowAsArray = rowAsArray.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResult]
  }
  @scala.inline
  implicit class IResultOps[Self <: IResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_parsers(value: js.Array[js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_parsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_types(value: Binary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: js.Array[IColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowAsArray(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowAsArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

