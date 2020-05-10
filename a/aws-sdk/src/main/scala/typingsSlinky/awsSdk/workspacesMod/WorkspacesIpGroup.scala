package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspacesIpGroup extends js.Object {
  /**
    * The description of the group.
    */
  var groupDesc: js.UndefOr[IpGroupDesc] = js.native
  /**
    * The identifier of the group.
    */
  var groupId: js.UndefOr[IpGroupId] = js.native
  /**
    * The name of the group.
    */
  var groupName: js.UndefOr[IpGroupName] = js.native
  /**
    * The rules.
    */
  var userRules: js.UndefOr[IpRuleList] = js.native
}

object WorkspacesIpGroup {
  @scala.inline
  def apply(): WorkspacesIpGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspacesIpGroup]
  }
  @scala.inline
  implicit class WorkspacesIpGroupOps[Self <: WorkspacesIpGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupDesc(value: IpGroupDesc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupDesc")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupId(value: IpGroupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupName(value: IpGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupName")(js.undefined)
        ret
    }
    @scala.inline
    def withUserRules(value: IpRuleList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userRules")(js.undefined)
        ret
    }
  }
  
}

