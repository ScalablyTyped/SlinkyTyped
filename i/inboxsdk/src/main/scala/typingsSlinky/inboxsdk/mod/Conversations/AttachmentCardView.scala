package typingsSlinky.inboxsdk.mod.Conversations

import typingsSlinky.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentCardView extends js.Object {
  var destroyed: Boolean = js.native
  def addButton(buttonDescriptor: CustomButtonDescriptor): Unit = js.native
  def getAttachmentType(): String = js.native
  /**
    * @deprecated. Use AttachmentCardClickEvent.getDownloadURL() instead
    */
  def getDownloadURL(): js.Promise[String] = js.native
  def getMessageView(): MessageView | Null = js.native
  def getTitle(): String = js.native
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
}

object AttachmentCardView {
  @scala.inline
  def apply(
    addButton: CustomButtonDescriptor => Unit,
    destroyed: Boolean,
    getAttachmentType: () => String,
    getDownloadURL: () => js.Promise[String],
    getMessageView: () => MessageView | Null,
    getTitle: () => String,
    on: (destroy, js.Function0[Unit]) => Unit
  ): AttachmentCardView = {
    val __obj = js.Dynamic.literal(addButton = js.Any.fromFunction1(addButton), destroyed = destroyed.asInstanceOf[js.Any], getAttachmentType = js.Any.fromFunction0(getAttachmentType), getDownloadURL = js.Any.fromFunction0(getDownloadURL), getMessageView = js.Any.fromFunction0(getMessageView), getTitle = js.Any.fromFunction0(getTitle), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[AttachmentCardView]
  }
  @scala.inline
  implicit class AttachmentCardViewOps[Self <: AttachmentCardView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddButton(value: CustomButtonDescriptor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addButton")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroyed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAttachmentType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttachmentType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDownloadURL(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDownloadURL")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMessageView(value: () => MessageView | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMessageView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTitle(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOn(value: (destroy, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

