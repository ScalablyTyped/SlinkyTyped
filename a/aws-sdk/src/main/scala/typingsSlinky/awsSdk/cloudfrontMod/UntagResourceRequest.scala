package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    *  An ARN of a CloudFront resource.
    */
  var Resource: ResourceARN = js.native
  /**
    *  A complex type that contains zero or more Tag key elements.
    */
  var TagKeys: typingsSlinky.awsSdk.cloudfrontMod.TagKeys = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(Resource: ResourceARN, TagKeys: TagKeys): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  @scala.inline
  implicit class UntagResourceRequestOps[Self <: UntagResourceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResource(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resource")(value.asInstanceOf[js.Any])
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

