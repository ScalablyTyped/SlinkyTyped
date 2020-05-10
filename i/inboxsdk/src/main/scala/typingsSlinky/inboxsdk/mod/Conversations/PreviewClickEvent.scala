package typingsSlinky.inboxsdk.mod.Conversations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreviewClickEvent extends js.Object {
  var attachmentCardView: AttachmentCardView = js.native
  def preventDefault(): Unit = js.native
}

object PreviewClickEvent {
  @scala.inline
  def apply(attachmentCardView: AttachmentCardView, preventDefault: () => Unit): PreviewClickEvent = {
    val __obj = js.Dynamic.literal(attachmentCardView = attachmentCardView.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault))
    __obj.asInstanceOf[PreviewClickEvent]
  }
  @scala.inline
  implicit class PreviewClickEventOps[Self <: PreviewClickEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachmentCardView(value: AttachmentCardView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentCardView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDefault(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

