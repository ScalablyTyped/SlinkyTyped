package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object route53resolverMod {
  
  type AccountId = java.lang.String
  
  type Arn = java.lang.String
  
  type Boolean = scala.Boolean
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.route53resolverMod.ClientApiVersions
  
  type CreatorRequestId = java.lang.String
  
  type DomainName = java.lang.String
  
  type FilterName = java.lang.String
  
  type FilterValue = java.lang.String
  
  type FilterValues = js.Array[typingsSlinky.awsSdk.route53resolverMod.FilterValue]
  
  type Filters = js.Array[typingsSlinky.awsSdk.route53resolverMod.Filter]
  
  type Ip = java.lang.String
  
  type IpAddressCount = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED_CREATION
    - typingsSlinky.awsSdk.awsSdkStrings.ATTACHING
    - typingsSlinky.awsSdk.awsSdkStrings.ATTACHED
    - typingsSlinky.awsSdk.awsSdkStrings.REMAP_DETACHING
    - typingsSlinky.awsSdk.awsSdkStrings.REMAP_ATTACHING
    - typingsSlinky.awsSdk.awsSdkStrings.DETACHING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED_RESOURCE_GONE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_FAILED_FAS_EXPIRED
    - java.lang.String
  */
  type IpAddressStatus = typingsSlinky.awsSdk.route53resolverMod._IpAddressStatus | java.lang.String
  
  type IpAddressesRequest = js.Array[typingsSlinky.awsSdk.route53resolverMod.IpAddressRequest]
  
  type IpAddressesResponse = js.Array[typingsSlinky.awsSdk.route53resolverMod.IpAddressResponse]
  
  type MaxResults = scala.Double
  
  type Name = java.lang.String
  
  type NextToken = java.lang.String
  
  type Port = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INBOUND
    - typingsSlinky.awsSdk.awsSdkStrings.OUTBOUND
    - java.lang.String
  */
  type ResolverEndpointDirection = typingsSlinky.awsSdk.route53resolverMod._ResolverEndpointDirection | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.OPERATIONAL
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.AUTO_RECOVERING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTION_NEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type ResolverEndpointStatus = typingsSlinky.awsSdk.route53resolverMod._ResolverEndpointStatus | java.lang.String
  
  type ResolverEndpoints = js.Array[typingsSlinky.awsSdk.route53resolverMod.ResolverEndpoint]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.OVERRIDDEN
    - java.lang.String
  */
  type ResolverRuleAssociationStatus = typingsSlinky.awsSdk.route53resolverMod._ResolverRuleAssociationStatus | java.lang.String
  
  type ResolverRuleAssociations = js.Array[typingsSlinky.awsSdk.route53resolverMod.ResolverRuleAssociation]
  
  type ResolverRulePolicy = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ResolverRuleStatus = typingsSlinky.awsSdk.route53resolverMod._ResolverRuleStatus | java.lang.String
  
  type ResolverRules = js.Array[typingsSlinky.awsSdk.route53resolverMod.ResolverRule]
  
  type ResourceId = java.lang.String
  
  type Rfc3339TimeString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FORWARD
    - typingsSlinky.awsSdk.awsSdkStrings.SYSTEM
    - typingsSlinky.awsSdk.awsSdkStrings.RECURSIVE
    - java.lang.String
  */
  type RuleTypeOption = typingsSlinky.awsSdk.route53resolverMod._RuleTypeOption | java.lang.String
  
  type SecurityGroupIds = js.Array[typingsSlinky.awsSdk.route53resolverMod.ResourceId]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_SHARED
    - typingsSlinky.awsSdk.awsSdkStrings.SHARED_WITH_ME
    - typingsSlinky.awsSdk.awsSdkStrings.SHARED_BY_ME
    - java.lang.String
  */
  type ShareStatus = typingsSlinky.awsSdk.route53resolverMod._ShareStatus | java.lang.String
  
  type StatusMessage = java.lang.String
  
  type SubnetId = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.route53resolverMod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.route53resolverMod.Tag]
  
  type TagValue = java.lang.String
  
  type TargetList = js.Array[typingsSlinky.awsSdk.route53resolverMod.TargetAddress]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-04-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.route53resolverMod._apiVersion | java.lang.String
}
