package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisioningArtifactPreferences extends js.Object {
  /**
    * One or more AWS accounts where stack instances are deployed from the stack set. These accounts can be scoped in ProvisioningPreferences$StackSetAccounts and UpdateProvisioningPreferences$StackSetAccounts. Applicable only to a CFN_STACKSET provisioned product type.
    */
  var StackSetAccounts: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.StackSetAccounts] = js.native
  /**
    * One or more AWS Regions where stack instances are deployed from the stack set. These regions can be scoped in ProvisioningPreferences$StackSetRegions and UpdateProvisioningPreferences$StackSetRegions. Applicable only to a CFN_STACKSET provisioned product type.
    */
  var StackSetRegions: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.StackSetRegions] = js.native
}

object ProvisioningArtifactPreferences {
  @scala.inline
  def apply(): ProvisioningArtifactPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningArtifactPreferences]
  }
  @scala.inline
  implicit class ProvisioningArtifactPreferencesOps[Self <: ProvisioningArtifactPreferences] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackSetAccounts(value: StackSetAccounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackSetAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetAccounts")(js.undefined)
        ret
    }
    @scala.inline
    def withStackSetRegions(value: StackSetRegions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetRegions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackSetRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetRegions")(js.undefined)
        ret
    }
  }
  
}

