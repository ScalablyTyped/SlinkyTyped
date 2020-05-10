package typingsSlinky.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobStatistics2 extends js.Object {
  /** [Output-only] Billing tier for the job. */
  var billingTier: js.UndefOr[Double] = js.native
  /** [Output-only] Whether the query result was fetched from the query cache. */
  var cacheHit: js.UndefOr[Boolean] = js.native
  /** [Output-only] The number of rows affected by a DML statement. Present only for DML statements INSERT, UPDATE or DELETE. */
  var numDmlAffectedRows: js.UndefOr[String] = js.native
  /** [Output-only] Describes execution plan for the query. */
  var queryPlan: js.UndefOr[js.Array[ExplainQueryStage]] = js.native
  /** [Output-only, Experimental] Referenced tables for the job. Queries that reference more than 50 tables will not have a complete list. */
  var referencedTables: js.UndefOr[js.Array[TableReference]] = js.native
  /** [Output-only, Experimental] The schema of the results. Present only for successful dry run of non-legacy SQL queries. */
  var schema: js.UndefOr[TableSchema] = js.native
  /** [Output-only, Experimental] The type of query statement, if valid. */
  var statementType: js.UndefOr[String] = js.native
  /** [Output-only] Total bytes billed for the job. */
  var totalBytesBilled: js.UndefOr[String] = js.native
  /** [Output-only] Total bytes processed for the job. */
  var totalBytesProcessed: js.UndefOr[String] = js.native
  /** [Output-only] Slot-milliseconds for the job. */
  var totalSlotMs: js.UndefOr[String] = js.native
  /** [Output-only, Experimental] Standard SQL only: list of undeclared query parameters detected during a dry run validation. */
  var undeclaredQueryParameters: js.UndefOr[js.Array[QueryParameter]] = js.native
}

object JobStatistics2 {
  @scala.inline
  def apply(): JobStatistics2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatistics2]
  }
  @scala.inline
  implicit class JobStatistics2Ops[Self <: JobStatistics2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBillingTier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingTier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingTier")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheHit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheHit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheHit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheHit")(js.undefined)
        ret
    }
    @scala.inline
    def withNumDmlAffectedRows(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numDmlAffectedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumDmlAffectedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numDmlAffectedRows")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryPlan(value: js.Array[ExplainQueryStage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryPlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryPlan")(js.undefined)
        ret
    }
    @scala.inline
    def withReferencedTables(value: js.Array[TableReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referencedTables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferencedTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referencedTables")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: TableSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withStatementType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatementType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statementType")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalBytesBilled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesBilled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalBytesBilled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesBilled")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalBytesProcessed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesProcessed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalBytesProcessed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesProcessed")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalSlotMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSlotMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalSlotMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSlotMs")(js.undefined)
        ret
    }
    @scala.inline
    def withUndeclaredQueryParameters(value: js.Array[QueryParameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undeclaredQueryParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUndeclaredQueryParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undeclaredQueryParameters")(js.undefined)
        ret
    }
  }
  
}

