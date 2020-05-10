package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableStatistics extends js.Object {
  /**
    * The data definition language (DDL) used to build and modify the structure of your tables.
    */
  var Ddls: js.UndefOr[Long] = js.native
  /**
    * The number of delete actions performed on a table.
    */
  var Deletes: js.UndefOr[Long] = js.native
  /**
    * The number of rows that failed conditional checks during the full load operation (valid only for migrations where DynamoDB is the target).
    */
  var FullLoadCondtnlChkFailedRows: js.UndefOr[Long] = js.native
  /**
    * The time when the full load operation completed.
    */
  var FullLoadEndTime: js.UndefOr[js.Date] = js.native
  /**
    * The number of rows that failed to load during the full load operation (valid only for migrations where DynamoDB is the target).
    */
  var FullLoadErrorRows: js.UndefOr[Long] = js.native
  /**
    * A value that indicates if the table was reloaded (true) or loaded as part of a new full load operation (false).
    */
  var FullLoadReloaded: js.UndefOr[BooleanOptional] = js.native
  /**
    * The number of rows added during the full load operation.
    */
  var FullLoadRows: js.UndefOr[Long] = js.native
  /**
    * The time when the full load operation started.
    */
  var FullLoadStartTime: js.UndefOr[js.Date] = js.native
  /**
    * The number of insert actions performed on a table.
    */
  var Inserts: js.UndefOr[Long] = js.native
  /**
    * The last time a table was updated.
    */
  var LastUpdateTime: js.UndefOr[js.Date] = js.native
  /**
    * The schema name.
    */
  var SchemaName: js.UndefOr[String] = js.native
  /**
    * The name of the table.
    */
  var TableName: js.UndefOr[String] = js.native
  /**
    * The state of the tables described. Valid states: Table does not exist | Before load | Full load | Table completed | Table cancelled | Table error | Table all | Table updates | Table is being reloaded
    */
  var TableState: js.UndefOr[String] = js.native
  /**
    * The number of update actions performed on a table.
    */
  var Updates: js.UndefOr[Long] = js.native
  /**
    * The number of records that failed validation.
    */
  var ValidationFailedRecords: js.UndefOr[Long] = js.native
  /**
    * The number of records that have yet to be validated.
    */
  var ValidationPendingRecords: js.UndefOr[Long] = js.native
  /**
    * The validation state of the table. This parameter can have the following values:   Not enabled - Validation isn't enabled for the table in the migration task.   Pending records - Some records in the table are waiting for validation.   Mismatched records - Some records in the table don't match between the source and target.   Suspended records - Some records in the table couldn't be validated.   No primary key - The table couldn't be validated because it has no primary key.   Table error - The table wasn't validated because it's in an error state and some data wasn't migrated.   Validated - All rows in the table are validated. If the table is updated, the status can change from Validated.   Error - The table couldn't be validated because of an unexpected error.  
    */
  var ValidationState: js.UndefOr[String] = js.native
  /**
    * Additional details about the state of validation.
    */
  var ValidationStateDetails: js.UndefOr[String] = js.native
  /**
    * The number of records that couldn't be validated.
    */
  var ValidationSuspendedRecords: js.UndefOr[Long] = js.native
}

object TableStatistics {
  @scala.inline
  def apply(): TableStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableStatistics]
  }
  @scala.inline
  implicit class TableStatisticsOps[Self <: TableStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDdls(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ddls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDdls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ddls")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletes(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deletes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deletes")(js.undefined)
        ret
    }
    @scala.inline
    def withFullLoadCondtnlChkFailedRows(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullLoadCondtnlChkFailedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullLoadCondtnlChkFailedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullLoadCondtnlChkFailedRows")(js.undefined)
        ret
    }
    @scala.inline
    def withFullLoadEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullLoadEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullLoadEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullLoadEndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFullLoadErrorRows(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullLoadErrorRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullLoadErrorRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullLoadErrorRows")(js.undefined)
        ret
    }
    @scala.inline
    def withFullLoadReloaded(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullLoadReloaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullLoadReloaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullLoadReloaded")(js.undefined)
        ret
    }
    @scala.inline
    def withFullLoadRows(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullLoadRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullLoadRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullLoadRows")(js.undefined)
        ret
    }
    @scala.inline
    def withFullLoadStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullLoadStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullLoadStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullLoadStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withInserts(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inserts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInserts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inserts")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaName")(js.undefined)
        ret
    }
    @scala.inline
    def withTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(js.undefined)
        ret
    }
    @scala.inline
    def withTableState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableState")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdates(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Updates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Updates")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationFailedRecords(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationFailedRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationFailedRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationFailedRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationPendingRecords(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationPendingRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationPendingRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationPendingRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationState")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationStateDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationStateDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationStateDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationStateDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationSuspendedRecords(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationSuspendedRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationSuspendedRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationSuspendedRecords")(js.undefined)
        ret
    }
  }
  
}

