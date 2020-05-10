package typingsSlinky.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSchemaWithOptionsModel extends DataSourceSchema {
  @JSName("model")
  var model_DataSourceSchemaWithOptionsModel: js.UndefOr[DataSourceSchemaModel] = js.native
}

object DataSourceSchemaWithOptionsModel {
  @scala.inline
  def apply(): DataSourceSchemaWithOptionsModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSchemaWithOptionsModel]
  }
  @scala.inline
  implicit class DataSourceSchemaWithOptionsModelOps[Self <: DataSourceSchemaWithOptionsModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModel(value: DataSourceSchemaModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
  }
  
}

