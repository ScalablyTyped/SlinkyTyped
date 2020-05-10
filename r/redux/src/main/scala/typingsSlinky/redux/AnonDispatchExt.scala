package typingsSlinky.redux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDispatchExt[Ext] extends js.Object {
  var dispatch: Ext = js.native
}

object AnonDispatchExt {
  @scala.inline
  def apply[Ext](dispatch: Ext): AnonDispatchExt[Ext] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDispatchExt[Ext]]
  }
  @scala.inline
  implicit class AnonDispatchExtOps[Self[ext] <: AnonDispatchExt[ext], Ext] (val x: Self[Ext]) extends AnyVal {
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

