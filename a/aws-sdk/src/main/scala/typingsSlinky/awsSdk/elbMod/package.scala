package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object elbMod {
  type AccessLogEnabled = scala.Boolean
  type AccessLogInterval = scala.Double
  type AccessLogPrefix = java.lang.String
  type AccessPointName = java.lang.String
  type AccessPointPort = scala.Double
  type AdditionalAttributeKey = java.lang.String
  type AdditionalAttributeValue = java.lang.String
  type AdditionalAttributes = js.Array[typingsSlinky.awsSdk.elbMod.AdditionalAttribute]
  type AppCookieStickinessPolicies = js.Array[typingsSlinky.awsSdk.elbMod.AppCookieStickinessPolicy]
  type AttributeName = java.lang.String
  type AttributeType = java.lang.String
  type AttributeValue = java.lang.String
  type AvailabilityZone = java.lang.String
  type AvailabilityZones = js.Array[typingsSlinky.awsSdk.elbMod.AvailabilityZone]
  type BackendServerDescriptions = js.Array[typingsSlinky.awsSdk.elbMod.BackendServerDescription]
  type Cardinality = java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.elbMod.ClientApiVersions
  type ConnectionDrainingEnabled = scala.Boolean
  type ConnectionDrainingTimeout = scala.Double
  type CookieExpirationPeriod = scala.Double
  type CookieName = java.lang.String
  type CreatedTime = js.Date
  type CrossZoneLoadBalancingEnabled = scala.Boolean
  type DNSName = java.lang.String
  type DefaultValue = java.lang.String
  type Description = java.lang.String
  type EndPointPort = scala.Double
  type HealthCheckInterval = scala.Double
  type HealthCheckTarget = java.lang.String
  type HealthCheckTimeout = scala.Double
  type HealthyThreshold = scala.Double
  type IdleTimeout = scala.Double
  type InstanceId = java.lang.String
  type InstancePort = scala.Double
  type InstanceStates = js.Array[typingsSlinky.awsSdk.elbMod.InstanceState]
  type Instances = js.Array[typingsSlinky.awsSdk.elbMod.Instance]
  type LBCookieStickinessPolicies = js.Array[typingsSlinky.awsSdk.elbMod.LBCookieStickinessPolicy]
  type Limits = js.Array[typingsSlinky.awsSdk.elbMod.Limit]
  type ListenerDescriptions = js.Array[typingsSlinky.awsSdk.elbMod.ListenerDescription]
  type Listeners = js.Array[typingsSlinky.awsSdk.elbMod.Listener]
  type LoadBalancerDescriptions = js.Array[typingsSlinky.awsSdk.elbMod.LoadBalancerDescription]
  type LoadBalancerNames = js.Array[typingsSlinky.awsSdk.elbMod.AccessPointName]
  type LoadBalancerNamesMax20 = js.Array[typingsSlinky.awsSdk.elbMod.AccessPointName]
  type LoadBalancerScheme = java.lang.String
  type Marker = java.lang.String
  type Max = java.lang.String
  type Name = java.lang.String
  type PageSize = scala.Double
  type PolicyAttributeDescriptions = js.Array[typingsSlinky.awsSdk.elbMod.PolicyAttributeDescription]
  type PolicyAttributeTypeDescriptions = js.Array[typingsSlinky.awsSdk.elbMod.PolicyAttributeTypeDescription]
  type PolicyAttributes = js.Array[typingsSlinky.awsSdk.elbMod.PolicyAttribute]
  type PolicyDescriptions = js.Array[typingsSlinky.awsSdk.elbMod.PolicyDescription]
  type PolicyName = java.lang.String
  type PolicyNames = js.Array[typingsSlinky.awsSdk.elbMod.PolicyName]
  type PolicyTypeDescriptions = js.Array[typingsSlinky.awsSdk.elbMod.PolicyTypeDescription]
  type PolicyTypeName = java.lang.String
  type PolicyTypeNames = js.Array[typingsSlinky.awsSdk.elbMod.PolicyTypeName]
  type Ports = js.Array[typingsSlinky.awsSdk.elbMod.AccessPointPort]
  type Protocol = java.lang.String
  type ReasonCode = java.lang.String
  type S3BucketName = java.lang.String
  type SSLCertificateId = java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupName = java.lang.String
  type SecurityGroupOwnerAlias = java.lang.String
  type SecurityGroups = js.Array[typingsSlinky.awsSdk.elbMod.SecurityGroupId]
  type State = java.lang.String
  type SubnetId = java.lang.String
  type Subnets = js.Array[typingsSlinky.awsSdk.elbMod.SubnetId]
  type TagDescriptions = js.Array[typingsSlinky.awsSdk.elbMod.TagDescription]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.elbMod.TagKeyOnly]
  type TagList = js.Array[typingsSlinky.awsSdk.elbMod.Tag]
  type TagValue = java.lang.String
  type UnhealthyThreshold = scala.Double
  type VPCId = java.lang.String
}
