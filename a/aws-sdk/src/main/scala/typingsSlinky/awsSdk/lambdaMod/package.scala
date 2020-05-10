package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lambdaMod {
  type Action = java.lang.String
  type AdditionalVersion = java.lang.String
  type AdditionalVersionWeights = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.lambdaMod.Weight]
  type Alias = java.lang.String
  type AliasList = js.Array[typingsSlinky.awsSdk.lambdaMod.AliasConfiguration]
  type Arn = java.lang.String
  type BatchSize = scala.Double
  type BisectBatchOnFunctionError = scala.Boolean
  type BlobStream = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.lambdaMod.Blob | java.lang.String | typingsSlinky.node.streamMod.Readable
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.lambdaMod.ClientApiVersions
  type CompatibleRuntimes = js.Array[typingsSlinky.awsSdk.lambdaMod.Runtime]
  type Date = js.Date
  type Description = java.lang.String
  type DestinationArn = java.lang.String
  type Enabled = scala.Boolean
  type EnvironmentVariableName = java.lang.String
  type EnvironmentVariableValue = java.lang.String
  type EnvironmentVariables = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.lambdaMod.EnvironmentVariableValue]
  type EventSourceMappingsList = js.Array[typingsSlinky.awsSdk.lambdaMod.EventSourceMappingConfiguration]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TRIM_HORIZON
    - typingsSlinky.awsSdk.awsSdkStrings.LATEST
    - typingsSlinky.awsSdk.awsSdkStrings.AT_TIMESTAMP
    - java.lang.String
  */
  type EventSourcePosition = typingsSlinky.awsSdk.lambdaMod._EventSourcePosition | java.lang.String
  type EventSourceToken = java.lang.String
  type FunctionArn = java.lang.String
  type FunctionEventInvokeConfigList = js.Array[typingsSlinky.awsSdk.lambdaMod.FunctionEventInvokeConfig]
  type FunctionList = js.Array[typingsSlinky.awsSdk.lambdaMod.FunctionConfiguration]
  type FunctionName = java.lang.String
  type FunctionVersion = typingsSlinky.awsSdk.awsSdkStrings.ALL | java.lang.String
  type Handler = java.lang.String
  type HttpStatus = scala.Double
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Event_
    - typingsSlinky.awsSdk.awsSdkStrings.RequestResponse
    - typingsSlinky.awsSdk.awsSdkStrings.DryRun
    - java.lang.String
  */
  type InvocationType = typingsSlinky.awsSdk.lambdaMod._InvocationType | java.lang.String
  type KMSKeyArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Successful_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - java.lang.String
  */
  type LastUpdateStatus = typingsSlinky.awsSdk.lambdaMod._LastUpdateStatus | java.lang.String
  type LastUpdateStatusReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EniLimitExceeded_
    - typingsSlinky.awsSdk.awsSdkStrings.InsufficientRolePermissions
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidConfiguration
    - typingsSlinky.awsSdk.awsSdkStrings.InternalError
    - typingsSlinky.awsSdk.awsSdkStrings.SubnetOutOfIPAddresses
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidSubnet
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidSecurityGroup
    - java.lang.String
  */
  type LastUpdateStatusReasonCode = typingsSlinky.awsSdk.lambdaMod._LastUpdateStatusReasonCode | java.lang.String
  type LayerArn = java.lang.String
  type LayerList = js.Array[typingsSlinky.awsSdk.lambdaMod.LayerVersionArn]
  type LayerName = java.lang.String
  type LayerPermissionAllowedAction = java.lang.String
  type LayerPermissionAllowedPrincipal = java.lang.String
  type LayerVersionArn = java.lang.String
  type LayerVersionNumber = scala.Double
  type LayerVersionsList = js.Array[typingsSlinky.awsSdk.lambdaMod.LayerVersionsListItem]
  type LayersList = js.Array[typingsSlinky.awsSdk.lambdaMod.LayersListItem]
  type LayersReferenceList = js.Array[typingsSlinky.awsSdk.lambdaMod.Layer]
  type LicenseInfo = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.None_
    - typingsSlinky.awsSdk.awsSdkStrings.Tail
    - java.lang.String
  */
  type LogType = typingsSlinky.awsSdk.lambdaMod._LogType | java.lang.String
  type Long = scala.Double
  type MasterRegion = java.lang.String
  type MaxFunctionEventInvokeConfigListItems = scala.Double
  type MaxLayerListItems = scala.Double
  type MaxListItems = scala.Double
  type MaxProvisionedConcurrencyConfigListItems = scala.Double
  type MaximumBatchingWindowInSeconds = scala.Double
  type MaximumEventAgeInSeconds = scala.Double
  type MaximumRecordAgeInSeconds = scala.Double
  type MaximumRetryAttempts = scala.Double
  type MaximumRetryAttemptsEventSourceMapping = scala.Double
  type MemorySize = scala.Double
  type NameSpacedFunctionArn = java.lang.String
  type NamespacedFunctionName = java.lang.String
  type NamespacedStatementId = java.lang.String
  type NonNegativeInteger = scala.Double
  type OrganizationId = java.lang.String
  type ParallelizationFactor = scala.Double
  type PositiveInteger = scala.Double
  type Principal = java.lang.String
  type ProvisionedConcurrencyConfigList = js.Array[typingsSlinky.awsSdk.lambdaMod.ProvisionedConcurrencyConfigListItem]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.READY
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ProvisionedConcurrencyStatusEnum = typingsSlinky.awsSdk.lambdaMod._ProvisionedConcurrencyStatusEnum | java.lang.String
  type Qualifier = java.lang.String
  type ReservedConcurrentExecutions = scala.Double
  type ResourceArn = java.lang.String
  type RoleArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.nodejs
    - typingsSlinky.awsSdk.awsSdkStrings.nodejs4Dot3
    - typingsSlinky.awsSdk.awsSdkStrings.nodejs6Dot10
    - typingsSlinky.awsSdk.awsSdkStrings.nodejs8Dot10
    - typingsSlinky.awsSdk.awsSdkStrings.nodejs10Dotx
    - typingsSlinky.awsSdk.awsSdkStrings.nodejs12Dotx
    - typingsSlinky.awsSdk.awsSdkStrings.java8
    - typingsSlinky.awsSdk.awsSdkStrings.java11
    - typingsSlinky.awsSdk.awsSdkStrings.python2Dot7
    - typingsSlinky.awsSdk.awsSdkStrings.python3Dot6
    - typingsSlinky.awsSdk.awsSdkStrings.python3Dot7
    - typingsSlinky.awsSdk.awsSdkStrings.python3Dot8
    - typingsSlinky.awsSdk.awsSdkStrings.dotnetcore1Dot0
    - typingsSlinky.awsSdk.awsSdkStrings.dotnetcore2Dot0
    - typingsSlinky.awsSdk.awsSdkStrings.dotnetcore2Dot1
    - typingsSlinky.awsSdk.awsSdkStrings.`nodejs4Dot3-edge`
    - typingsSlinky.awsSdk.awsSdkStrings.go1Dotx
    - typingsSlinky.awsSdk.awsSdkStrings.ruby2Dot5
    - typingsSlinky.awsSdk.awsSdkStrings.ruby2Dot7
    - typingsSlinky.awsSdk.awsSdkStrings.provided
    - java.lang.String
  */
  type Runtime = typingsSlinky.awsSdk.lambdaMod._Runtime | java.lang.String
  type S3Bucket = java.lang.String
  type S3Key = java.lang.String
  type S3ObjectVersion = java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[typingsSlinky.awsSdk.lambdaMod.SecurityGroupId]
  type SensitiveString = java.lang.String
  type SourceOwner = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.Active_
    - typingsSlinky.awsSdk.awsSdkStrings.Inactive_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type State = typingsSlinky.awsSdk.lambdaMod._State | java.lang.String
  type StateReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Idle_
    - typingsSlinky.awsSdk.awsSdkStrings.Creating_
    - typingsSlinky.awsSdk.awsSdkStrings.Restoring_
    - typingsSlinky.awsSdk.awsSdkStrings.EniLimitExceeded_
    - typingsSlinky.awsSdk.awsSdkStrings.InsufficientRolePermissions
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidConfiguration
    - typingsSlinky.awsSdk.awsSdkStrings.InternalError
    - typingsSlinky.awsSdk.awsSdkStrings.SubnetOutOfIPAddresses
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidSubnet
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidSecurityGroup
    - java.lang.String
  */
  type StateReasonCode = typingsSlinky.awsSdk.lambdaMod._StateReasonCode | java.lang.String
  type StatementId = java.lang.String
  type String = java.lang.String
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[typingsSlinky.awsSdk.lambdaMod.SubnetId]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.lambdaMod.TagKey]
  type TagValue = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.lambdaMod.TagValue]
  type Timeout = scala.Double
  type Timestamp = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Active_
    - typingsSlinky.awsSdk.awsSdkStrings.PassThrough_
    - java.lang.String
  */
  type TracingMode = typingsSlinky.awsSdk.lambdaMod._TracingMode | java.lang.String
  type UnreservedConcurrentExecutions = scala.Double
  type Version = java.lang.String
  type VpcId = java.lang.String
  type Weight = scala.Double
  type _Blob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.lambdaMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-11-11`
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-03-31`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.lambdaMod._apiVersion | java.lang.String
}
