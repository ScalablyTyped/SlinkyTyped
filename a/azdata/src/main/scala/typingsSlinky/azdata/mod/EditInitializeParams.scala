package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditInitializeParams extends IEditSessionOperationParams {
  var filters: EditInitializeFiltering = js.native
  var objectName: String = js.native
  var objectType: String = js.native
  var queryString: String = js.native
  var schemaName: String = js.native
}

object EditInitializeParams {
  @scala.inline
  def apply(
    filters: EditInitializeFiltering,
    objectName: String,
    objectType: String,
    ownerUri: String,
    queryString: String,
    schemaName: String
  ): EditInitializeParams = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], objectName = objectName.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], schemaName = schemaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditInitializeParams]
  }
  @scala.inline
  implicit class EditInitializeParamsOps[Self <: EditInitializeParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: EditInitializeFiltering): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

