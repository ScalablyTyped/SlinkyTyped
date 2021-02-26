package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object budgetsMod {
  
  type AccountId = java.lang.String
  
  type ActionHistories = js.Array[typingsSlinky.awsSdk.budgetsMod.ActionHistory]
  
  type ActionId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STANDBY
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.EXECUTION_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.EXECUTION_SUCCESS
    - typingsSlinky.awsSdk.awsSdkStrings.EXECUTION_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.REVERSE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.REVERSE_SUCCESS
    - typingsSlinky.awsSdk.awsSdkStrings.REVERSE_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.RESET_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.RESET_FAILURE
    - java.lang.String
  */
  type ActionStatus = typingsSlinky.awsSdk.budgetsMod._ActionStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STOP_EC2_INSTANCES
    - typingsSlinky.awsSdk.awsSdkStrings.STOP_RDS_INSTANCES
    - java.lang.String
  */
  type ActionSubType = typingsSlinky.awsSdk.budgetsMod._ActionSubType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.APPLY_IAM_POLICY
    - typingsSlinky.awsSdk.awsSdkStrings.APPLY_SCP_POLICY
    - typingsSlinky.awsSdk.awsSdkStrings.RUN_SSM_DOCUMENTS
    - java.lang.String
  */
  type ActionType = typingsSlinky.awsSdk.budgetsMod._ActionType | java.lang.String
  
  type Actions = js.Array[typingsSlinky.awsSdk.budgetsMod.Action]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AUTOMATIC
    - typingsSlinky.awsSdk.awsSdkStrings.MANUAL
    - java.lang.String
  */
  type ApprovalModel = typingsSlinky.awsSdk.budgetsMod._ApprovalModel | java.lang.String
  
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
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SYSTEM
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_ACTION
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_ACTION
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_ACTION
    - typingsSlinky.awsSdk.awsSdkStrings.EXECUTE_ACTION
    - java.lang.String
  */
  type EventType = typingsSlinky.awsSdk.budgetsMod._EventType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.APPROVE_BUDGET_ACTION
    - typingsSlinky.awsSdk.awsSdkStrings.RETRY_BUDGET_ACTION
    - typingsSlinky.awsSdk.awsSdkStrings.REVERSE_BUDGET_ACTION
    - typingsSlinky.awsSdk.awsSdkStrings.RESET_BUDGET_ACTION
    - java.lang.String
  */
  type ExecutionType = typingsSlinky.awsSdk.budgetsMod._ExecutionType | java.lang.String
  
  type GenericString = java.lang.String
  
  type GenericTimestamp = js.Date
  
  type Group = java.lang.String
  
  type Groups = js.Array[typingsSlinky.awsSdk.budgetsMod.Group]
  
  type InstanceId = java.lang.String
  
  type InstanceIds = js.Array[typingsSlinky.awsSdk.budgetsMod.InstanceId]
  
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
  
  type PolicyArn = java.lang.String
  
  type PolicyId = java.lang.String
  
  type Region = java.lang.String
  
  type Role = java.lang.String
  
  type RoleArn = java.lang.String
  
  type Roles = js.Array[typingsSlinky.awsSdk.budgetsMod.Role]
  
  type SubscriberAddress = java.lang.String
  
  type Subscribers = js.Array[typingsSlinky.awsSdk.budgetsMod.Subscriber]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SNS
    - typingsSlinky.awsSdk.awsSdkStrings.EMAIL
    - java.lang.String
  */
  type SubscriptionType = typingsSlinky.awsSdk.budgetsMod._SubscriptionType | java.lang.String
  
  type TargetId = java.lang.String
  
  type TargetIds = js.Array[typingsSlinky.awsSdk.budgetsMod.TargetId]
  
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
  
  type User = java.lang.String
  
  type Users = js.Array[typingsSlinky.awsSdk.budgetsMod.User]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-10-20`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.budgetsMod._apiVersion | java.lang.String
}
