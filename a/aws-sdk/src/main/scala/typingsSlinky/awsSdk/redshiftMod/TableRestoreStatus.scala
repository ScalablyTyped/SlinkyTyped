package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRestoreStatus extends js.Object {
  /**
    * The identifier of the Amazon Redshift cluster that the table is being restored to.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * A description of the status of the table restore request. Status values include SUCCEEDED, FAILED, CANCELED, PENDING, IN_PROGRESS.
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * The name of the table to create as a result of the table restore request.
    */
  var NewTableName: js.UndefOr[String] = js.native
  /**
    * The amount of data restored to the new table so far, in megabytes (MB).
    */
  var ProgressInMegaBytes: js.UndefOr[LongOptional] = js.native
  /**
    * The time that the table restore request was made, in Universal Coordinated Time (UTC).
    */
  var RequestTime: js.UndefOr[js.Date] = js.native
  /**
    * The identifier of the snapshot that the table is being restored from.
    */
  var SnapshotIdentifier: js.UndefOr[String] = js.native
  /**
    * The name of the source database that contains the table being restored.
    */
  var SourceDatabaseName: js.UndefOr[String] = js.native
  /**
    * The name of the source schema that contains the table being restored.
    */
  var SourceSchemaName: js.UndefOr[String] = js.native
  /**
    * The name of the source table being restored.
    */
  var SourceTableName: js.UndefOr[String] = js.native
  /**
    * A value that describes the current state of the table restore request. Valid Values: SUCCEEDED, FAILED, CANCELED, PENDING, IN_PROGRESS 
    */
  var Status: js.UndefOr[TableRestoreStatusType] = js.native
  /**
    * The unique identifier for the table restore request.
    */
  var TableRestoreRequestId: js.UndefOr[String] = js.native
  /**
    * The name of the database to restore the table to.
    */
  var TargetDatabaseName: js.UndefOr[String] = js.native
  /**
    * The name of the schema to restore the table to.
    */
  var TargetSchemaName: js.UndefOr[String] = js.native
  /**
    * The total amount of data to restore to the new table, in megabytes (MB).
    */
  var TotalDataInMegaBytes: js.UndefOr[LongOptional] = js.native
}

object TableRestoreStatus {
  @scala.inline
  def apply(): TableRestoreStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRestoreStatus]
  }
  @scala.inline
  implicit class TableRestoreStatusOps[Self <: TableRestoreStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
    @scala.inline
    def withNewTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewTableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewTableName")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressInMegaBytes(value: LongOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressInMegaBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressInMegaBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressInMegaBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceDatabaseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceDatabaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceDatabaseName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceDatabaseName")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceSchemaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceSchemaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceSchemaName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceSchemaName")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceTableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceTableName")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: TableRestoreStatusType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withTableRestoreRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableRestoreRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableRestoreRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableRestoreRequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetDatabaseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetDatabaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetDatabaseName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetDatabaseName")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetSchemaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetSchemaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetSchemaName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetSchemaName")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalDataInMegaBytes(value: LongOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalDataInMegaBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalDataInMegaBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalDataInMegaBytes")(js.undefined)
        ret
    }
  }
  
}

