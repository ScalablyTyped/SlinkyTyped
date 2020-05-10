package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteImagePipelineRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the image pipeline to delete. 
    */
  var imagePipelineArn: ImagePipelineArn = js.native
}

object DeleteImagePipelineRequest {
  @scala.inline
  def apply(imagePipelineArn: ImagePipelineArn): DeleteImagePipelineRequest = {
    val __obj = js.Dynamic.literal(imagePipelineArn = imagePipelineArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImagePipelineRequest]
  }
  @scala.inline
  implicit class DeleteImagePipelineRequestOps[Self <: DeleteImagePipelineRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImagePipelineArn(value: ImagePipelineArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePipelineArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

