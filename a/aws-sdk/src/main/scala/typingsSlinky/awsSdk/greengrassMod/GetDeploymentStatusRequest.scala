package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeploymentStatusRequest extends js.Object {
  /**
    * The ID of the deployment.
    */
  var DeploymentId: string = js.native
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string = js.native
}

object GetDeploymentStatusRequest {
  @scala.inline
  def apply(DeploymentId: string, GroupId: string): GetDeploymentStatusRequest = {
    val __obj = js.Dynamic.literal(DeploymentId = DeploymentId.asInstanceOf[js.Any], GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentStatusRequest]
  }
  @scala.inline
  implicit class GetDeploymentStatusRequestOps[Self <: GetDeploymentStatusRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeploymentId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

