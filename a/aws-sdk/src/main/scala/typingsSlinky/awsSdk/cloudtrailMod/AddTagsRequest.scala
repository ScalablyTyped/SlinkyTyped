package typingsSlinky.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsRequest extends js.Object {
  /**
    * Specifies the ARN of the trail to which one or more tags will be added. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var ResourceId: String = js.native
  /**
    * Contains a list of CloudTrail tags, up to a limit of 50
    */
  var TagsList: js.UndefOr[typingsSlinky.awsSdk.cloudtrailMod.TagsList] = js.native
}

object AddTagsRequest {
  @scala.inline
  def apply(ResourceId: String): AddTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsRequest]
  }
  @scala.inline
  implicit class AddTagsRequestOps[Self <: AddTagsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagsList(value: TagsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagsList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagsList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagsList")(js.undefined)
        ret
    }
  }
  
}

