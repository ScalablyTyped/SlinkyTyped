package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountModification extends js.Object {
  /**
    * The IP address range, specified as an IPv4 CIDR block, for the management network interface used for the account.
    */
  var DedicatedTenancyManagementCidrRange: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.DedicatedTenancyManagementCidrRange] = js.native
  /**
    * The status of BYOL (whether BYOL is being enabled or disabled).
    */
  var DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportResultEnum] = js.native
  /**
    * The error code that is returned if the configuration of BYOL cannot be modified.
    */
  var ErrorCode: js.UndefOr[WorkspaceErrorCode] = js.native
  /**
    * The text of the error message that is returned if the configuration of BYOL cannot be modified.
    */
  var ErrorMessage: js.UndefOr[Description] = js.native
  /**
    * The state of the modification to the configuration of BYOL.
    */
  var ModificationState: js.UndefOr[DedicatedTenancyModificationStateEnum] = js.native
  /**
    * The timestamp when the modification of the BYOL configuration was started.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
}

object AccountModification {
  @scala.inline
  def apply(): AccountModification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountModification]
  }
  @scala.inline
  implicit class AccountModificationOps[Self <: AccountModification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDedicatedTenancyManagementCidrRange(value: DedicatedTenancyManagementCidrRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DedicatedTenancyManagementCidrRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDedicatedTenancyManagementCidrRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DedicatedTenancyManagementCidrRange")(js.undefined)
        ret
    }
    @scala.inline
    def withDedicatedTenancySupport(value: DedicatedTenancySupportResultEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DedicatedTenancySupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDedicatedTenancySupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DedicatedTenancySupport")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorCode(value: WorkspaceErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withModificationState(value: DedicatedTenancyModificationStateEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModificationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModificationState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModificationState")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(js.undefined)
        ret
    }
  }
  
}

