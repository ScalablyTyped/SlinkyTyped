package typingsSlinky.mailparser.mod

import typingsSlinky.mailparser.mailparserStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Text message content.
  */
@js.native
trait MessageText extends js.Object {
  /**
  	 * Includes the HTML version of the message.
  	 *
  	 * Is set if the message has at least one `text/html` node.
  	 */
  var html: js.UndefOr[String | Boolean] = js.native
  /**
  	 * Includes the plaintext version of the message.
  	 *
  	 * Is set if the message has at least one `text/plain` node.
  	 */
  var text: js.UndefOr[String] = js.native
  /**
  	 * Includes the plaintext version of the message in HTML format.
  	 *
  	 * Is set if the message has at least one `text/plain` node.
  	 */
  var textAsHtml: js.UndefOr[String] = js.native
  /**
  	 * Message type.
  	 */
  var `type`: text = js.native
}

object MessageText {
  @scala.inline
  def apply(`type`: text): MessageText = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageText]
  }
  @scala.inline
  implicit class MessageTextOps[Self <: MessageText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAsHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAsHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAsHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAsHtml")(js.undefined)
        ret
    }
  }
  
}

