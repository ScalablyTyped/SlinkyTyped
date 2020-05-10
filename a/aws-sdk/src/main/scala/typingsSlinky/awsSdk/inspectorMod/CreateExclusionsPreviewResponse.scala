package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateExclusionsPreviewResponse extends js.Object {
  /**
    * Specifies the unique identifier of the requested exclusions preview. You can use the unique identifier to retrieve the exclusions preview when running the GetExclusionsPreview API.
    */
  var previewToken: UUID = js.native
}

object CreateExclusionsPreviewResponse {
  @scala.inline
  def apply(previewToken: UUID): CreateExclusionsPreviewResponse = {
    val __obj = js.Dynamic.literal(previewToken = previewToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExclusionsPreviewResponse]
  }
  @scala.inline
  implicit class CreateExclusionsPreviewResponseOps[Self <: CreateExclusionsPreviewResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreviewToken(value: UUID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewToken")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

