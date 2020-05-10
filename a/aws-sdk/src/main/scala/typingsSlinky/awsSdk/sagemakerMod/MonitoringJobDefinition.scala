package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringJobDefinition extends js.Object {
  /**
    * Baseline configuration used to validate that the data conforms to the specified constraints and statistics
    */
  var BaselineConfig: js.UndefOr[MonitoringBaselineConfig] = js.native
  /**
    * Sets the environment variables in the Docker container.
    */
  var Environment: js.UndefOr[MonitoringEnvironmentMap] = js.native
  /**
    * Configures the monitoring job to run a specified Docker container image.
    */
  var MonitoringAppSpecification: typingsSlinky.awsSdk.sagemakerMod.MonitoringAppSpecification = js.native
  /**
    * The array of inputs for the monitoring job. Currently we support monitoring an Amazon SageMaker Endpoint.
    */
  var MonitoringInputs: typingsSlinky.awsSdk.sagemakerMod.MonitoringInputs = js.native
  /**
    * The array of outputs from the monitoring job to be uploaded to Amazon Simple Storage Service (Amazon S3).
    */
  var MonitoringOutputConfig: typingsSlinky.awsSdk.sagemakerMod.MonitoringOutputConfig = js.native
  /**
    * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a monitoring job. In distributed processing, you specify more than one instance.
    */
  var MonitoringResources: typingsSlinky.awsSdk.sagemakerMod.MonitoringResources = js.native
  /**
    * Specifies networking options for an monitoring job.
    */
  var NetworkConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NetworkConfig] = js.native
  /**
    * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
    */
  var RoleArn: typingsSlinky.awsSdk.sagemakerMod.RoleArn = js.native
  /**
    * Specifies a time limit for how long the monitoring job is allowed to run.
    */
  var StoppingCondition: js.UndefOr[MonitoringStoppingCondition] = js.native
}

object MonitoringJobDefinition {
  @scala.inline
  def apply(
    MonitoringAppSpecification: MonitoringAppSpecification,
    MonitoringInputs: MonitoringInputs,
    MonitoringOutputConfig: MonitoringOutputConfig,
    MonitoringResources: MonitoringResources,
    RoleArn: RoleArn
  ): MonitoringJobDefinition = {
    val __obj = js.Dynamic.literal(MonitoringAppSpecification = MonitoringAppSpecification.asInstanceOf[js.Any], MonitoringInputs = MonitoringInputs.asInstanceOf[js.Any], MonitoringOutputConfig = MonitoringOutputConfig.asInstanceOf[js.Any], MonitoringResources = MonitoringResources.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringJobDefinition]
  }
  @scala.inline
  implicit class MonitoringJobDefinitionOps[Self <: MonitoringJobDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMonitoringAppSpecification(value: MonitoringAppSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringAppSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonitoringInputs(value: MonitoringInputs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringInputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonitoringOutputConfig(value: MonitoringOutputConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringOutputConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonitoringResources(value: MonitoringResources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaselineConfig(value: MonitoringBaselineConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaselineConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaselineConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: MonitoringEnvironmentMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Environment")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkConfig(value: NetworkConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withStoppingCondition(value: MonitoringStoppingCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StoppingCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoppingCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StoppingCondition")(js.undefined)
        ret
    }
  }
  
}

