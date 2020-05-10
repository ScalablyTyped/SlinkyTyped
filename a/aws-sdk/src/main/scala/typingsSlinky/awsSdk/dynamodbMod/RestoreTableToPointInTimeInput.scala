package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreTableToPointInTimeInput extends js.Object {
  /**
    * The billing mode of the restored table.
    */
  var BillingModeOverride: js.UndefOr[BillingMode] = js.native
  /**
    * List of global secondary indexes for the restored table. The indexes provided should match existing secondary indexes. You can choose to exclude some or all of the indexes at the time of restore.
    */
  var GlobalSecondaryIndexOverride: js.UndefOr[GlobalSecondaryIndexList] = js.native
  /**
    * List of local secondary indexes for the restored table. The indexes provided should match existing secondary indexes. You can choose to exclude some or all of the indexes at the time of restore.
    */
  var LocalSecondaryIndexOverride: js.UndefOr[LocalSecondaryIndexList] = js.native
  /**
    * Provisioned throughput settings for the restored table.
    */
  var ProvisionedThroughputOverride: js.UndefOr[ProvisionedThroughput] = js.native
  /**
    * Time in the past to restore the table to.
    */
  var RestoreDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The new server-side encryption settings for the restored table.
    */
  var SSESpecificationOverride: js.UndefOr[SSESpecification] = js.native
  /**
    * The DynamoDB table that will be restored. This value is an Amazon Resource Name (ARN).
    */
  var SourceTableArn: js.UndefOr[TableArn] = js.native
  /**
    * Name of the source table that is being restored.
    */
  var SourceTableName: js.UndefOr[TableName] = js.native
  /**
    * The name of the new table to which it must be restored to.
    */
  var TargetTableName: TableName = js.native
  /**
    * Restore the table to the latest possible time. LatestRestorableDateTime is typically 5 minutes before the current time. 
    */
  var UseLatestRestorableTime: js.UndefOr[BooleanObject] = js.native
}

object RestoreTableToPointInTimeInput {
  @scala.inline
  def apply(TargetTableName: TableName): RestoreTableToPointInTimeInput = {
    val __obj = js.Dynamic.literal(TargetTableName = TargetTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreTableToPointInTimeInput]
  }
  @scala.inline
  implicit class RestoreTableToPointInTimeInputOps[Self <: RestoreTableToPointInTimeInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetTableName(value: TableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetTableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBillingModeOverride(value: BillingMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingModeOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingModeOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingModeOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalSecondaryIndexOverride(value: GlobalSecondaryIndexList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalSecondaryIndexOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalSecondaryIndexOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalSecondaryIndexOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalSecondaryIndexOverride(value: LocalSecondaryIndexList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalSecondaryIndexOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalSecondaryIndexOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalSecondaryIndexOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedThroughputOverride(value: ProvisionedThroughput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedThroughputOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedThroughputOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedThroughputOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withRestoreDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestoreDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestoreDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestoreDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSSESpecificationOverride(value: SSESpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSESpecificationOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSESpecificationOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSESpecificationOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceTableArn(value: TableArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceTableArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceTableArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceTableArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceTableName(value: TableName): Self = {
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
    def withUseLatestRestorableTime(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseLatestRestorableTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLatestRestorableTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseLatestRestorableTime")(js.undefined)
        ret
    }
  }
  
}

