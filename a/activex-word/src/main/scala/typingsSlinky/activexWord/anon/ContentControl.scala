package typingsSlinky.activexWord.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentControl extends js.Object {
  val ContentControl: typingsSlinky.activexWord.Word.ContentControl = js.native
}

object ContentControl {
  @scala.inline
  def apply(ContentControl: typingsSlinky.activexWord.Word.ContentControl): ContentControl = {
    val __obj = js.Dynamic.literal(ContentControl = ContentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentControl]
  }
  @scala.inline
  implicit class ContentControlOps[Self <: ContentControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentControl(value: typingsSlinky.activexWord.Word.ContentControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentControl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

