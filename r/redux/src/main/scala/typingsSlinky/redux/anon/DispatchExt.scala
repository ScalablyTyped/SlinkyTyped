package typingsSlinky.redux.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DispatchExt[Ext] extends js.Object {
  var dispatch: Ext = js.native
}

object DispatchExt {
  @scala.inline
  def apply[Ext](dispatch: Ext): DispatchExt[Ext] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchExt[Ext]]
  }
  @scala.inline
  implicit class DispatchExtOps[Self[ext] <: DispatchExt[ext], Ext] (val x: Self[Ext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Ext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Ext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Ext] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Ext] with Other]
    @scala.inline
    def withDispatch(value: Ext): Self[Ext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

