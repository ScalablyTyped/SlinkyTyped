package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImageRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the image that you want to retrieve. 
    */
  var imageBuildVersionArn: ImageBuildVersionArn = js.native
}

object GetImageRequest {
  @scala.inline
  def apply(imageBuildVersionArn: ImageBuildVersionArn): GetImageRequest = {
    val __obj = js.Dynamic.literal(imageBuildVersionArn = imageBuildVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageRequest]
  }
  @scala.inline
  implicit class GetImageRequestOps[Self <: GetImageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageBuildVersionArn(value: ImageBuildVersionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageBuildVersionArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

