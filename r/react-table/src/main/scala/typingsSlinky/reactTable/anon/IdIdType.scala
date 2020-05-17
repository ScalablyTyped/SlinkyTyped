package typingsSlinky.reactTable.anon

import typingsSlinky.reactTable.mod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdIdType[D /* <: js.Object */] extends js.Object {
  var id: IdType[D] = js.native
}

object IdIdType {
  @scala.inline
  def apply[D](id: IdType[D]): IdIdType[D] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdIdType[D]]
  }
  @scala.inline
  implicit class IdIdTypeOps[Self[d] <: IdIdType[d], D] (val x: Self[D]) extends AnyVal {
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
  }
  
}

