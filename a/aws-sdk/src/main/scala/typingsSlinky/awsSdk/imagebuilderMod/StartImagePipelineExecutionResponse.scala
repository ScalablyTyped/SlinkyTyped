package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartImagePipelineExecutionResponse extends js.Object {
  /**
    *  The idempotency token used to make this request idempotent.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the image that was created by this request.
    */
  var imageBuildVersionArn: js.UndefOr[ImageBuildVersionArn] = js.native
  /**
    *  The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object StartImagePipelineExecutionResponse {
  @scala.inline
  def apply(): StartImagePipelineExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartImagePipelineExecutionResponse]
  }
  @scala.inline
  implicit class StartImagePipelineExecutionResponseOps[Self <: StartImagePipelineExecutionResponse] (val x: Self) extends AnyVal {
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
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientToken")(js.undefined)
        ret
    }
    @scala.inline
    def withImageBuildVersionArn(value: ImageBuildVersionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageBuildVersionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageBuildVersionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageBuildVersionArn")(js.undefined)
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

