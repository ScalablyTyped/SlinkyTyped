package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRecoveryPointsByBackupVaultInput extends js.Object {
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: typingsSlinky.awsSdk.backupMod.BackupVaultName = js.native
  /**
    * Returns only recovery points that match the specified backup plan ID.
    */
  var ByBackupPlanId: js.UndefOr[String] = js.native
  /**
    * Returns only recovery points that were created after the specified timestamp.
    */
  var ByCreatedAfter: js.UndefOr[js.Date] = js.native
  /**
    * Returns only recovery points that were created before the specified timestamp.
    */
  var ByCreatedBefore: js.UndefOr[js.Date] = js.native
  /**
    * Returns only recovery points that match the specified resource Amazon Resource Name (ARN).
    */
  var ByResourceArn: js.UndefOr[ARN] = js.native
  /**
    * Returns only recovery points that match the specified resource type.
    */
  var ByResourceType: js.UndefOr[ResourceType] = js.native
  /**
    * The maximum number of items to be returned.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.backupMod.MaxResults] = js.native
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListRecoveryPointsByBackupVaultInput {
  @scala.inline
  def apply(BackupVaultName: BackupVaultName): ListRecoveryPointsByBackupVaultInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRecoveryPointsByBackupVaultInput]
  }
  @scala.inline
  implicit class ListRecoveryPointsByBackupVaultInputOps[Self <: ListRecoveryPointsByBackupVaultInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupVaultName(value: BackupVaultName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupVaultName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByBackupPlanId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByBackupPlanId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByBackupPlanId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByBackupPlanId")(js.undefined)
        ret
    }
    @scala.inline
    def withByCreatedAfter(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByCreatedAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByCreatedAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByCreatedAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withByCreatedBefore(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByCreatedBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByCreatedBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByCreatedBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withByResourceArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByResourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByResourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByResourceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withByResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByResourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

