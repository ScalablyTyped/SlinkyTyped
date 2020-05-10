package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDeveloperMetadataRequest extends js.Object {
  /** The filters matching the developer metadata entries to update. */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.native
  /** The value that all metadata matched by the data filters will be updated to. */
  var developerMetadata: js.UndefOr[DeveloperMetadata] = js.native
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `developerMetadata` is implied and should not be specified.
    * A single `"&#42;"` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
}

object UpdateDeveloperMetadataRequest {
  @scala.inline
  def apply(): UpdateDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeveloperMetadataRequest]
  }
  @scala.inline
  implicit class UpdateDeveloperMetadataRequestOps[Self <: UpdateDeveloperMetadataRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataFilters(value: js.Array[DataFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withDeveloperMetadata(value: DeveloperMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
  }
  
}

