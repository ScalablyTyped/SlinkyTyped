package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GreenFleetProvisioningOption extends js.Object {
  /**
    * The method used to add instances to a replacement environment.   DISCOVER_EXISTING: Use instances that already exist or will be created manually.   COPY_AUTO_SCALING_GROUP: Use settings from a specified Auto Scaling group to define and create instances in a new Auto Scaling group.  
    */
  var action: js.UndefOr[GreenFleetProvisioningAction] = js.native
}

object GreenFleetProvisioningOption {
  @scala.inline
  def apply(): GreenFleetProvisioningOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GreenFleetProvisioningOption]
  }
  @scala.inline
  implicit class GreenFleetProvisioningOptionOps[Self <: GreenFleetProvisioningOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: GreenFleetProvisioningAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
  }
  
}

