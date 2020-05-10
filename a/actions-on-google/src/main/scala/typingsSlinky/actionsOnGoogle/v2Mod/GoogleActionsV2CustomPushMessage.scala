package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2CustomPushMessage extends js.Object {
  /**
    * An order update updating orders placed through transaction APIs.
    */
  var orderUpdate: js.UndefOr[GoogleActionsV2OrdersOrderUpdate] = js.native
  /**
    * The specified target for the push request.
    */
  var target: js.UndefOr[GoogleActionsV2CustomPushMessageTarget] = js.native
  /**
    * If specified, displays a notification to the user with specified title
    * and text.
    */
  var userNotification: js.UndefOr[GoogleActionsV2UserNotification] = js.native
}

object GoogleActionsV2CustomPushMessage {
  @scala.inline
  def apply(): GoogleActionsV2CustomPushMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2CustomPushMessage]
  }
  @scala.inline
  implicit class GoogleActionsV2CustomPushMessageOps[Self <: GoogleActionsV2CustomPushMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrderUpdate(value: GoogleActionsV2OrdersOrderUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: GoogleActionsV2CustomPushMessageTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withUserNotification(value: GoogleActionsV2UserNotification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userNotification")(js.undefined)
        ret
    }
  }
  
}

