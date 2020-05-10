package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRobotResponse extends js.Object {
  /**
    * The target architecture of the robot application.
    */
  var architecture: js.UndefOr[Architecture] = js.native
  /**
    * The Amazon Resource Name (ARN) of the robot.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The time, in milliseconds since the epoch, when the robot was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleetArn: js.UndefOr[Arn] = js.native
  /**
    * The Greengrass group id.
    */
  var greengrassGroupId: js.UndefOr[Id] = js.native
  /**
    * The Amazon Resource Name (ARN) of the last deployment job.
    */
  var lastDeploymentJob: js.UndefOr[Arn] = js.native
  /**
    * The time of the last deployment job.
    */
  var lastDeploymentTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the robot.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The status of the fleet.
    */
  var status: js.UndefOr[RobotStatus] = js.native
  /**
    * The list of all tags added to the specified robot.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object DescribeRobotResponse {
  @scala.inline
  def apply(): DescribeRobotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRobotResponse]
  }
  @scala.inline
  implicit class DescribeRobotResponseOps[Self <: DescribeRobotResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchitecture(value: Architecture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("architecture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchitecture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("architecture")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withFleetArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fleetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFleetArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fleetArn")(js.undefined)
        ret
    }
    @scala.inline
    def withGreengrassGroupId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greengrassGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreengrassGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greengrassGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withLastDeploymentJob(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastDeploymentJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastDeploymentJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastDeploymentJob")(js.undefined)
        ret
    }
    @scala.inline
    def withLastDeploymentTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastDeploymentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastDeploymentTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastDeploymentTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: RobotStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

