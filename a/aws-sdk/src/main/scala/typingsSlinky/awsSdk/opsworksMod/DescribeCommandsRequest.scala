package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCommandsRequest extends js.Object {
  /**
    * An array of command IDs. If you include this parameter, DescribeCommands returns a description of the specified commands. Otherwise, it returns a description of every command.
    */
  var CommandIds: js.UndefOr[Strings] = js.native
  /**
    * The deployment ID. If you include this parameter, DescribeCommands returns a description of the commands associated with the specified deployment.
    */
  var DeploymentId: js.UndefOr[String] = js.native
  /**
    * The instance ID. If you include this parameter, DescribeCommands returns a description of the commands associated with the specified instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
}

object DescribeCommandsRequest {
  @scala.inline
  def apply(): DescribeCommandsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCommandsRequest]
  }
  @scala.inline
  implicit class DescribeCommandsRequestOps[Self <: DescribeCommandsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommandIds(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommandIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommandIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommandIds")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
        ret
    }
  }
  
}

