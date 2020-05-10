package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExclusionsPreviewResponse extends js.Object {
  /**
    * Information about the exclusions included in the preview.
    */
  var exclusionPreviews: js.UndefOr[ExclusionPreviewList] = js.native
  /**
    * When a response is generated, if there is more data to be listed, this parameters is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * Specifies the status of the request to generate an exclusions preview.
    */
  var previewStatus: PreviewStatus = js.native
}

object GetExclusionsPreviewResponse {
  @scala.inline
  def apply(previewStatus: PreviewStatus): GetExclusionsPreviewResponse = {
    val __obj = js.Dynamic.literal(previewStatus = previewStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExclusionsPreviewResponse]
  }
  @scala.inline
  implicit class GetExclusionsPreviewResponseOps[Self <: GetExclusionsPreviewResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreviewStatus(value: PreviewStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExclusionPreviews(value: ExclusionPreviewList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusionPreviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusionPreviews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusionPreviews")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

