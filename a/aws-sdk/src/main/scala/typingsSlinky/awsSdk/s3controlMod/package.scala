package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object s3controlMod {
  type AccessPointList = js.Array[typingsSlinky.awsSdk.s3controlMod.AccessPoint]
  type AccessPointName = java.lang.String
  type AccountId = java.lang.String
  type Boolean = scala.Boolean
  type BucketName = java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.configUseDualstackMod.UseDualstackConfigOptions with typingsSlinky.awsSdk.s3controlMod.ClientApiVersions
  type ConfirmationRequired = scala.Boolean
  type CreationDate = js.Date
  type IAMRoleArn = java.lang.String
  type IsPublic = scala.Boolean
  type JobArn = java.lang.String
  type JobCreationTime = js.Date
  type JobFailureCode = java.lang.String
  type JobFailureList = js.Array[typingsSlinky.awsSdk.s3controlMod.JobFailure]
  type JobFailureReason = java.lang.String
  type JobId = java.lang.String
  type JobListDescriptorList = js.Array[typingsSlinky.awsSdk.s3controlMod.JobListDescriptor]
  type JobManifestFieldList = js.Array[typingsSlinky.awsSdk.s3controlMod.JobManifestFieldName]
  type JobNumberOfTasksFailed = scala.Double
  type JobNumberOfTasksSucceeded = scala.Double
  type JobPriority = scala.Double
  type JobStatusList = js.Array[typingsSlinky.awsSdk.s3controlMod.JobStatus]
  type JobStatusUpdateReason = java.lang.String
  type JobTerminationDate = js.Date
  type JobTotalNumberOfTasks = scala.Double
  type KmsKeyArnString = java.lang.String
  type MaxLength1024String = java.lang.String
  type MaxResults = scala.Double
  type NonEmptyMaxLength1024String = java.lang.String
  type NonEmptyMaxLength2048String = java.lang.String
  type NonEmptyMaxLength256String = java.lang.String
  type NonEmptyMaxLength64String = java.lang.String
  type Policy = java.lang.String
  type ReportPrefixString = java.lang.String
  type S3BucketArnString = java.lang.String
  type S3ContentLength = scala.Double
  type S3ExpirationInDays = scala.Double
  type S3GrantList = js.Array[typingsSlinky.awsSdk.s3controlMod.S3Grant]
  type S3KeyArnString = java.lang.String
  type S3ObjectVersionId = java.lang.String
  type S3TagSet = js.Array[typingsSlinky.awsSdk.s3controlMod.S3Tag]
  type S3UserMetadata = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.s3controlMod.MaxLength1024String]
  type Setting = scala.Boolean
  type SuspendedCause = java.lang.String
  type SuspendedDate = js.Date
  type TimeStamp = js.Date
  type VpcId = java.lang.String
}
