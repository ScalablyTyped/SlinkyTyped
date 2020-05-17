package typingsSlinky.reactTable.anon

import typingsSlinky.reactTable.mod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0`[D /* <: js.Object */] extends js.Object {
  var accessor: IdType[D] = js.native
}

object `0` {
  @scala.inline
  def apply[D](accessor: IdType[D]): `0`[D] = {
    val __obj = js.Dynamic.literal(accessor = accessor.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[D]]
  }
  @scala.inline
  implicit class `0Ops`[Self[d] <: `0`[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withAccessor(value: IdType[D]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

