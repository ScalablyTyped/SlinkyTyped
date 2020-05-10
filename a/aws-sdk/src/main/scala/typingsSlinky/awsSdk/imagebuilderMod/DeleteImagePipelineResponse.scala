package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteImagePipelineResponse extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the image pipeline that was deleted. 
    */
  var imagePipelineArn: js.UndefOr[ImagePipelineArn] = js.native
  /**
    *  The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object DeleteImagePipelineResponse {
  @scala.inline
  def apply(): DeleteImagePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteImagePipelineResponse]
  }
  @scala.inline
  implicit class DeleteImagePipelineResponseOps[Self <: DeleteImagePipelineResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutImagePipelineArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePipelineArn")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(js.undefined)
        ret
    }
  }
  
}

