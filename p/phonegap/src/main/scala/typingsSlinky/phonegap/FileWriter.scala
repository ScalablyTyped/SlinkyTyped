package typingsSlinky.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Defined in lib.d.ts
interface File {
  fullPath: string;
  type: string;
  size: number;
}
*/
@js.native
trait FileWriter extends js.Object {
  var error: FileError = js.native
  var fileName: String = js.native
  var length: Double = js.native
  var onabort: js.Function = js.native
  var onerror: js.Function = js.native
  var onprogress: js.Function = js.native
  var onwrite: js.Function = js.native
  var onwriteend: js.Function = js.native
  var onwritestart: js.Function = js.native
  var position: Double = js.native
  var readyState: js.Any = js.native
  def abort(): Unit = js.native
  def seek(arg: Double): Unit = js.native
  def truncate(arg: Double): Unit = js.native
  def write(arg: js.Any): Unit = js.native
}

object FileWriter {
  @scala.inline
  def apply(
    abort: () => Unit,
    error: FileError,
    fileName: String,
    length: Double,
    onabort: js.Function,
    onerror: js.Function,
    onprogress: js.Function,
    onwrite: js.Function,
    onwriteend: js.Function,
    onwritestart: js.Function,
    position: Double,
    readyState: js.Any,
    seek: Double => Unit,
    truncate: Double => Unit,
    write: js.Any => Unit
  ): FileWriter = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), error = error.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], onabort = onabort.asInstanceOf[js.Any], onerror = onerror.asInstanceOf[js.Any], onprogress = onprogress.asInstanceOf[js.Any], onwrite = onwrite.asInstanceOf[js.Any], onwriteend = onwriteend.asInstanceOf[js.Any], onwritestart = onwritestart.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], seek = js.Any.fromFunction1(seek), truncate = js.Any.fromFunction1(truncate), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[FileWriter]
  }
  @scala.inline
  implicit class FileWriterOps[Self <: FileWriter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withError(value: FileError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnabort(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onabort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnerror(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnprogress(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprogress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnwrite(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onwrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnwriteend(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onwriteend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnwritestart(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onwritestart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadyState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readyState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeek(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTruncate(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrite(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

