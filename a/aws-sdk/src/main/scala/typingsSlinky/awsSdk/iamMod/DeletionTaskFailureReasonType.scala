package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletionTaskFailureReasonType extends js.Object {
  /**
    * A short description of the reason that the service-linked role deletion failed.
    */
  var Reason: js.UndefOr[ReasonType] = js.native
  /**
    * A list of objects that contains details about the service-linked role deletion failure, if that information is returned by the service. If the service-linked role has active sessions or if any resources that were used by the role have not been deleted from the linked service, the role can't be deleted. This parameter includes a list of the resources that are associated with the role and the Region in which the resources are being used.
    */
  var RoleUsageList: js.UndefOr[RoleUsageListType] = js.native
}

object DeletionTaskFailureReasonType {
  @scala.inline
  def apply(): DeletionTaskFailureReasonType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletionTaskFailureReasonType]
  }
  @scala.inline
  implicit class DeletionTaskFailureReasonTypeOps[Self <: DeletionTaskFailureReasonType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReason(value: ReasonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleUsageList(value: RoleUsageListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleUsageList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleUsageList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleUsageList")(js.undefined)
        ret
    }
  }
  
}

