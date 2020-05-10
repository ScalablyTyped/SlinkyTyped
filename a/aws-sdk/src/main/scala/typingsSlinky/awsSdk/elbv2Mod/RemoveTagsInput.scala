package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArns: typingsSlinky.awsSdk.elbv2Mod.ResourceArns = js.native
  /**
    * The tag keys for the tags to remove.
    */
  var TagKeys: typingsSlinky.awsSdk.elbv2Mod.TagKeys = js.native
}

object RemoveTagsInput {
  @scala.inline
  def apply(ResourceArns: ResourceArns, TagKeys: TagKeys): RemoveTagsInput = {
    val __obj = js.Dynamic.literal(ResourceArns = ResourceArns.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsInput]
  }
  @scala.inline
  implicit class RemoveTagsInputOps[Self <: RemoveTagsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceArns(value: ResourceArns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagKeys(value: TagKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagKeys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

