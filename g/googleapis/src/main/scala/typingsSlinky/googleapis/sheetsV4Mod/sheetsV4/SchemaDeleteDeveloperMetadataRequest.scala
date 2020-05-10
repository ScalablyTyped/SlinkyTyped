package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to delete developer metadata.
  */
@js.native
trait SchemaDeleteDeveloperMetadataRequest extends js.Object {
  /**
    * The data filter describing the criteria used to select which developer
    * metadata entry to delete.
    */
  var dataFilter: js.UndefOr[SchemaDataFilter] = js.native
}

object SchemaDeleteDeveloperMetadataRequest {
  @scala.inline
  def apply(): SchemaDeleteDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteDeveloperMetadataRequest]
  }
  @scala.inline
  implicit class SchemaDeleteDeveloperMetadataRequestOps[Self <: SchemaDeleteDeveloperMetadataRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataFilter(value: SchemaDataFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFilter")(js.undefined)
        ret
    }
  }
  
}

