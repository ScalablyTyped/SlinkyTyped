package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object macie2Mod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLING_IN_PROGRESS
    - java.lang.String
  */
  type AdminStatus = typingsSlinky.awsSdk.macie2Mod._AdminStatus | java.lang.String
  
  type BucketCriteria = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.macie2Mod.BucketCriteriaAdditionalProperties]
  
  type Cells = js.Array[typingsSlinky.awsSdk.macie2Mod.Cell]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.macie2Mod.ClientApiVersions
  
  type Criterion = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.macie2Mod.CriterionAdditionalProperties]
  
  type Currency = typingsSlinky.awsSdk.awsSdkStrings.USD | java.lang.String
  
  type CustomDetections = js.Array[typingsSlinky.awsSdk.macie2Mod.CustomDetection]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUNDAY
    - typingsSlinky.awsSdk.awsSdkStrings.MONDAY
    - typingsSlinky.awsSdk.awsSdkStrings.TUESDAY
    - typingsSlinky.awsSdk.awsSdkStrings.WEDNESDAY
    - typingsSlinky.awsSdk.awsSdkStrings.THURSDAY
    - typingsSlinky.awsSdk.awsSdkStrings.FRIDAY
    - typingsSlinky.awsSdk.awsSdkStrings.SATURDAY
    - java.lang.String
  */
  type DayOfWeek = typingsSlinky.awsSdk.macie2Mod._DayOfWeek | java.lang.String
  
  type DefaultDetections = js.Array[typingsSlinky.awsSdk.macie2Mod.DefaultDetection]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PUBLIC
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_PUBLIC
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type EffectivePermission = typingsSlinky.awsSdk.macie2Mod._EffectivePermission | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.AES256
    - typingsSlinky.awsSdk.awsSdkStrings.awsColonkms
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type EncryptionType = typingsSlinky.awsSdk.macie2Mod._EncryptionType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ClientError
    - typingsSlinky.awsSdk.awsSdkStrings.InternalError
    - java.lang.String
  */
  type ErrorCode = typingsSlinky.awsSdk.macie2Mod._ErrorCode | java.lang.String
  
  type FindingActionType = typingsSlinky.awsSdk.awsSdkStrings.AWS_API_CALL | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CLASSIFICATION
    - typingsSlinky.awsSdk.awsSdkStrings.POLICY
    - java.lang.String
  */
  type FindingCategory = typingsSlinky.awsSdk.macie2Mod._FindingCategory | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FIFTEEN_MINUTES
    - typingsSlinky.awsSdk.awsSdkStrings.ONE_HOUR
    - typingsSlinky.awsSdk.awsSdkStrings.SIX_HOURS
    - java.lang.String
  */
  type FindingPublishingFrequency = typingsSlinky.awsSdk.macie2Mod._FindingPublishingFrequency | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.groupKey
    - typingsSlinky.awsSdk.awsSdkStrings.count__
    - java.lang.String
  */
  type FindingStatisticsSortAttributeName = typingsSlinky.awsSdk.macie2Mod._FindingStatisticsSortAttributeName | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SensitiveDataColonS3ObjectSlashMultiple
    - typingsSlinky.awsSdk.awsSdkStrings.SensitiveDataColonS3ObjectSlashFinancial
    - typingsSlinky.awsSdk.awsSdkStrings.SensitiveDataColonS3ObjectSlashPersonal
    - typingsSlinky.awsSdk.awsSdkStrings.SensitiveDataColonS3ObjectSlashCredentials
    - typingsSlinky.awsSdk.awsSdkStrings.SensitiveDataColonS3ObjectSlashCustomIdentifier
    - typingsSlinky.awsSdk.awsSdkStrings.PolicyColonIAMUserSlashS3BucketPublic
    - typingsSlinky.awsSdk.awsSdkStrings.PolicyColonIAMUserSlashS3BucketSharedExternally
    - typingsSlinky.awsSdk.awsSdkStrings.PolicyColonIAMUserSlashS3BucketReplicatedExternally
    - typingsSlinky.awsSdk.awsSdkStrings.PolicyColonIAMUserSlashS3BucketEncryptionDisabled
    - typingsSlinky.awsSdk.awsSdkStrings.PolicyColonIAMUserSlashS3BlockPublicAccessDisabled
    - java.lang.String
  */
  type FindingType = typingsSlinky.awsSdk.macie2Mod._FindingType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ARCHIVE
    - typingsSlinky.awsSdk.awsSdkStrings.NOOP
    - java.lang.String
  */
  type FindingsFilterAction = typingsSlinky.awsSdk.macie2Mod._FindingsFilterAction | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.resourcesAffectedDots3BucketDotname
    - typingsSlinky.awsSdk.awsSdkStrings.type__
    - typingsSlinky.awsSdk.awsSdkStrings.classificationDetailsDotjobId
    - typingsSlinky.awsSdk.awsSdkStrings.severityDotdescription
    - java.lang.String
  */
  type GroupBy = typingsSlinky.awsSdk.macie2Mod._GroupBy | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TRUE
    - typingsSlinky.awsSdk.awsSdkStrings.FALSE
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type IsDefinedInJob = typingsSlinky.awsSdk.macie2Mod._IsDefinedInJob | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TRUE
    - typingsSlinky.awsSdk.awsSdkStrings.FALSE
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type IsMonitoredByJob = typingsSlinky.awsSdk.macie2Mod._IsMonitoredByJob | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EQ
    - typingsSlinky.awsSdk.awsSdkStrings.GT
    - typingsSlinky.awsSdk.awsSdkStrings.GTE
    - typingsSlinky.awsSdk.awsSdkStrings.LT
    - typingsSlinky.awsSdk.awsSdkStrings.LTE
    - typingsSlinky.awsSdk.awsSdkStrings.NE
    - typingsSlinky.awsSdk.awsSdkStrings.CONTAINS
    - java.lang.String
  */
  type JobComparator = typingsSlinky.awsSdk.macie2Mod._JobComparator | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.PAUSED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.IDLE
    - typingsSlinky.awsSdk.awsSdkStrings.USER_PAUSED
    - java.lang.String
  */
  type JobStatus = typingsSlinky.awsSdk.macie2Mod._JobStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ONE_TIME
    - typingsSlinky.awsSdk.awsSdkStrings.SCHEDULED
    - java.lang.String
  */
  type JobType = typingsSlinky.awsSdk.macie2Mod._JobType | java.lang.String
  
  type KeyValuePairList = js.Array[typingsSlinky.awsSdk.macie2Mod.KeyValuePair]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type LastRunErrorStatusCode = typingsSlinky.awsSdk.macie2Mod._LastRunErrorStatusCode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.jobType
    - typingsSlinky.awsSdk.awsSdkStrings.jobStatus_
    - typingsSlinky.awsSdk.awsSdkStrings.createdAt_
    - typingsSlinky.awsSdk.awsSdkStrings.name__
    - java.lang.String
  */
  type ListJobsFilterKey = typingsSlinky.awsSdk.macie2Mod._ListJobsFilterKey | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.createdAt_
    - typingsSlinky.awsSdk.awsSdkStrings.jobStatus_
    - typingsSlinky.awsSdk.awsSdkStrings.name__
    - typingsSlinky.awsSdk.awsSdkStrings.jobType
    - java.lang.String
  */
  type ListJobsSortAttributeName = typingsSlinky.awsSdk.macie2Mod._ListJobsSortAttributeName | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PAUSED
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - java.lang.String
  */
  type MacieStatus = typingsSlinky.awsSdk.macie2Mod._MacieStatus | java.lang.String
  
  type MaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ASC
    - typingsSlinky.awsSdk.awsSdkStrings.DESC
    - java.lang.String
  */
  type OrderBy = typingsSlinky.awsSdk.macie2Mod._OrderBy | java.lang.String
  
  type Pages = js.Array[typingsSlinky.awsSdk.macie2Mod.Page]
  
  type Ranges = js.Array[typingsSlinky.awsSdk.macie2Mod.Range]
  
  type Records = js.Array[typingsSlinky.awsSdk.macie2Mod.Record]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Enabled_
    - typingsSlinky.awsSdk.awsSdkStrings.Paused_
    - typingsSlinky.awsSdk.awsSdkStrings.Invited_
    - typingsSlinky.awsSdk.awsSdkStrings.Created_
    - typingsSlinky.awsSdk.awsSdkStrings.Removed_
    - typingsSlinky.awsSdk.awsSdkStrings.Resigned
    - typingsSlinky.awsSdk.awsSdkStrings.EmailVerificationInProgress
    - typingsSlinky.awsSdk.awsSdkStrings.EmailVerificationFailed
    - typingsSlinky.awsSdk.awsSdkStrings.RegionDisabled
    - typingsSlinky.awsSdk.awsSdkStrings.AccountSuspended
    - java.lang.String
  */
  type RelationshipStatus = typingsSlinky.awsSdk.macie2Mod._RelationshipStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BUCKET_CREATION_DATE
    - typingsSlinky.awsSdk.awsSdkStrings.OBJECT_EXTENSION
    - typingsSlinky.awsSdk.awsSdkStrings.OBJECT_LAST_MODIFIED_DATE
    - typingsSlinky.awsSdk.awsSdkStrings.OBJECT_SIZE
    - typingsSlinky.awsSdk.awsSdkStrings.TAG
    - java.lang.String
  */
  type ScopeFilterKey = typingsSlinky.awsSdk.macie2Mod._ScopeFilterKey | java.lang.String
  
  type SensitiveData = js.Array[typingsSlinky.awsSdk.macie2Mod.SensitiveDataItem]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FINANCIAL_INFORMATION
    - typingsSlinky.awsSdk.awsSdkStrings.PERSONAL_INFORMATION
    - typingsSlinky.awsSdk.awsSdkStrings.CREDENTIALS
    - typingsSlinky.awsSdk.awsSdkStrings.CUSTOM_IDENTIFIER
    - java.lang.String
  */
  type SensitiveDataItemCategory = typingsSlinky.awsSdk.macie2Mod._SensitiveDataItemCategory | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Low_
    - typingsSlinky.awsSdk.awsSdkStrings.Medium_
    - typingsSlinky.awsSdk.awsSdkStrings.High_
    - java.lang.String
  */
  type SeverityDescription = typingsSlinky.awsSdk.macie2Mod._SeverityDescription | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EXTERNAL
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_SHARED
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type SharedAccess = typingsSlinky.awsSdk.macie2Mod._SharedAccess | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD
    - typingsSlinky.awsSdk.awsSdkStrings.REDUCED_REDUNDANCY
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD_IA
    - typingsSlinky.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
    - typingsSlinky.awsSdk.awsSdkStrings.DEEP_ARCHIVE
    - typingsSlinky.awsSdk.awsSdkStrings.ONEZONE_IA
    - typingsSlinky.awsSdk.awsSdkStrings.GLACIER
    - java.lang.String
  */
  type StorageClass = typingsSlinky.awsSdk.macie2Mod._StorageClass | java.lang.String
  
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.macie2Mod.string]
  
  type TagTarget = typingsSlinky.awsSdk.awsSdkStrings.S3_OBJECT | java.lang.String
  
  type Unit = typingsSlinky.awsSdk.awsSdkStrings.TERABYTES | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GT
    - typingsSlinky.awsSdk.awsSdkStrings.GTE
    - typingsSlinky.awsSdk.awsSdkStrings.LT
    - typingsSlinky.awsSdk.awsSdkStrings.LTE
    - typingsSlinky.awsSdk.awsSdkStrings.EQ
    - typingsSlinky.awsSdk.awsSdkStrings.NE
    - typingsSlinky.awsSdk.awsSdkStrings.CONTAINS
    - java.lang.String
  */
  type UsageStatisticsFilterComparator = typingsSlinky.awsSdk.macie2Mod._UsageStatisticsFilterComparator | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.accountId_
    - typingsSlinky.awsSdk.awsSdkStrings.serviceLimit
    - typingsSlinky.awsSdk.awsSdkStrings.freeTrialStartDate
    - typingsSlinky.awsSdk.awsSdkStrings.total_
    - java.lang.String
  */
  type UsageStatisticsFilterKey = typingsSlinky.awsSdk.macie2Mod._UsageStatisticsFilterKey | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.accountId_
    - typingsSlinky.awsSdk.awsSdkStrings.total_
    - typingsSlinky.awsSdk.awsSdkStrings.serviceLimitValue
    - typingsSlinky.awsSdk.awsSdkStrings.freeTrialStartDate
    - java.lang.String
  */
  type UsageStatisticsSortKey = typingsSlinky.awsSdk.macie2Mod._UsageStatisticsSortKey | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DATA_INVENTORY_EVALUATION
    - typingsSlinky.awsSdk.awsSdkStrings.SENSITIVE_DATA_DISCOVERY
    - java.lang.String
  */
  type UsageType = typingsSlinky.awsSdk.macie2Mod._UsageType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AssumedRole
    - typingsSlinky.awsSdk.awsSdkStrings.IAMUser
    - typingsSlinky.awsSdk.awsSdkStrings.FederatedUser
    - typingsSlinky.awsSdk.awsSdkStrings.Root_
    - typingsSlinky.awsSdk.awsSdkStrings.AWSAccount
    - typingsSlinky.awsSdk.awsSdkStrings.AWSService
    - java.lang.String
  */
  type UserIdentityType = typingsSlinky.awsSdk.macie2Mod._UserIdentityType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2020-01-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.macie2Mod._apiVersion | java.lang.String
  
  type boolean = scala.Boolean
  
  type double = scala.Double
  
  type integer = scala.Double
  
  type listOfAdminAccount = js.Array[typingsSlinky.awsSdk.macie2Mod.AdminAccount]
  
  type listOfBatchGetCustomDataIdentifierSummary = js.Array[typingsSlinky.awsSdk.macie2Mod.BatchGetCustomDataIdentifierSummary]
  
  type listOfBucketMetadata = js.Array[typingsSlinky.awsSdk.macie2Mod.BucketMetadata]
  
  type listOfCustomDataIdentifierSummary = js.Array[typingsSlinky.awsSdk.macie2Mod.CustomDataIdentifierSummary]
  
  type listOfFinding = js.Array[typingsSlinky.awsSdk.macie2Mod.Finding]
  
  type listOfFindingType = js.Array[typingsSlinky.awsSdk.macie2Mod.FindingType]
  
  type listOfFindingsFilterListItem = js.Array[typingsSlinky.awsSdk.macie2Mod.FindingsFilterListItem]
  
  type listOfGroupCount = js.Array[typingsSlinky.awsSdk.macie2Mod.GroupCount]
  
  type listOfInvitation = js.Array[typingsSlinky.awsSdk.macie2Mod.Invitation]
  
  type listOfJobScopeTerm = js.Array[typingsSlinky.awsSdk.macie2Mod.JobScopeTerm]
  
  type listOfJobSummary = js.Array[typingsSlinky.awsSdk.macie2Mod.JobSummary]
  
  type listOfKeyValuePair = js.Array[typingsSlinky.awsSdk.macie2Mod.KeyValuePair]
  
  type listOfListJobsFilterTerm = js.Array[typingsSlinky.awsSdk.macie2Mod.ListJobsFilterTerm]
  
  type listOfMember = js.Array[typingsSlinky.awsSdk.macie2Mod.Member]
  
  type listOfS3BucketDefinitionForJob = js.Array[typingsSlinky.awsSdk.macie2Mod.S3BucketDefinitionForJob]
  
  type listOfString = js.Array[typingsSlinky.awsSdk.macie2Mod.string]
  
  type listOfTagValuePair = js.Array[typingsSlinky.awsSdk.macie2Mod.TagValuePair]
  
  type listOfUnprocessedAccount = js.Array[typingsSlinky.awsSdk.macie2Mod.UnprocessedAccount]
  
  type listOfUsageByAccount = js.Array[typingsSlinky.awsSdk.macie2Mod.UsageByAccount]
  
  type listOfUsageRecord = js.Array[typingsSlinky.awsSdk.macie2Mod.UsageRecord]
  
  type listOfUsageStatisticsFilter = js.Array[typingsSlinky.awsSdk.macie2Mod.UsageStatisticsFilter]
  
  type listOfUsageTotal = js.Array[typingsSlinky.awsSdk.macie2Mod.UsageTotal]
  
  type long = scala.Double
  
  type string = java.lang.String
  
  type timestampIso8601 = js.Date
}
