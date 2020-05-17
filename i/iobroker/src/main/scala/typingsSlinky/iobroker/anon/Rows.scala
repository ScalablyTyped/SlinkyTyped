package typingsSlinky.iobroker.anon

import typingsSlinky.iobroker.mod.global.ioBroker.GetObjectViewItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rows extends js.Object {
  var rows: js.Array[GetObjectViewItem] = js.native
}

object Rows {
  @scala.inline
  def apply(rows: js.Array[GetObjectViewItem]): Rows = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rows]
  }
  @scala.inline
  implicit class RowsOps[Self <: Rows] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRows(value: js.Array[GetObjectViewItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

