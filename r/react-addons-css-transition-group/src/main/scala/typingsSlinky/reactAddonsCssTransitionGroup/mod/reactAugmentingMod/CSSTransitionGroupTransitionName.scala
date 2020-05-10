package typingsSlinky.reactAddonsCssTransitionGroup.mod.reactAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSSTransitionGroupTransitionName extends js.Object {
  var appear: js.UndefOr[String] = js.native
  var appearActive: js.UndefOr[String] = js.native
  var enter: String = js.native
  var enterActive: js.UndefOr[String] = js.native
  var leave: String = js.native
  var leaveActive: js.UndefOr[String] = js.native
}

object CSSTransitionGroupTransitionName {
  @scala.inline
  def apply(enter: String, leave: String): CSSTransitionGroupTransitionName = {
    val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any], leave = leave.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSTransitionGroupTransitionName]
  }
  @scala.inline
  implicit class CSSTransitionGroupTransitionNameOps[Self <: CSSTransitionGroupTransitionName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeave(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appear")(js.undefined)
        ret
    }
    @scala.inline
    def withAppearActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppearActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearActive")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterActive")(js.undefined)
        ret
    }
    @scala.inline
    def withLeaveActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaveActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaveActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaveActive")(js.undefined)
        ret
    }
  }
  
}

