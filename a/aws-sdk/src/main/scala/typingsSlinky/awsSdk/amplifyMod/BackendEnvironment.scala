package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendEnvironment extends js.Object {
  /**
    *  Arn for a backend environment, part of an Amplify App. 
    */
  var backendEnvironmentArn: BackendEnvironmentArn = js.native
  /**
    *  Creation date and time for a backend environment, part of an Amplify App. 
    */
  var createTime: js.Date = js.native
  /**
    *  Name of deployment artifacts. 
    */
  var deploymentArtifacts: js.UndefOr[DeploymentArtifacts] = js.native
  /**
    *  Name for a backend environment, part of an Amplify App. 
    */
  var environmentName: EnvironmentName = js.native
  /**
    *  CloudFormation stack name of backend environment. 
    */
  var stackName: js.UndefOr[StackName] = js.native
  /**
    *  Last updated date and time for a backend environment, part of an Amplify App. 
    */
  var updateTime: js.Date = js.native
}

object BackendEnvironment {
  @scala.inline
  def apply(
    backendEnvironmentArn: BackendEnvironmentArn,
    createTime: js.Date,
    environmentName: EnvironmentName,
    updateTime: js.Date
  ): BackendEnvironment = {
    val __obj = js.Dynamic.literal(backendEnvironmentArn = backendEnvironmentArn.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendEnvironment]
  }
  @scala.inline
  implicit class BackendEnvironmentOps[Self <: BackendEnvironment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackendEnvironmentArn(value: BackendEnvironmentArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backendEnvironmentArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironmentName(value: EnvironmentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeploymentArtifacts(value: DeploymentArtifacts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentArtifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentArtifacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentArtifacts")(js.undefined)
        ret
    }
    @scala.inline
    def withStackName(value: StackName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackName")(js.undefined)
        ret
    }
  }
  
}

