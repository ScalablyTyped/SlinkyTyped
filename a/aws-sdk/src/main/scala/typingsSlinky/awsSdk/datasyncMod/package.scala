package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object datasyncMod {
  type ActivationKey = java.lang.String
  type AgentArn = java.lang.String
  type AgentArnList = js.Array[typingsSlinky.awsSdk.datasyncMod.AgentArn]
  type AgentList = js.Array[typingsSlinky.awsSdk.datasyncMod.AgentListEntry]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ONLINE
    - typingsSlinky.awsSdk.awsSdkStrings.OFFLINE
    - java.lang.String
  */
  type AgentStatus = typingsSlinky.awsSdk.datasyncMod._AgentStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.BEST_EFFORT
    - java.lang.String
  */
  type Atime = typingsSlinky.awsSdk.datasyncMod._Atime | java.lang.String
  type BytesPerSecond = scala.Double
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.datasyncMod.ClientApiVersions
  type DestinationNetworkInterfaceArns = js.Array[typingsSlinky.awsSdk.datasyncMod.NetworkInterfaceArn]
  type Duration = scala.Double
  type Ec2SecurityGroupArn = java.lang.String
  type Ec2SecurityGroupArnList = js.Array[typingsSlinky.awsSdk.datasyncMod.Ec2SecurityGroupArn]
  type Ec2SubnetArn = java.lang.String
  type EfsFilesystemArn = java.lang.String
  type EfsSubdirectory = java.lang.String
  type Endpoint = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PUBLIC
    - typingsSlinky.awsSdk.awsSdkStrings.PRIVATE_LINK
    - typingsSlinky.awsSdk.awsSdkStrings.FIPS
    - java.lang.String
  */
  type EndpointType = typingsSlinky.awsSdk.datasyncMod._EndpointType | java.lang.String
  type FilterList = js.Array[typingsSlinky.awsSdk.datasyncMod.FilterRule]
  type FilterType = typingsSlinky.awsSdk.awsSdkStrings.SIMPLE_PATTERN | java.lang.String
  type FilterValue = java.lang.String
  type FsxFilesystemArn = java.lang.String
  type FsxWindowsSubdirectory = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.INT_VALUE
    - typingsSlinky.awsSdk.awsSdkStrings.NAME
    - typingsSlinky.awsSdk.awsSdkStrings.BOTH
    - java.lang.String
  */
  type Gid = typingsSlinky.awsSdk.datasyncMod._Gid | java.lang.String
  type IamRoleArn = java.lang.String
  type InputTagList = js.Array[typingsSlinky.awsSdk.datasyncMod.TagListEntry]
  type LocationArn = java.lang.String
  type LocationList = js.Array[typingsSlinky.awsSdk.datasyncMod.LocationListEntry]
  type LocationUri = java.lang.String
  type LogGroupArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OFF
    - typingsSlinky.awsSdk.awsSdkStrings.BASIC
    - typingsSlinky.awsSdk.awsSdkStrings.TRANSFER
    - java.lang.String
  */
  type LogLevel = typingsSlinky.awsSdk.datasyncMod._LogLevel | java.lang.String
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.PRESERVE
    - java.lang.String
  */
  type Mtime = typingsSlinky.awsSdk.datasyncMod._Mtime | java.lang.String
  type NetworkInterfaceArn = java.lang.String
  type NextToken = java.lang.String
  type NfsSubdirectory = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AUTOMATIC
    - typingsSlinky.awsSdk.awsSdkStrings.NFS3
    - typingsSlinky.awsSdk.awsSdkStrings.NFS4_0
    - typingsSlinky.awsSdk.awsSdkStrings.NFS4_1
    - java.lang.String
  */
  type NfsVersion = typingsSlinky.awsSdk.datasyncMod._NfsVersion | java.lang.String
  type ObjectStorageAccessKey = java.lang.String
  type ObjectStorageBucketName = java.lang.String
  type ObjectStorageSecretKey = java.lang.String
  type ObjectStorageServerPort = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HTTPS
    - typingsSlinky.awsSdk.awsSdkStrings.HTTP
    - java.lang.String
  */
  type ObjectStorageServerProtocol = typingsSlinky.awsSdk.datasyncMod._ObjectStorageServerProtocol | java.lang.String
  type OutputTagList = js.Array[typingsSlinky.awsSdk.datasyncMod.TagListEntry]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALWAYS
    - typingsSlinky.awsSdk.awsSdkStrings.NEVER
    - java.lang.String
  */
  type OverwriteMode = typingsSlinky.awsSdk.datasyncMod._OverwriteMode | java.lang.String
  type PLSecurityGroupArnList = js.Array[typingsSlinky.awsSdk.datasyncMod.Ec2SecurityGroupArn]
  type PLSubnetArnList = js.Array[typingsSlinky.awsSdk.datasyncMod.Ec2SubnetArn]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type PhaseStatus = typingsSlinky.awsSdk.datasyncMod._PhaseStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.PRESERVE
    - java.lang.String
  */
  type PosixPermissions = typingsSlinky.awsSdk.datasyncMod._PosixPermissions | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PRESERVE
    - typingsSlinky.awsSdk.awsSdkStrings.REMOVE
    - java.lang.String
  */
  type PreserveDeletedFiles = typingsSlinky.awsSdk.datasyncMod._PreserveDeletedFiles | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.PRESERVE
    - java.lang.String
  */
  type PreserveDevices = typingsSlinky.awsSdk.datasyncMod._PreserveDevices | java.lang.String
  type S3BucketArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD_IA
    - typingsSlinky.awsSdk.awsSdkStrings.ONEZONE_IA
    - typingsSlinky.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
    - typingsSlinky.awsSdk.awsSdkStrings.GLACIER
    - typingsSlinky.awsSdk.awsSdkStrings.DEEP_ARCHIVE
    - java.lang.String
  */
  type S3StorageClass = typingsSlinky.awsSdk.datasyncMod._S3StorageClass | java.lang.String
  type S3Subdirectory = java.lang.String
  type ScheduleExpressionCron = java.lang.String
  type ServerHostname = java.lang.String
  type SmbDomain = java.lang.String
  type SmbPassword = java.lang.String
  type SmbSubdirectory = java.lang.String
  type SmbUser = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AUTOMATIC
    - typingsSlinky.awsSdk.awsSdkStrings.SMB2
    - typingsSlinky.awsSdk.awsSdkStrings.SMB3
    - java.lang.String
  */
  type SmbVersion = typingsSlinky.awsSdk.datasyncMod._SmbVersion | java.lang.String
  type SourceNetworkInterfaceArns = js.Array[typingsSlinky.awsSdk.datasyncMod.NetworkInterfaceArn]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.datasyncMod.TagKey]
  type TagValue = java.lang.String
  type TaggableResourceArn = java.lang.String
  type TaskArn = java.lang.String
  type TaskExecutionArn = java.lang.String
  type TaskExecutionList = js.Array[typingsSlinky.awsSdk.datasyncMod.TaskExecutionListEntry]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.QUEUED
    - typingsSlinky.awsSdk.awsSdkStrings.LAUNCHING
    - typingsSlinky.awsSdk.awsSdkStrings.PREPARING
    - typingsSlinky.awsSdk.awsSdkStrings.TRANSFERRING
    - typingsSlinky.awsSdk.awsSdkStrings.VERIFYING
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type TaskExecutionStatus = typingsSlinky.awsSdk.datasyncMod._TaskExecutionStatus | java.lang.String
  type TaskList = js.Array[typingsSlinky.awsSdk.datasyncMod.TaskListEntry]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type TaskQueueing = typingsSlinky.awsSdk.datasyncMod._TaskQueueing | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.QUEUED
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE
    - java.lang.String
  */
  type TaskStatus = typingsSlinky.awsSdk.datasyncMod._TaskStatus | java.lang.String
  type Time = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CHANGED
    - typingsSlinky.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type TransferMode = typingsSlinky.awsSdk.datasyncMod._TransferMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.INT_VALUE
    - typingsSlinky.awsSdk.awsSdkStrings.NAME
    - typingsSlinky.awsSdk.awsSdkStrings.BOTH
    - java.lang.String
  */
  type Uid = typingsSlinky.awsSdk.datasyncMod._Uid | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.POINT_IN_TIME_CONSISTENT
    - typingsSlinky.awsSdk.awsSdkStrings.ONLY_FILES_TRANSFERRED
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type VerifyMode = typingsSlinky.awsSdk.datasyncMod._VerifyMode | java.lang.String
  type VpcEndpointId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-11-09`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.datasyncMod._apiVersion | java.lang.String
  type long = scala.Double
}
