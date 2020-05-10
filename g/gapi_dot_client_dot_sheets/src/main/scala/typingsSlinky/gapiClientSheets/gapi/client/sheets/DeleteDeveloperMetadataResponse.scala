package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDeveloperMetadataResponse extends js.Object {
  /** The metadata that was deleted. */
  var deletedDeveloperMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.native
}

object DeleteDeveloperMetadataResponse {
  @scala.inline
  def apply(): DeleteDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDeveloperMetadataResponse]
  }
  @scala.inline
  implicit class DeleteDeveloperMetadataResponseOps[Self <: DeleteDeveloperMetadataResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletedDeveloperMetadata(value: js.Array[DeveloperMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedDeveloperMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletedDeveloperMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedDeveloperMetadata")(js.undefined)
        ret
    }
  }
  
}

