package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlinkApplicationConfigurationDescription extends js.Object {
  /**
    * Describes an application's checkpointing configuration. Checkpointing is the process of persisting application state for fault tolerance.
    */
  var CheckpointConfigurationDescription: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.CheckpointConfigurationDescription] = js.native
  /**
    * The job plan for an application. For more information about the job plan, see Jobs and Scheduling in the Apache Flink Documentation. To retrieve the job plan for the application, use the DescribeApplicationRequest$IncludeAdditionalDetails parameter of the DescribeApplication operation.
    */
  var JobPlanDescription: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.JobPlanDescription] = js.native
  /**
    * Describes configuration parameters for Amazon CloudWatch logging for an application.
    */
  var MonitoringConfigurationDescription: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.MonitoringConfigurationDescription] = js.native
  /**
    * Describes parameters for how an application executes multiple tasks simultaneously.
    */
  var ParallelismConfigurationDescription: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ParallelismConfigurationDescription] = js.native
}

object FlinkApplicationConfigurationDescription {
  @scala.inline
  def apply(): FlinkApplicationConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlinkApplicationConfigurationDescription]
  }
  @scala.inline
  implicit class FlinkApplicationConfigurationDescriptionOps[Self <: FlinkApplicationConfigurationDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckpointConfigurationDescription(value: CheckpointConfigurationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckpointConfigurationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckpointConfigurationDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckpointConfigurationDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withJobPlanDescription(value: JobPlanDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobPlanDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobPlanDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobPlanDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitoringConfigurationDescription(value: MonitoringConfigurationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringConfigurationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoringConfigurationDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringConfigurationDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withParallelismConfigurationDescription(value: ParallelismConfigurationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParallelismConfigurationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelismConfigurationDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParallelismConfigurationDescription")(js.undefined)
        ret
    }
  }
  
}

