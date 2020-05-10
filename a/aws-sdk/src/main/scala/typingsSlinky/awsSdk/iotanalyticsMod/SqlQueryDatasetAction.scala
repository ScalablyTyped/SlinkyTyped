package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlQueryDatasetAction extends js.Object {
  /**
    * Pre-filters applied to message data.
    */
  var filters: js.UndefOr[QueryFilters] = js.native
  /**
    * A SQL query string.
    */
  var sqlQuery: SqlQuery = js.native
}

object SqlQueryDatasetAction {
  @scala.inline
  def apply(sqlQuery: SqlQuery): SqlQueryDatasetAction = {
    val __obj = js.Dynamic.literal(sqlQuery = sqlQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlQueryDatasetAction]
  }
  @scala.inline
  implicit class SqlQueryDatasetActionOps[Self <: SqlQueryDatasetAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSqlQuery(value: SqlQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: QueryFilters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
  }
  
}

