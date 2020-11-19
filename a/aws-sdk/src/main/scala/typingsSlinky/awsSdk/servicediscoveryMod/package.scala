package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object servicediscoveryMod {
  
  type AmazonResourceName = java.lang.String
  
  type Arn = java.lang.String
  
  type AttrKey = java.lang.String
  
  type AttrValue = java.lang.String
  
  type Attributes = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.servicediscoveryMod.AttrValue]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.servicediscoveryMod.ClientApiVersions
  
  type Code = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HEALTHY
    - typingsSlinky.awsSdk.awsSdkStrings.UNHEALTHY
    - java.lang.String
  */
  type CustomHealthStatus = typingsSlinky.awsSdk.servicediscoveryMod._CustomHealthStatus | java.lang.String
  
  type DiscoverMaxResults = scala.Double
  
  type DnsRecordList = js.Array[typingsSlinky.awsSdk.servicediscoveryMod.DnsRecord]
  
  type FailureThreshold = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EQ
    - typingsSlinky.awsSdk.awsSdkStrings.IN
    - typingsSlinky.awsSdk.awsSdkStrings.BETWEEN
    - java.lang.String
  */
  type FilterCondition = typingsSlinky.awsSdk.servicediscoveryMod._FilterCondition | java.lang.String
  
  type FilterValue = java.lang.String
  
  type FilterValues = js.Array[typingsSlinky.awsSdk.servicediscoveryMod.FilterValue]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HTTP
    - typingsSlinky.awsSdk.awsSdkStrings.HTTPS
    - typingsSlinky.awsSdk.awsSdkStrings.TCP
    - java.lang.String
  */
  type HealthCheckType = typingsSlinky.awsSdk.servicediscoveryMod._HealthCheckType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HEALTHY
    - typingsSlinky.awsSdk.awsSdkStrings.UNHEALTHY
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type HealthStatus = typingsSlinky.awsSdk.servicediscoveryMod._HealthStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HEALTHY
    - typingsSlinky.awsSdk.awsSdkStrings.UNHEALTHY
    - typingsSlinky.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type HealthStatusFilter = typingsSlinky.awsSdk.servicediscoveryMod._HealthStatusFilter | java.lang.String
  
  type HttpInstanceSummaryList = js.Array[typingsSlinky.awsSdk.servicediscoveryMod.HttpInstanceSummary]
  
  type InstanceHealthStatusMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.servicediscoveryMod.HealthStatus]
  
  type InstanceIdList = js.Array[typingsSlinky.awsSdk.servicediscoveryMod.ResourceId]
  
  type InstanceSummaryList = js.Array[typingsSlinky.awsSdk.servicediscoveryMod.InstanceSummary]
  
  type MaxResults = scala.Double
  
  type Message = java.lang.String
  
  type NamespaceFilterName = typingsSlinky.awsSdk.awsSdkStrings.TYPE | java.lang.String
  
  type NamespaceFilters = js.Array[typingsSlinky.awsSdk.servicediscoveryMod.NamespaceFilter]
  
  type NamespaceName = java.lang.String
  
  type NamespaceSummariesList = js.Array[typingsSlinky.awsSdk.servicediscoveryMod.NamespaceSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DNS_PUBLIC
    - typingsSlinky.awsSdk.awsSdkStrings.DNS_PRIVATE
    - typingsSlinky.awsSdk.awsSdkStrings.HTTP
    - java.lang.String
  */
  type NamespaceType = typingsSlinky.awsSdk.servicediscoveryMod._NamespaceType | java.lang.String
  
  type NextToken = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NAMESPACE_ID
    - typingsSlinky.awsSdk.awsSdkStrings.SERVICE_ID
    - typingsSlinky.awsSdk.awsSdkStrings.STATUS
    - typingsSlinky.awsSdk.awsSdkStrings.TYPE
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_DATE
    - java.lang.String
  */
  type OperationFilterName = typingsSlinky.awsSdk.servicediscoveryMod._OperationFilterName | java.lang.String
  
  type OperationFilters = js.Array[typingsSlinky.awsSdk.servicediscoveryMod.OperationFilter]
  
  type OperationId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUBMITTED
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
    - typingsSlinky.awsSdk.awsSdkStrings.FAIL
    - java.lang.String
  */
  type OperationStatus = typingsSlinky.awsSdk.servicediscoveryMod._OperationStatus | java.lang.String
  
  type OperationSummaryList = js.Array[typingsSlinky.awsSdk.servicediscoveryMod.OperationSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NAMESPACE
    - typingsSlinky.awsSdk.awsSdkStrings.SERVICE
    - typingsSlinky.awsSdk.awsSdkStrings.INSTANCE
    - java.lang.String
  */
  type OperationTargetType = typingsSlinky.awsSdk.servicediscoveryMod._OperationTargetType | java.lang.String
  
  type OperationTargetsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.servicediscoveryMod.ResourceId]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_NAMESPACE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_NAMESPACE
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_SERVICE
    - typingsSlinky.awsSdk.awsSdkStrings.REGISTER_INSTANCE
    - typingsSlinky.awsSdk.awsSdkStrings.DEREGISTER_INSTANCE
    - java.lang.String
  */
  type OperationType = typingsSlinky.awsSdk.servicediscoveryMod._OperationType | java.lang.String
  
  type RecordTTL = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SRV
    - typingsSlinky.awsSdk.awsSdkStrings.A
    - typingsSlinky.awsSdk.awsSdkStrings.AAAA
    - typingsSlinky.awsSdk.awsSdkStrings.CNAME
    - java.lang.String
  */
  type RecordType = typingsSlinky.awsSdk.servicediscoveryMod._RecordType | java.lang.String
  
  type ResourceCount = scala.Double
  
  type ResourceDescription = java.lang.String
  
  type ResourceId = java.lang.String
  
  type ResourcePath = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MULTIVALUE
    - typingsSlinky.awsSdk.awsSdkStrings.WEIGHTED
    - java.lang.String
  */
  type RoutingPolicy = typingsSlinky.awsSdk.servicediscoveryMod._RoutingPolicy | java.lang.String
  
  type ServiceFilterName = typingsSlinky.awsSdk.awsSdkStrings.NAMESPACE_ID | java.lang.String
  
  type ServiceFilters = js.Array[typingsSlinky.awsSdk.servicediscoveryMod.ServiceFilter]
  
  type ServiceName = java.lang.String
  
  type ServiceSummariesList = js.Array[typingsSlinky.awsSdk.servicediscoveryMod.ServiceSummary]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.servicediscoveryMod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.servicediscoveryMod.Tag]
  
  type TagValue = java.lang.String
  
  type Timestamp = js.Date
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-03-14`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.servicediscoveryMod._apiVersion | java.lang.String
}
