package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object resourcegroupstaggingapiMod {
  
  type AmazonResourceType = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.resourcegroupstaggingapiMod.ClientApiVersions
  
  type ComplianceStatus = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InternalServiceException
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidParameterException
    - java.lang.String
  */
  type ErrorCode = typingsSlinky.awsSdk.resourcegroupstaggingapiMod._ErrorCode | java.lang.String
  
  type ErrorMessage = java.lang.String
  
  type ExcludeCompliantResources = scala.Boolean
  
  type FailedResourcesMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.FailureInfo]
  
  type GroupBy = js.Array[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.GroupByAttribute]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TARGET_ID
    - typingsSlinky.awsSdk.awsSdkStrings.REGION
    - typingsSlinky.awsSdk.awsSdkStrings.RESOURCE_TYPE
    - java.lang.String
  */
  type GroupByAttribute = typingsSlinky.awsSdk.resourcegroupstaggingapiMod._GroupByAttribute | java.lang.String
  
  type IncludeComplianceDetails = scala.Boolean
  
  type LastUpdated = java.lang.String
  
  type MaxResultsGetComplianceSummary = scala.Double
  
  type NonCompliantResources = scala.Double
  
  type PaginationToken = java.lang.String
  
  type Region = java.lang.String
  
  type RegionFilterList = js.Array[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.Region]
  
  type ResourceARN = java.lang.String
  
  type ResourceARNList = js.Array[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.ResourceARN]
  
  type ResourceTagMappingList = js.Array[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.ResourceTagMapping]
  
  type ResourceTypeFilterList = js.Array[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.AmazonResourceType]
  
  type ResourcesPerPage = scala.Double
  
  type S3Bucket = java.lang.String
  
  type S3Location = java.lang.String
  
  type Status = java.lang.String
  
  type StatusCode = scala.Double
  
  type SummaryList = js.Array[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.Summary]
  
  type TagFilterList = js.Array[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.TagFilter]
  
  type TagKey = java.lang.String
  
  type TagKeyFilterList = js.Array[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.TagKey]
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.TagKey]
  
  type TagKeyListForUntag = js.Array[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.Tag]
  
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.TagValue]
  
  type TagValue = java.lang.String
  
  type TagValueList = js.Array[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.TagValue]
  
  type TagValuesOutputList = js.Array[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.TagValue]
  
  type TagsPerPage = scala.Double
  
  type TargetId = java.lang.String
  
  type TargetIdFilterList = js.Array[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.TargetId]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT
    - typingsSlinky.awsSdk.awsSdkStrings.OU
    - typingsSlinky.awsSdk.awsSdkStrings.ROOT
    - java.lang.String
  */
  type TargetIdType = typingsSlinky.awsSdk.resourcegroupstaggingapiMod._TargetIdType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-01-26`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.resourcegroupstaggingapiMod._apiVersion | java.lang.String
}
