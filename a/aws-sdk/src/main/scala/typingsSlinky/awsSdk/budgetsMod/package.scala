package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object budgetsMod {
  
  type AccountId = java.lang.String
  
  type BudgetName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.USAGE
    - typingsSlinky.awsSdk.awsSdkStrings.COST
    - typingsSlinky.awsSdk.awsSdkStrings.RI_UTILIZATION
    - typingsSlinky.awsSdk.awsSdkStrings.RI_COVERAGE
    - typingsSlinky.awsSdk.awsSdkStrings.SAVINGS_PLANS_UTILIZATION
    - typingsSlinky.awsSdk.awsSdkStrings.SAVINGS_PLANS_COVERAGE
    - java.lang.String
  */
  type BudgetType = typingsSlinky.awsSdk.budgetsMod._BudgetType | java.lang.String
  
  type BudgetedAndActualAmountsList = js.Array[typingsSlinky.awsSdk.budgetsMod.BudgetedAndActualAmounts]
  
  type Budgets = js.Array[typingsSlinky.awsSdk.budgetsMod.Budget]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.budgetsMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GREATER_THAN
    - typingsSlinky.awsSdk.awsSdkStrings.LESS_THAN
    - typingsSlinky.awsSdk.awsSdkStrings.EQUAL_TO
    - java.lang.String
  */
  type ComparisonOperator = typingsSlinky.awsSdk.budgetsMod._ComparisonOperator | java.lang.String
  
  type CostFilters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.budgetsMod.DimensionValues]
  
  type DimensionValues = js.Array[typingsSlinky.awsSdk.budgetsMod.GenericString]
  
  type GenericString = java.lang.String
  
  type GenericTimestamp = js.Date
  
  type MaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OK
    - typingsSlinky.awsSdk.awsSdkStrings.ALARM
    - java.lang.String
  */
  type NotificationState = typingsSlinky.awsSdk.budgetsMod._NotificationState | java.lang.String
  
  type NotificationThreshold = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTUAL
    - typingsSlinky.awsSdk.awsSdkStrings.FORECASTED
    - java.lang.String
  */
  type NotificationType = typingsSlinky.awsSdk.budgetsMod._NotificationType | java.lang.String
  
  type NotificationWithSubscribersList = js.Array[typingsSlinky.awsSdk.budgetsMod.NotificationWithSubscribers]
  
  type Notifications = js.Array[typingsSlinky.awsSdk.budgetsMod.Notification]
  
  type NullableBoolean = scala.Boolean
  
  type NumericValue = java.lang.String
  
  type PlannedBudgetLimits = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.budgetsMod.Spend]
  
  type SubscriberAddress = java.lang.String
  
  type Subscribers = js.Array[typingsSlinky.awsSdk.budgetsMod.Subscriber]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SNS
    - typingsSlinky.awsSdk.awsSdkStrings.EMAIL
    - java.lang.String
  */
  type SubscriptionType = typingsSlinky.awsSdk.budgetsMod._SubscriptionType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PERCENTAGE
    - typingsSlinky.awsSdk.awsSdkStrings.ABSOLUTE_VALUE
    - java.lang.String
  */
  type ThresholdType = typingsSlinky.awsSdk.budgetsMod._ThresholdType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DAILY
    - typingsSlinky.awsSdk.awsSdkStrings.MONTHLY
    - typingsSlinky.awsSdk.awsSdkStrings.QUARTERLY
    - typingsSlinky.awsSdk.awsSdkStrings.ANNUALLY
    - java.lang.String
  */
  type TimeUnit = typingsSlinky.awsSdk.budgetsMod._TimeUnit | java.lang.String
  
  type UnitValue = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-10-20`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.budgetsMod._apiVersion | java.lang.String
}
