package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSimulationJobResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the simulation job.
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  
  /**
    * Compute information for the simulation job.
    */
  var compute: js.UndefOr[ComputeResponse] = js.native
  
  /**
    * The data sources for the simulation job.
    */
  var dataSources: js.UndefOr[DataSources] = js.native
  
  /**
    * the failure behavior for the simulation job.
    */
  var failureBehavior: js.UndefOr[FailureBehavior] = js.native
  
  /**
    * The failure code of the simulation job if it failed:  InternalServiceError  Internal service error.  RobotApplicationCrash  Robot application exited abnormally.  SimulationApplicationCrash   Simulation application exited abnormally.  BadPermissionsRobotApplication  Robot application bundle could not be downloaded.  BadPermissionsSimulationApplication  Simulation application bundle could not be downloaded.  BadPermissionsS3Output  Unable to publish outputs to customer-provided S3 bucket.  BadPermissionsCloudwatchLogs  Unable to publish logs to customer-provided CloudWatch Logs resource.  SubnetIpLimitExceeded  Subnet IP limit exceeded.  ENILimitExceeded  ENI limit exceeded.  BadPermissionsUserCredentials  Unable to use the Role provided.  InvalidBundleRobotApplication  Robot bundle cannot be extracted (invalid format, bundling error, or other issue).  InvalidBundleSimulationApplication  Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).  RobotApplicationVersionMismatchedEtag  Etag for RobotApplication does not match value during version creation.  SimulationApplicationVersionMismatchedEtag  Etag for SimulationApplication does not match value during version creation.  
    */
  var failureCode: js.UndefOr[SimulationJobErrorCode] = js.native
  
  /**
    * The IAM role that allows the simulation job to call the AWS APIs that are specified in its associated policies on your behalf.
    */
  var iamRole: js.UndefOr[IamRole] = js.native
  
  /**
    * The time, in milliseconds since the epoch, when the simulation job was last started.
    */
  var lastStartedAt: js.UndefOr[js.Date] = js.native
  
  /**
    * The time, in milliseconds since the epoch, when the simulation job was last updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.native
  
  /**
    * The logging configuration.
    */
  var loggingConfig: js.UndefOr[LoggingConfig] = js.native
  
  /**
    * The maximum simulation job duration in seconds. 
    */
  var maxJobDurationInSeconds: js.UndefOr[JobDuration] = js.native
  
  /**
    * Simulation job output files location.
    */
  var outputLocation: js.UndefOr[OutputLocation] = js.native
  
  /**
    * The robot application used by the simulation job.
    */
  var robotApplications: js.UndefOr[RobotApplicationConfigs] = js.native
  
  /**
    * The simulation application used by the simulation job.
    */
  var simulationApplications: js.UndefOr[SimulationApplicationConfigs] = js.native
  
  /**
    * The simulation job execution duration in milliseconds.
    */
  var simulationTimeMillis: js.UndefOr[SimulationTimeMillis] = js.native
  
  /**
    * The status of the simulation job.
    */
  var status: js.UndefOr[SimulationJobStatus] = js.native
  
  /**
    * The list of all tags added to the simulation job.
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    * Information about the vpc configuration.
    */
  var vpcConfig: js.UndefOr[VPCConfigResponse] = js.native
}
object CreateSimulationJobResponse {
  
  @scala.inline
  def apply(): CreateSimulationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSimulationJobResponse]
  }
  
  @scala.inline
  implicit class CreateSimulationJobResponseOps[Self <: CreateSimulationJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestToken: Self = this.set("clientRequestToken", js.undefined)
    
    @scala.inline
    def setCompute(value: ComputeResponse): Self = this.set("compute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompute: Self = this.set("compute", js.undefined)
    
    @scala.inline
    def setDataSourcesVarargs(value: DataSource*): Self = this.set("dataSources", js.Array(value :_*))
    
    @scala.inline
    def setDataSources(value: DataSources): Self = this.set("dataSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSources: Self = this.set("dataSources", js.undefined)
    
    @scala.inline
    def setFailureBehavior(value: FailureBehavior): Self = this.set("failureBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureBehavior: Self = this.set("failureBehavior", js.undefined)
    
    @scala.inline
    def setFailureCode(value: SimulationJobErrorCode): Self = this.set("failureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureCode: Self = this.set("failureCode", js.undefined)
    
    @scala.inline
    def setIamRole(value: IamRole): Self = this.set("iamRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamRole: Self = this.set("iamRole", js.undefined)
    
    @scala.inline
    def setLastStartedAt(value: js.Date): Self = this.set("lastStartedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastStartedAt: Self = this.set("lastStartedAt", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: js.Date): Self = this.set("lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedAt: Self = this.set("lastUpdatedAt", js.undefined)
    
    @scala.inline
    def setLoggingConfig(value: LoggingConfig): Self = this.set("loggingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggingConfig: Self = this.set("loggingConfig", js.undefined)
    
    @scala.inline
    def setMaxJobDurationInSeconds(value: JobDuration): Self = this.set("maxJobDurationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxJobDurationInSeconds: Self = this.set("maxJobDurationInSeconds", js.undefined)
    
    @scala.inline
    def setOutputLocation(value: OutputLocation): Self = this.set("outputLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputLocation: Self = this.set("outputLocation", js.undefined)
    
    @scala.inline
    def setRobotApplicationsVarargs(value: RobotApplicationConfig*): Self = this.set("robotApplications", js.Array(value :_*))
    
    @scala.inline
    def setRobotApplications(value: RobotApplicationConfigs): Self = this.set("robotApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRobotApplications: Self = this.set("robotApplications", js.undefined)
    
    @scala.inline
    def setSimulationApplicationsVarargs(value: SimulationApplicationConfig*): Self = this.set("simulationApplications", js.Array(value :_*))
    
    @scala.inline
    def setSimulationApplications(value: SimulationApplicationConfigs): Self = this.set("simulationApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimulationApplications: Self = this.set("simulationApplications", js.undefined)
    
    @scala.inline
    def setSimulationTimeMillis(value: SimulationTimeMillis): Self = this.set("simulationTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimulationTimeMillis: Self = this.set("simulationTimeMillis", js.undefined)
    
    @scala.inline
    def setStatus(value: SimulationJobStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: VPCConfigResponse): Self = this.set("vpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcConfig: Self = this.set("vpcConfig", js.undefined)
  }
}
