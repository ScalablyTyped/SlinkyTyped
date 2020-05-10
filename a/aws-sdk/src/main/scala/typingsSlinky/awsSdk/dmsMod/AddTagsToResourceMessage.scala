package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsToResourceMessage extends js.Object {
  /**
    * Identifies the AWS DMS resource to which tags should be added. The value for this parameter is an Amazon Resource Name (ARN). For AWS DMS, you can tag a replication instance, an endpoint, or a replication task.
    */
  var ResourceArn: String = js.native
  /**
    * One or more tags to be assigned to the resource.
    */
  var Tags: TagList = js.native
}

object AddTagsToResourceMessage {
  @scala.inline
  def apply(ResourceArn: String, Tags: TagList): AddTagsToResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsToResourceMessage]
  }
  @scala.inline
  implicit class AddTagsToResourceMessageOps[Self <: AddTagsToResourceMessage] (val x: Self) extends AnyVal {
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
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

