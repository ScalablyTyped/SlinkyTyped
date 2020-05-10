package typingsSlinky.iobroker

import typingsSlinky.iobroker.mod._Global_.ioBroker.GetObjectListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRowsArray extends js.Object {
  var rows: js.Array[GetObjectListItem] = js.native
}

object AnonRowsArray {
  @scala.inline
  def apply(rows: js.Array[GetObjectListItem]): AnonRowsArray = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRowsArray]
  }
  @scala.inline
  implicit class AnonRowsArrayOps[Self <: AnonRowsArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRows(value: js.Array[GetObjectListItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

