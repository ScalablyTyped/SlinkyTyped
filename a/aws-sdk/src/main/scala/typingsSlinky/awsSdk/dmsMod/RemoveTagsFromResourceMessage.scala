package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsFromResourceMessage extends js.Object {
  /**
    * An AWS DMS resource from which you want to remove tag(s). The value for this parameter is an Amazon Resource Name (ARN).
    */
  var ResourceArn: String = js.native
  /**
    * The tag key (name) of the tag to be removed.
    */
  var TagKeys: KeyList = js.native
}

object RemoveTagsFromResourceMessage {
  @scala.inline
  def apply(ResourceArn: String, TagKeys: KeyList): RemoveTagsFromResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromResourceMessage]
  }
  @scala.inline
  implicit class RemoveTagsFromResourceMessageOps[Self <: RemoveTagsFromResourceMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagKeys(value: KeyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagKeys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

