package typingsSlinky.redux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon0[Ext1, Ext2] extends js.Object {
  var dispatch: Ext1 with Ext2 = js.native
}

object Anon0 {
  @scala.inline
  def apply[Ext1, Ext2](dispatch: Ext1 with Ext2): Anon0[Ext1, Ext2] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0[Ext1, Ext2]]
  }
  @scala.inline
  implicit class Anon0Ops[Self[ext1, ext2] <: Anon0[ext1, ext2], Ext1, Ext2] (val x: Self[Ext1, Ext2]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Ext1, Ext2] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Ext1, Ext2]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Ext1, Ext2]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Ext1, Ext2]) with Other]
    @scala.inline
    def withDispatch(value: Ext1 with Ext2): Self[Ext1, Ext2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

