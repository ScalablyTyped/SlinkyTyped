package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationalTable extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the data source.
    */
  var DataSourceArn: Arn = js.native
  /**
    * The column schema of the table.
    */
  var InputColumns: InputColumnList = js.native
  /**
    * The name of the relational table.
    */
  var Name: RelationalTableName = js.native
  /**
    * The schema name. This name applies to certain relational database engines.
    */
  var Schema: js.UndefOr[RelationalTableSchema] = js.native
}

object RelationalTable {
  @scala.inline
  def apply(DataSourceArn: Arn, InputColumns: InputColumnList, Name: RelationalTableName): RelationalTable = {
    val __obj = js.Dynamic.literal(DataSourceArn = DataSourceArn.asInstanceOf[js.Any], InputColumns = InputColumns.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationalTable]
  }
  @scala.inline
  implicit class RelationalTableOps[Self <: RelationalTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSourceArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputColumns(value: InputColumnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: RelationalTableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: RelationalTableSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schema")(js.undefined)
        ret
    }
  }
  
}

