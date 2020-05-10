package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceToIndexFieldMapping extends js.Object {
  /**
    * The name of the column or attribute in the data source.
    */
  var DataSourceFieldName: typingsSlinky.awsSdk.kendraMod.DataSourceFieldName = js.native
  /**
    * The type of data stored in the column or attribute.
    */
  var DateFieldFormat: js.UndefOr[DataSourceDateFieldFormat] = js.native
  /**
    * The name of the field in the index.
    */
  var IndexFieldName: typingsSlinky.awsSdk.kendraMod.IndexFieldName = js.native
}

object DataSourceToIndexFieldMapping {
  @scala.inline
  def apply(DataSourceFieldName: DataSourceFieldName, IndexFieldName: IndexFieldName): DataSourceToIndexFieldMapping = {
    val __obj = js.Dynamic.literal(DataSourceFieldName = DataSourceFieldName.asInstanceOf[js.Any], IndexFieldName = IndexFieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceToIndexFieldMapping]
  }
  @scala.inline
  implicit class DataSourceToIndexFieldMappingOps[Self <: DataSourceToIndexFieldMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSourceFieldName(value: DataSourceFieldName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSourceFieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexFieldName(value: IndexFieldName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexFieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateFieldFormat(value: DataSourceDateFieldFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateFieldFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFieldFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateFieldFormat")(js.undefined)
        ret
    }
  }
  
}

