package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserHierarchyRequest extends js.Object {
  /**
    * The identifier of the hierarchy group.
    */
  var HierarchyGroupId: js.UndefOr[typingsSlinky.awsSdk.connectMod.HierarchyGroupId] = js.native
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsSlinky.awsSdk.connectMod.InstanceId = js.native
  /**
    * The identifier of the user account.
    */
  var UserId: typingsSlinky.awsSdk.connectMod.UserId = js.native
}

object UpdateUserHierarchyRequest {
  @scala.inline
  def apply(InstanceId: InstanceId, UserId: UserId): UpdateUserHierarchyRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserHierarchyRequest]
  }
  @scala.inline
  implicit class UpdateUserHierarchyRequestOps[Self <: UpdateUserHierarchyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: UserId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHierarchyGroupId(value: HierarchyGroupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HierarchyGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHierarchyGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HierarchyGroupId")(js.undefined)
        ret
    }
  }
  
}

