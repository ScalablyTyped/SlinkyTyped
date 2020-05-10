package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// TELEGRAM TYPES ///
@js.native
trait PassportFile extends js.Object {
  var file_date: Double = js.native
  var file_id: String = js.native
  var file_size: Double = js.native
}

object PassportFile {
  @scala.inline
  def apply(file_date: Double, file_id: String, file_size: Double): PassportFile = {
    val __obj = js.Dynamic.literal(file_date = file_date.asInstanceOf[js.Any], file_id = file_id.asInstanceOf[js.Any], file_size = file_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassportFile]
  }
  @scala.inline
  implicit class PassportFileOps[Self <: PassportFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile_date(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

