package typingsSlinky.redux.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0`[Ext1, Ext2] extends js.Object {
  var dispatch: Ext1 with Ext2 = js.native
}

object `0` {
  @scala.inline
  def apply[Ext1, Ext2](dispatch: Ext1 with Ext2): `0`[Ext1, Ext2] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[Ext1, Ext2]]
  }
  @scala.inline
  implicit class `0Ops`[Self[ext1, ext2] <: `0`[ext1, ext2], Ext1, Ext2] (val x: Self[Ext1, Ext2]) extends AnyVal {
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

