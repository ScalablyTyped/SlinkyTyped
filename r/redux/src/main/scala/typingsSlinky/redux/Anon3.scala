package typingsSlinky.redux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon3[Ext1, Ext2, Ext3, Ext4, Ext5] extends js.Object {
  var dispatch: Ext1 with Ext2 with Ext3 with Ext4 with Ext5 = js.native
}

object Anon3 {
  @scala.inline
  def apply[Ext1, Ext2, Ext3, Ext4, Ext5](dispatch: Ext1 with Ext2 with Ext3 with Ext4 with Ext5): Anon3[Ext1, Ext2, Ext3, Ext4, Ext5] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon3[Ext1, Ext2, Ext3, Ext4, Ext5]]
  }
  @scala.inline
  implicit class Anon3Ops[Self[ext1, ext2, ext3, ext4, ext5] <: Anon3[ext1, ext2, ext3, ext4, ext5], Ext1, Ext2, Ext3, Ext4, Ext5] (val x: Self[Ext1, Ext2, Ext3, Ext4, Ext5]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Ext1, Ext2, Ext3, Ext4, Ext5] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Ext1, Ext2, Ext3, Ext4, Ext5]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Ext1, Ext2, Ext3, Ext4, Ext5]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Ext1, Ext2, Ext3, Ext4, Ext5]) with Other]
    @scala.inline
    def withDispatch(value: Ext1 with Ext2 with Ext3 with Ext4 with Ext5): Self[Ext1, Ext2, Ext3, Ext4, Ext5] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

