package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentInfo extends js.Object {
  /**
    * Provides information about the results of a deployment, such as whether instances in the original environment in a blue/green deployment were not terminated.
    */
  var additionalDeploymentStatusInfo: js.UndefOr[AdditionalDeploymentStatusInfo] = js.native
  /**
    * The application name.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.native
  /**
    * Information about the automatic rollback configuration associated with the deployment.
    */
  var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.native
  /**
    * Information about blue/green deployment options for this deployment.
    */
  var blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration] = js.native
  /**
    * A timestamp that indicates when the deployment was complete.
    */
  var completeTime: js.UndefOr[js.Date] = js.native
  /**
    * The destination platform type for the deployment (Lambda, Server, or ECS).
    */
  var computePlatform: js.UndefOr[ComputePlatform] = js.native
  /**
    * A timestamp that indicates when the deployment was created.
    */
  var createTime: js.UndefOr[js.Date] = js.native
  /**
    * The means by which the deployment was created:   user: A user created the deployment.   autoscaling: Amazon EC2 Auto Scaling created the deployment.   codeDeployRollback: A rollback process created the deployment.  
    */
  var creator: js.UndefOr[DeploymentCreator] = js.native
  /**
    *  The deployment configuration name. 
    */
  var deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.native
  /**
    *  The deployment group name. 
    */
  var deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.native
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
  /**
    * A summary of the deployment status of the instances in the deployment.
    */
  var deploymentOverview: js.UndefOr[DeploymentOverview] = js.native
  /**
    * Messages that contain information about the status of a deployment.
    */
  var deploymentStatusMessages: js.UndefOr[DeploymentStatusMessageList] = js.native
  /**
    * Information about the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer.
    */
  var deploymentStyle: js.UndefOr[DeploymentStyle] = js.native
  /**
    * A comment about the deployment.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * Information about any error associated with this deployment.
    */
  var errorInformation: js.UndefOr[ErrorInformation] = js.native
  /**
    * Information about how AWS CodeDeploy handles files that already exist in a deployment target location but weren't part of the previous successful deployment.   DISALLOW: The deployment fails. This is also the default behavior if no option is specified.   OVERWRITE: The version of the file from the application revision currently being deployed replaces the version already on the instance.   RETAIN: The version of the file already on the instance is kept and used as part of the new deployment.  
    */
  var fileExistsBehavior: js.UndefOr[FileExistsBehavior] = js.native
  /**
    *  If true, then if an ApplicationStop, BeforeBlockTraffic, or AfterBlockTraffic deployment lifecycle event to an instance fails, then the deployment continues to the next deployment lifecycle event. For example, if ApplicationStop fails, the deployment continues with DownloadBundle. If BeforeBlockTraffic fails, the deployment continues with BlockTraffic. If AfterBlockTraffic fails, the deployment continues with ApplicationStop.   If false or not specified, then if a lifecycle event fails during a deployment to an instance, that deployment fails. If deployment to that instance is part of an overall deployment and the number of healthy hosts is not less than the minimum number of healthy hosts, then a deployment to the next instance is attempted.   During a deployment, the AWS CodeDeploy agent runs the scripts specified for ApplicationStop, BeforeBlockTraffic, and AfterBlockTraffic in the AppSpec file from the previous successful deployment. (All other scripts are run from the AppSpec file in the current deployment.) If one of these scripts contains an error and does not run successfully, the deployment can fail.   If the cause of the failure is a script from the last successful deployment that will never run successfully, create a new deployment and use ignoreApplicationStopFailures to specify that the ApplicationStop, BeforeBlockTraffic, and AfterBlockTraffic failures should be ignored. 
    */
  var ignoreApplicationStopFailures: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the wait period set for the termination of instances in the original environment has started. Status is 'false' if the KEEP_ALIVE option is specified. Otherwise, 'true' as soon as the termination wait period starts.
    */
  var instanceTerminationWaitTimeStarted: js.UndefOr[Boolean] = js.native
  /**
    * Information about the load balancer used in the deployment.
    */
  var loadBalancerInfo: js.UndefOr[LoadBalancerInfo] = js.native
  /**
    * Information about the application revision that was deployed to the deployment group before the most recent successful deployment.
    */
  var previousRevision: js.UndefOr[RevisionLocation] = js.native
  /**
    * Information about the location of stored application artifacts and the service from which to retrieve them.
    */
  var revision: js.UndefOr[RevisionLocation] = js.native
  /**
    * Information about a deployment rollback.
    */
  var rollbackInfo: js.UndefOr[RollbackInfo] = js.native
  /**
    * A timestamp that indicates when the deployment was deployed to the deployment group. In some cases, the reported value of the start time might be later than the complete time. This is due to differences in the clock settings of backend servers that participate in the deployment process.
    */
  var startTime: js.UndefOr[js.Date] = js.native
  /**
    * The current state of the deployment as a whole.
    */
  var status: js.UndefOr[DeploymentStatus] = js.native
  /**
    * Information about the instances that belong to the replacement environment in a blue/green deployment.
    */
  var targetInstances: js.UndefOr[TargetInstances] = js.native
  /**
    * Indicates whether only instances that are not running the latest application revision are to be deployed to.
    */
  var updateOutdatedInstancesOnly: js.UndefOr[Boolean] = js.native
}

object DeploymentInfo {
  @scala.inline
  def apply(): DeploymentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentInfo]
  }
  @scala.inline
  implicit class DeploymentInfoOps[Self <: DeploymentInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalDeploymentStatusInfo(value: AdditionalDeploymentStatusInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalDeploymentStatusInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalDeploymentStatusInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalDeploymentStatusInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationName(value: ApplicationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(js.undefined)
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
    def withBlueGreenDeploymentConfiguration(value: BlueGreenDeploymentConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueGreenDeploymentConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlueGreenDeploymentConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueGreenDeploymentConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withCompleteTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleteTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeTime")(js.undefined)
        ret
    }
    @scala.inline
    def withComputePlatform(value: ComputePlatform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computePlatform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputePlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computePlatform")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCreator(value: DeploymentCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creator")(js.undefined)
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
    def withDeploymentId(value: DeploymentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentId")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentOverview(value: DeploymentOverview): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentOverview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentOverview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentOverview")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentStatusMessages(value: DeploymentStatusMessageList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentStatusMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentStatusMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentStatusMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentStyle(value: DeploymentStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentStyle")(js.undefined)
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
    def withErrorInformation(value: ErrorInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorInformation")(js.undefined)
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
    def withInstanceTerminationWaitTimeStarted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTerminationWaitTimeStarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceTerminationWaitTimeStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTerminationWaitTimeStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadBalancerInfo(value: LoadBalancerInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancerInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancerInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancerInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousRevision(value: RevisionLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousRevision")(js.undefined)
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
    def withRollbackInfo(value: RollbackInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollbackInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRollbackInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollbackInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: DeploymentStatus): Self = {
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

