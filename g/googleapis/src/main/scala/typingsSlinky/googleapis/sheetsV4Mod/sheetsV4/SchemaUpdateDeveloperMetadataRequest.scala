package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to update properties of developer metadata. Updates the
  * properties of the developer metadata selected by the filters to the values
  * provided in the DeveloperMetadata resource.  Callers must specify the
  * properties they wish to update in the fields parameter, as well as specify
  * at least one DataFilter matching the metadata they wish to update.
  */
@js.native
trait SchemaUpdateDeveloperMetadataRequest extends js.Object {
  /**
    * The filters matching the developer metadata entries to update.
    */
  var dataFilters: js.UndefOr[js.Array[SchemaDataFilter]] = js.native
  /**
    * The value that all metadata matched by the data filters will be updated
    * to.
    */
  var developerMetadata: js.UndefOr[SchemaDeveloperMetadata] = js.native
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `developerMetadata` is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
}

object SchemaUpdateDeveloperMetadataRequest {
  @scala.inline
  def apply(): SchemaUpdateDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateDeveloperMetadataRequest]
  }
  @scala.inline
  implicit class SchemaUpdateDeveloperMetadataRequestOps[Self <: SchemaUpdateDeveloperMetadataRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataFilters(value: js.Array[SchemaDataFilter]): Self = {
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
    def withDeveloperMetadata(value: SchemaDeveloperMetadata): Self = {
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

