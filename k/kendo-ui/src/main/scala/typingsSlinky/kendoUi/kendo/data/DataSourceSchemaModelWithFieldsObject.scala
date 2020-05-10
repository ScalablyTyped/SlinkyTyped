package typingsSlinky.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSchemaModelWithFieldsObject extends DataSourceSchemaModel {
  @JSName("fields")
  var fields_DataSourceSchemaModelWithFieldsObject: js.UndefOr[DataSourceSchemaModelFields] = js.native
}

object DataSourceSchemaModelWithFieldsObject {
  @scala.inline
  def apply(): DataSourceSchemaModelWithFieldsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSchemaModelWithFieldsObject]
  }
  @scala.inline
  implicit class DataSourceSchemaModelWithFieldsObjectOps[Self <: DataSourceSchemaModelWithFieldsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: DataSourceSchemaModelFields): Self = {
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

