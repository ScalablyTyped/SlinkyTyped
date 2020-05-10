package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableEnhancedMonitoringInput extends js.Object {
  /**
    * List of shard-level metrics to enable. The following are the valid shard-level metrics. The value "ALL" enables every metric.    IncomingBytes     IncomingRecords     OutgoingBytes     OutgoingRecords     WriteProvisionedThroughputExceeded     ReadProvisionedThroughputExceeded     IteratorAgeMilliseconds     ALL    For more information, see Monitoring the Amazon Kinesis Data Streams Service with Amazon CloudWatch in the Amazon Kinesis Data Streams Developer Guide.
    */
  var ShardLevelMetrics: MetricsNameList = js.native
  /**
    * The name of the stream for which to enable enhanced monitoring.
    */
  var StreamName: typingsSlinky.awsSdk.kinesisMod.StreamName = js.native
}

object EnableEnhancedMonitoringInput {
  @scala.inline
  def apply(ShardLevelMetrics: MetricsNameList, StreamName: StreamName): EnableEnhancedMonitoringInput = {
    val __obj = js.Dynamic.literal(ShardLevelMetrics = ShardLevelMetrics.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableEnhancedMonitoringInput]
  }
  @scala.inline
  implicit class EnableEnhancedMonitoringInputOps[Self <: EnableEnhancedMonitoringInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShardLevelMetrics(value: MetricsNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShardLevelMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamName(value: StreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

