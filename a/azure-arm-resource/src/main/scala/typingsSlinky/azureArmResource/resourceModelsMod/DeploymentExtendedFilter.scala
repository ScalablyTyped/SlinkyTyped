package typingsSlinky.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentExtendedFilter extends js.Object {
  /**
    * The provisioning state.
    */
  var provisioningState: js.UndefOr[String] = js.native
}

object DeploymentExtendedFilter {
  @scala.inline
  def apply(): DeploymentExtendedFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentExtendedFilter]
  }
  @scala.inline
  implicit class DeploymentExtendedFilterOps[Self <: DeploymentExtendedFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvisioningState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisioningState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisioningState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisioningState")(js.undefined)
        ret
    }
  }
  
}

