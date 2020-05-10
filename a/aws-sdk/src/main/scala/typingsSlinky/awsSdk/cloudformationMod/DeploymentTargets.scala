package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentTargets extends js.Object {
  /**
    * The names of one or more AWS accounts for which you want to deploy stack set updates.
    */
  var Accounts: js.UndefOr[AccountList] = js.native
  /**
    * The organization root ID or organizational unit (OUs) IDs to which StackSets deploys.
    */
  var OrganizationalUnitIds: js.UndefOr[OrganizationalUnitIdList] = js.native
}

object DeploymentTargets {
  @scala.inline
  def apply(): DeploymentTargets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentTargets]
  }
  @scala.inline
  implicit class DeploymentTargetsOps[Self <: DeploymentTargets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccounts(value: AccountList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accounts")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizationalUnitIds(value: OrganizationalUnitIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationalUnitIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationalUnitIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationalUnitIds")(js.undefined)
        ret
    }
  }
  
}

