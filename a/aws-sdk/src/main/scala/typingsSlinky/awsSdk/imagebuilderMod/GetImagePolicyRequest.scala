package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImagePolicyRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the image whose policy you want to retrieve. 
    */
  var imageArn: ImageBuildVersionArn = js.native
}

object GetImagePolicyRequest {
  @scala.inline
  def apply(imageArn: ImageBuildVersionArn): GetImagePolicyRequest = {
    val __obj = js.Dynamic.literal(imageArn = imageArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImagePolicyRequest]
  }
  @scala.inline
  implicit class GetImagePolicyRequestOps[Self <: GetImagePolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageArn(value: ImageBuildVersionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

