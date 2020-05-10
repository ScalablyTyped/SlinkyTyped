package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimulationJobRequest extends js.Object {
  /**
    * Specify data sources to mount read-only files from S3 into your simulation. These files are available under /opt/robomaker/datasources/data_source_name.   There is a limit of 100 files and a combined size of 25GB for all DataSourceConfig objects.  
    */
  var dataSources: js.UndefOr[DataSourceConfigs] = js.native
  /**
    * The failure behavior the simulation job.  Continue  Restart the simulation job in the same host instance.  Fail  Stop the simulation job and terminate the instance.  
    */
  var failureBehavior: js.UndefOr[FailureBehavior] = js.native
  /**
    * The IAM role name that allows the simulation instance to call the AWS APIs that are specified in its associated policies on your behalf. This is how credentials are passed in to your simulation job. 
    */
  var iamRole: js.UndefOr[IamRole] = js.native
  var loggingConfig: js.UndefOr[LoggingConfig] = js.native
  /**
    * The maximum simulation job duration in seconds. The value must be 8 days (691,200 seconds) or less.
    */
  var maxJobDurationInSeconds: JobDuration = js.native
  var outputLocation: js.UndefOr[OutputLocation] = js.native
  /**
    * The robot applications to use in the simulation job.
    */
  var robotApplications: js.UndefOr[RobotApplicationConfigs] = js.native
  /**
    * The simulation applications to use in the simulation job.
    */
  var simulationApplications: js.UndefOr[SimulationApplicationConfigs] = js.native
  /**
    * A map that contains tag keys and tag values that are attached to the simulation job request.
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * Boolean indicating whether to use default simulation tool applications.
    */
  var useDefaultApplications: js.UndefOr[BoxedBoolean] = js.native
  var vpcConfig: js.UndefOr[VPCConfig] = js.native
}

object SimulationJobRequest {
  @scala.inline
  def apply(maxJobDurationInSeconds: JobDuration): SimulationJobRequest = {
    val __obj = js.Dynamic.literal(maxJobDurationInSeconds = maxJobDurationInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimulationJobRequest]
  }
  @scala.inline
  implicit class SimulationJobRequestOps[Self <: SimulationJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxJobDurationInSeconds(value: JobDuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxJobDurationInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSources(value: DataSourceConfigs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSources")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureBehavior(value: FailureBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withIamRole(value: IamRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamRole")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggingConfig(value: LoggingConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputLocation(value: OutputLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withRobotApplications(value: RobotApplicationConfigs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("robotApplications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRobotApplications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("robotApplications")(js.undefined)
        ret
    }
    @scala.inline
    def withSimulationApplications(value: SimulationApplicationConfigs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simulationApplications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimulationApplications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simulationApplications")(js.undefined)
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
    @scala.inline
    def withUseDefaultApplications(value: BoxedBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDefaultApplications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDefaultApplications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDefaultApplications")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcConfig(value: VPCConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcConfig")(js.undefined)
        ret
    }
  }
  
}

