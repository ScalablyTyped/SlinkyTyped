package typingsSlinky.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for a request to delete attachments.
  */
@js.native
trait SchemaDeleteAttachmentsResponse extends js.Object {
  /**
    * The number of attachments that were deleted.
    */
  var numDeleted: js.UndefOr[Double] = js.native
}

object SchemaDeleteAttachmentsResponse {
  @scala.inline
  def apply(): SchemaDeleteAttachmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteAttachmentsResponse]
  }
  @scala.inline
  implicit class SchemaDeleteAttachmentsResponseOps[Self <: SchemaDeleteAttachmentsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumDeleted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numDeleted")(js.undefined)
        ret
    }
  }
  
}

