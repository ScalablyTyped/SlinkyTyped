package typingsSlinky.epiceditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonToggleEdit extends js.Object {
  var toggleEdit: String = js.native
  var toggleFullscreen: String = js.native
  var togglePreview: String = js.native
}

object AnonToggleEdit {
  @scala.inline
  def apply(toggleEdit: String, toggleFullscreen: String, togglePreview: String): AnonToggleEdit = {
    val __obj = js.Dynamic.literal(toggleEdit = toggleEdit.asInstanceOf[js.Any], toggleFullscreen = toggleFullscreen.asInstanceOf[js.Any], togglePreview = togglePreview.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonToggleEdit]
  }
  @scala.inline
  implicit class AnonToggleEditOps[Self <: AnonToggleEdit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToggleEdit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleFullscreen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleFullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTogglePreview(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglePreview")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

