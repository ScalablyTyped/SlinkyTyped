package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ms_
    - typingsSlinky.awsSdk.awsSdkStrings.s_
    - java.lang.String
  */
  type DurationUnit = typingsSlinky.awsSdk.appmeshMod._DurationUnit | java.lang.String
  
  type DurationValue = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALLOW_ALL
    - typingsSlinky.awsSdk.awsSdkStrings.DROP_ALL
    - java.lang.String
  */
  type EgressFilterType = typingsSlinky.awsSdk.appmeshMod._EgressFilterType | java.lang.String
  
  type FilePath = java.lang.String
  
  type GatewayRouteList = js.Array[typingsSlinky.awsSdk.appmeshMod.GatewayRouteRef]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type GatewayRouteStatusCode = typingsSlinky.awsSdk.appmeshMod._GatewayRouteStatusCode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.cancelled__
    - typingsSlinky.awsSdk.awsSdkStrings.`deadline-exceeded`
    - typingsSlinky.awsSdk.awsSdkStrings.internal_
    - typingsSlinky.awsSdk.awsSdkStrings.`resource-exhausted`
    - typingsSlinky.awsSdk.awsSdkStrings.unavailable__
    - java.lang.String
  */
  type GrpcRetryPolicyEvent = typingsSlinky.awsSdk.appmeshMod._GrpcRetryPolicyEvent | java.lang.String
  
  type GrpcRetryPolicyEvents = js.Array[typingsSlinky.awsSdk.appmeshMod.GrpcRetryPolicyEvent]
  
  type GrpcRouteMetadataList = js.Array[typingsSlinky.awsSdk.appmeshMod.GrpcRouteMetadata]
  
  type HeaderMatch = java.lang.String
  
  type HeaderName = java.lang.String
  
  type HealthCheckIntervalMillis = scala.Double
  
  type HealthCheckThreshold = scala.Double
  
  type HealthCheckTimeoutMillis = scala.Double
  
  type Hostname = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CONNECT
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE
    - typingsSlinky.awsSdk.awsSdkStrings.GET
    - typingsSlinky.awsSdk.awsSdkStrings.HEAD
    - typingsSlinky.awsSdk.awsSdkStrings.OPTIONS
    - typingsSlinky.awsSdk.awsSdkStrings.PATCH
    - typingsSlinky.awsSdk.awsSdkStrings.POST
    - typingsSlinky.awsSdk.awsSdkStrings.PUT
    - typingsSlinky.awsSdk.awsSdkStrings.TRACE
    - java.lang.String
  */
  type HttpMethod = typingsSlinky.awsSdk.appmeshMod._HttpMethod | java.lang.String
  
  type HttpRetryPolicyEvent = java.lang.String
  
  type HttpRetryPolicyEvents = js.Array[typingsSlinky.awsSdk.appmeshMod.HttpRetryPolicyEvent]
  
  type HttpRouteHeaders = js.Array[typingsSlinky.awsSdk.appmeshMod.HttpRouteHeader]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.http_
    - typingsSlinky.awsSdk.awsSdkStrings.https_
    - java.lang.String
  */
  type HttpScheme = typingsSlinky.awsSdk.appmeshMod._HttpScheme | java.lang.String
  
  type ListGatewayRoutesLimit = scala.Double
  
  type ListMeshesLimit = scala.Double
  
  type ListRoutesLimit = scala.Double
  
  type ListVirtualGatewaysLimit = scala.Double
  
  type ListVirtualNodesLimit = scala.Double
  
  type ListVirtualRoutersLimit = scala.Double
  
  type ListVirtualServicesLimit = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - typingsSlinky.awsSdk.awsSdkStrings.PERMISSIVE
    - typingsSlinky.awsSdk.awsSdkStrings.STRICT
    - java.lang.String
  */
  type ListenerTlsMode = typingsSlinky.awsSdk.appmeshMod._ListenerTlsMode | java.lang.String
  
  type Listeners = js.Array[typingsSlinky.awsSdk.appmeshMod.Listener]
  
  type Long = scala.Double
  
  type MaxRetries = scala.Double
  
  type MeshList = js.Array[typingsSlinky.awsSdk.appmeshMod.MeshRef]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type MeshStatusCode = typingsSlinky.awsSdk.appmeshMod._MeshStatusCode | java.lang.String
  
  type MethodName = java.lang.String
  
  type PercentInt = scala.Double
  
  type PortNumber = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.grpc
    - typingsSlinky.awsSdk.awsSdkStrings.http_
    - typingsSlinky.awsSdk.awsSdkStrings.http2
    - typingsSlinky.awsSdk.awsSdkStrings.tcp_
    - java.lang.String
  */
  type PortProtocol = typingsSlinky.awsSdk.appmeshMod._PortProtocol | java.lang.String
  
  type PortSet = js.Array[typingsSlinky.awsSdk.appmeshMod.PortNumber]
  
  type ResourceName = java.lang.String
  
  type RouteList = js.Array[typingsSlinky.awsSdk.appmeshMod.RouteRef]
  
  type RoutePriority = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type RouteStatusCode = typingsSlinky.awsSdk.appmeshMod._RouteStatusCode | java.lang.String
  
  type ServiceName = java.lang.String
  
  type String = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.appmeshMod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.appmeshMod.TagRef]
  
  type TagValue = java.lang.String
  
  type TagsLimit = scala.Double
  
  type TcpRetryPolicyEvent = typingsSlinky.awsSdk.awsSdkStrings.`connection-error` | java.lang.String
  
  type TcpRetryPolicyEvents = js.Array[typingsSlinky.awsSdk.appmeshMod.TcpRetryPolicyEvent]
  
  type Timestamp = js.Date
  
  type VirtualGatewayCertificateAuthorityArns = js.Array[typingsSlinky.awsSdk.appmeshMod.Arn]
  
  type VirtualGatewayHealthCheckIntervalMillis = scala.Double
  
  type VirtualGatewayHealthCheckThreshold = scala.Double
  
  type VirtualGatewayHealthCheckTimeoutMillis = scala.Double
  
  type VirtualGatewayList = js.Array[typingsSlinky.awsSdk.appmeshMod.VirtualGatewayRef]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - typingsSlinky.awsSdk.awsSdkStrings.PERMISSIVE
    - typingsSlinky.awsSdk.awsSdkStrings.STRICT
    - java.lang.String
  */
  type VirtualGatewayListenerTlsMode = typingsSlinky.awsSdk.appmeshMod._VirtualGatewayListenerTlsMode | java.lang.String
  
  type VirtualGatewayListeners = js.Array[typingsSlinky.awsSdk.appmeshMod.VirtualGatewayListener]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.grpc
    - typingsSlinky.awsSdk.awsSdkStrings.http_
    - typingsSlinky.awsSdk.awsSdkStrings.http2
    - java.lang.String
  */
  type VirtualGatewayPortProtocol = typingsSlinky.awsSdk.appmeshMod._VirtualGatewayPortProtocol | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type VirtualGatewayStatusCode = typingsSlinky.awsSdk.appmeshMod._VirtualGatewayStatusCode | java.lang.String
  
  type VirtualNodeList = js.Array[typingsSlinky.awsSdk.appmeshMod.VirtualNodeRef]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type VirtualNodeStatusCode = typingsSlinky.awsSdk.appmeshMod._VirtualNodeStatusCode | java.lang.String
  
  type VirtualRouterList = js.Array[typingsSlinky.awsSdk.appmeshMod.VirtualRouterRef]
  
  type VirtualRouterListeners = js.Array[typingsSlinky.awsSdk.appmeshMod.VirtualRouterListener]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type VirtualRouterStatusCode = typingsSlinky.awsSdk.appmeshMod._VirtualRouterStatusCode | java.lang.String
  
  type VirtualServiceList = js.Array[typingsSlinky.awsSdk.appmeshMod.VirtualServiceRef]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type VirtualServiceStatusCode = typingsSlinky.awsSdk.appmeshMod._VirtualServiceStatusCode | java.lang.String
  
  type WeightedTargets = js.Array[typingsSlinky.awsSdk.appmeshMod.WeightedTarget]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-10-01`
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-01-25`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.appmeshMod._apiVersion | java.lang.String
}
