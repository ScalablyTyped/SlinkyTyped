package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Limits extends js.Object {
  var MaximumPartitionCount: typingsSlinky.awsSdk.cloudsearchMod.MaximumPartitionCount = js.native
  var MaximumReplicationCount: typingsSlinky.awsSdk.cloudsearchMod.MaximumReplicationCount = js.native
}

object Limits {
  @scala.inline
  def apply(MaximumPartitionCount: MaximumPartitionCount, MaximumReplicationCount: MaximumReplicationCount): Limits = {
    val __obj = js.Dynamic.literal(MaximumPartitionCount = MaximumPartitionCount.asInstanceOf[js.Any], MaximumReplicationCount = MaximumReplicationCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limits]
  }
  @scala.inline
  implicit class LimitsOps[Self <: Limits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximumPartitionCount(value: MaximumPartitionCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumPartitionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximumReplicationCount(value: MaximumReplicationCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumReplicationCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

