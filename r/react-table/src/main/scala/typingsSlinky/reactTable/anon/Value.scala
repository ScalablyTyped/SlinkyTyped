package typingsSlinky.reactTable.anon

import typingsSlinky.reactTable.mod.FilterValue
import typingsSlinky.reactTable.mod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value[D /* <: js.Object */] extends js.Object {
  var id: IdType[D] = js.native
  var value: FilterValue = js.native
}

object Value {
  @scala.inline
  def apply[D](id: IdType[D], value: FilterValue): Value[D] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[D]]
  }
  @scala.inline
  implicit class ValueOps[Self[d] <: Value[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withId(value: IdType[D]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: FilterValue): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

