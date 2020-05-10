package typingsSlinky.node.inspectorMod.NodeWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendMessageToWorkerParameterType extends js.Object {
  var message: String = js.native
  /**
    * Identifier of the session.
    */
  var sessionId: SessionID = js.native
}

object SendMessageToWorkerParameterType {
  @scala.inline
  def apply(message: String, sessionId: SessionID): SendMessageToWorkerParameterType = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageToWorkerParameterType]
  }
  @scala.inline
  implicit class SendMessageToWorkerParameterTypeOps[Self <: SendMessageToWorkerParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionId(value: SessionID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

