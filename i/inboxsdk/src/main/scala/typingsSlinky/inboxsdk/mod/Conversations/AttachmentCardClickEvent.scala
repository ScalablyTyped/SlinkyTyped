package typingsSlinky.inboxsdk.mod.Conversations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentCardClickEvent extends js.Object {
  def getDownloadURL(): js.Promise[String] = js.native
}

object AttachmentCardClickEvent {
  @scala.inline
  def apply(getDownloadURL: () => js.Promise[String]): AttachmentCardClickEvent = {
    val __obj = js.Dynamic.literal(getDownloadURL = js.Any.fromFunction0(getDownloadURL))
    __obj.asInstanceOf[AttachmentCardClickEvent]
  }
  @scala.inline
  implicit class AttachmentCardClickEventOps[Self <: AttachmentCardClickEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDownloadURL(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDownloadURL")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

