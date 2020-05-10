package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentInput extends js.Object {
  /**
    * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
    */
  var applicationName: ApplicationName = js.native
  /**
    * Configuration information for an automatic rollback that is added when a deployment is created.
    */
  var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.native
  /**
    * The name of a deployment configuration associated with the IAM user or AWS account. If not specified, the value configured in the deployment group is used as the default. If the deployment group does not have a deployment configuration associated with it, CodeDeployDefault.OneAtATime is used by default.
    */
  var deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.native
  /**
    * The name of the deployment group.
    */
  var deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.native
  /**
    * A comment about the deployment.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * Information about how AWS CodeDeploy handles files that already exist in a deployment target location but weren't part of the previous successful deployment. The fileExistsBehavior parameter takes any of the following values:   DISALLOW: The deployment fails. This is also the default behavior if no option is specified.   OVERWRITE: The version of the file from the application revision currently being deployed replaces the version already on the instance.   RETAIN: The version of the file already on the instance is kept and used as part of the new deployment.  
    */
  var fileExistsBehavior: js.UndefOr[FileExistsBehavior] = js.native
  /**
    *  If true, then if an ApplicationStop, BeforeBlockTraffic, or AfterBlockTraffic deployment lifecycle event to an instance fails, then the deployment continues to the next deployment lifecycle event. For example, if ApplicationStop fails, the deployment continues with DownloadBundle. If BeforeBlockTraffic fails, the deployment continues with BlockTraffic. If AfterBlockTraffic fails, the deployment continues with ApplicationStop.   If false or not specified, then if a lifecycle event fails during a deployment to an instance, that deployment fails. If deployment to that instance is part of an overall deployment and the number of healthy hosts is not less than the minimum number of healthy hosts, then a deployment to the next instance is attempted.   During a deployment, the AWS CodeDeploy agent runs the scripts specified for ApplicationStop, BeforeBlockTraffic, and AfterBlockTraffic in the AppSpec file from the previous successful deployment. (All other scripts are run from the AppSpec file in the current deployment.) If one of these scripts contains an error and does not run successfully, the deployment can fail.   If the cause of the failure is a script from the last successful deployment that will never run successfully, create a new deployment and use ignoreApplicationStopFailures to specify that the ApplicationStop, BeforeBlockTraffic, and AfterBlockTraffic failures should be ignored. 
    */
  var ignoreApplicationStopFailures: js.UndefOr[Boolean] = js.native
  /**
    *  The type and location of the revision to deploy. 
    */
  var revision: js.UndefOr[RevisionLocation] = js.native
  /**
    *  Information about the instances that belong to the replacement environment in a blue/green deployment. 
    */
  var targetInstances: js.UndefOr[TargetInstances] = js.native
  /**
    *  Indicates whether to deploy to all instances or only to instances that are not running the latest application revision. 
    */
  var updateOutdatedInstancesOnly: js.UndefOr[Boolean] = js.native
}

object CreateDeploymentInput {
  @scala.inline
  def apply(applicationName: ApplicationName): CreateDeploymentInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentInput]
  }
  @scala.inline
  implicit class CreateDeploymentInputOps[Self <: CreateDeploymentInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationName(value: ApplicationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoRollbackConfiguration(value: AutoRollbackConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRollbackConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRollbackConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRollbackConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentConfigName(value: DeploymentConfigName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentConfigName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentConfigName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentConfigName")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentGroupName(value: DeploymentGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withFileExistsBehavior(value: FileExistsBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExistsBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileExistsBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExistsBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreApplicationStopFailures(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreApplicationStopFailures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreApplicationStopFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreApplicationStopFailures")(js.undefined)
        ret
    }
    @scala.inline
    def withRevision(value: RevisionLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetInstances(value: TargetInstances): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetInstances")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateOutdatedInstancesOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOutdatedInstancesOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateOutdatedInstancesOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOutdatedInstancesOnly")(js.undefined)
        ret
    }
  }
  
}

