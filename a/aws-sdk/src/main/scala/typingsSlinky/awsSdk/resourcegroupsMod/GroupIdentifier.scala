package typingsSlinky.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupIdentifier extends js.Object {
  /**
    * The ARN of a resource group.
    */
  var GroupArn: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.GroupArn] = js.native
  /**
    * The name of a resource group.
    */
  var GroupName: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.GroupName] = js.native
}

object GroupIdentifier {
  @scala.inline
  def apply(): GroupIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupIdentifier]
  }
  @scala.inline
  implicit class GroupIdentifierOps[Self <: GroupIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupArn(value: GroupArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupName(value: GroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(js.undefined)
        ret
    }
  }
  
}

