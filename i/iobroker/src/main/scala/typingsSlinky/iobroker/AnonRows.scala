package typingsSlinky.iobroker

import typingsSlinky.iobroker.mod._Global_.ioBroker.GetObjectViewItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRows extends js.Object {
  var rows: js.Array[GetObjectViewItem] = js.native
}

object AnonRows {
  @scala.inline
  def apply(rows: js.Array[GetObjectViewItem]): AnonRows = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRows]
  }
  @scala.inline
  implicit class AnonRowsOps[Self <: AnonRows] (val x: Self) extends AnyVal {
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

