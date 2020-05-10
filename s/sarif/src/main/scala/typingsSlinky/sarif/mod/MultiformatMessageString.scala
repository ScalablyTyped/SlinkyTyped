package typingsSlinky.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiformatMessageString extends js.Object {
  /**
    * A Markdown message string or format string.
    */
  var markdown: js.UndefOr[String] = js.native
  /**
    * Key/value pairs that provide additional information about the message.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * A plain text message string or format string.
    */
  var text: String = js.native
}

object MultiformatMessageString {
  @scala.inline
  def apply(text: String): MultiformatMessageString = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiformatMessageString]
  }
  @scala.inline
  implicit class MultiformatMessageStringOps[Self <: MultiformatMessageString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkdown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markdown")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}

