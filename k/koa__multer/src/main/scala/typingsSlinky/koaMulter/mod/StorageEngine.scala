package typingsSlinky.koaMulter.mod

import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageEngine extends js.Object {
  def _handleFile(
    req: IncomingMessage,
    file: File,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[File], Unit]
  ): Unit = js.native
  def _removeFile(req: IncomingMessage, file: File, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
}

object StorageEngine {
  @scala.inline
  def apply(
    _handleFile: (IncomingMessage, File, js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[File], Unit]) => Unit,
    _removeFile: (IncomingMessage, File, js.Function1[/* error */ js.Error, Unit]) => Unit
  ): StorageEngine = {
    val __obj = js.Dynamic.literal(_handleFile = js.Any.fromFunction3(_handleFile), _removeFile = js.Any.fromFunction3(_removeFile))
    __obj.asInstanceOf[StorageEngine]
  }
  @scala.inline
  implicit class StorageEngineOps[Self <: StorageEngine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_handleFile(
      value: (IncomingMessage, File, js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[File], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_handleFile")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def with_removeFile(value: (IncomingMessage, File, js.Function1[/* error */ js.Error, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_removeFile")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

