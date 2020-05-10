package typingsSlinky.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGroupInput extends js.Object {
  /**
    * The description of the resource group. Descriptions can have a maximum of 511 characters, including letters, numbers, hyphens, underscores, punctuation, and spaces.
    */
  var Description: js.UndefOr[GroupDescription] = js.native
  /**
    * The name of the group, which is the identifier of the group in other operations. A resource group name cannot be updated after it is created. A resource group name can have a maximum of 128 characters, including letters, numbers, hyphens, dots, and underscores. The name cannot start with AWS or aws; these are reserved. A resource group name must be unique within your account.
    */
  var Name: GroupName = js.native
  /**
    * The resource query that determines which AWS resources are members of this group.
    */
  var ResourceQuery: typingsSlinky.awsSdk.resourcegroupsMod.ResourceQuery = js.native
  /**
    * The tags to add to the group. A tag is a string-to-string map of key-value pairs. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.Tags] = js.native
}

object CreateGroupInput {
  @scala.inline
  def apply(Name: GroupName, ResourceQuery: ResourceQuery): CreateGroupInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ResourceQuery = ResourceQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupInput]
  }
  @scala.inline
  implicit class CreateGroupInputOps[Self <: CreateGroupInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: GroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceQuery(value: ResourceQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: GroupDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
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
  }
  
}

