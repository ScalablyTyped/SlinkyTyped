package typingsSlinky.jsmediatags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFilealterpreservation extends js.Object {
  var file_alter_preservation: Boolean = js.native
  var read_only: Boolean = js.native
  var tag_alter_preservation: Boolean = js.native
}

object AnonFilealterpreservation {
  @scala.inline
  def apply(file_alter_preservation: Boolean, read_only: Boolean, tag_alter_preservation: Boolean): AnonFilealterpreservation = {
    val __obj = js.Dynamic.literal(file_alter_preservation = file_alter_preservation.asInstanceOf[js.Any], read_only = read_only.asInstanceOf[js.Any], tag_alter_preservation = tag_alter_preservation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilealterpreservation]
  }
  @scala.inline
  implicit class AnonFilealterpreservationOps[Self <: AnonFilealterpreservation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile_alter_preservation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_alter_preservation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRead_only(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read_only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag_alter_preservation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag_alter_preservation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

