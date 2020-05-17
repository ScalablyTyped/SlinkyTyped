package typingsSlinky.activexWord.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelContentControl extends js.Object {
  var Cancel: Boolean = js.native
  val ContentControl: typingsSlinky.activexWord.Word.ContentControl = js.native
}

object CancelContentControl {
  @scala.inline
  def apply(Cancel: Boolean, ContentControl: typingsSlinky.activexWord.Word.ContentControl): CancelContentControl = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ContentControl = ContentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelContentControl]
  }
  @scala.inline
  implicit class CancelContentControlOps[Self <: CancelContentControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
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

