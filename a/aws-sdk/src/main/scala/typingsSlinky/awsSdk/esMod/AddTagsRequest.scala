package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsRequest extends js.Object {
  /**
    *  Specify the ARN for which you want to add the tags.
    */
  var ARN: typingsSlinky.awsSdk.esMod.ARN = js.native
  /**
    *  List of Tag that need to be added for the Elasticsearch domain. 
    */
  var TagList: typingsSlinky.awsSdk.esMod.TagList = js.native
}

object AddTagsRequest {
  @scala.inline
  def apply(ARN: ARN, TagList: TagList): AddTagsRequest = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], TagList = TagList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsRequest]
  }
  @scala.inline
  implicit class AddTagsRequestOps[Self <: AddTagsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARN(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagList(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

