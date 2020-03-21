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
  def apply(InstanceIdSet: InstanceIdSet = null): RunScheduledInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceIdSet != null) __obj.updateDynamic("InstanceIdSet")(InstanceIdSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunScheduledInstancesResult]
  }
}

