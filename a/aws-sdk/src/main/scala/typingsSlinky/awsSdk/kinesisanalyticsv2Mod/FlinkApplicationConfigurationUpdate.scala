package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlinkApplicationConfigurationUpdate extends js.Object {
  /**
    * Describes updates to an application's checkpointing configuration. Checkpointing is the process of persisting application state for fault tolerance.
    */
  var CheckpointConfigurationUpdate: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.CheckpointConfigurationUpdate] = js.native
  /**
    * Describes updates to the configuration parameters for Amazon CloudWatch logging for an application.
    */
  var MonitoringConfigurationUpdate: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.MonitoringConfigurationUpdate] = js.native
  /**
    * Describes updates to the parameters for how an application executes multiple tasks simultaneously.
    */
  var ParallelismConfigurationUpdate: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ParallelismConfigurationUpdate] = js.native
}

object FlinkApplicationConfigurationUpdate {
  @scala.inline
  def apply(): FlinkApplicationConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlinkApplicationConfigurationUpdate]
  }
  @scala.inline
  implicit class FlinkApplicationConfigurationUpdateOps[Self <: FlinkApplicationConfigurationUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckpointConfigurationUpdate(value: CheckpointConfigurationUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckpointConfigurationUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckpointConfigurationUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckpointConfigurationUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitoringConfigurationUpdate(value: MonitoringConfigurationUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringConfigurationUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoringConfigurationUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringConfigurationUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withParallelismConfigurationUpdate(value: ParallelismConfigurationUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParallelismConfigurationUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelismConfigurationUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParallelismConfigurationUpdate")(js.undefined)
        ret
    }
  }
  
}

