package typingsSlinky.redux.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `2`[Ext1, Ext2, Ext3, Ext4] extends js.Object {
  var dispatch: Ext1 with Ext2 with Ext3 with Ext4 = js.native
}

object `2` {
  @scala.inline
  def apply[Ext1, Ext2, Ext3, Ext4](dispatch: Ext1 with Ext2 with Ext3 with Ext4): `2`[Ext1, Ext2, Ext3, Ext4] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`[Ext1, Ext2, Ext3, Ext4]]
  }
  @scala.inline
  implicit class `2Ops`[Self[ext1, ext2, ext3, ext4] <: `2`[ext1, ext2, ext3, ext4], Ext1, Ext2, Ext3, Ext4] (val x: Self[Ext1, Ext2, Ext3, Ext4]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Ext1, Ext2, Ext3, Ext4] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Ext1, Ext2, Ext3, Ext4]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Ext1, Ext2, Ext3, Ext4]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Ext1, Ext2, Ext3, Ext4]) with Other]
    @scala.inline
    def withDispatch(value: Ext1 with Ext2 with Ext3 with Ext4): Self[Ext1, Ext2, Ext3, Ext4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

