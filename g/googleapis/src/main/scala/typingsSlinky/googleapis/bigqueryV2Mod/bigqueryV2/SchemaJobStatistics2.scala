package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import typingsSlinky.googleapis.AnonNameSlotMs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaJobStatistics2 extends js.Object {
  /**
    * [Output-only] Billing tier for the job.
    */
  var billingTier: js.UndefOr[Double] = js.native
  /**
    * [Output-only] Whether the query result was fetched from the query cache.
    */
  var cacheHit: js.UndefOr[Boolean] = js.native
  /**
    * The DDL operation performed, possibly dependent on the pre-existence of
    * the DDL target. Possible values (new values might be added in the
    * future): &quot;CREATE&quot;: The query created the DDL target.
    * &quot;SKIP&quot;: No-op. Example cases: the query is CREATE TABLE IF NOT
    * EXISTS while the table already exists, or the query is DROP TABLE IF
    * EXISTS while the table does not exist. &quot;REPLACE&quot;: The query
    * replaced the DDL target. Example case: the query is CREATE OR REPLACE
    * TABLE, and the table already exists. &quot;DROP&quot;: The query deleted
    * the DDL target.
    */
  var ddlOperationPerformed: js.UndefOr[String] = js.native
  /**
    * The DDL target routine. Present only for CREATE/DROP FUNCTION/PROCEDURE
    * queries.
    */
  var ddlTargetRoutine: js.UndefOr[SchemaRoutineReference] = js.native
  /**
    * The DDL target table. Present only for CREATE/DROP TABLE/VIEW queries.
    */
  var ddlTargetTable: js.UndefOr[SchemaTableReference] = js.native
  /**
    * [Output-only] The original estimate of bytes processed for the job.
    */
  var estimatedBytesProcessed: js.UndefOr[String] = js.native
  /**
    * [Output-only, Beta] Information about create model query job progress.
    */
  var modelTraining: js.UndefOr[SchemaBigQueryModelTraining] = js.native
  /**
    * [Output-only, Beta] Deprecated; do not use.
    */
  var modelTrainingCurrentIteration: js.UndefOr[Double] = js.native
  /**
    * [Output-only, Beta] Deprecated; do not use.
    */
  var modelTrainingExpectedTotalIteration: js.UndefOr[String] = js.native
  /**
    * [Output-only] The number of rows affected by a DML statement. Present
    * only for DML statements INSERT, UPDATE or DELETE.
    */
  var numDmlAffectedRows: js.UndefOr[String] = js.native
  /**
    * [Output-only] Describes execution plan for the query.
    */
  var queryPlan: js.UndefOr[js.Array[SchemaExplainQueryStage]] = js.native
  /**
    * [Output-only] Referenced tables for the job. Queries that reference more
    * than 50 tables will not have a complete list.
    */
  var referencedTables: js.UndefOr[js.Array[SchemaTableReference]] = js.native
  /**
    * [Output-only] Job resource usage breakdown by reservation.
    */
  var reservationUsage: js.UndefOr[js.Array[AnonNameSlotMs]] = js.native
  /**
    * [Output-only] The schema of the results. Present only for successful dry
    * run of non-legacy SQL queries.
    */
  var schema: js.UndefOr[SchemaTableSchema] = js.native
  /**
    * The type of query statement, if valid. Possible values (new values might
    * be added in the future): &quot;SELECT&quot;: SELECT query.
    * &quot;INSERT&quot;: INSERT query; see
    * https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language.
    * &quot;UPDATE&quot;: UPDATE query; see
    * https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language.
    * &quot;DELETE&quot;: DELETE query; see
    * https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language.
    * &quot;MERGE&quot;: MERGE query; see
    * https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language.
    * &quot;CREATE_TABLE&quot;: CREATE [OR REPLACE] TABLE without AS SELECT.
    * &quot;CREATE_TABLE_AS_SELECT&quot;: CREATE [OR REPLACE] TABLE ... AS
    * SELECT ... . &quot;DROP_TABLE&quot;: DROP TABLE query.
    * &quot;CREATE_VIEW&quot;: CREATE [OR REPLACE] VIEW ... AS SELECT ... .
    * &quot;DROP_VIEW&quot;: DROP VIEW query. &quot;CREATE_FUNCTION&quot;:
    * CREATE FUNCTION query. &quot;DROP_FUNCTION&quot; : DROP FUNCTION query.
    * &quot;ALTER_TABLE&quot;: ALTER TABLE query. &quot;ALTER_VIEW&quot;: ALTER
    * VIEW query.
    */
  var statementType: js.UndefOr[String] = js.native
  /**
    * [Output-only] [Beta] Describes a timeline of job execution.
    */
  var timeline: js.UndefOr[js.Array[SchemaQueryTimelineSample]] = js.native
  /**
    * [Output-only] Total bytes billed for the job.
    */
  var totalBytesBilled: js.UndefOr[String] = js.native
  /**
    * [Output-only] Total bytes processed for the job.
    */
  var totalBytesProcessed: js.UndefOr[String] = js.native
  /**
    * [Output-only] For dry-run jobs, totalBytesProcessed is an estimate and
    * this field specifies the accuracy of the estimate. Possible values can
    * be: UNKNOWN: accuracy of the estimate is unknown. PRECISE: estimate is
    * precise. LOWER_BOUND: estimate is lower bound of what the query would
    * cost. UPPER_BOUND: estimate is upper bound of what the query would cost.
    */
  var totalBytesProcessedAccuracy: js.UndefOr[String] = js.native
  /**
    * [Output-only] Total number of partitions processed from all partitioned
    * tables referenced in the job.
    */
  var totalPartitionsProcessed: js.UndefOr[String] = js.native
  /**
    * [Output-only] Slot-milliseconds for the job.
    */
  var totalSlotMs: js.UndefOr[String] = js.native
  /**
    * Standard SQL only: list of undeclared query parameters detected during a
    * dry run validation.
    */
  var undeclaredQueryParameters: js.UndefOr[js.Array[SchemaQueryParameter]] = js.native
}

