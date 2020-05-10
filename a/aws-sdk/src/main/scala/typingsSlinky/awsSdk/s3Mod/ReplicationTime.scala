package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationTime extends js.Object {
  /**
    *  Specifies whether the replication time is enabled. 
    */
  var Status: ReplicationTimeStatus = js.native
  /**
    *  A container specifying the time by which replication should be complete for all objects and operations on objects. 
    */
  var Time: ReplicationTimeValue = js.native
}

object ReplicationTime {
  @scala.inline
  def apply(Status: ReplicationTimeStatus, Time: ReplicationTimeValue): ReplicationTime = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationTime]
  }
  @scala.inline
  implicit class ReplicationTimeOps[Self <: ReplicationTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: ReplicationTimeStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: ReplicationTimeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

