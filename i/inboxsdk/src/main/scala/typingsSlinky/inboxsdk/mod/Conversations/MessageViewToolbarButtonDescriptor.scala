package typingsSlinky.inboxsdk.mod.Conversations

import typingsSlinky.inboxsdk.inboxsdkStrings.MORE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageViewToolbarButtonDescriptor extends js.Object {
  var iconClass: js.UndefOr[String] = js.native
  var iconUrl: String = js.native
  var orderHint: Double = js.native
  var section: MORE = js.native
  var title: String = js.native
  def onClick(): Unit = js.native
}

object MessageViewToolbarButtonDescriptor {
  @scala.inline
  def apply(iconUrl: String, onClick: () => Unit, orderHint: Double, section: MORE, title: String): MessageViewToolbarButtonDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), orderHint = orderHint.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageViewToolbarButtonDescriptor]
  }
  @scala.inline
  implicit class MessageViewToolbarButtonDescriptorOps[Self <: MessageViewToolbarButtonDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOrderHint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSection(value: MORE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(js.undefined)
        ret
    }
  }
  
}

