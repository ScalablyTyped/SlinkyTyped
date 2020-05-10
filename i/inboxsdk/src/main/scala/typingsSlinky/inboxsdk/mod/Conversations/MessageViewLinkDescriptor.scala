package typingsSlinky.inboxsdk.mod.Conversations

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageViewLinkDescriptor extends js.Object {
  var element: HTMLElement = js.native
  var href: String = js.native
  var html: String = js.native
  var isInQuotedArea: Boolean = js.native
  var text: String = js.native
}

object MessageViewLinkDescriptor {
  @scala.inline
  def apply(element: HTMLElement, href: String, html: String, isInQuotedArea: Boolean, text: String): MessageViewLinkDescriptor = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], isInQuotedArea = isInQuotedArea.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageViewLinkDescriptor]
  }
  @scala.inline
  implicit class MessageViewLinkDescriptorOps[Self <: MessageViewLinkDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInQuotedArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInQuotedArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

