package typingsSlinky.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourcesInput extends js.Object {
  /**
    * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. You can specify a minimum of 1 and a maximum of 20 ARNs (resources) to untag. An ARN can be set to a maximum of 1600 characters. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var ResourceARNList: typingsSlinky.awsSdk.resourcegroupstaggingapiMod.ResourceARNList = js.native
  /**
    * A list of the tag keys that you want to remove from the specified resources.
    */
  var TagKeys: TagKeyListForUntag = js.native
}

object UntagResourcesInput {
  @scala.inline
  def apply(ResourceARNList: ResourceARNList, TagKeys: TagKeyListForUntag): UntagResourcesInput = {
    val __obj = js.Dynamic.literal(ResourceARNList = ResourceARNList.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourcesInput]
  }
  @scala.inline
  implicit class UntagResourcesInputOps[Self <: UntagResourcesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceARNList(value: ResourceARNList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceARNList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagKeys(value: TagKeyListForUntag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagKeys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

