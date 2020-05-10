package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metrics extends js.Object {
  /**
    *  A container specifying the time threshold for emitting the s3:Replication:OperationMissedThreshold event. 
    */
  var EventThreshold: ReplicationTimeValue = js.native
  /**
    *  Specifies whether the replication metrics are enabled. 
    */
  var Status: MetricsStatus = js.native
}

object Metrics {
  @scala.inline
  def apply(EventThreshold: ReplicationTimeValue, Status: MetricsStatus): Metrics = {
    val __obj = js.Dynamic.literal(EventThreshold = EventThreshold.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metrics]
  }
  @scala.inline
  implicit class MetricsOps[Self <: Metrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventThreshold(value: ReplicationTimeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: MetricsStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

