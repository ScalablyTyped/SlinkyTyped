package typingsSlinky.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceInput extends js.Object {
  /**
    * The ARN of the signaling channel from which you want to remove tags.
    */
  var ResourceARN: typingsSlinky.awsSdk.kinesisvideoMod.ResourceARN = js.native
  /**
    * A list of the keys of the tags that you want to remove.
    */
  var TagKeyList: typingsSlinky.awsSdk.kinesisvideoMod.TagKeyList = js.native
}

object UntagResourceInput {
  @scala.inline
  def apply(ResourceARN: ResourceARN, TagKeyList: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], TagKeyList = TagKeyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceInput]
  }
  @scala.inline
  implicit class UntagResourceInputOps[Self <: UntagResourceInput] (val x: Self) extends AnyVal {
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
    def withTagKeyList(value: TagKeyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagKeyList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

