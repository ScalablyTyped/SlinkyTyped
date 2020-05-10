package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResponse extends js.Object {
  var TagsModel: typingsSlinky.awsSdk.pinpointMod.TagsModel = js.native
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(TagsModel: TagsModel): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal(TagsModel = TagsModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
  @scala.inline
  implicit class ListTagsForResourceResponseOps[Self <: ListTagsForResourceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTagsModel(value: TagsModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagsModel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

