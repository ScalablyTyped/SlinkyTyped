package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object servicequotasMod {
  
  type AwsRegion = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.servicequotasMod.ClientApiVersions
  
  type CustomerServiceEngagementId = java.lang.String
  
  type DateTime = js.Date
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DEPENDENCY_ACCESS_DENIED_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.DEPENDENCY_THROTTLING_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.DEPENDENCY_SERVICE_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.SERVICE_QUOTA_NOT_AVAILABLE_ERROR
    - java.lang.String
  */
  type ErrorCode = typingsSlinky.awsSdk.servicequotasMod._ErrorCode | java.lang.String
  
  type ErrorMessage = java.lang.String
  
  type GlobalQuota = scala.Boolean
  
  type MaxResults = scala.Double
  
  type MetricDimensionName = java.lang.String
  
  type MetricDimensionValue = java.lang.String
  
  type MetricDimensionsMapDefinition = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.servicequotasMod.MetricDimensionValue]
  
  type NextToken = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MICROSECOND
    - typingsSlinky.awsSdk.awsSdkStrings.MILLISECOND
    - typingsSlinky.awsSdk.awsSdkStrings.SECOND
    - typingsSlinky.awsSdk.awsSdkStrings.MINUTE
    - typingsSlinky.awsSdk.awsSdkStrings.HOUR
    - typingsSlinky.awsSdk.awsSdkStrings.DAY
    - typingsSlinky.awsSdk.awsSdkStrings.WEEK
    - java.lang.String
  */
  type PeriodUnit = typingsSlinky.awsSdk.servicequotasMod._PeriodUnit | java.lang.String
  
  type PeriodValue = scala.Double
  
  type QuotaAdjustable = scala.Boolean
  
  type QuotaArn = java.lang.String
  
  type QuotaCode = java.lang.String
  
  type QuotaMetricName = java.lang.String
  
  type QuotaMetricNamespace = java.lang.String
  
  type QuotaName = java.lang.String
  
  type QuotaUnit = java.lang.String
  
  type QuotaValue = scala.Double
  
  type RequestId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.CASE_OPENED
    - typingsSlinky.awsSdk.awsSdkStrings.APPROVED
    - typingsSlinky.awsSdk.awsSdkStrings.DENIED
    - typingsSlinky.awsSdk.awsSdkStrings.CASE_CLOSED
    - java.lang.String
  */
  type RequestStatus = typingsSlinky.awsSdk.servicequotasMod._RequestStatus | java.lang.String
  
  type RequestedServiceQuotaChangeHistoryListDefinition = js.Array[typingsSlinky.awsSdk.servicequotasMod.RequestedServiceQuotaChange]
  
  type Requester = java.lang.String
  
  type ServiceCode = java.lang.String
  
  type ServiceInfoListDefinition = js.Array[typingsSlinky.awsSdk.servicequotasMod.ServiceInfo]
  
  type ServiceName = java.lang.String
  
  type ServiceQuotaIncreaseRequestInTemplateList = js.Array[typingsSlinky.awsSdk.servicequotasMod.ServiceQuotaIncreaseRequestInTemplate]
  
  type ServiceQuotaListDefinition = js.Array[typingsSlinky.awsSdk.servicequotasMod.ServiceQuota]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ASSOCIATED
    - typingsSlinky.awsSdk.awsSdkStrings.DISASSOCIATED
    - java.lang.String
  */
  type ServiceQuotaTemplateAssociationStatus = typingsSlinky.awsSdk.servicequotasMod._ServiceQuotaTemplateAssociationStatus | java.lang.String
  
  type Statistic = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-06-24`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.servicequotasMod._apiVersion | java.lang.String
}
