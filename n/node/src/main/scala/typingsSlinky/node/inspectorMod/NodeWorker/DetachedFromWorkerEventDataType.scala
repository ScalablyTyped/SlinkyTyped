package typingsSlinky.node.inspectorMod.NodeWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachedFromWorkerEventDataType extends js.Object {
  /**
    * Detached session identifier.
    */
  var sessionId: SessionID = js.native
}

object DetachedFromWorkerEventDataType {
  @scala.inline
  def apply(sessionId: SessionID): DetachedFromWorkerEventDataType = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachedFromWorkerEventDataType]
  }
  @scala.inline
  implicit class DetachedFromWorkerEventDataTypeOps[Self <: DetachedFromWorkerEventDataType] (val x: Self) extends AnyVal {
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
  }
  
}

