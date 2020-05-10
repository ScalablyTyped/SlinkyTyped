package typingsSlinky.gapiClientSlides.gapi.client.slides

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextContent extends js.Object {
  /** The bulleted lists contained in this text, keyed by list ID. */
  var lists: js.UndefOr[Record[String, List]] = js.native
  /**
    * The text contents broken down into its component parts, including styling
    * information. This property is read-only.
    */
  var textElements: js.UndefOr[js.Array[TextElement]] = js.native
}

object TextContent {
  @scala.inline
  def apply(): TextContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextContent]
  }
  @scala.inline
  implicit class TextContentOps[Self <: TextContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLists(value: Record[String, List]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lists")(js.undefined)
        ret
    }
    @scala.inline
    def withTextElements(value: js.Array[TextElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textElements")(js.undefined)
        ret
    }
  }
  
}

