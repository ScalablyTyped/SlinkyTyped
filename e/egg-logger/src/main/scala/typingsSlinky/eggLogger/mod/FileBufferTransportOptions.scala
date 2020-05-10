package typingsSlinky.eggLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileBufferTransportOptions extends FileTransportOptions {
  var flushInterval: js.UndefOr[Double] = js.native
  var maxBufferLength: js.UndefOr[Double] = js.native
}

object FileBufferTransportOptions {
  @scala.inline
  def apply(file: String): FileBufferTransportOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileBufferTransportOptions]
  }
  @scala.inline
  implicit class FileBufferTransportOptionsOps[Self <: FileBufferTransportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlushInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlushInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBufferLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBufferLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBufferLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBufferLength")(js.undefined)
        ret
    }
  }
  
}

