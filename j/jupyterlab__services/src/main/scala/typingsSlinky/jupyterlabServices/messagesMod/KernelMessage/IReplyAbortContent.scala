package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.abort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reply content indicating an aborted request.
  *
  * This is [deprecated](https://jupyter-client.readthedocs.io/en/latest/messaging.html#request-reply)
  * in message spec 5.1. Kernels should send an 'error' reply instead.
  */
@js.native
trait IReplyAbortContent
  extends _ReplyContent[js.Any] {
  var status: abort = js.native
}

object IReplyAbortContent {
  @scala.inline
  def apply(status: abort): IReplyAbortContent = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReplyAbortContent]
  }
  @scala.inline
  implicit class IReplyAbortContentOps[Self <: IReplyAbortContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: abort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

