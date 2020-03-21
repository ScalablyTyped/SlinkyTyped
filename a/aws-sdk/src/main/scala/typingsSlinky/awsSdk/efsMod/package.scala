package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object efsMod {
  type AccessPointArn = java.lang.String
  type AccessPointDescriptions = js.Array[typingsSlinky.awsSdk.efsMod.AccessPointDescription]
  type AccessPointId = java.lang.String
  type AvailabilityZoneId = java.lang.String
  type AvailabilityZoneName = java.lang.String
  type AwsAccountId = java.lang.String
  type BypassPolicyLockoutSafetyCheck = scala.Boolean
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.efsMod.ClientApiVersions
  type ClientToken = java.lang.String
  type CreationToken = java.lang.String
  type Encrypted = scala.Boolean
  type FileSystemDescriptions = js.Array[typingsSlinky.awsSdk.efsMod.FileSystemDescription]
  type FileSystemId = java.lang.String
  type FileSystemNullableSizeValue = scala.Double
  type FileSystemSizeValue = scala.Double
  type Gid = scala.Double
  type IpAddress = java.lang.String
  type KmsKeyId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.creating__
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - typingsSlinky.awsSdk.awsSdkStrings.updating__
    - typingsSlinky.awsSdk.awsSdkStrings.deleting__
    - typingsSlinky.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type LifeCycleState = typingsSlinky.awsSdk.efsMod._LifeCycleState | java.lang.String
  type LifecyclePolicies = js.Array[typingsSlinky.awsSdk.efsMod.LifecyclePolicy]
  type Marker = java.lang.String
  type MaxItems = scala.Double
  type MaxResults = scala.Double
  type MountTargetCount = scala.Double
  type MountTargetDescriptions = js.Array[typingsSlinky.awsSdk.efsMod.MountTargetDescription]
  type MountTargetId = java.lang.String
  type Name = java.lang.String
  type NetworkInterfaceId = java.lang.String
  type OwnerGid = scala.Double
  type OwnerUid = scala.Double
  type Path = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.generalPurpose
    - typingsSlinky.awsSdk.awsSdkStrings.maxIO
    - java.lang.String
  */
  type PerformanceMode = typingsSlinky.awsSdk.efsMod._PerformanceMode | java.lang.String
  type Permissions = java.lang.String
  type Policy = java.lang.String
  type ProvisionedThroughputInMibps = scala.Double
  type ResourceId = java.lang.String
  type SecondaryGids = js.Array[typingsSlinky.awsSdk.efsMod.Gid]
  type SecurityGroup = java.lang.String
  type SecurityGroups = js.Array[typingsSlinky.awsSdk.efsMod.SecurityGroup]
  type SubnetId = java.lang.String
  type TagKey = java.lang.String
  type TagKeys = js.Array[typingsSlinky.awsSdk.efsMod.TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[typingsSlinky.awsSdk.efsMod.Tag]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.bursting
    - typingsSlinky.awsSdk.awsSdkStrings.provisioned_
    - java.lang.String
  */
  type ThroughputMode = typingsSlinky.awsSdk.efsMod._ThroughputMode | java.lang.String
  type Timestamp = js.Date
  type Token = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AFTER_7_DAYS
    - typingsSlinky.awsSdk.awsSdkStrings.AFTER_14_DAYS
    - typingsSlinky.awsSdk.awsSdkStrings.AFTER_30_DAYS
    - typingsSlinky.awsSdk.awsSdkStrings.AFTER_60_DAYS
    - typingsSlinky.awsSdk.awsSdkStrings.AFTER_90_DAYS
    - java.lang.String
  */
  type TransitionToIARules = typingsSlinky.awsSdk.efsMod._TransitionToIARules | java.lang.String
  type Uid = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-02-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.efsMod._apiVersion | java.lang.String
}
