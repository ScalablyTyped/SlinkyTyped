package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBackupJobsInput extends js.Object {
  /**
    * Returns only backup jobs that will be stored in the specified backup vault. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var ByBackupVaultName: js.UndefOr[BackupVaultName] = js.native
  /**
    * Returns only backup jobs that were created after the specified date.
    */
  var ByCreatedAfter: js.UndefOr[js.Date] = js.native
  /**
    * Returns only backup jobs that were created before the specified date.
    */
  var ByCreatedBefore: js.UndefOr[js.Date] = js.native
  /**
    * Returns only backup jobs that match the specified resource Amazon Resource Name (ARN).
    */
  var ByResourceArn: js.UndefOr[ARN] = js.native
  /**
    * Returns only backup jobs for the specified resources:    DynamoDB for Amazon DynamoDB    EBS for Amazon Elastic Block Store    EFS for Amazon Elastic File System    RDS for Amazon Relational Database Service    Storage Gateway for AWS Storage Gateway  
    */
  var ByResourceType: js.UndefOr[ResourceType] = js.native
  /**
    * Returns only backup jobs that are in the specified state.
    */
  var ByState: js.UndefOr[BackupJobState] = js.native
  /**
    * The maximum number of items to be returned.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.backupMod.MaxResults] = js.native
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListBackupJobsInput {
  @scala.inline
  def apply(): ListBackupJobsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBackupJobsInput]
  }
  @scala.inline
  implicit class ListBackupJobsInputOps[Self <: ListBackupJobsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByBackupVaultName(value: BackupVaultName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByBackupVaultName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByBackupVaultName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByBackupVaultName")(js.undefined)
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
    def withByState(value: BackupJobState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByState")(js.undefined)
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

