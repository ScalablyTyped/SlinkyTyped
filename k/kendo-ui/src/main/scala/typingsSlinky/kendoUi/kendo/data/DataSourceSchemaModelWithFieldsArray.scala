package typingsSlinky.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSchemaModelWithFieldsArray extends DataSourceSchemaModel {
  @JSName("fields")
  var fields_DataSourceSchemaModelWithFieldsArray: js.UndefOr[js.Array[DataSourceSchemaModelField]] = js.native
}

object DataSourceSchemaModelWithFieldsArray {
  @scala.inline
  def apply(): DataSourceSchemaModelWithFieldsArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSchemaModelWithFieldsArray]
  }
  @scala.inline
  implicit class DataSourceSchemaModelWithFieldsArrayOps[Self <: DataSourceSchemaModelWithFieldsArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: js.Array[DataSourceSchemaModelField]): Self = {
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

