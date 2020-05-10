package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnhancedMonitoringOutput extends js.Object {
  /**
    * Represents the current state of the metrics that are in the enhanced state before the operation.
    */
  var CurrentShardLevelMetrics: js.UndefOr[MetricsNameList] = js.native
  /**
    * Represents the list of all the metrics that would be in the enhanced state after the operation.
    */
  var DesiredShardLevelMetrics: js.UndefOr[MetricsNameList] = js.native
  /**
    * The name of the Kinesis data stream.
    */
  var StreamName: js.UndefOr[typingsSlinky.awsSdk.kinesisMod.StreamName] = js.native
}

object EnhancedMonitoringOutput {
  @scala.inline
  def apply(): EnhancedMonitoringOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnhancedMonitoringOutput]
  }
  @scala.inline
  implicit class EnhancedMonitoringOutputOps[Self <: EnhancedMonitoringOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentShardLevelMetrics(value: MetricsNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentShardLevelMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentShardLevelMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentShardLevelMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredShardLevelMetrics(value: MetricsNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredShardLevelMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredShardLevelMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredShardLevelMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamName(value: StreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamName")(js.undefined)
        ret
    }
  }
  
}

