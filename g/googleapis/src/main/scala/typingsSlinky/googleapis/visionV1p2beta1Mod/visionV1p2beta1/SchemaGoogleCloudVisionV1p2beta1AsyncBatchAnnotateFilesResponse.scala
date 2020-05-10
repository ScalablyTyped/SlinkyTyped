package typingsSlinky.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to an async batch file annotation request.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesResponse extends js.Object {
  /**
    * The list of file annotation responses, one for each request in
    * AsyncBatchAnnotateFilesRequest.
    */
  var responses: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse]] = js.native
}

object SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesResponseOps[Self <: SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponses(value: js.Array[SchemaGoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse]): Self = {
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

