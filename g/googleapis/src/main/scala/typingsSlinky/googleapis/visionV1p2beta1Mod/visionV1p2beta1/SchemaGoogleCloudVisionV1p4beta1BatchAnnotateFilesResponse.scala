package typingsSlinky.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of file annotation responses.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse extends js.Object {
  /**
    * The list of file annotation responses, each response corresponding to
    * each AnnotateFileRequest in BatchAnnotateFilesRequest.
    */
  var responses: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1AnnotateFileResponse]] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1BatchAnnotateFilesResponseOps[Self <: SchemaGoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponses(value: js.Array[SchemaGoogleCloudVisionV1p4beta1AnnotateFileResponse]): Self = {
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

