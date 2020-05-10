package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.ojganttMod.ojGantt.Row
import typingsSlinky.oracleOraclejet.ojganttMod.ojGantt.RowTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItemData[K2, D2] extends js.Object {
  var color: String = js.native
  var data: RowTask[K2] = js.native
  var itemData: D2 | Null = js.native
  var rowData: Row[K2] = js.native
}

object AnonItemData {
  @scala.inline
  def apply[K2, D2](color: String, data: RowTask[K2], rowData: Row[K2]): AnonItemData[K2, D2] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemData[K2, D2]]
  }
  @scala.inline
  implicit class AnonItemDataOps[Self[k2, d2] <: AnonItemData[k2, d2], K2, D2] (val x: Self[K2, D2]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K2, D2] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K2, D2]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K2, D2]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K2, D2]) with Other]
    @scala.inline
    def withColor(value: String): Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: RowTask[K2]): Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowData(value: Row[K2]): Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemData(value: D2): Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemDataNull: Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemData")(null)
        ret
    }
  }
  
}

