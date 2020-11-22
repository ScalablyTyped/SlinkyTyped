package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object iotMod {
  
  type AbortAction = typingsSlinky.awsSdk.awsSdkStrings.CANCEL | java.lang.String
  
  type AbortCriteriaList = js.Array[typingsSlinky.awsSdk.iotMod.AbortCriteria]
  
  type AbortThresholdPercentage = scala.Double
  
  type AcmCertificateArn = java.lang.String
  
  type ActionList = js.Array[typingsSlinky.awsSdk.iotMod.Action]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PUBLISH
    - typingsSlinky.awsSdk.awsSdkStrings.SUBSCRIBE
    - typingsSlinky.awsSdk.awsSdkStrings.RECEIVE
    - typingsSlinky.awsSdk.awsSdkStrings.CONNECT
    - java.lang.String
  */
  type ActionType = typingsSlinky.awsSdk.iotMod._ActionType | java.lang.String
  
  type ActiveViolations = js.Array[typingsSlinky.awsSdk.iotMod.ActiveViolation]
  
  type AdditionalMetricsToRetainList = js.Array[typingsSlinky.awsSdk.iotMod.BehaviorMetric]
  
  type AdditionalMetricsToRetainV2List = js.Array[typingsSlinky.awsSdk.iotMod.MetricToRetain]
  
  type AdditionalParameterMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.iotMod.Value]
  
  type AggregationField = java.lang.String
  
  type AlarmName = java.lang.String
  
  type AlertTargetArn = java.lang.String
  
  type AlertTargetType = typingsSlinky.awsSdk.awsSdkStrings.SNS | java.lang.String
  
  type AlertTargets = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.iotMod.AlertTarget]
  
  type AllowAuthorizerOverride = scala.Boolean
  
  type AllowAutoRegistration = scala.Boolean
  
  type ApproximateSecondsBeforeTimedOut = scala.Double
  
  type AscendingOrder = scala.Boolean
  
  type AssetId = java.lang.String
  
  type AssetPropertyAlias = java.lang.String
  
  type AssetPropertyBooleanValue = java.lang.String
  
  type AssetPropertyDoubleValue = java.lang.String
  
  type AssetPropertyEntryId = java.lang.String
  
  type AssetPropertyId = java.lang.String
  
  type AssetPropertyIntegerValue = java.lang.String
  
  type AssetPropertyOffsetInNanos = java.lang.String
  
  type AssetPropertyQuality = java.lang.String
  
  type AssetPropertyStringValue = java.lang.String
  
  type AssetPropertyTimeInSeconds = java.lang.String
  
  type AssetPropertyValueList = js.Array[typingsSlinky.awsSdk.iotMod.AssetPropertyValue]
  
  type AttributeKey = java.lang.String
  
  type AttributeName = java.lang.String
  
  type AttributeValue = java.lang.String
  
  type Attributes = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.iotMod.AttributeValue]
  
  type AttributesMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.iotMod.Value]
  
  type AuditCheckConfigurations = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.iotMod.AuditCheckConfiguration]
  
  type AuditCheckName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.WAITING_FOR_DATA_COLLECTION
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELED
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED_COMPLIANT
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED_NON_COMPLIANT
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type AuditCheckRunStatus = typingsSlinky.awsSdk.iotMod._AuditCheckRunStatus | java.lang.String
  
  type AuditCheckToActionsMapping = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.iotMod.MitigationActionNameList]
  
  type AuditCheckToReasonCodeFilter = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.iotMod.ReasonForNonComplianceCodes]
  
  type AuditDescription = java.lang.String
  
  type AuditDetails = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.iotMod.AuditCheckDetails]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CRITICAL
    - typingsSlinky.awsSdk.awsSdkStrings.HIGH
    - typingsSlinky.awsSdk.awsSdkStrings.MEDIUM
    - typingsSlinky.awsSdk.awsSdkStrings.LOW
    - java.lang.String
  */
  type AuditFindingSeverity = typingsSlinky.awsSdk.iotMod._AuditFindingSeverity | java.lang.String
  
  type AuditFindings = js.Array[typingsSlinky.awsSdk.iotMod.AuditFinding]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DAILY
    - typingsSlinky.awsSdk.awsSdkStrings.WEEKLY
    - typingsSlinky.awsSdk.awsSdkStrings.BIWEEKLY
    - typingsSlinky.awsSdk.awsSdkStrings.MONTHLY
    - java.lang.String
  */
  type AuditFrequency = typingsSlinky.awsSdk.iotMod._AuditFrequency | java.lang.String
  
  type AuditMitigationActionExecutionMetadataList = js.Array[typingsSlinky.awsSdk.iotMod.AuditMitigationActionExecutionMetadata]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELED
    - typingsSlinky.awsSdk.awsSdkStrings.SKIPPED
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type AuditMitigationActionsExecutionStatus = typingsSlinky.awsSdk.iotMod._AuditMitigationActionsExecutionStatus | java.lang.String
  
  type AuditMitigationActionsTaskId = java.lang.String
  
  type AuditMitigationActionsTaskMetadataList = js.Array[typingsSlinky.awsSdk.iotMod.AuditMitigationActionsTaskMetadata]
  
  type AuditMitigationActionsTaskStatistics = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.iotMod.TaskStatisticsForAuditCheck]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELED
    - java.lang.String
  */
  type AuditMitigationActionsTaskStatus = typingsSlinky.awsSdk.iotMod._AuditMitigationActionsTaskStatus | java.lang.String
  
  type AuditNotificationTargetConfigurations = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.iotMod.AuditNotificationTarget]
  
  type AuditNotificationType = typingsSlinky.awsSdk.awsSdkStrings.SNS | java.lang.String
  
  type AuditSuppressionList = js.Array[typingsSlinky.awsSdk.iotMod.AuditSuppression]
  
  type AuditTaskId = java.lang.String
  
  type AuditTaskMetadataList = js.Array[typingsSlinky.awsSdk.iotMod.AuditTaskMetadata]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELED
    - java.lang.String
  */
  type AuditTaskStatus = typingsSlinky.awsSdk.iotMod._AuditTaskStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ON_DEMAND_AUDIT_TASK
    - typingsSlinky.awsSdk.awsSdkStrings.SCHEDULED_AUDIT_TASK
    - java.lang.String
  */
  type AuditTaskType = typingsSlinky.awsSdk.iotMod._AuditTaskType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALLOWED
    - typingsSlinky.awsSdk.awsSdkStrings.EXPLICIT_DENY
    - typingsSlinky.awsSdk.awsSdkStrings.IMPLICIT_DENY
    - java.lang.String
  */
  type AuthDecision = typingsSlinky.awsSdk.iotMod._AuthDecision | java.lang.String
  
  type AuthInfos = js.Array[typingsSlinky.awsSdk.iotMod.AuthInfo]
  
  type AuthResults = js.Array[typingsSlinky.awsSdk.iotMod.AuthResult]
  
  type AuthorizerArn = java.lang.String
  
  type AuthorizerFunctionArn = java.lang.String
  
  type AuthorizerName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type AuthorizerStatus = typingsSlinky.awsSdk.iotMod._AuthorizerStatus | java.lang.String
  
  type Authorizers = js.Array[typingsSlinky.awsSdk.iotMod.AuthorizerSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLE
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLE
    - java.lang.String
  */
  type AutoRegistrationStatus = typingsSlinky.awsSdk.iotMod._AutoRegistrationStatus | java.lang.String
  
  type Average = scala.Double
  
  type AwsAccountId = java.lang.String
  
  type AwsArn = java.lang.String
  
  type AwsIotJobArn = java.lang.String
  
  type AwsIotJobId = java.lang.String
  
  type AwsIotSqlVersion = java.lang.String
  
  type AwsJobAbortCriteriaAbortAction = typingsSlinky.awsSdk.awsSdkStrings.CANCEL | java.lang.String
  
  type AwsJobAbortCriteriaAbortThresholdPercentage = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.REJECTED
    - typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT
    - typingsSlinky.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type AwsJobAbortCriteriaFailureType = typingsSlinky.awsSdk.iotMod._AwsJobAbortCriteriaFailureType | java.lang.String
  
  type AwsJobAbortCriteriaList = js.Array[typingsSlinky.awsSdk.iotMod.AwsJobAbortCriteria]
  
  type AwsJobAbortCriteriaMinimumNumberOfExecutedThings = scala.Double
  
  type AwsJobRateIncreaseCriteriaNumberOfThings = scala.Double
  
  type AwsJobRolloutIncrementFactor = scala.Double
  
  type AwsJobRolloutRatePerMinute = scala.Double
  
  type AwsJobTimeoutInProgressTimeoutInMinutes = scala.Double
  
  type BatchMode = scala.Boolean
  
  type BehaviorMetric = java.lang.String
  
  type BehaviorName = java.lang.String
  
  type Behaviors = js.Array[typingsSlinky.awsSdk.iotMod.Behavior]
  
  type BillingGroupArn = java.lang.String
  
  type BillingGroupDescription = java.lang.String
  
  type BillingGroupId = java.lang.String
  
  type BillingGroupName = java.lang.String
  
  type BillingGroupNameAndArnList = js.Array[typingsSlinky.awsSdk.iotMod.GroupNameAndArn]
  
  type Boolean = scala.Boolean
  
  type BooleanKey = scala.Boolean
  
  type BucketName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type CACertificateStatus = typingsSlinky.awsSdk.iotMod._CACertificateStatus | java.lang.String
  
  type CACertificateUpdateAction = typingsSlinky.awsSdk.awsSdkStrings.DEACTIVATE | java.lang.String
  
  type CACertificates = js.Array[typingsSlinky.awsSdk.iotMod.CACertificate]
  
  type CanceledChecksCount = scala.Double
  
  type CanceledFindingsCount = scala.Double
  
  type CanceledThings = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.private__
    - typingsSlinky.awsSdk.awsSdkStrings.`public-read`
    - typingsSlinky.awsSdk.awsSdkStrings.`public-read-write`
    - typingsSlinky.awsSdk.awsSdkStrings.`aws-exec-read`
    - typingsSlinky.awsSdk.awsSdkStrings.`authenticated-read`
    - typingsSlinky.awsSdk.awsSdkStrings.`bucket-owner-read`
    - typingsSlinky.awsSdk.awsSdkStrings.`bucket-owner-full-control`
    - typingsSlinky.awsSdk.awsSdkStrings.`log-delivery-write`
    - java.lang.String
  */
  type CannedAccessControlList = typingsSlinky.awsSdk.iotMod._CannedAccessControlList | java.lang.String
  
  type CertificateArn = java.lang.String
  
  type CertificateId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT
    - typingsSlinky.awsSdk.awsSdkStrings.SNI_ONLY
    - java.lang.String
  */
  type CertificateMode = typingsSlinky.awsSdk.iotMod._CertificateMode | java.lang.String
  
  type CertificateName = java.lang.String
  
  type CertificatePathOnDevice = java.lang.String
  
  type CertificatePem = java.lang.String
  
  type CertificateSigningRequest = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.REVOKED
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_TRANSFER
    - typingsSlinky.awsSdk.awsSdkStrings.REGISTER_INACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_ACTIVATION
    - java.lang.String
  */
  type CertificateStatus = typingsSlinky.awsSdk.iotMod._CertificateStatus | java.lang.String
  
  type Certificates = js.Array[typingsSlinky.awsSdk.iotMod.Certificate]
  
  type ChannelName = java.lang.String
  
  type CheckCompliant = scala.Boolean
  
  type Cidr = java.lang.String
  
  type Cidrs = js.Array[typingsSlinky.awsSdk.iotMod.Cidr]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.iotMod.ClientApiVersions
  
  type ClientId = java.lang.String
  
  type ClientRequestToken = java.lang.String
  
  type Code = java.lang.String
  
  type CognitoIdentityPoolId = java.lang.String
  
  type Comment = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`less-than`
    - typingsSlinky.awsSdk.awsSdkStrings.`less-than-equals`
    - typingsSlinky.awsSdk.awsSdkStrings.`greater-than`
    - typingsSlinky.awsSdk.awsSdkStrings.`greater-than-equals`
    - typingsSlinky.awsSdk.awsSdkStrings.`in-cidr-set`
    - typingsSlinky.awsSdk.awsSdkStrings.`not-in-cidr-set`
    - typingsSlinky.awsSdk.awsSdkStrings.`in-port-set`
    - typingsSlinky.awsSdk.awsSdkStrings.`not-in-port-set`
    - java.lang.String
  */
  type ComparisonOperator = typingsSlinky.awsSdk.iotMod._ComparisonOperator | java.lang.String
  
  type CompliantChecksCount = scala.Double
  
  type ConfirmationToken = java.lang.String
  
  type ConnectivityTimestamp = scala.Double
  
  type ConsecutiveDatapointsToAlarm = scala.Double
  
  type ConsecutiveDatapointsToClear = scala.Double
  
  type Count = scala.Double
  
  type CreatedAtDate = js.Date
  
  type CreationDate = js.Date
  
  type CredentialDurationSeconds = scala.Double
  
  type CustomerVersion = scala.Double
  
  type DateType = js.Date
  
  type DayOfMonth = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUN
    - typingsSlinky.awsSdk.awsSdkStrings.MON
    - typingsSlinky.awsSdk.awsSdkStrings.TUE
    - typingsSlinky.awsSdk.awsSdkStrings.WED
    - typingsSlinky.awsSdk.awsSdkStrings.THU
    - typingsSlinky.awsSdk.awsSdkStrings.FRI
    - typingsSlinky.awsSdk.awsSdkStrings.SAT
    - java.lang.String
  */
  type DayOfWeek = typingsSlinky.awsSdk.iotMod._DayOfWeek | java.lang.String
  
  type DeleteAdditionalMetricsToRetain = scala.Boolean
  
  type DeleteAlertTargets = scala.Boolean
  
  type DeleteBehaviors = scala.Boolean
  
  type DeleteScheduledAudits = scala.Boolean
  
  type DeleteStream = scala.Boolean
  
  type DeliveryStreamName = java.lang.String
  
  type DeprecationDate = js.Date
  
  type Description = java.lang.String
  
  type DetailsKey = java.lang.String
  
  type DetailsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.iotMod.DetailsValue]
  
  type DetailsValue = java.lang.String
  
  type DeviceCertificateUpdateAction = typingsSlinky.awsSdk.awsSdkStrings.DEACTIVATE | java.lang.String
  
  type DeviceDefenderThingName = java.lang.String
  
  type DimensionArn = java.lang.String
  
  type DimensionName = java.lang.String
  
  type DimensionNames = js.Array[typingsSlinky.awsSdk.iotMod.DimensionName]
  
  type DimensionStringValue = java.lang.String
  
  type DimensionStringValues = js.Array[typingsSlinky.awsSdk.iotMod.DimensionStringValue]
  
  type DimensionType = typingsSlinky.awsSdk.awsSdkStrings.TOPIC_FILTER | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_IN
    - java.lang.String
  */
  type DimensionValueOperator = typingsSlinky.awsSdk.iotMod._DimensionValueOperator | java.lang.String
  
  type DisableAllLogs = scala.Boolean
  
  type DomainConfigurationArn = java.lang.String
  
  type DomainConfigurationName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type DomainConfigurationStatus = typingsSlinky.awsSdk.iotMod._DomainConfigurationStatus | java.lang.String
  
  type DomainConfigurations = js.Array[typingsSlinky.awsSdk.iotMod.DomainConfigurationSummary]
  
  type DomainName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENDPOINT
    - typingsSlinky.awsSdk.awsSdkStrings.AWS_MANAGED
    - typingsSlinky.awsSdk.awsSdkStrings.CUSTOMER_MANAGED
    - java.lang.String
  */
  type DomainType = typingsSlinky.awsSdk.iotMod._DomainType | java.lang.String
  
  type DurationSeconds = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.BUILDING
    - typingsSlinky.awsSdk.awsSdkStrings.REBUILDING
    - java.lang.String
  */
  type DynamicGroupStatus = typingsSlinky.awsSdk.iotMod._DynamicGroupStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STRING
    - typingsSlinky.awsSdk.awsSdkStrings.NUMBER
    - java.lang.String
  */
  type DynamoKeyType = typingsSlinky.awsSdk.iotMod._DynamoKeyType | java.lang.String
  
  type DynamoOperation = java.lang.String
  
  type EffectivePolicies = js.Array[typingsSlinky.awsSdk.iotMod.EffectivePolicy]
  
  type ElasticsearchEndpoint = java.lang.String
  
  type ElasticsearchId = java.lang.String
  
  type ElasticsearchIndex = java.lang.String
  
  type ElasticsearchType = java.lang.String
  
  type Enabled = scala.Boolean
  
  type EndpointAddress = java.lang.String
  
  type EndpointType = java.lang.String
  
  type ErrorCode = java.lang.String
  
  type ErrorMessage = java.lang.String
  
  type EvaluationStatistic = java.lang.String
  
  type EventConfigurations = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.iotMod.Configuration]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.THING
    - typingsSlinky.awsSdk.awsSdkStrings.THING_GROUP
    - typingsSlinky.awsSdk.awsSdkStrings.THING_TYPE
    - typingsSlinky.awsSdk.awsSdkStrings.THING_GROUP_MEMBERSHIP
    - typingsSlinky.awsSdk.awsSdkStrings.THING_GROUP_HIERARCHY
    - typingsSlinky.awsSdk.awsSdkStrings.THING_TYPE_ASSOCIATION
    - typingsSlinky.awsSdk.awsSdkStrings.JOB
    - typingsSlinky.awsSdk.awsSdkStrings.JOB_EXECUTION
    - typingsSlinky.awsSdk.awsSdkStrings.POLICY
    - typingsSlinky.awsSdk.awsSdkStrings.CERTIFICATE
    - typingsSlinky.awsSdk.awsSdkStrings.CA_CERTIFICATE
    - java.lang.String
  */
  type EventType = typingsSlinky.awsSdk.iotMod._EventType | java.lang.String
  
  type ExecutionNamePrefix = java.lang.String
  
  type ExecutionNumber = scala.Double
  
  type ExpectedVersion = scala.Double
  
  type ExpiresInSec = scala.Double
  
  type ExpiresInSeconds = scala.Double
  
  type FailedChecksCount = scala.Double
  
  type FailedFindingsCount = scala.Double
  
  type FailedThings = scala.Double
  
  type FieldName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Number_
    - typingsSlinky.awsSdk.awsSdkStrings.String_
    - typingsSlinky.awsSdk.awsSdkStrings.Boolean_
    - java.lang.String
  */
  type FieldType = typingsSlinky.awsSdk.iotMod._FieldType | java.lang.String
  
  type Fields = js.Array[typingsSlinky.awsSdk.iotMod.Field]
  
  type FileId = scala.Double
  
  type FileName = java.lang.String
  
  type FindingId = java.lang.String
  
  type FindingIds = js.Array[typingsSlinky.awsSdk.iotMod.FindingId]
  
  type FirehoseSeparator = java.lang.String
  
  type Flag = scala.Boolean
  
  type ForceDelete = scala.Boolean
  
  type ForceDeleteAWSJob = scala.Boolean
  
  type ForceFlag = scala.Boolean
  
  type Forced = scala.Boolean
  
  type FunctionArn = java.lang.String
  
  type GenerationId = java.lang.String
  
  type HashAlgorithm = java.lang.String
  
  type HashKeyField = java.lang.String
  
  type HashKeyValue = java.lang.String
  
  type HeaderKey = java.lang.String
  
  type HeaderList = js.Array[typingsSlinky.awsSdk.iotMod.HttpActionHeader]
  
  type HeaderValue = java.lang.String
  
  type HttpHeaderName = java.lang.String
  
  type HttpHeaderValue = java.lang.String
  
  type HttpHeaders = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.iotMod.HttpHeaderValue]
  
  type HttpQueryString = java.lang.String
  
  type InProgressChecksCount = scala.Double
  
  type InProgressThings = scala.Double
  
  type InProgressTimeoutInMinutes = scala.Double
  
  type IncrementFactor = scala.Double
  
  type IndexName = java.lang.String
  
  type IndexNamesList = js.Array[typingsSlinky.awsSdk.iotMod.IndexName]
  
  type IndexSchema = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.BUILDING
    - typingsSlinky.awsSdk.awsSdkStrings.REBUILDING
    - java.lang.String
  */
  type IndexStatus = typingsSlinky.awsSdk.iotMod._IndexStatus | java.lang.String
  
  type InlineDocument = java.lang.String
  
  type InputName = java.lang.String
  
  type IsAuthenticated = scala.Boolean
  
  type IsDefaultVersion = scala.Boolean
  
  type IsDisabled = scala.Boolean
  
  type IsSuppressed = scala.Boolean
  
  type JobArn = java.lang.String
  
  type JobDescription = java.lang.String
  
  type JobDocument = java.lang.String
  
  type JobDocumentSource = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.REJECTED
    - typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT
    - typingsSlinky.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type JobExecutionFailureType = typingsSlinky.awsSdk.iotMod._JobExecutionFailureType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.QUEUED
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT
    - typingsSlinky.awsSdk.awsSdkStrings.REJECTED
    - typingsSlinky.awsSdk.awsSdkStrings.REMOVED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELED
    - java.lang.String
  */
  type JobExecutionStatus = typingsSlinky.awsSdk.iotMod._JobExecutionStatus | java.lang.String
  
  type JobExecutionSummaryForJobList = js.Array[typingsSlinky.awsSdk.iotMod.JobExecutionSummaryForJob]
  
  type JobExecutionSummaryForThingList = js.Array[typingsSlinky.awsSdk.iotMod.JobExecutionSummaryForThing]
  
  type JobId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELED
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETION_IN_PROGRESS
    - java.lang.String
  */
  type JobStatus = typingsSlinky.awsSdk.iotMod._JobStatus | java.lang.String
  
  type JobSummaryList = js.Array[typingsSlinky.awsSdk.iotMod.JobSummary]
  
  type JobTargets = js.Array[typingsSlinky.awsSdk.iotMod.TargetArn]
  
  type JsonDocument = java.lang.String
  
  type Key = java.lang.String
  
  type KeyName = java.lang.String
  
  type KeyValue = java.lang.String
  
  type LaserMaxResults = scala.Double
  
  type LastModifiedDate = js.Date
  
  type ListSuppressedFindings = scala.Boolean
  
  type LogGroupName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DEBUG
    - typingsSlinky.awsSdk.awsSdkStrings.INFO
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.WARN
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type LogLevel = typingsSlinky.awsSdk.iotMod._LogLevel | java.lang.String
  
  type LogTargetConfigurations = js.Array[typingsSlinky.awsSdk.iotMod.LogTargetConfiguration]
  
  type LogTargetName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT
    - typingsSlinky.awsSdk.awsSdkStrings.THING_GROUP
    - java.lang.String
  */
  type LogTargetType = typingsSlinky.awsSdk.iotMod._LogTargetType | java.lang.String
  
  type Marker = java.lang.String
  
  type MaxJobExecutionsPerMin = scala.Double
  
  type MaxResults = scala.Double
  
  type Maximum = scala.Double
  
  type MaximumPerMinute = scala.Double
  
  type Message = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RAW
    - typingsSlinky.awsSdk.awsSdkStrings.JSON
    - java.lang.String
  */
  type MessageFormat = typingsSlinky.awsSdk.iotMod._MessageFormat | java.lang.String
  
  type MessageId = java.lang.String
  
  type Minimum = scala.Double
  
  type MinimumNumberOfExecutedThings = scala.Double
  
  type MissingContextValue = java.lang.String
  
  type MissingContextValues = js.Array[typingsSlinky.awsSdk.iotMod.MissingContextValue]
  
  type MitigationActionArn = java.lang.String
  
  type MitigationActionId = java.lang.String
  
  type MitigationActionIdentifierList = js.Array[typingsSlinky.awsSdk.iotMod.MitigationActionIdentifier]
  
  type MitigationActionList = js.Array[typingsSlinky.awsSdk.iotMod.MitigationAction]
  
  type MitigationActionName = java.lang.String
  
  type MitigationActionNameList = js.Array[typingsSlinky.awsSdk.iotMod.MitigationActionName]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_DEVICE_CERTIFICATE
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_CA_CERTIFICATE
    - typingsSlinky.awsSdk.awsSdkStrings.ADD_THINGS_TO_THING_GROUP
    - typingsSlinky.awsSdk.awsSdkStrings.REPLACE_DEFAULT_POLICY_VERSION
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLE_IOT_LOGGING
    - typingsSlinky.awsSdk.awsSdkStrings.PUBLISH_FINDING_TO_SNS
    - java.lang.String
  */
  type MitigationActionType = typingsSlinky.awsSdk.iotMod._MitigationActionType | java.lang.String
  
  type MqttClientId = java.lang.String
  
  type MqttPassword = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.iotMod.Blob | java.lang.String
  
  type MqttUsername = java.lang.String
  
  type NamespaceId = java.lang.String
  
  type NextToken = java.lang.String
  
  type NonCompliantChecksCount = scala.Double
  
  type NonCompliantResourcesCount = scala.Double
  
  type NumberOfThings = scala.Double
  
  type OTAUpdateArn = java.lang.String
  
  type OTAUpdateDescription = java.lang.String
  
  type OTAUpdateErrorMessage = java.lang.String
  
  type OTAUpdateFileVersion = java.lang.String
  
  type OTAUpdateFiles = js.Array[typingsSlinky.awsSdk.iotMod.OTAUpdateFile]
  
  type OTAUpdateId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_FAILED
    - java.lang.String
  */
  type OTAUpdateStatus = typingsSlinky.awsSdk.iotMod._OTAUpdateStatus | java.lang.String
  
  type OTAUpdatesSummary = js.Array[typingsSlinky.awsSdk.iotMod.OTAUpdateSummary]
  
  type OptionalVersion = scala.Double
  
  type OutgoingCertificates = js.Array[typingsSlinky.awsSdk.iotMod.OutgoingCertificate]
  
  type OverrideDynamicGroups = scala.Boolean
  
  type PageSize = scala.Double
  
  type Parameter = java.lang.String
  
  type Parameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.iotMod.Value]
  
  type PartitionKey = java.lang.String
  
  type PayloadField = java.lang.String
  
  type PayloadVersion = java.lang.String
  
  type Percent = scala.Double
  
  type PercentList = js.Array[typingsSlinky.awsSdk.iotMod.Percent]
  
  type PercentValue = scala.Double
  
  type Percentage = scala.Double
  
  type Percentiles = js.Array[typingsSlinky.awsSdk.iotMod.PercentPair]
  
  type Platform = java.lang.String
  
  type Policies = js.Array[typingsSlinky.awsSdk.iotMod.Policy]
  
  type PolicyArn = java.lang.String
  
  type PolicyDocument = java.lang.String
  
  type PolicyDocuments = js.Array[typingsSlinky.awsSdk.iotMod.PolicyDocument]
  
  type PolicyName = java.lang.String
  
  type PolicyNames = js.Array[typingsSlinky.awsSdk.iotMod.PolicyName]
  
  type PolicyTarget = java.lang.String
  
  type PolicyTargets = js.Array[typingsSlinky.awsSdk.iotMod.PolicyTarget]
  
  type PolicyTemplateName = typingsSlinky.awsSdk.awsSdkStrings.BLANK_POLICY | java.lang.String
  
  type PolicyVersionId = java.lang.String
  
  type PolicyVersions = js.Array[typingsSlinky.awsSdk.iotMod.PolicyVersion]
  
  type Port = scala.Double
  
  type Ports = js.Array[typingsSlinky.awsSdk.iotMod.Port]
  
  type Prefix = java.lang.String
  
  type Principal = java.lang.String
  
  type PrincipalArn = java.lang.String
  
  type PrincipalId = java.lang.String
  
  type Principals = js.Array[typingsSlinky.awsSdk.iotMod.PrincipalArn]
  
  type PrivateKey = java.lang.String
  
  type ProcessingTargetName = java.lang.String
  
  type ProcessingTargetNameList = js.Array[typingsSlinky.awsSdk.iotMod.ProcessingTargetName]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MQTT
    - typingsSlinky.awsSdk.awsSdkStrings.HTTP
    - java.lang.String
  */
  type Protocol = typingsSlinky.awsSdk.iotMod._Protocol | java.lang.String
  
  type Protocols = js.Array[typingsSlinky.awsSdk.iotMod.Protocol]
  
  type ProvisioningTemplateListing = js.Array[typingsSlinky.awsSdk.iotMod.ProvisioningTemplateSummary]
  
  type ProvisioningTemplateVersionListing = js.Array[typingsSlinky.awsSdk.iotMod.ProvisioningTemplateVersionSummary]
  
  type PublicKey = java.lang.String
  
  type PublicKeyMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.iotMod.KeyValue]
  
  type PutAssetPropertyValueEntryList = js.Array[typingsSlinky.awsSdk.iotMod.PutAssetPropertyValueEntry]
  
  type Qos = scala.Double
  
  type QueryMaxResults = scala.Double
  
  type QueryString = java.lang.String
  
  type QueryVersion = java.lang.String
  
  type QueueUrl = java.lang.String
  
  type QueuedThings = scala.Double
  
  type RangeKeyField = java.lang.String
  
  type RangeKeyValue = java.lang.String
  
  type ReasonCode = java.lang.String
  
  type ReasonForNonCompliance = java.lang.String
  
  type ReasonForNonComplianceCode = java.lang.String
  
  type ReasonForNonComplianceCodes = js.Array[typingsSlinky.awsSdk.iotMod.ReasonForNonComplianceCode]
  
  type Recursive = scala.Boolean
  
  type RecursiveWithoutDefault = scala.Boolean
  
  type RegistrationCode = java.lang.String
  
  type RegistryMaxResults = scala.Double
  
  type RegistryS3BucketName = java.lang.String
  
  type RegistryS3KeyName = java.lang.String
  
  type RejectedThings = scala.Double
  
  type RelatedResources = js.Array[typingsSlinky.awsSdk.iotMod.RelatedResource]
  
  type RemoveAuthorizerConfig = scala.Boolean
  
  type RemoveAutoRegistration = scala.Boolean
  
  type RemoveHook = scala.Boolean
  
  type RemoveThingType = scala.Boolean
  
  type RemovedThings = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ERRORS
    - typingsSlinky.awsSdk.awsSdkStrings.RESULTS
    - java.lang.String
  */
  type ReportType = typingsSlinky.awsSdk.iotMod._ReportType | java.lang.String
  
  type ReservedDomainConfigurationName = java.lang.String
  
  type Resource = java.lang.String
  
  type ResourceArn = java.lang.String
  
  type ResourceArns = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.iotMod.ResourceArn]
  
  type ResourceLogicalId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DEVICE_CERTIFICATE
    - typingsSlinky.awsSdk.awsSdkStrings.CA_CERTIFICATE
    - typingsSlinky.awsSdk.awsSdkStrings.IOT_POLICY
    - typingsSlinky.awsSdk.awsSdkStrings.COGNITO_IDENTITY_POOL
    - typingsSlinky.awsSdk.awsSdkStrings.CLIENT_ID
    - typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT_SETTINGS
    - typingsSlinky.awsSdk.awsSdkStrings.ROLE_ALIAS
    - typingsSlinky.awsSdk.awsSdkStrings.IAM_ROLE
    - java.lang.String
  */
  type ResourceType = typingsSlinky.awsSdk.iotMod._ResourceType | java.lang.String
  
  type Resources = js.Array[typingsSlinky.awsSdk.iotMod.Resource]
  
  type RoleAlias = java.lang.String
  
  type RoleAliasArn = java.lang.String
  
  type RoleAliases = js.Array[typingsSlinky.awsSdk.iotMod.RoleAlias]
  
  type RoleArn = java.lang.String
  
  type RolloutRatePerMinute = scala.Double
  
  type RuleArn = java.lang.String
  
  type RuleName = java.lang.String
  
  type S3Bucket = java.lang.String
  
  type S3FileUrl = java.lang.String
  
  type S3FileUrlList = js.Array[typingsSlinky.awsSdk.iotMod.S3FileUrl]
  
  type S3Key = java.lang.String
  
  type S3Version = java.lang.String
  
  type SQL = java.lang.String
  
  type SalesforceEndpoint = java.lang.String
  
  type SalesforceToken = java.lang.String
  
  type ScheduledAuditArn = java.lang.String
  
  type ScheduledAuditMetadataList = js.Array[typingsSlinky.awsSdk.iotMod.ScheduledAuditMetadata]
  
  type ScheduledAuditName = java.lang.String
  
  type SearchableAttributes = js.Array[typingsSlinky.awsSdk.iotMod.AttributeName]
  
  type Seconds = scala.Double
  
  type SecurityProfileArn = java.lang.String
  
  type SecurityProfileDescription = java.lang.String
  
  type SecurityProfileIdentifiers = js.Array[typingsSlinky.awsSdk.iotMod.SecurityProfileIdentifier]
  
  type SecurityProfileName = java.lang.String
  
  type SecurityProfileTargetArn = java.lang.String
  
  type SecurityProfileTargetMappings = js.Array[typingsSlinky.awsSdk.iotMod.SecurityProfileTargetMapping]
  
  type SecurityProfileTargets = js.Array[typingsSlinky.awsSdk.iotMod.SecurityProfileTarget]
  
  type ServerCertificateArns = js.Array[typingsSlinky.awsSdk.iotMod.AcmCertificateArn]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INVALID
    - typingsSlinky.awsSdk.awsSdkStrings.VALID
    - java.lang.String
  */
  type ServerCertificateStatus = typingsSlinky.awsSdk.iotMod._ServerCertificateStatus | java.lang.String
  
  type ServerCertificateStatusDetail = java.lang.String
  
  type ServerCertificates = js.Array[typingsSlinky.awsSdk.iotMod.ServerCertificateSummary]
  
  type ServerName = java.lang.String
  
  type ServiceName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DATA
    - typingsSlinky.awsSdk.awsSdkStrings.CREDENTIAL_PROVIDER
    - typingsSlinky.awsSdk.awsSdkStrings.JOBS
    - java.lang.String
  */
  type ServiceType = typingsSlinky.awsSdk.iotMod._ServiceType | java.lang.String
  
  type SetAsActive = scala.Boolean
  
  type SetAsActiveFlag = scala.Boolean
  
  type SetAsDefault = scala.Boolean
  
  type Signature = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.iotMod.Blob | java.lang.String
  
  type SignatureAlgorithm = java.lang.String
  
  type SigningJobId = java.lang.String
  
  type SigningProfileName = java.lang.String
  
  type SigningRegion = java.lang.String
  
  type SkippedFindingsCount = scala.Double
  
  type SkyfallMaxResults = scala.Double
  
  type SnsTopicArn = java.lang.String
  
  type StateMachineName = java.lang.String
  
  type StateReason = java.lang.String
  
  type StateValue = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Completed_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Cancelled_
    - typingsSlinky.awsSdk.awsSdkStrings.Cancelling_
    - java.lang.String
  */
  type Status = typingsSlinky.awsSdk.iotMod._Status | java.lang.String
  
  type StdDeviation = scala.Double
  
  type StreamArn = java.lang.String
  
  type StreamDescription = java.lang.String
  
  type StreamFiles = js.Array[typingsSlinky.awsSdk.iotMod.StreamFile]
  
  type StreamId = java.lang.String
  
  type StreamName = java.lang.String
  
  type StreamVersion = scala.Double
  
  type StreamsSummary = js.Array[typingsSlinky.awsSdk.iotMod.StreamSummary]
  
  type String = java.lang.String
  
  type StringMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.iotMod.String]
  
  type SucceededFindingsCount = scala.Double
  
  type SucceededThings = scala.Double
  
  type Sum = scala.Double
  
  type SumOfSquares = scala.Double
  
  type SuppressIndefinitely = scala.Boolean
  
  type SuppressedNonCompliantResourcesCount = scala.Double
  
  type TableName = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.iotMod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.iotMod.Tag]
  
  type TagValue = java.lang.String
  
  type Target = java.lang.String
  
  type TargetArn = java.lang.String
  
  type TargetAuditCheckNames = js.Array[typingsSlinky.awsSdk.iotMod.AuditCheckName]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CONTINUOUS
    - typingsSlinky.awsSdk.awsSdkStrings.SNAPSHOT
    - java.lang.String
  */
  type TargetSelection = typingsSlinky.awsSdk.iotMod._TargetSelection | java.lang.String
  
  type Targets = js.Array[typingsSlinky.awsSdk.iotMod.Target]
  
  type TaskId = java.lang.String
  
  type TaskIdList = js.Array[typingsSlinky.awsSdk.iotMod.TaskId]
  
  type TemplateArn = java.lang.String
  
  type TemplateBody = java.lang.String
  
  type TemplateDescription = java.lang.String
  
  type TemplateName = java.lang.String
  
  type TemplateVersionId = scala.Double
  
  type ThingArn = java.lang.String
  
  type ThingAttributeList = js.Array[typingsSlinky.awsSdk.iotMod.ThingAttribute]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OFF
    - typingsSlinky.awsSdk.awsSdkStrings.STATUS
    - java.lang.String
  */
  type ThingConnectivityIndexingMode = typingsSlinky.awsSdk.iotMod._ThingConnectivityIndexingMode | java.lang.String
  
  type ThingDocumentList = js.Array[typingsSlinky.awsSdk.iotMod.ThingDocument]
  
  type ThingGroupArn = java.lang.String
  
  type ThingGroupDescription = java.lang.String
  
  type ThingGroupDocumentList = js.Array[typingsSlinky.awsSdk.iotMod.ThingGroupDocument]
  
  type ThingGroupId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OFF
    - typingsSlinky.awsSdk.awsSdkStrings.ON
    - java.lang.String
  */
  type ThingGroupIndexingMode = typingsSlinky.awsSdk.iotMod._ThingGroupIndexingMode | java.lang.String
  
  type ThingGroupList = js.Array[typingsSlinky.awsSdk.iotMod.ThingGroupName]
  
  type ThingGroupName = java.lang.String
  
  type ThingGroupNameAndArnList = js.Array[typingsSlinky.awsSdk.iotMod.GroupNameAndArn]
  
  type ThingGroupNameList = js.Array[typingsSlinky.awsSdk.iotMod.ThingGroupName]
  
  type ThingGroupNames = js.Array[typingsSlinky.awsSdk.iotMod.ThingGroupName]
  
  type ThingId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OFF
    - typingsSlinky.awsSdk.awsSdkStrings.REGISTRY
    - typingsSlinky.awsSdk.awsSdkStrings.REGISTRY_AND_SHADOW
    - java.lang.String
  */
  type ThingIndexingMode = typingsSlinky.awsSdk.iotMod._ThingIndexingMode | java.lang.String
  
  type ThingName = java.lang.String
  
  type ThingNameList = js.Array[typingsSlinky.awsSdk.iotMod.ThingName]
  
  type ThingTypeArn = java.lang.String
  
  type ThingTypeDescription = java.lang.String
  
  type ThingTypeId = java.lang.String
  
  type ThingTypeList = js.Array[typingsSlinky.awsSdk.iotMod.ThingTypeDefinition]
  
  type ThingTypeName = java.lang.String
  
  type TimedOutThings = scala.Double
  
  type Timestamp = js.Date
  
  type TimestreamDatabaseName = java.lang.String
  
  type TimestreamDimensionList = js.Array[typingsSlinky.awsSdk.iotMod.TimestreamDimension]
  
  type TimestreamDimensionName = java.lang.String
  
  type TimestreamDimensionValue = java.lang.String
  
  type TimestreamTableName = java.lang.String
  
  type TimestreamTimestampUnit = java.lang.String
  
  type TimestreamTimestampValue = java.lang.String
  
  type Token = java.lang.String
  
  type TokenKeyName = java.lang.String
  
  type TokenSignature = java.lang.String
  
  type Topic = java.lang.String
  
  type TopicPattern = java.lang.String
  
  type TopicRuleDestinationMaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type TopicRuleDestinationStatus = typingsSlinky.awsSdk.iotMod._TopicRuleDestinationStatus | java.lang.String
  
  type TopicRuleDestinationSummaries = js.Array[typingsSlinky.awsSdk.iotMod.TopicRuleDestinationSummary]
  
  type TopicRuleList = js.Array[typingsSlinky.awsSdk.iotMod.TopicRuleListItem]
  
  type TopicRuleMaxResults = scala.Double
  
  type TotalChecksCount = scala.Double
  
  type TotalFindingsCount = scala.Double
  
  type TotalResourcesCount = scala.Double
  
  type UndoDeprecate = scala.Boolean
  
  type UnsignedLong = scala.Double
  
  type Url = java.lang.String
  
  type UseBase64 = scala.Boolean
  
  type Valid = scala.Boolean
  
  type ValidationErrors = js.Array[typingsSlinky.awsSdk.iotMod.ValidationError]
  
  type Value = java.lang.String
  
  type Variance = scala.Double
  
  type Version = scala.Double
  
  type VersionNumber = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`in-alarm`
    - typingsSlinky.awsSdk.awsSdkStrings.`alarm-cleared`
    - typingsSlinky.awsSdk.awsSdkStrings.`alarm-invalidated`
    - java.lang.String
  */
  type ViolationEventType = typingsSlinky.awsSdk.iotMod._ViolationEventType | java.lang.String
  
  type ViolationEvents = js.Array[typingsSlinky.awsSdk.iotMod.ViolationEvent]
  
  type ViolationId = java.lang.String
  
  type WaitingForDataCollectionChecksCount = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-05-28`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.iotMod._apiVersion | java.lang.String
}
