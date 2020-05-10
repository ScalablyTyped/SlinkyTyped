package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsFromResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource you want to remove the tags from.
    */
  var ResourceARN: typingsSlinky.awsSdk.storagegatewayMod.ResourceARN = js.native
  /**
    * The keys of the tags you want to remove from the specified resource. A tag is composed of a key/value pair.
    */
  var TagKeys: typingsSlinky.awsSdk.storagegatewayMod.TagKeys = js.native
}

object RemoveTagsFromResourceInput {
  @scala.inline
  def apply(ResourceARN: ResourceARN, TagKeys: TagKeys): RemoveTagsFromResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromResourceInput]
  }
  @scala.inline
  implicit class RemoveTagsFromResourceInputOps[Self <: RemoveTagsFromResourceInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceARN(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceARN")(value.asInstanceOf[js.Any])
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

