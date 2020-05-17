package typingsSlinky.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operation extends js.Object {
  var operation: String = js.native
  var playbackId: String = js.native
}

object Operation {
  @scala.inline
  def apply(operation: String, playbackId: String): Operation = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], playbackId = playbackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  implicit class OperationOps[Self <: Operation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaybackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbackId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

