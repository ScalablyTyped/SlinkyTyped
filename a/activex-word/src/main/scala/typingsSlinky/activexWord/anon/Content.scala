package typingsSlinky.activexWord.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Content extends js.Object {
  var Content: String = js.native
  val ContentControl: typingsSlinky.activexWord.Word.ContentControl = js.native
}

object Content {
  @scala.inline
  def apply(Content: String, ContentControl: typingsSlinky.activexWord.Word.ContentControl): Content = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], ContentControl = ContentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  @scala.inline
  implicit class ContentOps[Self <: Content] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentControl(value: typingsSlinky.activexWord.Word.ContentControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentControl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

