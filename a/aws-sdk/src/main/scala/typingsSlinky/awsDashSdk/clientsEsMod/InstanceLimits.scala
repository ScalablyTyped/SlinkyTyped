package typingsSlinky.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceLimits extends js.Object {
  var InstanceCountLimits: js.UndefOr[typingsSlinky.awsDashSdk.clientsEsMod.InstanceCountLimits] = js.native
}

object InstanceLimits {
  @scala.inline
  def apply(InstanceCountLimits: InstanceCountLimits = null): InstanceLimits = {
    val __obj = js.Dynamic.literal()
    if (InstanceCountLimits != null) __obj.updateDynamic("InstanceCountLimits")(InstanceCountLimits.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceLimits]
  }
}

