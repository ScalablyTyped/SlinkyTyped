package typingsSlinky.ffmpegJs.ffmpegWorkerMp4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Worker extends js.Object {
  def onmessage(opts: OnMessageOptions): Unit = js.native
  def postMessage(opts: PostMessageOptions): Unit = js.native
  def terminate(): Unit = js.native
}

object Worker {
  @scala.inline
  def apply(
    onmessage: OnMessageOptions => Unit,
    postMessage: PostMessageOptions => Unit,
    terminate: () => Unit
  ): Worker = {
    val __obj = js.Dynamic.literal(onmessage = js.Any.fromFunction1(onmessage), postMessage = js.Any.fromFunction1(postMessage), terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[Worker]
  }
  @scala.inline
  implicit class WorkerOps[Self <: Worker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnmessage(value: OnMessageOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPostMessage(value: PostMessageOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTerminate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminate")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

