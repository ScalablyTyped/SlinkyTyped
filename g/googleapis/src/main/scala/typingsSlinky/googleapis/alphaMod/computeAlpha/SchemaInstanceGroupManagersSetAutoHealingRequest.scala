package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupManagersSetAutoHealingRequest extends js.Object {
  var autoHealingPolicies: js.UndefOr[js.Array[SchemaInstanceGroupManagerAutoHealingPolicy]] = js.native
}

object SchemaInstanceGroupManagersSetAutoHealingRequest {
  @scala.inline
  def apply(): SchemaInstanceGroupManagersSetAutoHealingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagersSetAutoHealingRequest]
  }
  @scala.inline
  implicit class SchemaInstanceGroupManagersSetAutoHealingRequestOps[Self <: SchemaInstanceGroupManagersSetAutoHealingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoHealingPolicies(value: js.Array[SchemaInstanceGroupManagerAutoHealingPolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHealingPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHealingPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHealingPolicies")(js.undefined)
        ret
    }
  }
  
}

