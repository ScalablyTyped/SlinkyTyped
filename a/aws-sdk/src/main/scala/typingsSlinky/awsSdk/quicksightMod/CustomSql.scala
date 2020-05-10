package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomSql extends js.Object {
  /**
    * The column schema from the SQL query result set.
    */
  var Columns: js.UndefOr[InputColumnList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the data source.
    */
  var DataSourceArn: Arn = js.native
  /**
    * A display name for the SQL query result.
    */
  var Name: CustomSqlName = js.native
  /**
    * The SQL query.
    */
  var SqlQuery: typingsSlinky.awsSdk.quicksightMod.SqlQuery = js.native
}

object CustomSql {
  @scala.inline
  def apply(DataSourceArn: Arn, Name: CustomSqlName, SqlQuery: SqlQuery): CustomSql = {
    val __obj = js.Dynamic.literal(DataSourceArn = DataSourceArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SqlQuery = SqlQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomSql]
  }
  @scala.inline
  implicit class CustomSqlOps[Self <: CustomSql] (val x: Self) extends AnyVal {
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
    def withName(value: CustomSqlName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSqlQuery(value: SqlQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SqlQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumns(value: InputColumnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Columns")(js.undefined)
        ret
    }
  }
  
}

