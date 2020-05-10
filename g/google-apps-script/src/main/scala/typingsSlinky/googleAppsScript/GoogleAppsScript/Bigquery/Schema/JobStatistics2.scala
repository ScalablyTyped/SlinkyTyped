package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobStatistics2 extends js.Object {
  var billingTier: js.UndefOr[Double] = js.native
  var cacheHit: js.UndefOr[Boolean] = js.native
  var ddlOperationPerformed: js.UndefOr[String] = js.native
  var ddlTargetRoutine: js.UndefOr[RoutineReference] = js.native
  var ddlTargetTable: js.UndefOr[TableReference] = js.native
  var estimatedBytesProcessed: js.UndefOr[String] = js.native
  var modelTraining: js.UndefOr[BigQueryModelTraining] = js.native
  var modelTrainingCurrentIteration: js.UndefOr[Double] = js.native
  var modelTrainingExpectedTotalIteration: js.UndefOr[String] = js.native
  var numDmlAffectedRows: js.UndefOr[String] = js.native
  var queryPlan: js.UndefOr[js.Array[ExplainQueryStage]] = js.native
  var referencedTables: js.UndefOr[js.Array[TableReference]] = js.native
  var reservationUsage: js.UndefOr[js.Array[JobStatistics2ReservationUsage]] = js.native
  var schema: js.UndefOr[TableSchema] = js.native
  var statementType: js.UndefOr[String] = js.native
  var timeline: js.UndefOr[js.Array[QueryTimelineSample]] = js.native
  var totalBytesBilled: js.UndefOr[String] = js.native
  var totalBytesProcessed: js.UndefOr[String] = js.native
  var totalBytesProcessedAccuracy: js.UndefOr[String] = js.native
  var totalPartitionsProcessed: js.UndefOr[String] = js.native
  var totalSlotMs: js.UndefOr[String] = js.native
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
    def withDdlTargetRoutine(value: RoutineReference): Self = {
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
    def withDdlTargetTable(value: TableReference): Self = {
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
    def withModelTraining(value: BigQueryModelTraining): Self = {
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
    def withReservationUsage(value: js.Array[JobStatistics2ReservationUsage]): Self = {
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
    def withTimeline(value: js.Array[QueryTimelineSample]): Self = {
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

