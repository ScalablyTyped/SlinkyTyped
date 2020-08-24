package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object resourcegroupsMod {
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.resourcegroupsMod.ClientApiVersions
  type Description = java.lang.String
  type ErrorCode = java.lang.String
  type ErrorMessage = java.lang.String
  type FailedResourceList = js.Array[typingsSlinky.awsSdk.resourcegroupsMod.FailedResource]
  type GroupArn = java.lang.String
  type GroupConfigurationFailureReason = java.lang.String
  type GroupConfigurationList = js.Array[typingsSlinky.awsSdk.resourcegroupsMod.GroupConfigurationItem]
  type GroupConfigurationParameterName = java.lang.String
  type GroupConfigurationParameterValue = java.lang.String
  type GroupConfigurationParameterValueList = js.Array[typingsSlinky.awsSdk.resourcegroupsMod.GroupConfigurationParameterValue]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_FAILED
    - java.lang.String
  */
  type GroupConfigurationStatus = typingsSlinky.awsSdk.resourcegroupsMod._GroupConfigurationStatus | java.lang.String
  type GroupConfigurationType = java.lang.String
  type GroupFilterList = js.Array[typingsSlinky.awsSdk.resourcegroupsMod.GroupFilter]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`resource-type`
    - typingsSlinky.awsSdk.awsSdkStrings.`configuration-type`
    - java.lang.String
  */
  type GroupFilterName = typingsSlinky.awsSdk.resourcegroupsMod._GroupFilterName | java.lang.String
  type GroupFilterValue = java.lang.String
  type GroupFilterValues = js.Array[typingsSlinky.awsSdk.resourcegroupsMod.GroupFilterValue]
  type GroupIdentifierList = js.Array[typingsSlinky.awsSdk.resourcegroupsMod.GroupIdentifier]
  type GroupList = js.Array[typingsSlinky.awsSdk.resourcegroupsMod.Group]
  type GroupName = java.lang.String
  type GroupParameterList = js.Array[typingsSlinky.awsSdk.resourcegroupsMod.GroupConfigurationParameter]
  type GroupString = java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type Query = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CLOUDFORMATION_STACK_INACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.CLOUDFORMATION_STACK_NOT_EXISTING
    - java.lang.String
  */
  type QueryErrorCode = typingsSlinky.awsSdk.resourcegroupsMod._QueryErrorCode | java.lang.String
  type QueryErrorList = js.Array[typingsSlinky.awsSdk.resourcegroupsMod.QueryError]
  type QueryErrorMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TAG_FILTERS_1_0
    - typingsSlinky.awsSdk.awsSdkStrings.CLOUDFORMATION_STACK_1_0
    - java.lang.String
  */
  type QueryType = typingsSlinky.awsSdk.resourcegroupsMod._QueryType | java.lang.String
  type ResourceArn = java.lang.String
  type ResourceArnList = js.Array[typingsSlinky.awsSdk.resourcegroupsMod.ResourceArn]
  type ResourceFilterList = js.Array[typingsSlinky.awsSdk.resourcegroupsMod.ResourceFilter]
  type ResourceFilterName = typingsSlinky.awsSdk.awsSdkStrings.`resource-type` | java.lang.String
  type ResourceFilterValue = java.lang.String
  type ResourceFilterValues = js.Array[typingsSlinky.awsSdk.resourcegroupsMod.ResourceFilterValue]
  type ResourceIdentifierList = js.Array[typingsSlinky.awsSdk.resourcegroupsMod.ResourceIdentifier]
  type ResourceType = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.resourcegroupsMod.TagKey]
  type TagValue = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.resourcegroupsMod.TagValue]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-11-27`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.resourcegroupsMod._apiVersion | java.lang.String
}
