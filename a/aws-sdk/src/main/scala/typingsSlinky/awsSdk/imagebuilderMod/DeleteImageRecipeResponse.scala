package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteImageRecipeResponse extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the image recipe that was deleted. 
    */
  var imageRecipeArn: js.UndefOr[ImageRecipeArn] = js.native
  /**
    *  The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object DeleteImageRecipeResponse {
  @scala.inline
  def apply(): DeleteImageRecipeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteImageRecipeResponse]
  }
  @scala.inline
  implicit class DeleteImageRecipeResponseOps[Self <: DeleteImageRecipeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageRecipeArn(value: ImageRecipeArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageRecipeArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageRecipeArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageRecipeArn")(js.undefined)
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

