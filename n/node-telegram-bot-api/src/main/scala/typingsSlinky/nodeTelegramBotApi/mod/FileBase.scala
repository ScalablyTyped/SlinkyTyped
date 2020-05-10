package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileBase extends js.Object {
  var file_id: String = js.native
  var file_size: js.UndefOr[Double] = js.native
}

object FileBase {
  @scala.inline
  def apply(file_id: String): FileBase = {
    val __obj = js.Dynamic.literal(file_id = file_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileBase]
  }
  @scala.inline
  implicit class FileBaseOps[Self <: FileBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withoutFile_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_size")(js.undefined)
        ret
    }
  }
  
}

