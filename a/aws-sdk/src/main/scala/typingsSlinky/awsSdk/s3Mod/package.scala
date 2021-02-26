package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object s3Mod {
  
  type AbortDate = js.Date
  
  type AbortRuleId = java.lang.String
  
  type AcceptRanges = java.lang.String
  
  type AccountId = java.lang.String
  
  type AllowQuotedRecordDelimiter = scala.Boolean
  
  type AllowedHeader = java.lang.String
  
  type AllowedHeaders = js.Array[typingsSlinky.awsSdk.s3Mod.AllowedHeader]
  
  type AllowedMethod = java.lang.String
  
  type AllowedMethods = js.Array[typingsSlinky.awsSdk.s3Mod.AllowedMethod]
  
  type AllowedOrigin = java.lang.String
  
  type AllowedOrigins = js.Array[typingsSlinky.awsSdk.s3Mod.AllowedOrigin]
  
  type AnalyticsConfigurationList = js.Array[typingsSlinky.awsSdk.s3Mod.AnalyticsConfiguration]
  
  type AnalyticsId = java.lang.String
  
  type AnalyticsS3ExportFileFormat = typingsSlinky.awsSdk.awsSdkStrings.CSV | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ARCHIVE_ACCESS
    - typingsSlinky.awsSdk.awsSdkStrings.DEEP_ARCHIVE_ACCESS
    - java.lang.String
  */
  type ArchiveStatus = typingsSlinky.awsSdk.s3Mod._ArchiveStatus | java.lang.String
  
  type Body = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.s3Mod.Blob | java.lang.String | typingsSlinky.node.streamMod.Readable
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Enabled_
    - typingsSlinky.awsSdk.awsSdkStrings.Suspended_
    - java.lang.String
  */
  type BucketAccelerateStatus = typingsSlinky.awsSdk.s3Mod._BucketAccelerateStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.private__
    - typingsSlinky.awsSdk.awsSdkStrings.`public-read`
    - typingsSlinky.awsSdk.awsSdkStrings.`public-read-write`
    - typingsSlinky.awsSdk.awsSdkStrings.`authenticated-read`
    - java.lang.String
  */
  type BucketCannedACL = typingsSlinky.awsSdk.s3Mod._BucketCannedACL | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`af-south-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-east-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-northeast-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-northeast-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-northeast-3`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-south-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-southeast-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-southeast-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`ca-central-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`cn-north-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`cn-northwest-1`
    - typingsSlinky.awsSdk.awsSdkStrings.EU
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-central-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-north-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-south-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-west-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-west-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-west-3`
    - typingsSlinky.awsSdk.awsSdkStrings.`me-south-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`sa-east-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-east-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-gov-east-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-gov-west-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-west-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-west-2`
    - java.lang.String
  */
  type BucketLocationConstraint = typingsSlinky.awsSdk.s3Mod._BucketLocationConstraint | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FULL_CONTROL
    - typingsSlinky.awsSdk.awsSdkStrings.READ
    - typingsSlinky.awsSdk.awsSdkStrings.WRITE
    - java.lang.String
  */
  type BucketLogsPermission = typingsSlinky.awsSdk.s3Mod._BucketLogsPermission | java.lang.String
  
  type BucketName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Enabled_
    - typingsSlinky.awsSdk.awsSdkStrings.Suspended_
    - java.lang.String
  */
  type BucketVersioningStatus = typingsSlinky.awsSdk.s3Mod._BucketVersioningStatus | java.lang.String
  
  type Buckets = js.Array[typingsSlinky.awsSdk.s3Mod.Bucket]
  
  type BypassGovernanceRetention = scala.Boolean
  
  type BytesProcessed = scala.Double
  
  type BytesReturned = scala.Double
  
  type BytesScanned = scala.Double
  
  type CORSRules = js.Array[typingsSlinky.awsSdk.s3Mod.CORSRule]
  
  type CacheControl = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.configUseDualstackMod.UseDualstackConfigOptions with typingsSlinky.awsSdk.s3Mod.ClientApiVersions
  
  type CloudFunction = java.lang.String
  
  type CloudFunctionInvocationRole = java.lang.String
  
  type Code = java.lang.String
  
  type Comments = java.lang.String
  
  type CommonPrefixList = js.Array[typingsSlinky.awsSdk.s3Mod.CommonPrefix]
  
  type CompletedPartList = js.Array[typingsSlinky.awsSdk.s3Mod.CompletedPart]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.GZIP
    - typingsSlinky.awsSdk.awsSdkStrings.BZIP2
    - java.lang.String
  */
  type CompressionType = typingsSlinky.awsSdk.s3Mod._CompressionType | java.lang.String
  
  type ConfirmRemoveSelfBucketAccess = scala.Boolean
  
  type ContentDisposition = java.lang.String
  
  type ContentEncoding = java.lang.String
  
  type ContentLanguage = java.lang.String
  
  type ContentLength = scala.Double
  
  type ContentMD5 = java.lang.String
  
  type ContentRange = java.lang.String
  
  type ContentType = java.lang.String
  
  type CopySource = java.lang.String
  
  type CopySourceIfMatch = java.lang.String
  
  type CopySourceIfModifiedSince = js.Date
  
  type CopySourceIfNoneMatch = java.lang.String
  
  type CopySourceIfUnmodifiedSince = js.Date
  
  type CopySourceRange = java.lang.String
  
  type CopySourceSSECustomerAlgorithm = java.lang.String
  
  type CopySourceSSECustomerKey = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.s3Mod.Blob | java.lang.String
  
  type CopySourceSSECustomerKeyMD5 = java.lang.String
  
  type CopySourceVersionId = java.lang.String
  
  type CreationDate = js.Date
  
  type Date = js.Date
  
  type Days = scala.Double
  
  type DaysAfterInitiation = scala.Double
  
  type DeleteMarker = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Enabled_
    - typingsSlinky.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type DeleteMarkerReplicationStatus = typingsSlinky.awsSdk.s3Mod._DeleteMarkerReplicationStatus | java.lang.String
  
  type DeleteMarkerVersionId = java.lang.String
  
  type DeleteMarkers = js.Array[typingsSlinky.awsSdk.s3Mod.DeleteMarkerEntry]
  
  type DeletedObjects = js.Array[typingsSlinky.awsSdk.s3Mod.DeletedObject]
  
  type Delimiter = java.lang.String
  
  type Description = java.lang.String
  
  type DisplayName = java.lang.String
  
  type ETag = java.lang.String
  
  type EmailAddress = java.lang.String
  
  type EnableRequestProgress = scala.Boolean
  
  type EncodingType = typingsSlinky.awsSdk.awsSdkStrings.url_ | java.lang.String
  
  type End = scala.Double
  
  type Errors = js.Array[typingsSlinky.awsSdk.s3Mod.Error]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.s3ColonReducedRedundancyLostObject
    - typingsSlinky.awsSdk.awsSdkStrings.s3ColonObjectCreatedColonAsterisk
    - typingsSlinky.awsSdk.awsSdkStrings.s3ColonObjectCreatedColonPut
    - typingsSlinky.awsSdk.awsSdkStrings.s3ColonObjectCreatedColonPost
    - typingsSlinky.awsSdk.awsSdkStrings.s3ColonObjectCreatedColonCopy
    - typingsSlinky.awsSdk.awsSdkStrings.s3ColonObjectCreatedColonCompleteMultipartUpload
    - typingsSlinky.awsSdk.awsSdkStrings.s3ColonObjectRemovedColonAsterisk
    - typingsSlinky.awsSdk.awsSdkStrings.s3ColonObjectRemovedColonDelete
    - typingsSlinky.awsSdk.awsSdkStrings.s3ColonObjectRemovedColonDeleteMarkerCreated
    - typingsSlinky.awsSdk.awsSdkStrings.s3ColonObjectRestoreColonAsterisk
    - typingsSlinky.awsSdk.awsSdkStrings.s3ColonObjectRestoreColonPost
    - typingsSlinky.awsSdk.awsSdkStrings.s3ColonObjectRestoreColonCompleted
    - typingsSlinky.awsSdk.awsSdkStrings.s3ColonReplicationColonAsterisk
    - typingsSlinky.awsSdk.awsSdkStrings.s3ColonReplicationColonOperationFailedReplication
    - typingsSlinky.awsSdk.awsSdkStrings.s3ColonReplicationColonOperationNotTracked
    - typingsSlinky.awsSdk.awsSdkStrings.s3ColonReplicationColonOperationMissedThreshold
    - typingsSlinky.awsSdk.awsSdkStrings.s3ColonReplicationColonOperationReplicatedAfterThreshold
    - java.lang.String
  */
  type Event = typingsSlinky.awsSdk.s3Mod._Event | java.lang.String
  
  type EventList = js.Array[typingsSlinky.awsSdk.s3Mod.Event]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Enabled_
    - typingsSlinky.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type ExistingObjectReplicationStatus = typingsSlinky.awsSdk.s3Mod._ExistingObjectReplicationStatus | java.lang.String
  
  type Expiration = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Enabled_
    - typingsSlinky.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type ExpirationStatus = typingsSlinky.awsSdk.s3Mod._ExpirationStatus | java.lang.String
  
  type ExpiredObjectDeleteMarker = scala.Boolean
  
  type Expires = js.Date
  
  type ExposeHeader = java.lang.String
  
  type ExposeHeaders = js.Array[typingsSlinky.awsSdk.s3Mod.ExposeHeader]
  
  type Expression = java.lang.String
  
  type ExpressionType = typingsSlinky.awsSdk.awsSdkStrings.SQL | java.lang.String
  
  type FetchOwner = scala.Boolean
  
  type FieldDelimiter = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.USE
    - typingsSlinky.awsSdk.awsSdkStrings.IGNORE
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type FileHeaderInfo = typingsSlinky.awsSdk.s3Mod._FileHeaderInfo | java.lang.String
  
  type FilterRuleList = js.Array[typingsSlinky.awsSdk.s3Mod.FilterRule]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.prefix_
    - typingsSlinky.awsSdk.awsSdkStrings.suffix
    - java.lang.String
  */
  type FilterRuleName = typingsSlinky.awsSdk.s3Mod._FilterRuleName | java.lang.String
  
  type FilterRuleValue = java.lang.String
  
  type GrantFullControl = java.lang.String
  
  type GrantRead = java.lang.String
  
  type GrantReadACP = java.lang.String
  
  type GrantWrite = java.lang.String
  
  type GrantWriteACP = java.lang.String
  
  type Grants = js.Array[typingsSlinky.awsSdk.s3Mod.Grant]
  
  type HostName = java.lang.String
  
  type HttpErrorCodeReturnedEquals = java.lang.String
  
  type HttpRedirectCode = java.lang.String
  
  type ID = java.lang.String
  
  type IfMatch = java.lang.String
  
  type IfModifiedSince = js.Date
  
  type IfNoneMatch = java.lang.String
  
  type IfUnmodifiedSince = js.Date
  
  type Initiated = js.Date
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ARCHIVE_ACCESS
    - typingsSlinky.awsSdk.awsSdkStrings.DEEP_ARCHIVE_ACCESS
    - java.lang.String
  */
  type IntelligentTieringAccessTier = typingsSlinky.awsSdk.s3Mod._IntelligentTieringAccessTier | java.lang.String
  
  type IntelligentTieringConfigurationList = js.Array[typingsSlinky.awsSdk.s3Mod.IntelligentTieringConfiguration]
  
  type IntelligentTieringDays = scala.Double
  
  type IntelligentTieringId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Enabled_
    - typingsSlinky.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type IntelligentTieringStatus = typingsSlinky.awsSdk.s3Mod._IntelligentTieringStatus | java.lang.String
  
  type InventoryConfigurationList = js.Array[typingsSlinky.awsSdk.s3Mod.InventoryConfiguration]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CSV
    - typingsSlinky.awsSdk.awsSdkStrings.ORC
    - typingsSlinky.awsSdk.awsSdkStrings.Parquet_
    - java.lang.String
  */
  type InventoryFormat = typingsSlinky.awsSdk.s3Mod._InventoryFormat | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Daily_
    - typingsSlinky.awsSdk.awsSdkStrings.Weekly_
    - java.lang.String
  */
  type InventoryFrequency = typingsSlinky.awsSdk.s3Mod._InventoryFrequency | java.lang.String
  
  type InventoryId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.All_
    - typingsSlinky.awsSdk.awsSdkStrings.Current_
    - java.lang.String
  */
  type InventoryIncludedObjectVersions = typingsSlinky.awsSdk.s3Mod._InventoryIncludedObjectVersions | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Size_
    - typingsSlinky.awsSdk.awsSdkStrings.LastModifiedDate
    - typingsSlinky.awsSdk.awsSdkStrings.StorageClass
    - typingsSlinky.awsSdk.awsSdkStrings.ETag
    - typingsSlinky.awsSdk.awsSdkStrings.IsMultipartUploaded
    - typingsSlinky.awsSdk.awsSdkStrings.ReplicationStatus
    - typingsSlinky.awsSdk.awsSdkStrings.EncryptionStatus
    - typingsSlinky.awsSdk.awsSdkStrings.ObjectLockRetainUntilDate
    - typingsSlinky.awsSdk.awsSdkStrings.ObjectLockMode
    - typingsSlinky.awsSdk.awsSdkStrings.ObjectLockLegalHoldStatus
    - typingsSlinky.awsSdk.awsSdkStrings.IntelligentTieringAccessTier
    - java.lang.String
  */
  type InventoryOptionalField = typingsSlinky.awsSdk.s3Mod._InventoryOptionalField | java.lang.String
  
  type InventoryOptionalFields = js.Array[typingsSlinky.awsSdk.s3Mod.InventoryOptionalField]
  
  type IsEnabled = scala.Boolean
  
  type IsLatest = scala.Boolean
  
  type IsPublic = scala.Boolean
  
  type IsTruncated = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT
    - typingsSlinky.awsSdk.awsSdkStrings.LINES
    - java.lang.String
  */
  type JSONType = typingsSlinky.awsSdk.s3Mod._JSONType | java.lang.String
  
  type KMSContext = java.lang.String
  
  type KeyCount = scala.Double
  
  type KeyMarker = java.lang.String
  
  type KeyPrefixEquals = java.lang.String
  
  type LambdaFunctionArn = java.lang.String
  
  type LambdaFunctionConfigurationList = js.Array[typingsSlinky.awsSdk.s3Mod.LambdaFunctionConfiguration]
  
  type LastModified = js.Date
  
  type LifecycleRules = js.Array[typingsSlinky.awsSdk.s3Mod.LifecycleRule]
  
  type Location = java.lang.String
  
  type LocationPrefix = java.lang.String
  
  type MFA = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Enabled_
    - typingsSlinky.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type MFADelete = typingsSlinky.awsSdk.s3Mod._MFADelete | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Enabled_
    - typingsSlinky.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type MFADeleteStatus = typingsSlinky.awsSdk.s3Mod._MFADeleteStatus | java.lang.String
  
  type Marker = java.lang.String
  
  type MaxAgeSeconds = scala.Double
  
  type MaxKeys = scala.Double
  
  type MaxParts = scala.Double
  
  type MaxUploads = scala.Double
  
  type Message = java.lang.String
  
  type Metadata = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.s3Mod.MetadataValue]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.COPY
    - typingsSlinky.awsSdk.awsSdkStrings.REPLACE
    - java.lang.String
  */
  type MetadataDirective = typingsSlinky.awsSdk.s3Mod._MetadataDirective | java.lang.String
  
  type MetadataKey = java.lang.String
  
  type MetadataValue = java.lang.String
  
  type MetricsConfigurationList = js.Array[typingsSlinky.awsSdk.s3Mod.MetricsConfiguration]
  
  type MetricsId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Enabled_
    - typingsSlinky.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type MetricsStatus = typingsSlinky.awsSdk.s3Mod._MetricsStatus | java.lang.String
  
  type Minutes = scala.Double
  
  type MissingMeta = scala.Double
  
  type MultipartUploadId = java.lang.String
  
  type MultipartUploadList = js.Array[typingsSlinky.awsSdk.s3Mod.MultipartUpload]
  
  type NextKeyMarker = java.lang.String
  
  type NextMarker = java.lang.String
  
  type NextPartNumberMarker = scala.Double
  
  type NextToken = java.lang.String
  
  type NextUploadIdMarker = java.lang.String
  
  type NextVersionIdMarker = java.lang.String
  
  type NoncurrentVersionTransitionList = js.Array[typingsSlinky.awsSdk.s3Mod.NoncurrentVersionTransition]
  
  type NotificationId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.private__
    - typingsSlinky.awsSdk.awsSdkStrings.`public-read`
    - typingsSlinky.awsSdk.awsSdkStrings.`public-read-write`
    - typingsSlinky.awsSdk.awsSdkStrings.`authenticated-read`
    - typingsSlinky.awsSdk.awsSdkStrings.`aws-exec-read`
    - typingsSlinky.awsSdk.awsSdkStrings.`bucket-owner-read`
    - typingsSlinky.awsSdk.awsSdkStrings.`bucket-owner-full-control`
    - java.lang.String
  */
  type ObjectCannedACL = typingsSlinky.awsSdk.s3Mod._ObjectCannedACL | java.lang.String
  
  type ObjectIdentifierList = js.Array[typingsSlinky.awsSdk.s3Mod.ObjectIdentifier]
  
  type ObjectKey = java.lang.String
  
  type ObjectList = js.Array[typingsSlinky.awsSdk.s3Mod.Object]
  
  type ObjectLockEnabled = typingsSlinky.awsSdk.awsSdkStrings.Enabled_ | java.lang.String
  
  type ObjectLockEnabledForBucket = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ON
    - typingsSlinky.awsSdk.awsSdkStrings.OFF
    - java.lang.String
  */
  type ObjectLockLegalHoldStatus = typingsSlinky.awsSdk.s3Mod._ObjectLockLegalHoldStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GOVERNANCE
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLIANCE
    - java.lang.String
  */
  type ObjectLockMode = typingsSlinky.awsSdk.s3Mod._ObjectLockMode | java.lang.String
  
  type ObjectLockRetainUntilDate = js.Date
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GOVERNANCE
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLIANCE
    - java.lang.String
  */
  type ObjectLockRetentionMode = typingsSlinky.awsSdk.s3Mod._ObjectLockRetentionMode | java.lang.String
  
  type ObjectLockToken = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BucketOwnerPreferred
    - typingsSlinky.awsSdk.awsSdkStrings.ObjectWriter
    - java.lang.String
  */
  type ObjectOwnership = typingsSlinky.awsSdk.s3Mod._ObjectOwnership | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD
    - typingsSlinky.awsSdk.awsSdkStrings.REDUCED_REDUNDANCY
    - typingsSlinky.awsSdk.awsSdkStrings.GLACIER
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD_IA
    - typingsSlinky.awsSdk.awsSdkStrings.ONEZONE_IA
    - typingsSlinky.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
    - typingsSlinky.awsSdk.awsSdkStrings.DEEP_ARCHIVE
    - typingsSlinky.awsSdk.awsSdkStrings.OUTPOSTS
    - java.lang.String
  */
  type ObjectStorageClass = typingsSlinky.awsSdk.s3Mod._ObjectStorageClass | java.lang.String
  
  type ObjectVersionId = java.lang.String
  
  type ObjectVersionList = js.Array[typingsSlinky.awsSdk.s3Mod.ObjectVersion]
  
  type ObjectVersionStorageClass = typingsSlinky.awsSdk.awsSdkStrings.STANDARD | java.lang.String
  
  type OwnerOverride = typingsSlinky.awsSdk.awsSdkStrings.Destination | java.lang.String
  
  type OwnershipControlsRules = js.Array[typingsSlinky.awsSdk.s3Mod.OwnershipControlsRule]
  
  type PartNumber = scala.Double
  
  type PartNumberMarker = scala.Double
  
  type Parts = js.Array[typingsSlinky.awsSdk.s3Mod.Part]
  
  type PartsCount = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Requester
    - typingsSlinky.awsSdk.awsSdkStrings.BucketOwner
    - java.lang.String
  */
  type Payer = typingsSlinky.awsSdk.s3Mod._Payer | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FULL_CONTROL
    - typingsSlinky.awsSdk.awsSdkStrings.WRITE
    - typingsSlinky.awsSdk.awsSdkStrings.WRITE_ACP
    - typingsSlinky.awsSdk.awsSdkStrings.READ
    - typingsSlinky.awsSdk.awsSdkStrings.READ_ACP
    - java.lang.String
  */
  type Permission = typingsSlinky.awsSdk.s3Mod._Permission | java.lang.String
  
  type Policy = java.lang.String
  
  type Prefix = java.lang.String
  
  type Priority = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.http_
    - typingsSlinky.awsSdk.awsSdkStrings.https_
    - java.lang.String
  */
  type Protocol = typingsSlinky.awsSdk.s3Mod._Protocol | java.lang.String
  
  type QueueArn = java.lang.String
  
  type QueueConfigurationList = js.Array[typingsSlinky.awsSdk.s3Mod.QueueConfiguration]
  
  type Quiet = scala.Boolean
  
  type QuoteCharacter = java.lang.String
  
  type QuoteEscapeCharacter = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALWAYS
    - typingsSlinky.awsSdk.awsSdkStrings.ASNEEDED
    - java.lang.String
  */
  type QuoteFields = typingsSlinky.awsSdk.s3Mod._QuoteFields | java.lang.String
  
  type Range = java.lang.String
  
  type RecordDelimiter = java.lang.String
  
  type ReplaceKeyPrefixWith = java.lang.String
  
  type ReplaceKeyWith = java.lang.String
  
  type ReplicaKmsKeyID = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Enabled_
    - typingsSlinky.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type ReplicationRuleStatus = typingsSlinky.awsSdk.s3Mod._ReplicationRuleStatus | java.lang.String
  
  type ReplicationRules = js.Array[typingsSlinky.awsSdk.s3Mod.ReplicationRule]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.REPLICA
    - java.lang.String
  */
  type ReplicationStatus = typingsSlinky.awsSdk.s3Mod._ReplicationStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Enabled_
    - typingsSlinky.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type ReplicationTimeStatus = typingsSlinky.awsSdk.s3Mod._ReplicationTimeStatus | java.lang.String
  
  type RequestCharged = typingsSlinky.awsSdk.awsSdkStrings.requester_ | java.lang.String
  
  type RequestPayer = typingsSlinky.awsSdk.awsSdkStrings.requester_ | java.lang.String
  
  type ResponseCacheControl = java.lang.String
  
  type ResponseContentDisposition = java.lang.String
  
  type ResponseContentEncoding = java.lang.String
  
  type ResponseContentLanguage = java.lang.String
  
  type ResponseContentType = java.lang.String
  
  type ResponseExpires = js.Date
  
  type Restore = java.lang.String
  
  type RestoreOutputPath = java.lang.String
  
  type RestoreRequestType = typingsSlinky.awsSdk.awsSdkStrings.SELECT | java.lang.String
  
  type Role = java.lang.String
  
  type RoutingRules = js.Array[typingsSlinky.awsSdk.s3Mod.RoutingRule]
  
  type Rules = js.Array[typingsSlinky.awsSdk.s3Mod.Rule]
  
  type SSECustomerAlgorithm = java.lang.String
  
  type SSECustomerKey = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.s3Mod.Blob | java.lang.String
  
  type SSECustomerKeyMD5 = java.lang.String
  
  type SSEKMSEncryptionContext = java.lang.String
  
  type SSEKMSKeyId = java.lang.String
  
  type SelectObjectContentEventStream = typingsSlinky.awsSdk.eventStreamMod.EventStream[typingsSlinky.awsSdk.anon.Cont]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AES256
    - typingsSlinky.awsSdk.awsSdkStrings.awsColonkms
    - java.lang.String
  */
  type ServerSideEncryption = typingsSlinky.awsSdk.s3Mod._ServerSideEncryption | java.lang.String
  
  type ServerSideEncryptionRules = js.Array[typingsSlinky.awsSdk.s3Mod.ServerSideEncryptionRule]
  
  type Setting = scala.Boolean
  
  type Size = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Enabled_
    - typingsSlinky.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type SseKmsEncryptedObjectsStatus = typingsSlinky.awsSdk.s3Mod._SseKmsEncryptedObjectsStatus | java.lang.String
  
  type Start = scala.Double
  
  type StartAfter = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD
    - typingsSlinky.awsSdk.awsSdkStrings.REDUCED_REDUNDANCY
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD_IA
    - typingsSlinky.awsSdk.awsSdkStrings.ONEZONE_IA
    - typingsSlinky.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
    - typingsSlinky.awsSdk.awsSdkStrings.GLACIER
    - typingsSlinky.awsSdk.awsSdkStrings.DEEP_ARCHIVE
    - typingsSlinky.awsSdk.awsSdkStrings.OUTPOSTS
    - java.lang.String
  */
  type StorageClass = typingsSlinky.awsSdk.s3Mod._StorageClass | java.lang.String
  
  type StorageClassAnalysisSchemaVersion = typingsSlinky.awsSdk.awsSdkStrings.V_1 | java.lang.String
  
  type Suffix = java.lang.String
  
  type TagCount = scala.Double
  
  type TagSet = js.Array[typingsSlinky.awsSdk.s3Mod.Tag]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.COPY
    - typingsSlinky.awsSdk.awsSdkStrings.REPLACE
    - java.lang.String
  */
  type TaggingDirective = typingsSlinky.awsSdk.s3Mod._TaggingDirective | java.lang.String
  
  type TaggingHeader = java.lang.String
  
  type TargetBucket = java.lang.String
  
  type TargetGrants = js.Array[typingsSlinky.awsSdk.s3Mod.TargetGrant]
  
  type TargetPrefix = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Standard_
    - typingsSlinky.awsSdk.awsSdkStrings.Bulk_
    - typingsSlinky.awsSdk.awsSdkStrings.Expedited
    - java.lang.String
  */
  type Tier = typingsSlinky.awsSdk.s3Mod._Tier | java.lang.String
  
  type TieringList = js.Array[typingsSlinky.awsSdk.s3Mod.Tiering]
  
  type Token = java.lang.String
  
  type TopicArn = java.lang.String
  
  type TopicConfigurationList = js.Array[typingsSlinky.awsSdk.s3Mod.TopicConfiguration]
  
  type TransitionList = js.Array[typingsSlinky.awsSdk.s3Mod.Transition]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GLACIER
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD_IA
    - typingsSlinky.awsSdk.awsSdkStrings.ONEZONE_IA
    - typingsSlinky.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
    - typingsSlinky.awsSdk.awsSdkStrings.DEEP_ARCHIVE
    - java.lang.String
  */
  type TransitionStorageClass = typingsSlinky.awsSdk.s3Mod._TransitionStorageClass | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CanonicalUser
    - typingsSlinky.awsSdk.awsSdkStrings.AmazonCustomerByEmail
    - typingsSlinky.awsSdk.awsSdkStrings.Group_
    - java.lang.String
  */
  type Type = typingsSlinky.awsSdk.s3Mod._Type | java.lang.String
  
  type URI = java.lang.String
  
  type UploadIdMarker = java.lang.String
  
  type UserMetadata = js.Array[typingsSlinky.awsSdk.s3Mod.MetadataEntry]
  
  type Value = java.lang.String
  
  type VersionIdMarker = java.lang.String
  
  type WebsiteRedirectLocation = java.lang.String
  
  type Years = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2006-03-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.s3Mod._apiVersion | java.lang.String
}
