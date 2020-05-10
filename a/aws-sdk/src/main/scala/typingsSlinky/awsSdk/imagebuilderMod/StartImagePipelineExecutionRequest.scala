package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartImagePipelineExecutionRequest extends js.Object {
  /**
    *  The idempotency token used to make this request idempotent. 
    */
  var clientToken: ClientToken = js.native
  /**
    *  The Amazon Resource Name (ARN) of the image pipeline that you want to manually invoke. 
    */
  var imagePipelineArn: ImagePipelineArn = js.native
}

object StartImagePipelineExecutionRequest {
  @scala.inline
  def apply(clientToken: ClientToken, imagePipelineArn: ImagePipelineArn): StartImagePipelineExecutionRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], imagePipelineArn = imagePipelineArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartImagePipelineExecutionRequest]
  }
  @scala.inline
  implicit class StartImagePipelineExecutionRequestOps[Self <: StartImagePipelineExecutionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientToken(value: ClientToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImagePipelineArn(value: ImagePipelineArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePipelineArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

