package typingsSlinky.muiDatatables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDataIndex extends js.Object {
  var dataIndex: Double = js.native
}

object AnonDataIndex {
  @scala.inline
  def apply(dataIndex: Double): AnonDataIndex = {
    val __obj = js.Dynamic.literal(dataIndex = dataIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataIndex]
  }
  @scala.inline
  implicit class AnonDataIndexOps[Self <: AnonDataIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

