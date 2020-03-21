package typingsSlinky.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGroupQueryInput extends js.Object {
  /**
    * The name of the resource group for which you want to edit the query.
    */
  var GroupName: typingsSlinky.awsSdk.resourcegroupsMod.GroupName = js.native
  /**
    * The resource query that determines which AWS resources are members of the resource group.
    */
  var ResourceQuery: typingsSlinky.awsSdk.resourcegroupsMod.ResourceQuery = js.native
}

object UpdateGroupQueryInput {
  @scala.inline
  def apply(GroupName: GroupName, ResourceQuery: ResourceQuery): UpdateGroupQueryInput = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], ResourceQuery = ResourceQuery.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateGroupQueryInput]
  }
}

