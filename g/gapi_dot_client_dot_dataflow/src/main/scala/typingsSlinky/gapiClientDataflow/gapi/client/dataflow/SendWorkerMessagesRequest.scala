package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendWorkerMessagesRequest extends js.Object {
  /** The location which contains the job */
  var location: js.UndefOr[String] = js.native
  /** The WorkerMessages to send. */
  var workerMessages: js.UndefOr[js.Array[WorkerMessage]] = js.native
}

object SendWorkerMessagesRequest {
  @scala.inline
  def apply(): SendWorkerMessagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendWorkerMessagesRequest]
  }
  @scala.inline
  implicit class SendWorkerMessagesRequestOps[Self <: SendWorkerMessagesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerMessages(value: js.Array[WorkerMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerMessages")(js.undefined)
        ret
    }
  }
  
}

