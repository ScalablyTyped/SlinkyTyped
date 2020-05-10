package typingsSlinky.activexWord

import typingsSlinky.activexWord.Word.ContentControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContentControl extends js.Object {
  val ContentControl: typingsSlinky.activexWord.Word.ContentControl = js.native
}

object AnonContentControl {
  @scala.inline
  def apply(ContentControl: ContentControl): AnonContentControl = {
    val __obj = js.Dynamic.literal(ContentControl = ContentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentControl]
  }
  @scala.inline
  implicit class AnonContentControlOps[Self <: AnonContentControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentControl(value: ContentControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentControl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

