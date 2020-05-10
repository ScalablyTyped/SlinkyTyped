package typingsSlinky.muiDatatables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDataDataIndex extends js.Object {
  var data: js.Array[_] = js.native
  var dataIndex: Double = js.native
}

object AnonDataDataIndex {
  @scala.inline
  def apply(data: js.Array[_], dataIndex: Double): AnonDataDataIndex = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataIndex = dataIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataDataIndex]
  }
  @scala.inline
  implicit class AnonDataDataIndexOps[Self <: AnonDataDataIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

