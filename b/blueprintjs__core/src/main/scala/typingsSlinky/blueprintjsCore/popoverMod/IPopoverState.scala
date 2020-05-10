package typingsSlinky.blueprintjsCore.popoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPopoverState extends js.Object {
  var hasDarkParent: Boolean = js.native
  var isOpen: Boolean = js.native
  var transformOrigin: String = js.native
}

object IPopoverState {
  @scala.inline
  def apply(hasDarkParent: Boolean, isOpen: Boolean, transformOrigin: String): IPopoverState = {
    val __obj = js.Dynamic.literal(hasDarkParent = hasDarkParent.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], transformOrigin = transformOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPopoverState]
  }
  @scala.inline
  implicit class IPopoverStateOps[Self <: IPopoverState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasDarkParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDarkParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformOrigin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