object SchemaJobStatistics2 {
  @scala.inline
  def apply(): SchemaJobStatistics2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobStatistics2]
  }
  @scala.inline
  implicit class SchemaJobStatistics2Ops[Self <: SchemaJobStatistics2] (val x: Self) extends AnyVal {
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
    def withDdlOperationPerformed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ddlOperationPerformed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDdlOperationPerformed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ddlOperationPerformed")(js.undefined)
        ret
    }
    @scala.inline
    def withDdlTargetRoutine(value: SchemaRoutineReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ddlTargetRoutine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDdlTargetRoutine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ddlTargetRoutine")(js.undefined)
        ret
    }
    @scala.inline
    def withDdlTargetTable(value: SchemaTableReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ddlTargetTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDdlTargetTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ddlTargetTable")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedBytesProcessed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedBytesProcessed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedBytesProcessed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedBytesProcessed")(js.undefined)
        ret
    }
    @scala.inline
    def withModelTraining(value: SchemaBigQueryModelTraining): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelTraining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelTraining: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelTraining")(js.undefined)
        ret
    }
    @scala.inline
    def withModelTrainingCurrentIteration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelTrainingCurrentIteration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelTrainingCurrentIteration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelTrainingCurrentIteration")(js.undefined)
        ret
    }
    @scala.inline
    def withModelTrainingExpectedTotalIteration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelTrainingExpectedTotalIteration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelTrainingExpectedTotalIteration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelTrainingExpectedTotalIteration")(js.undefined)
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
    def withQueryPlan(value: js.Array[SchemaExplainQueryStage]): Self = {
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
    def withReferencedTables(value: js.Array[SchemaTableReference]): Self = {
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
    def withReservationUsage(value: js.Array[AnonNameSlotMs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservationUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservationUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservationUsage")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: SchemaTableSchema): Self = {
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
    def withTimeline(value: js.Array[SchemaQueryTimelineSample]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeline")(js.undefined)
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
    def withTotalBytesProcessedAccuracy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesProcessedAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalBytesProcessedAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesProcessedAccuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalPartitionsProcessed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPartitionsProcessed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalPartitionsProcessed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPartitionsProcessed")(js.undefined)
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
    def withUndeclaredQueryParameters(value: js.Array[SchemaQueryParameter]): Self = {
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

