package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object s3controlMod {
  
  type AccessPointList = js.Array[typingsSlinky.awsSdk.s3controlMod.AccessPoint]
  
  type AccessPointName = java.lang.String
  
  type AccountId = java.lang.String
  
  type AwsOrgArn = java.lang.String
  
  type Boolean = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.private__
    - typingsSlinky.awsSdk.awsSdkStrings.`public-read`
    - typingsSlinky.awsSdk.awsSdkStrings.`public-read-write`
    - typingsSlinky.awsSdk.awsSdkStrings.`authenticated-read`
    - java.lang.String
  */
  type BucketCannedACL = typingsSlinky.awsSdk.s3controlMod._BucketCannedACL | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EU
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-west-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-west-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-west-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-south-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-southeast-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-southeast-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-northeast-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`sa-east-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`cn-north-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-central-1`
    - java.lang.String
  */
  type BucketLocationConstraint = typingsSlinky.awsSdk.s3controlMod._BucketLocationConstraint | java.lang.String
  
  type BucketName = java.lang.String
  
  type Buckets = js.Array[typingsSlinky.awsSdk.s3controlMod.S3BucketArnString]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.configUseDualstackMod.UseDualstackConfigOptions with typingsSlinky.awsSdk.s3controlMod.ClientApiVersions
  
  type ConfigId = java.lang.String
  
  type ConfirmRemoveSelfBucketAccess = scala.Boolean
  
  type ConfirmationRequired = scala.Boolean
  
  type ContinuationToken = java.lang.String
  
  type CreationDate = js.Date
  
  type Date = js.Date
  
  type Days = scala.Double
  
  type DaysAfterInitiation = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Enabled_
    - typingsSlinky.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type ExpirationStatus = typingsSlinky.awsSdk.s3controlMod._ExpirationStatus | java.lang.String
  
  type ExpiredObjectDeleteMarker = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CSV
    - typingsSlinky.awsSdk.awsSdkStrings.Parquet_
    - java.lang.String
  */
  type Format = typingsSlinky.awsSdk.s3controlMod._Format | java.lang.String
  
  type FunctionArnString = java.lang.String
  
  type GrantFullControl = java.lang.String
  
  type GrantRead = java.lang.String
  
  type GrantReadACP = java.lang.String
  
  type GrantWrite = java.lang.String
  
  type GrantWriteACP = java.lang.String
  
  type IAMRoleArn = java.lang.String
  
  type ID = java.lang.String
  
  type IsEnabled = scala.Boolean
  
  type IsPublic = scala.Boolean
  
  type JobArn = java.lang.String
  
  type JobCreationTime = js.Date
  
  type JobFailureCode = java.lang.String
  
  type JobFailureList = js.Array[typingsSlinky.awsSdk.s3controlMod.JobFailure]
  
  type JobFailureReason = java.lang.String
  
  type JobId = java.lang.String
  
  type JobListDescriptorList = js.Array[typingsSlinky.awsSdk.s3controlMod.JobListDescriptor]
  
  type JobManifestFieldList = js.Array[typingsSlinky.awsSdk.s3controlMod.JobManifestFieldName]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Ignore_
    - typingsSlinky.awsSdk.awsSdkStrings.Bucket
    - typingsSlinky.awsSdk.awsSdkStrings.Key_
    - typingsSlinky.awsSdk.awsSdkStrings.VersionId
    - java.lang.String
  */
  type JobManifestFieldName = typingsSlinky.awsSdk.s3controlMod._JobManifestFieldName | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.S3BatchOperations_CSV_20180820
    - typingsSlinky.awsSdk.awsSdkStrings.S3InventoryReport_CSV_20161130
    - java.lang.String
  */
  type JobManifestFormat = typingsSlinky.awsSdk.s3controlMod._JobManifestFormat | java.lang.String
  
  type JobNumberOfTasksFailed = scala.Double
  
  type JobNumberOfTasksSucceeded = scala.Double
  
  type JobPriority = scala.Double
  
  type JobReportFormat = typingsSlinky.awsSdk.awsSdkStrings.Report_CSV_20180820 | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AllTasks
    - typingsSlinky.awsSdk.awsSdkStrings.FailedTasksOnly
    - java.lang.String
  */
  type JobReportScope = typingsSlinky.awsSdk.s3controlMod._JobReportScope | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Active_
    - typingsSlinky.awsSdk.awsSdkStrings.Cancelled_
    - typingsSlinky.awsSdk.awsSdkStrings.Cancelling_
    - typingsSlinky.awsSdk.awsSdkStrings.Complete_
    - typingsSlinky.awsSdk.awsSdkStrings.Completing_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Failing_
    - typingsSlinky.awsSdk.awsSdkStrings.New_
    - typingsSlinky.awsSdk.awsSdkStrings.Paused_
    - typingsSlinky.awsSdk.awsSdkStrings.Pausing
    - typingsSlinky.awsSdk.awsSdkStrings.Preparing_
    - typingsSlinky.awsSdk.awsSdkStrings.Ready_
    - typingsSlinky.awsSdk.awsSdkStrings.Suspended_
    - java.lang.String
  */
  type JobStatus = typingsSlinky.awsSdk.s3controlMod._JobStatus | java.lang.String
  
  type JobStatusList = js.Array[typingsSlinky.awsSdk.s3controlMod.JobStatus]
  
  type JobStatusUpdateReason = java.lang.String
  
  type JobTerminationDate = js.Date
  
  type JobTotalNumberOfTasks = scala.Double
  
  type KmsKeyArnString = java.lang.String
  
  type LifecycleRules = js.Array[typingsSlinky.awsSdk.s3controlMod.LifecycleRule]
  
  type Location = java.lang.String
  
  type MaxLength1024String = java.lang.String
  
  type MaxResults = scala.Double
  
  type MinStorageBytesPercentage = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Internet_
    - typingsSlinky.awsSdk.awsSdkStrings.VPC
    - java.lang.String
  */
  type NetworkOrigin = typingsSlinky.awsSdk.s3controlMod._NetworkOrigin | java.lang.String
  
  type NonEmptyMaxLength1024String = java.lang.String
  
  type NonEmptyMaxLength2048String = java.lang.String
  
  type NonEmptyMaxLength256String = java.lang.String
  
  type NonEmptyMaxLength64String = java.lang.String
  
  type NoncurrentVersionTransitionList = js.Array[typingsSlinky.awsSdk.s3controlMod.NoncurrentVersionTransition]
  
  type ObjectLockEnabledForBucket = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.LambdaInvoke
    - typingsSlinky.awsSdk.awsSdkStrings.S3PutObjectCopy
    - typingsSlinky.awsSdk.awsSdkStrings.S3PutObjectAcl
    - typingsSlinky.awsSdk.awsSdkStrings.S3PutObjectTagging
    - typingsSlinky.awsSdk.awsSdkStrings.S3InitiateRestoreObject
    - typingsSlinky.awsSdk.awsSdkStrings.S3PutObjectLegalHold
    - typingsSlinky.awsSdk.awsSdkStrings.S3PutObjectRetention
    - java.lang.String
  */
  type OperationName = typingsSlinky.awsSdk.s3controlMod._OperationName | java.lang.String
  
  type OutputSchemaVersion = typingsSlinky.awsSdk.awsSdkStrings.V_1 | java.lang.String
  
  type Policy = java.lang.String
  
  type Prefix = java.lang.String
  
  type PublicAccessBlockEnabled = scala.Boolean
  
  type RegionalBucketList = js.Array[typingsSlinky.awsSdk.s3controlMod.RegionalBucket]
  
  type Regions = js.Array[typingsSlinky.awsSdk.s3controlMod.S3AWSRegion]
  
  type ReportPrefixString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Cancelled_
    - typingsSlinky.awsSdk.awsSdkStrings.Ready_
    - java.lang.String
  */
  type RequestedJobStatus = typingsSlinky.awsSdk.s3controlMod._RequestedJobStatus | java.lang.String
  
  type S3AWSRegion = java.lang.String
  
  type S3AccessPointArn = java.lang.String
  
  type S3BucketArnString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.private__
    - typingsSlinky.awsSdk.awsSdkStrings.`public-read`
    - typingsSlinky.awsSdk.awsSdkStrings.`public-read-write`
    - typingsSlinky.awsSdk.awsSdkStrings.`aws-exec-read`
    - typingsSlinky.awsSdk.awsSdkStrings.`authenticated-read`
    - typingsSlinky.awsSdk.awsSdkStrings.`bucket-owner-read`
    - typingsSlinky.awsSdk.awsSdkStrings.`bucket-owner-full-control`
    - java.lang.String
  */
  type S3CannedAccessControlList = typingsSlinky.awsSdk.s3controlMod._S3CannedAccessControlList | java.lang.String
  
  type S3ContentLength = scala.Double
  
  type S3ExpirationInDays = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BULK
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD
    - java.lang.String
  */
  type S3GlacierJobTier = typingsSlinky.awsSdk.s3controlMod._S3GlacierJobTier | java.lang.String
  
  type S3GrantList = js.Array[typingsSlinky.awsSdk.s3controlMod.S3Grant]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.id__
    - typingsSlinky.awsSdk.awsSdkStrings.emailAddress_
    - typingsSlinky.awsSdk.awsSdkStrings.uri_
    - java.lang.String
  */
  type S3GranteeTypeIdentifier = typingsSlinky.awsSdk.s3controlMod._S3GranteeTypeIdentifier | java.lang.String
  
  type S3KeyArnString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.COPY
    - typingsSlinky.awsSdk.awsSdkStrings.REPLACE
    - java.lang.String
  */
  type S3MetadataDirective = typingsSlinky.awsSdk.s3controlMod._S3MetadataDirective | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OFF
    - typingsSlinky.awsSdk.awsSdkStrings.ON
    - java.lang.String
  */
  type S3ObjectLockLegalHoldStatus = typingsSlinky.awsSdk.s3controlMod._S3ObjectLockLegalHoldStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLIANCE
    - typingsSlinky.awsSdk.awsSdkStrings.GOVERNANCE
    - java.lang.String
  */
  type S3ObjectLockMode = typingsSlinky.awsSdk.s3controlMod._S3ObjectLockMode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLIANCE
    - typingsSlinky.awsSdk.awsSdkStrings.GOVERNANCE
    - java.lang.String
  */
  type S3ObjectLockRetentionMode = typingsSlinky.awsSdk.s3controlMod._S3ObjectLockRetentionMode | java.lang.String
  
  type S3ObjectVersionId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FULL_CONTROL
    - typingsSlinky.awsSdk.awsSdkStrings.READ
    - typingsSlinky.awsSdk.awsSdkStrings.WRITE
    - typingsSlinky.awsSdk.awsSdkStrings.READ_ACP
    - typingsSlinky.awsSdk.awsSdkStrings.WRITE_ACP
    - java.lang.String
  */
  type S3Permission = typingsSlinky.awsSdk.s3controlMod._S3Permission | java.lang.String
  
  type S3RegionalBucketArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AES256
    - typingsSlinky.awsSdk.awsSdkStrings.KMS
    - java.lang.String
  */
  type S3SSEAlgorithm = typingsSlinky.awsSdk.s3controlMod._S3SSEAlgorithm | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD_IA
    - typingsSlinky.awsSdk.awsSdkStrings.ONEZONE_IA
    - typingsSlinky.awsSdk.awsSdkStrings.GLACIER
    - typingsSlinky.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
    - typingsSlinky.awsSdk.awsSdkStrings.DEEP_ARCHIVE
    - java.lang.String
  */
  type S3StorageClass = typingsSlinky.awsSdk.s3controlMod._S3StorageClass | java.lang.String
  
  type S3TagSet = js.Array[typingsSlinky.awsSdk.s3controlMod.S3Tag]
  
  type S3UserMetadata = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.s3controlMod.MaxLength1024String]
  
  type SSEKMSKeyId = java.lang.String
  
  type Setting = scala.Boolean
  
  type StorageLensArn = java.lang.String
  
  type StorageLensConfigurationList = js.Array[typingsSlinky.awsSdk.s3controlMod.ListStorageLensConfigurationEntry]
  
  type StorageLensPrefixLevelDelimiter = java.lang.String
  
  type StorageLensPrefixLevelMaxDepth = scala.Double
  
  type StorageLensTags = js.Array[typingsSlinky.awsSdk.s3controlMod.StorageLensTag]
  
  type StringForNextToken = java.lang.String
  
  type SuspendedCause = java.lang.String
  
  type SuspendedDate = js.Date
  
  type TagKeyString = java.lang.String
  
  type TagValueString = java.lang.String
  
  type TimeStamp = js.Date
  
  type TransitionList = js.Array[typingsSlinky.awsSdk.s3controlMod.Transition]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GLACIER
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD_IA
    - typingsSlinky.awsSdk.awsSdkStrings.ONEZONE_IA
    - typingsSlinky.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
    - typingsSlinky.awsSdk.awsSdkStrings.DEEP_ARCHIVE
    - java.lang.String
  */
  type TransitionStorageClass = typingsSlinky.awsSdk.s3controlMod._TransitionStorageClass | java.lang.String
  
  type VpcId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-08-20`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.s3controlMod._apiVersion | java.lang.String
}
