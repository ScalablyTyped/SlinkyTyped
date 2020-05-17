package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object appmeshMod {
  type AccountId = java.lang.String
  type Arn = java.lang.String
  type AwsCloudMapInstanceAttributeKey = java.lang.String
  type AwsCloudMapInstanceAttributeValue = java.lang.String
  type AwsCloudMapInstanceAttributes = js.Array[typingsSlinky.awsSdk.appmeshMod.AwsCloudMapInstanceAttribute]
  type AwsCloudMapName = java.lang.String
  type Backends = js.Array[typingsSlinky.awsSdk.appmeshMod.Backend]
  type Boolean = scala.Boolean
  type CertificateAuthorityArns = js.Array[typingsSlinky.awsSdk.appmeshMod.Arn]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.appmeshMod.ClientApiVersions
  type DurationValue = scala.Double
  type FilePath = java.lang.String
  type GrpcRetryPolicyEvents = js.Array[typingsSlinky.awsSdk.appmeshMod.GrpcRetryPolicyEvent]
  type GrpcRouteMetadataList = js.Array[typingsSlinky.awsSdk.appmeshMod.GrpcRouteMetadata]
  type HeaderMatch = java.lang.String
  type HeaderName = java.lang.String
  type HealthCheckIntervalMillis = scala.Double
  type HealthCheckThreshold = scala.Double
  type HealthCheckTimeoutMillis = scala.Double
  type Hostname = java.lang.String
  type HttpRetryPolicyEvent = java.lang.String
  type HttpRetryPolicyEvents = js.Array[typingsSlinky.awsSdk.appmeshMod.HttpRetryPolicyEvent]
  type HttpRouteHeaders = js.Array[typingsSlinky.awsSdk.appmeshMod.HttpRouteHeader]
  type ListMeshesLimit = scala.Double
  type ListRoutesLimit = scala.Double
  type ListVirtualNodesLimit = scala.Double
  type ListVirtualRoutersLimit = scala.Double
  type ListVirtualServicesLimit = scala.Double
  type Listeners = js.Array[typingsSlinky.awsSdk.appmeshMod.Listener]
  type Long = scala.Double
  type MaxRetries = scala.Double
  type MeshList = js.Array[typingsSlinky.awsSdk.appmeshMod.MeshRef]
  type MethodName = java.lang.String
  type PercentInt = scala.Double
  type PortNumber = scala.Double
  type PortSet = js.Array[typingsSlinky.awsSdk.appmeshMod.PortNumber]
  type ResourceName = java.lang.String
  type RouteList = js.Array[typingsSlinky.awsSdk.appmeshMod.RouteRef]
  type RoutePriority = scala.Double
  type ServiceName = java.lang.String
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.appmeshMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.appmeshMod.TagRef]
  type TagValue = java.lang.String
  type TagsLimit = scala.Double
  type TcpRetryPolicyEvents = js.Array[typingsSlinky.awsSdk.appmeshMod.TcpRetryPolicyEvent]
  type Timestamp = js.Date
  type VirtualNodeList = js.Array[typingsSlinky.awsSdk.appmeshMod.VirtualNodeRef]
  type VirtualRouterList = js.Array[typingsSlinky.awsSdk.appmeshMod.VirtualRouterRef]
  type VirtualRouterListeners = js.Array[typingsSlinky.awsSdk.appmeshMod.VirtualRouterListener]
  type VirtualServiceList = js.Array[typingsSlinky.awsSdk.appmeshMod.VirtualServiceRef]
  type WeightedTargets = js.Array[typingsSlinky.awsSdk.appmeshMod.WeightedTarget]
}
