package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceInput extends js.Object {
  /**
    * An ARN that uniquely identifies a resource. The format of the ARN depends on the type of the tagged resource.
    */
  var ResourceArn: ARN = js.native
  /**
    * A list of keys to identify which key-value tags to remove from a resource.
    */
  var TagKeyList: typingsSlinky.awsSdk.backupMod.TagKeyList = js.native
}

object UntagResourceInput {
  @scala.inline
  def apply(ResourceArn: ARN, TagKeyList: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeyList = TagKeyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceInput]
  }
  @scala.inline
  implicit class UntagResourceInputOps[Self <: UntagResourceInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArn")(value.asInstanceOf[js.Any])
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

