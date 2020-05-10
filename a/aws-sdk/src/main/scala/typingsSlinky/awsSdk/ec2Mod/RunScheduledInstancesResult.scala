package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunScheduledInstancesResult extends js.Object {
  /**
    * The IDs of the newly launched instances.
    */
  var InstanceIdSet: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InstanceIdSet] = js.native
}

object RunScheduledInstancesResult {
  @scala.inline
  def apply(): RunScheduledInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunScheduledInstancesResult]
  }
  @scala.inline
  implicit class RunScheduledInstancesResultOps[Self <: RunScheduledInstancesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceIdSet(value: InstanceIdSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceIdSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceIdSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceIdSet")(js.undefined)
        ret
    }
  }
  
}

