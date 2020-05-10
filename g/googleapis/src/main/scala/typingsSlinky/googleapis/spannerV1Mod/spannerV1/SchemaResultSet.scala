package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results from Read or ExecuteSql.
  */
@js.native
trait SchemaResultSet extends js.Object {
  /**
    * Metadata about the result set, such as row type information.
    */
  var metadata: js.UndefOr[SchemaResultSetMetadata] = js.native
  /**
    * Each element in `rows` is a row whose format is defined by
    * metadata.row_type. The ith element in each row matches the ith field in
    * metadata.row_type. Elements are encoded based on type as described here.
    */
  var rows: js.UndefOr[js.Array[js.Array[_]]] = js.native
  /**
    * Query plan and execution statistics for the SQL statement that produced
    * this result set. These can be requested by setting
    * ExecuteSqlRequest.query_mode. DML statements always produce stats
    * containing the number of rows modified, unless executed using the
    * ExecuteSqlRequest.QueryMode.PLAN ExecuteSqlRequest.query_mode. Other
    * fields may or may not be populated, based on the
    * ExecuteSqlRequest.query_mode.
    */
  var stats: js.UndefOr[SchemaResultSetStats] = js.native
}

object SchemaResultSet {
  @scala.inline
  def apply(): SchemaResultSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultSet]
  }
  @scala.inline
  implicit class SchemaResultSetOps[Self <: SchemaResultSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadata(value: SchemaResultSetMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withStats(value: SchemaResultSetStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(js.undefined)
        ret
    }
  }
  
}

