package typingsSlinky.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetNodePoolSizeRequest extends js.Object {
  /** The desired node count for the pool. */
  var nodeCount: js.UndefOr[Double] = js.native
}

object SetNodePoolSizeRequest {
  @scala.inline
  def apply(): SetNodePoolSizeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetNodePoolSizeRequest]
  }
  @scala.inline
  implicit class SetNodePoolSizeRequestOps[Self <: SetNodePoolSizeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodeCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeCount")(js.undefined)
        ret
    }
  }
  
}

