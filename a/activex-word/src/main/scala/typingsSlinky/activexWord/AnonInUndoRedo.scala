package typingsSlinky.activexWord

import typingsSlinky.activexWord.Word.ContentControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInUndoRedo extends js.Object {
  val InUndoRedo: Boolean = js.native
  val NewContentControl: ContentControl = js.native
}

object AnonInUndoRedo {
  @scala.inline
  def apply(InUndoRedo: Boolean, NewContentControl: ContentControl): AnonInUndoRedo = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewContentControl = NewContentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInUndoRedo]
  }
  @scala.inline
  implicit class AnonInUndoRedoOps[Self <: AnonInUndoRedo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInUndoRedo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InUndoRedo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewContentControl(value: ContentControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewContentControl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

