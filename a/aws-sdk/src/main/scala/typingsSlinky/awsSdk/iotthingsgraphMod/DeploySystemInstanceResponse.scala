package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploySystemInstanceResponse extends js.Object {
  /**
    * The ID of the Greengrass deployment used to deploy the system instance.
    */
  var greengrassDeploymentId: js.UndefOr[GreengrassDeploymentId] = js.native
  /**
    * An object that contains summary information about a system instance that was deployed. 
    */
  var summary: SystemInstanceSummary = js.native
}

object DeploySystemInstanceResponse {
  @scala.inline
  def apply(summary: SystemInstanceSummary): DeploySystemInstanceResponse = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploySystemInstanceResponse]
  }
  @scala.inline
  implicit class DeploySystemInstanceResponseOps[Self <: DeploySystemInstanceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSummary(value: SystemInstanceSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGreengrassDeploymentId(value: GreengrassDeploymentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greengrassDeploymentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreengrassDeploymentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greengrassDeploymentId")(js.undefined)
        ret
    }
  }
  
}

