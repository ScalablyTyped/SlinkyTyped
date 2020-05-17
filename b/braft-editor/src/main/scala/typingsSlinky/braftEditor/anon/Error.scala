package typingsSlinky.braftEditor.anon

import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends js.Object {
  var file: File = js.native
  var libraryId: String = js.native
  def error(err: Msg): Unit = js.native
  def progress(progress: Double): Unit = js.native
  def success(res: Meta): Unit = js.native
}

object Error {
  @scala.inline
  def apply(error: Msg => Unit, file: File, libraryId: String, progress: Double => Unit, success: Meta => Unit): Error = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), file = file.asInstanceOf[js.Any], libraryId = libraryId.asInstanceOf[js.Any], progress = js.Any.fromFunction1(progress), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: Msg => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFile(value: File): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLibraryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSuccess(value: Meta => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

