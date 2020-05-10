package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSetConfiguration extends js.Object {
  /**
    * A structure containing the list of column group schemas.
    */
  var ColumnGroupSchemaList: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.ColumnGroupSchemaList] = js.native
  /**
    * Dataset schema.
    */
  var DataSetSchema: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.DataSetSchema] = js.native
  /**
    * Placeholder.
    */
  var Placeholder: js.UndefOr[String] = js.native
}

object DataSetConfiguration {
  @scala.inline
  def apply(): DataSetConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSetConfiguration]
  }
  @scala.inline
  implicit class DataSetConfigurationOps[Self <: DataSetConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnGroupSchemaList(value: ColumnGroupSchemaList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnGroupSchemaList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnGroupSchemaList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnGroupSchemaList")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSetSchema(value: DataSetSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSetSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSetSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSetSchema")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Placeholder")(js.undefined)
        ret
    }
  }
  
}

