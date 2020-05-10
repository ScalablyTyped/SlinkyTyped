package typingsSlinky.inboxsdk

import typingsSlinky.inboxsdk.mod.Conversations.MessageViewViewStates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMessageView extends js.Object {
  var messageView: this.type = js.native
  var newViewState: MessageViewViewStates = js.native
  var oldViewState: MessageViewViewStates = js.native
}

object AnonMessageView {
  @scala.inline
  def apply(
    messageView: AnonMessageView,
    newViewState: MessageViewViewStates,
    oldViewState: MessageViewViewStates
  ): AnonMessageView = {
    val __obj = js.Dynamic.literal(messageView = messageView.asInstanceOf[js.Any], newViewState = newViewState.asInstanceOf[js.Any], oldViewState = oldViewState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessageView]
  }
  @scala.inline
  implicit class AnonMessageViewOps[Self <: AnonMessageView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageView(value: AnonMessageView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewViewState(value: MessageViewViewStates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newViewState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldViewState(value: MessageViewViewStates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldViewState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

