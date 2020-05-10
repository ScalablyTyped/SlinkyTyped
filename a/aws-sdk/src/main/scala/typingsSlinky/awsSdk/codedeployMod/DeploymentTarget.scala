package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentTarget extends js.Object {
  /**
    *  The deployment type that is specific to the deployment's compute platform. 
    */
  var deploymentTargetType: js.UndefOr[DeploymentTargetType] = js.native
  /**
    *  Information about the target for a deployment that uses the Amazon ECS compute platform. 
    */
  var ecsTarget: js.UndefOr[ECSTarget] = js.native
  /**
    *  Information about the target for a deployment that uses the EC2/On-premises compute platform. 
    */
  var instanceTarget: js.UndefOr[InstanceTarget] = js.native
  /**
    *  Information about the target for a deployment that uses the AWS Lambda compute platform. 
    */
  var lambdaTarget: js.UndefOr[LambdaTarget] = js.native
}

object DeploymentTarget {
  @scala.inline
  def apply(): DeploymentTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentTarget]
  }
  @scala.inline
  implicit class DeploymentTargetOps[Self <: DeploymentTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeploymentTargetType(value: DeploymentTargetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentTargetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentTargetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentTargetType")(js.undefined)
        ret
    }
    @scala.inline
    def withEcsTarget(value: ECSTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecsTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcsTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecsTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceTarget(value: InstanceTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaTarget(value: LambdaTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaTarget")(js.undefined)
        ret
    }
  }
  
}

