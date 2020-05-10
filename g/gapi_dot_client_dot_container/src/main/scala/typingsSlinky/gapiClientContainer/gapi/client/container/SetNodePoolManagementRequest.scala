package typingsSlinky.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetNodePoolManagementRequest extends js.Object {
  /** NodeManagement configuration for the node pool. */
  var management: js.UndefOr[NodeManagement] = js.native
}

object SetNodePoolManagementRequest {
  @scala.inline
  def apply(): SetNodePoolManagementRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetNodePoolManagementRequest]
  }
  @scala.inline
  implicit class SetNodePoolManagementRequestOps[Self <: SetNodePoolManagementRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManagement(value: NodeManagement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("management")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("management")(js.undefined)
        ret
    }
  }
  
}

