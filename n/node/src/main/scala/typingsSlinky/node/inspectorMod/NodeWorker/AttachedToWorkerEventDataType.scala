package typingsSlinky.node.inspectorMod.NodeWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachedToWorkerEventDataType extends js.Object {
  /**
    * Identifier assigned to the session used to send/receive messages.
    */
  var sessionId: SessionID = js.native
  var waitingForDebugger: Boolean = js.native
  var workerInfo: WorkerInfo = js.native
}

object AttachedToWorkerEventDataType {
  @scala.inline
  def apply(sessionId: SessionID, waitingForDebugger: Boolean, workerInfo: WorkerInfo): AttachedToWorkerEventDataType = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any], waitingForDebugger = waitingForDebugger.asInstanceOf[js.Any], workerInfo = workerInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachedToWorkerEventDataType]
  }
  @scala.inline
  implicit class AttachedToWorkerEventDataTypeOps[Self <: AttachedToWorkerEventDataType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSessionId(value: SessionID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaitingForDebugger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitingForDebugger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkerInfo(value: WorkerInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

