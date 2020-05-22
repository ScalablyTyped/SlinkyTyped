package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eksMod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AL2_x86_64
    - typingsSlinky.awsSdk.awsSdkStrings.AL2_x86_64_GPU
    - java.lang.String
  */
  type AMITypes = typingsSlinky.awsSdk.eksMod._AMITypes | java.lang.String
  type AutoScalingGroupList = js.Array[typingsSlinky.awsSdk.eksMod.AutoScalingGroup]
  type Boolean = scala.Boolean
  type BoxedBoolean = scala.Boolean
  type BoxedInteger = scala.Double
  type Capacity = scala.Double
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.eksMod.ClientApiVersions
  type ClusterName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type ClusterStatus = typingsSlinky.awsSdk.eksMod._ClusterStatus | java.lang.String
  type EncryptionConfigList = js.Array[typingsSlinky.awsSdk.eksMod.EncryptionConfig]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SubnetNotFound
    - typingsSlinky.awsSdk.awsSdkStrings.SecurityGroupNotFound
    - typingsSlinky.awsSdk.awsSdkStrings.EniLimitReached
    - typingsSlinky.awsSdk.awsSdkStrings.IpNotAvailable
    - typingsSlinky.awsSdk.awsSdkStrings.AccessDenied
    - typingsSlinky.awsSdk.awsSdkStrings.OperationNotPermitted
    - typingsSlinky.awsSdk.awsSdkStrings.VpcIdNotFound
    - typingsSlinky.awsSdk.awsSdkStrings.Unknown_
    - typingsSlinky.awsSdk.awsSdkStrings.NodeCreationFailure
    - typingsSlinky.awsSdk.awsSdkStrings.PodEvictionFailure
    - typingsSlinky.awsSdk.awsSdkStrings.InsufficientFreeAddresses
    - java.lang.String
  */
  type ErrorCode = typingsSlinky.awsSdk.eksMod._ErrorCode | java.lang.String
  type ErrorDetails = js.Array[typingsSlinky.awsSdk.eksMod.ErrorDetail]
  type FargateProfileLabel = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.eksMod.String]
  type FargateProfileSelectors = js.Array[typingsSlinky.awsSdk.eksMod.FargateProfileSelector]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_FAILED
    - java.lang.String
  */
  type FargateProfileStatus = typingsSlinky.awsSdk.eksMod._FargateProfileStatus | java.lang.String
  type FargateProfilesRequestMaxResults = scala.Double
  type IssueList = js.Array[typingsSlinky.awsSdk.eksMod.Issue]
  type ListClustersRequestMaxResults = scala.Double
  type ListNodegroupsRequestMaxResults = scala.Double
  type ListUpdatesRequestMaxResults = scala.Double
  type LogSetups = js.Array[typingsSlinky.awsSdk.eksMod.LogSetup]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.api_
    - typingsSlinky.awsSdk.awsSdkStrings.audit_
    - typingsSlinky.awsSdk.awsSdkStrings.authenticator
    - typingsSlinky.awsSdk.awsSdkStrings.controllerManager
    - typingsSlinky.awsSdk.awsSdkStrings.scheduler
    - java.lang.String
  */
  type LogType = typingsSlinky.awsSdk.eksMod._LogType | java.lang.String
  type LogTypes = js.Array[typingsSlinky.awsSdk.eksMod.LogType]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AutoScalingGroupNotFound
    - typingsSlinky.awsSdk.awsSdkStrings.AutoScalingGroupInvalidConfiguration
    - typingsSlinky.awsSdk.awsSdkStrings.Ec2SecurityGroupNotFound
    - typingsSlinky.awsSdk.awsSdkStrings.Ec2SecurityGroupDeletionFailure
    - typingsSlinky.awsSdk.awsSdkStrings.Ec2LaunchTemplateNotFound
    - typingsSlinky.awsSdk.awsSdkStrings.Ec2LaunchTemplateVersionMismatch
    - typingsSlinky.awsSdk.awsSdkStrings.Ec2SubnetNotFound
    - typingsSlinky.awsSdk.awsSdkStrings.Ec2SubnetInvalidConfiguration
    - typingsSlinky.awsSdk.awsSdkStrings.IamInstanceProfileNotFound
    - typingsSlinky.awsSdk.awsSdkStrings.IamLimitExceeded
    - typingsSlinky.awsSdk.awsSdkStrings.IamNodeRoleNotFound
    - typingsSlinky.awsSdk.awsSdkStrings.NodeCreationFailure
    - typingsSlinky.awsSdk.awsSdkStrings.AsgInstanceLaunchFailures
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceLimitExceeded
    - typingsSlinky.awsSdk.awsSdkStrings.InsufficientFreeAddresses
    - typingsSlinky.awsSdk.awsSdkStrings.AccessDenied
    - typingsSlinky.awsSdk.awsSdkStrings.InternalFailure
    - java.lang.String
  */
  type NodegroupIssueCode = typingsSlinky.awsSdk.eksMod._NodegroupIssueCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DEGRADED
    - java.lang.String
  */
  type NodegroupStatus = typingsSlinky.awsSdk.eksMod._NodegroupStatus | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[typingsSlinky.awsSdk.eksMod.String]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.eksMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.eksMod.TagValue]
  type TagValue = java.lang.String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Version_
    - typingsSlinky.awsSdk.awsSdkStrings.PlatformVersion
    - typingsSlinky.awsSdk.awsSdkStrings.EndpointPrivateAccess
    - typingsSlinky.awsSdk.awsSdkStrings.EndpointPublicAccess
    - typingsSlinky.awsSdk.awsSdkStrings.ClusterLogging
    - typingsSlinky.awsSdk.awsSdkStrings.DesiredSize
    - typingsSlinky.awsSdk.awsSdkStrings.LabelsToAdd
    - typingsSlinky.awsSdk.awsSdkStrings.LabelsToRemove
    - typingsSlinky.awsSdk.awsSdkStrings.MaxSize
    - typingsSlinky.awsSdk.awsSdkStrings.MinSize
    - typingsSlinky.awsSdk.awsSdkStrings.ReleaseVersion
    - typingsSlinky.awsSdk.awsSdkStrings.PublicAccessCidrs
    - java.lang.String
  */
  type UpdateParamType = typingsSlinky.awsSdk.eksMod._UpdateParamType | java.lang.String
  type UpdateParams = js.Array[typingsSlinky.awsSdk.eksMod.UpdateParam]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Cancelled_
    - typingsSlinky.awsSdk.awsSdkStrings.Successful_
    - java.lang.String
  */
  type UpdateStatus = typingsSlinky.awsSdk.eksMod._UpdateStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.VersionUpdate
    - typingsSlinky.awsSdk.awsSdkStrings.EndpointAccessUpdate
    - typingsSlinky.awsSdk.awsSdkStrings.LoggingUpdate
    - typingsSlinky.awsSdk.awsSdkStrings.ConfigUpdate
    - java.lang.String
  */
  type UpdateType = typingsSlinky.awsSdk.eksMod._UpdateType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-11-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.eksMod._apiVersion | java.lang.String
  type labelKey = java.lang.String
  type labelValue = java.lang.String
  type labelsKeyList = js.Array[typingsSlinky.awsSdk.eksMod.String]
  type labelsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.eksMod.labelValue]
}
