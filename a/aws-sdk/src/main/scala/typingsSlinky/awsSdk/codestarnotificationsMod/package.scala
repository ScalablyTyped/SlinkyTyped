package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object codestarnotificationsMod {
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.codestarnotificationsMod.ClientApiVersions
  
  type ClientRequestToken = java.lang.String
  
  type CreatedTimestamp = js.Date
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BASIC
    - typingsSlinky.awsSdk.awsSdkStrings.FULL
    - java.lang.String
  */
  type DetailType = typingsSlinky.awsSdk.codestarnotificationsMod._DetailType | java.lang.String
  
  type EventTypeBatch = js.Array[typingsSlinky.awsSdk.codestarnotificationsMod.EventTypeSummary]
  
  type EventTypeId = java.lang.String
  
  type EventTypeIds = js.Array[typingsSlinky.awsSdk.codestarnotificationsMod.EventTypeId]
  
  type EventTypeName = java.lang.String
  
  type ForceUnsubscribeAll = scala.Boolean
  
  type LastModifiedTimestamp = js.Date
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RESOURCE_TYPE
    - typingsSlinky.awsSdk.awsSdkStrings.SERVICE_NAME
    - java.lang.String
  */
  type ListEventTypesFilterName = typingsSlinky.awsSdk.codestarnotificationsMod._ListEventTypesFilterName | java.lang.String
  
  type ListEventTypesFilterValue = java.lang.String
  
  type ListEventTypesFilters = js.Array[typingsSlinky.awsSdk.codestarnotificationsMod.ListEventTypesFilter]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EVENT_TYPE_ID
    - typingsSlinky.awsSdk.awsSdkStrings.CREATED_BY
    - typingsSlinky.awsSdk.awsSdkStrings.RESOURCE
    - typingsSlinky.awsSdk.awsSdkStrings.TARGET_ADDRESS
    - java.lang.String
  */
  type ListNotificationRulesFilterName = typingsSlinky.awsSdk.codestarnotificationsMod._ListNotificationRulesFilterName | java.lang.String
  
  type ListNotificationRulesFilterValue = java.lang.String
  
  type ListNotificationRulesFilters = js.Array[typingsSlinky.awsSdk.codestarnotificationsMod.ListNotificationRulesFilter]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TARGET_TYPE
    - typingsSlinky.awsSdk.awsSdkStrings.TARGET_ADDRESS
    - typingsSlinky.awsSdk.awsSdkStrings.TARGET_STATUS
    - java.lang.String
  */
  type ListTargetsFilterName = typingsSlinky.awsSdk.codestarnotificationsMod._ListTargetsFilterName | java.lang.String
  
  type ListTargetsFilterValue = java.lang.String
  
  type ListTargetsFilters = js.Array[typingsSlinky.awsSdk.codestarnotificationsMod.ListTargetsFilter]
  
  type MaxResults = scala.Double
  
  type NextToken = java.lang.String
  
  type NotificationRuleArn = java.lang.String
  
  type NotificationRuleBatch = js.Array[typingsSlinky.awsSdk.codestarnotificationsMod.NotificationRuleSummary]
  
  type NotificationRuleCreatedBy = java.lang.String
  
  type NotificationRuleId = java.lang.String
  
  type NotificationRuleName = java.lang.String
  
  type NotificationRuleResource = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type NotificationRuleStatus = typingsSlinky.awsSdk.codestarnotificationsMod._NotificationRuleStatus | java.lang.String
  
  type ResourceType = java.lang.String
  
  type ServiceName = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeys = js.Array[typingsSlinky.awsSdk.codestarnotificationsMod.TagKey]
  
  type TagValue = java.lang.String
  
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.codestarnotificationsMod.TagValue]
  
  type TargetAddress = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.UNREACHABLE
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DEACTIVATED
    - java.lang.String
  */
  type TargetStatus = typingsSlinky.awsSdk.codestarnotificationsMod._TargetStatus | java.lang.String
  
  type TargetType = java.lang.String
  
  type Targets = js.Array[typingsSlinky.awsSdk.codestarnotificationsMod.Target]
  
  type TargetsBatch = js.Array[typingsSlinky.awsSdk.codestarnotificationsMod.TargetSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-10-15`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.codestarnotificationsMod._apiVersion | java.lang.String
}
