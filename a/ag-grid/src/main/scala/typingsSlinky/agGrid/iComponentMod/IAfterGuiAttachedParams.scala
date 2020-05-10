package typingsSlinky.agGrid.iComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAfterGuiAttachedParams extends js.Object {
  def hidePopup(): Unit = js.native
}

object IAfterGuiAttachedParams {
  @scala.inline
  def apply(hidePopup: () => Unit): IAfterGuiAttachedParams = {
    val __obj = js.Dynamic.literal(hidePopup = js.Any.fromFunction0(hidePopup))
    __obj.asInstanceOf[IAfterGuiAttachedParams]
  }
  @scala.inline
  implicit class IAfterGuiAttachedParamsOps[Self <: IAfterGuiAttachedParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHidePopup(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePopup")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

