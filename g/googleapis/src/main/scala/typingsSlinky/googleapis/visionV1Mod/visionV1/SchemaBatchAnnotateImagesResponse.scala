package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a batch image annotation request.
  */
@js.native
trait SchemaBatchAnnotateImagesResponse extends js.Object {
  /**
    * Individual responses to image annotation requests within the batch.
    */
  var responses: js.UndefOr[js.Array[SchemaAnnotateImageResponse]] = js.native
}

object SchemaBatchAnnotateImagesResponse {
  @scala.inline
  def apply(): SchemaBatchAnnotateImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchAnnotateImagesResponse]
  }
  @scala.inline
  implicit class SchemaBatchAnnotateImagesResponseOps[Self <: SchemaBatchAnnotateImagesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponses(value: js.Array[SchemaAnnotateImageResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responses")(js.undefined)
        ret
    }
  }
  
}

