package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeResourceGroupsResponse extends js.Object {
  /**
    * Resource group details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems = js.native
  /**
    * Information about a resource group.
    */
  var resourceGroups: ResourceGroupList = js.native
}

object DescribeResourceGroupsResponse {
  @scala.inline
  def apply(failedItems: FailedItems, resourceGroups: ResourceGroupList): DescribeResourceGroupsResponse = {
    val __obj = js.Dynamic.literal(failedItems = failedItems.asInstanceOf[js.Any], resourceGroups = resourceGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResourceGroupsResponse]
  }
  @scala.inline
  implicit class DescribeResourceGroupsResponseOps[Self <: DescribeResourceGroupsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedItems(value: FailedItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceGroups(value: ResourceGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceGroups")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

