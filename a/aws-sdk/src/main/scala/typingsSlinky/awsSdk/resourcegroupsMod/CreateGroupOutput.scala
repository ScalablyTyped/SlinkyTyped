package typingsSlinky.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGroupOutput extends js.Object {
  /**
    * A full description of the resource group after it is created.
    */
  var Group: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.Group] = js.native
  /**
    * The resource query associated with the group.
    */
  var ResourceQuery: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.ResourceQuery] = js.native
  /**
    * The tags associated with the group.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.Tags] = js.native
}

object CreateGroupOutput {
  @scala.inline
  def apply(): CreateGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGroupOutput]
  }
  @scala.inline
  implicit class CreateGroupOutputOps[Self <: CreateGroupOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroup(value: Group): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Group")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceQuery(value: ResourceQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceQuery")(js.undefined)
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

