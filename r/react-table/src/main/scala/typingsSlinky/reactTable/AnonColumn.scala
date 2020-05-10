package typingsSlinky.reactTable

import typingsSlinky.reactTable.mod.HeaderGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColumn[D /* <: js.Object */] extends js.Object {
  var column: HeaderGroup[D] = js.native
}

object AnonColumn {
  @scala.inline
  def apply[D](column: HeaderGroup[D]): AnonColumn[D] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumn[D]]
  }
  @scala.inline
  implicit class AnonColumnOps[Self[d] <: AnonColumn[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withColumn(value: HeaderGroup[D]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

