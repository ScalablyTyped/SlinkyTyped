package typingsSlinky.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFWorker extends js.Object {
  val messageHandler: js.Any | Null = js.native
  val port: js.Any | Null = js.native
  val promise: js.Promise[_] = js.native
  def destroy(): Unit = js.native
}

object PDFWorker {
  @scala.inline
  def apply(destroy: () => Unit, promise: js.Promise[_]): PDFWorker = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFWorker]
  }
  @scala.inline
  implicit class PDFWorkerOps[Self <: PDFWorker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPromise(value: js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageHandlerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageHandler")(null)
        ret
    }
    @scala.inline
    def withPort(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(null)
        ret
    }
  }
  
}

