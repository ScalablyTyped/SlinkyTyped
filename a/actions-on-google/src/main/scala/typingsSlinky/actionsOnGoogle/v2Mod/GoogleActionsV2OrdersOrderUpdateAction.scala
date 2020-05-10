package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersOrderUpdateAction extends js.Object {
  /**
    * Button label and link.
    */
  var button: js.UndefOr[GoogleActionsV2UiElementsButton] = js.native
  /**
    * Type of action.
    */
  var `type`: js.UndefOr[GoogleActionsV2OrdersOrderUpdateActionType] = js.native
}

object GoogleActionsV2OrdersOrderUpdateAction {
  @scala.inline
  def apply(): GoogleActionsV2OrdersOrderUpdateAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersOrderUpdateAction]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersOrderUpdateActionOps[Self <: GoogleActionsV2OrdersOrderUpdateAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButton(value: GoogleActionsV2UiElementsButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: GoogleActionsV2OrdersOrderUpdateActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

