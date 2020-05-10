package typingsSlinky.reduxFirstRouter

import typingsSlinky.reduxFirstRouter.mod.NavigationAction
import typingsSlinky.reduxFirstRouter.mod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAction extends js.Object {
  var action: js.Object = js.native
  var navigationAction: Nullable[NavigationAction] = js.native
}

object AnonAction {
  @scala.inline
  def apply(action: js.Object): AnonAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAction]
  }
  @scala.inline
  implicit class AnonActionOps[Self <: AnonAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigationAction(value: Nullable[NavigationAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationAction")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationActionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationAction")(null)
        ret
    }
  }
  
}

