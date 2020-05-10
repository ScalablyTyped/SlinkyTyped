package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreTableFromBackupInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) associated with the backup.
    */
  var BackupArn: typingsSlinky.awsSdk.documentClientMod.DocumentClient.BackupArn = js.native
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
    * The new server-side encryption settings for the restored table.
    */
  var SSESpecificationOverride: js.UndefOr[SSESpecification] = js.native
  /**
    * The name of the new table to which the backup must be restored.
    */
  var TargetTableName: TableName = js.native
}

object RestoreTableFromBackupInput {
  @scala.inline
  def apply(BackupArn: BackupArn, TargetTableName: TableName): RestoreTableFromBackupInput = {
    val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], TargetTableName = TargetTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreTableFromBackupInput]
  }
  @scala.inline
  implicit class RestoreTableFromBackupInputOps[Self <: RestoreTableFromBackupInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupArn(value: BackupArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupArn")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

