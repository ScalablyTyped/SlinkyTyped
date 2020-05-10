package typingsSlinky.nodeCrate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBResultObject extends js.Object {
  var cols: js.Array[String] = js.native
  var duration: Double = js.native
  var json: js.Array[js.Object] = js.native
  var rowcount: Double = js.native
  var rows: js.Array[js.Array[js.Object]] = js.native
}

object DBResultObject {
  @scala.inline
  def apply(
    cols: js.Array[String],
    duration: Double,
    json: js.Array[js.Object],
    rowcount: Double,
    rows: js.Array[js.Array[js.Object]]
  ): DBResultObject = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], rowcount = rowcount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBResultObject]
  }
  @scala.inline
  implicit class DBResultObjectOps[Self <: DBResultObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCols(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJson(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowcount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowcount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: js.Array[js.Array[js.Object]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

