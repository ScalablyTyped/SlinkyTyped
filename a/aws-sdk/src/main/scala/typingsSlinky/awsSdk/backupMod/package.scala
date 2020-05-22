package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object backupMod {
  type ARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATED
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.ABORTING
    - typingsSlinky.awsSdk.awsSdkStrings.ABORTED
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.EXPIRED
    - java.lang.String
  */
  type BackupJobState = typingsSlinky.awsSdk.backupMod._BackupJobState | java.lang.String
  type BackupJobsList = js.Array[typingsSlinky.awsSdk.backupMod.BackupJob]
  type BackupPlanName = java.lang.String
  type BackupPlanTemplatesList = js.Array[typingsSlinky.awsSdk.backupMod.BackupPlanTemplatesListMember]
  type BackupPlanVersionsList = js.Array[typingsSlinky.awsSdk.backupMod.BackupPlansListMember]
  type BackupPlansList = js.Array[typingsSlinky.awsSdk.backupMod.BackupPlansListMember]
  type BackupRuleName = java.lang.String
  type BackupRules = js.Array[typingsSlinky.awsSdk.backupMod.BackupRule]
  type BackupRulesInput = js.Array[typingsSlinky.awsSdk.backupMod.BackupRuleInput]
  type BackupSelectionName = java.lang.String
  type BackupSelectionsList = js.Array[typingsSlinky.awsSdk.backupMod.BackupSelectionsListMember]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BACKUP_JOB_STARTED
    - typingsSlinky.awsSdk.awsSdkStrings.BACKUP_JOB_COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.BACKUP_JOB_SUCCESSFUL
    - typingsSlinky.awsSdk.awsSdkStrings.BACKUP_JOB_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.BACKUP_JOB_EXPIRED
    - typingsSlinky.awsSdk.awsSdkStrings.RESTORE_JOB_STARTED
    - typingsSlinky.awsSdk.awsSdkStrings.RESTORE_JOB_COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.RESTORE_JOB_SUCCESSFUL
    - typingsSlinky.awsSdk.awsSdkStrings.RESTORE_JOB_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.COPY_JOB_STARTED
    - typingsSlinky.awsSdk.awsSdkStrings.COPY_JOB_SUCCESSFUL
    - typingsSlinky.awsSdk.awsSdkStrings.COPY_JOB_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.RECOVERY_POINT_MODIFIED
    - typingsSlinky.awsSdk.awsSdkStrings.BACKUP_PLAN_CREATED
    - typingsSlinky.awsSdk.awsSdkStrings.BACKUP_PLAN_MODIFIED
    - java.lang.String
  */
  type BackupVaultEvent = typingsSlinky.awsSdk.backupMod._BackupVaultEvent | java.lang.String
  type BackupVaultEvents = js.Array[typingsSlinky.awsSdk.backupMod.BackupVaultEvent]
  type BackupVaultList = js.Array[typingsSlinky.awsSdk.backupMod.BackupVaultListMember]
  type BackupVaultName = java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.backupMod.ClientApiVersions
  type ConditionKey = java.lang.String
  type ConditionType = typingsSlinky.awsSdk.awsSdkStrings.STRINGEQUALS | java.lang.String
  type ConditionValue = java.lang.String
  type CopyActions = js.Array[typingsSlinky.awsSdk.backupMod.CopyAction]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATED
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type CopyJobState = typingsSlinky.awsSdk.backupMod._CopyJobState | java.lang.String
  type CopyJobsList = js.Array[typingsSlinky.awsSdk.backupMod.CopyJob]
  type CronExpression = java.lang.String
  type IAMPolicy = java.lang.String
  type IAMRoleArn = java.lang.String
  type IsEnabled = scala.Boolean
  type ListOfTags = js.Array[typingsSlinky.awsSdk.backupMod.Condition]
  type Long_ = scala.Double
  type MaxResults = scala.Double
  type Metadata = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.backupMod.MetadataValue]
  type MetadataKey = java.lang.String
  type MetadataValue = java.lang.String
  type ProtectedResourcesList = js.Array[typingsSlinky.awsSdk.backupMod.ProtectedResource]
  type RecoveryPointByBackupVaultList = js.Array[typingsSlinky.awsSdk.backupMod.RecoveryPointByBackupVault]
  type RecoveryPointByResourceList = js.Array[typingsSlinky.awsSdk.backupMod.RecoveryPointByResource]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.PARTIAL
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.EXPIRED
    - java.lang.String
  */
  type RecoveryPointStatus = typingsSlinky.awsSdk.backupMod._RecoveryPointStatus | java.lang.String
  type ResourceArns = js.Array[typingsSlinky.awsSdk.backupMod.ARN]
  type ResourceType = java.lang.String
  type ResourceTypeOptInPreference = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.backupMod.IsEnabled]
  type ResourceTypes = js.Array[typingsSlinky.awsSdk.backupMod.ResourceType]
  type RestoreJobId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.ABORTED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type RestoreJobStatus = typingsSlinky.awsSdk.backupMod._RestoreJobStatus | java.lang.String
  type RestoreJobsList = js.Array[typingsSlinky.awsSdk.backupMod.RestoreJobsListMember]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.WARM
    - typingsSlinky.awsSdk.awsSdkStrings.COLD
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type StorageClass = typingsSlinky.awsSdk.backupMod._StorageClass | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[java.lang.String]
  type TagValue = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.backupMod.TagValue]
  type WindowMinutes = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-11-15`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.backupMod._apiVersion | java.lang.String
  type long = scala.Double
  type timestamp = js.Date
}
