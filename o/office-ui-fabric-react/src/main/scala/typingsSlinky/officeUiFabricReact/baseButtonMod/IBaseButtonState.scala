package typingsSlinky.officeUiFabricReact.baseButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBaseButtonState extends js.Object {
  var menuHidden: Boolean = js.native
}

object IBaseButtonState {
  @scala.inline
  def apply(menuHidden: Boolean): IBaseButtonState = {
    val __obj = js.Dynamic.literal(menuHidden = menuHidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseButtonState]
  }
  @scala.inline
  implicit class IBaseButtonStateOps[Self <: IBaseButtonState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMenuHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuHidden")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

