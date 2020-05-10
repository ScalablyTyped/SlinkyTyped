package typingsSlinky.redux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon1[Ext1, Ext2, Ext3] extends js.Object {
  var dispatch: Ext1 with Ext2 with Ext3 = js.native
}

object Anon1 {
  @scala.inline
  def apply[Ext1, Ext2, Ext3](dispatch: Ext1 with Ext2 with Ext3): Anon1[Ext1, Ext2, Ext3] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1[Ext1, Ext2, Ext3]]
  }
  @scala.inline
  implicit class Anon1Ops[Self[ext1, ext2, ext3] <: Anon1[ext1, ext2, ext3], Ext1, Ext2, Ext3] (val x: Self[Ext1, Ext2, Ext3]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Ext1, Ext2, Ext3] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Ext1, Ext2, Ext3]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Ext1, Ext2, Ext3]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Ext1, Ext2, Ext3]) with Other]
    @scala.inline
    def withDispatch(value: Ext1 with Ext2 with Ext3): Self[Ext1, Ext2, Ext3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

