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
  def apply(GroupArn: GroupArn = null, GroupName: GroupName = null): GroupIdentifier = {
    val __obj = js.Dynamic.literal()
    if (GroupArn != null) __obj.updateDynamic("GroupArn")(GroupArn.asInstanceOf[js.Any])
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupIdentifier]
  }
}

