package typingsSlinky.redux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDispatch[Ext1] extends js.Object {
  var dispatch: Ext1 = js.native
}

object AnonDispatch {
  @scala.inline
  def apply[Ext1](dispatch: Ext1): AnonDispatch[Ext1] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDispatch[Ext1]]
  }
  @scala.inline
  implicit class AnonDispatchOps[Self[ext1] <: AnonDispatch[ext1], Ext1] (val x: Self[Ext1]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Ext1] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Ext1]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Ext1] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Ext1] with Other]
    @scala.inline
    def withDispatch(value: Ext1): Self[Ext1] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

