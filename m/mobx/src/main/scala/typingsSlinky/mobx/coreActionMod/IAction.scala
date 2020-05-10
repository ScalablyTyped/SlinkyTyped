package typingsSlinky.mobx.coreActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAction extends js.Object {
  var isMobxAction: Boolean = js.native
}

object IAction {
  @scala.inline
  def apply(isMobxAction: Boolean): IAction = {
    val __obj = js.Dynamic.literal(isMobxAction = isMobxAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAction]
  }
  @scala.inline
  implicit class IActionOps[Self <: IAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsMobxAction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobxAction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

