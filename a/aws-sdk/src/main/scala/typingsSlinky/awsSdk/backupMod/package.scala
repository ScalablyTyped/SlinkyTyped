package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object backupMod {
  type ARN = java.lang.String
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
  type BackupVaultEvents = js.Array[typingsSlinky.awsSdk.backupMod.BackupVaultEvent]
  type BackupVaultList = js.Array[typingsSlinky.awsSdk.backupMod.BackupVaultListMember]
  type BackupVaultName = java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.backupMod.ClientApiVersions
  type ConditionKey = java.lang.String
  type ConditionValue = java.lang.String
  type CopyActions = js.Array[typingsSlinky.awsSdk.backupMod.CopyAction]
  type CopyJobsList = js.Array[typingsSlinky.awsSdk.backupMod.CopyJob]
  type CronExpression = java.lang.String
  type IAMPolicy = java.lang.String
  type IAMRoleArn = java.lang.String
  type ListOfTags = js.Array[typingsSlinky.awsSdk.backupMod.Condition]
  type Long_ = scala.Double
  type MaxResults = scala.Double
  type Metadata = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.backupMod.MetadataValue]
  type MetadataKey = java.lang.String
  type MetadataValue = java.lang.String
  type ProtectedResourcesList = js.Array[typingsSlinky.awsSdk.backupMod.ProtectedResource]
  type RecoveryPointByBackupVaultList = js.Array[typingsSlinky.awsSdk.backupMod.RecoveryPointByBackupVault]
  type RecoveryPointByResourceList = js.Array[typingsSlinky.awsSdk.backupMod.RecoveryPointByResource]
  type ResourceArns = js.Array[typingsSlinky.awsSdk.backupMod.ARN]
  type ResourceType = java.lang.String
  type ResourceTypes = js.Array[typingsSlinky.awsSdk.backupMod.ResourceType]
  type RestoreJobId = java.lang.String
  type RestoreJobsList = js.Array[typingsSlinky.awsSdk.backupMod.RestoreJobsListMember]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[java.lang.String]
  type TagValue = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.backupMod.TagValue]
  type WindowMinutes = scala.Double
  type long = scala.Double
  type timestamp = js.Date
}
