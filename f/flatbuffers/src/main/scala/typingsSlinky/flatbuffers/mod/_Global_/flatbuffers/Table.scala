package typingsSlinky.flatbuffers.mod._Global_.flatbuffers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table extends js.Object {
  var bb: ByteBuffer | Null = js.native
  var bb_pos: Double = js.native
}

object Table {
  @scala.inline
  def apply(bb_pos: Double): Table = {
    val __obj = js.Dynamic.literal(bb_pos = bb_pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
  @scala.inline
  implicit class TableOps[Self <: Table] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBb_pos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bb_pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBb(value: ByteBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBbNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bb")(null)
        ret
    }
  }
  
}

