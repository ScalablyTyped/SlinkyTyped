package typingsSlinky.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsRequest extends js.Object {
  /**
    * Specifies the ARN of the trail from which tags should be removed. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var ResourceId: String = js.native
  /**
    * Specifies a list of tags to be removed.
    */
  var TagsList: js.UndefOr[typingsSlinky.awsSdk.cloudtrailMod.TagsList] = js.native
}

object RemoveTagsRequest {
  @scala.inline
  def apply(ResourceId: String): RemoveTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsRequest]
  }
  @scala.inline
  implicit class RemoveTagsRequestOps[Self <: RemoveTagsRequest] (val x: Self) extends AnyVal {
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

