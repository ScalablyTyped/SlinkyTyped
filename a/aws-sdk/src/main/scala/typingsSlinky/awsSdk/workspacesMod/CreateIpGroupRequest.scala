package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIpGroupRequest extends js.Object {
  /**
    * The description of the group.
    */
  var GroupDesc: js.UndefOr[IpGroupDesc] = js.native
  /**
    * The name of the group.
    */
  var GroupName: IpGroupName = js.native
  /**
    * The tags. Each WorkSpaces resource can have a maximum of 50 tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The rules to add to the group.
    */
  var UserRules: js.UndefOr[IpRuleList] = js.native
}

object CreateIpGroupRequest {
  @scala.inline
  def apply(GroupName: IpGroupName): CreateIpGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIpGroupRequest]
  }
  @scala.inline
  implicit class CreateIpGroupRequestOps[Self <: CreateIpGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupName(value: IpGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupDesc(value: IpGroupDesc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupDesc")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withUserRules(value: IpRuleList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserRules")(js.undefined)
        ret
    }
  }
  
}

