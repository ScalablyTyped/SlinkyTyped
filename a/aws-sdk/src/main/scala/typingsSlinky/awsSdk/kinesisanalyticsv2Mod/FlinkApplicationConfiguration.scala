package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlinkApplicationConfiguration extends js.Object {
  /**
    * Describes an application's checkpointing configuration. Checkpointing is the process of persisting application state for fault tolerance. For more information, see  Checkpoints for Fault Tolerance in the Apache Flink Documentation. 
    */
  var CheckpointConfiguration: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.CheckpointConfiguration] = js.native
  /**
    * Describes configuration parameters for Amazon CloudWatch logging for an application.
    */
  var MonitoringConfiguration: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.MonitoringConfiguration] = js.native
  /**
    * Describes parameters for how an application executes multiple tasks simultaneously.
    */
  var ParallelismConfiguration: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ParallelismConfiguration] = js.native
}

object FlinkApplicationConfiguration {
  @scala.inline
  def apply(): FlinkApplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlinkApplicationConfiguration]
  }
  @scala.inline
  implicit class FlinkApplicationConfigurationOps[Self <: FlinkApplicationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckpointConfiguration(value: CheckpointConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckpointConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckpointConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckpointConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitoringConfiguration(value: MonitoringConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoringConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withParallelismConfiguration(value: ParallelismConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParallelismConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelismConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParallelismConfiguration")(js.undefined)
        ret
    }
  }
  
}

