package typingsSlinky.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Upload line items response.
  */
@js.native
trait SchemaUploadLineItemsResponse extends js.Object {
  /**
    * Status of upload.
    */
  var uploadStatus: js.UndefOr[SchemaUploadStatus] = js.native
}

object SchemaUploadLineItemsResponse {
  @scala.inline
  def apply(): SchemaUploadLineItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadLineItemsResponse]
  }
  @scala.inline
  implicit class SchemaUploadLineItemsResponseOps[Self <: SchemaUploadLineItemsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUploadStatus(value: SchemaUploadStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadStatus")(js.undefined)
        ret
    }
  }
  
}

