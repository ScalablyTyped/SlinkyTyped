package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateIpGroupsRequest extends js.Object {
  /**
    * The identifier of the directory.
    */
  var DirectoryId: typingsSlinky.awsSdk.workspacesMod.DirectoryId = js.native
  /**
    * The identifiers of one or more IP access control groups.
    */
  var GroupIds: IpGroupIdList = js.native
}

object DisassociateIpGroupsRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, GroupIds: IpGroupIdList): DisassociateIpGroupsRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], GroupIds = GroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateIpGroupsRequest]
  }
  @scala.inline
  implicit class DisassociateIpGroupsRequestOps[Self <: DisassociateIpGroupsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupIds(value: IpGroupIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

