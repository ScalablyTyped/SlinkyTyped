package typingsSlinky.oracleOraclejet.ojfilepickerMod

import org.scalajs.dom.raw.FileList
import typingsSlinky.oracleOraclejet.ojprogresslistMod.ProgressItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileUploadTransport extends js.Object {
  def flush(): Unit = js.native
  def queue(fileList: FileList): js.Array[ProgressItem] = js.native
}

object FileUploadTransport {
  @scala.inline
  def apply(flush: () => Unit, queue: FileList => js.Array[ProgressItem]): FileUploadTransport = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush), queue = js.Any.fromFunction1(queue))
    __obj.asInstanceOf[FileUploadTransport]
  }
  @scala.inline
  implicit class FileUploadTransportOps[Self <: FileUploadTransport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlush(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withQueue(value: FileList => js.Array[ProgressItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

