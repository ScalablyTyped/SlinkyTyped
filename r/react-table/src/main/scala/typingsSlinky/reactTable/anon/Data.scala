package typingsSlinky.reactTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data[D /* <: js.Object */] extends js.Object {
  var data: js.Array[D] = js.native
  var depth: Double = js.native
  var subRows: js.Array[D] = js.native
}

object Data {
  @scala.inline
  def apply[D](data: js.Array[D], depth: Double, subRows: js.Array[D]): Data[D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], subRows = subRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[D]]
  }
  @scala.inline
  implicit class DataOps[Self[d] <: Data[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withData(value: js.Array[D]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubRows(value: js.Array[D]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subRows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

