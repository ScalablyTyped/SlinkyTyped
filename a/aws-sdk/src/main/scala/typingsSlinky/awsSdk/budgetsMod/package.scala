package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object budgetsMod {
  type AccountId = java.lang.String
  type BudgetName = java.lang.String
  type BudgetedAndActualAmountsList = js.Array[typingsSlinky.awsSdk.budgetsMod.BudgetedAndActualAmounts]
  type Budgets = js.Array[typingsSlinky.awsSdk.budgetsMod.Budget]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.budgetsMod.ClientApiVersions
  type CostFilters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.budgetsMod.DimensionValues]
  type DimensionValues = js.Array[typingsSlinky.awsSdk.budgetsMod.GenericString]
  type GenericString = java.lang.String
  type GenericTimestamp = js.Date
  type MaxResults = scala.Double
  type NotificationThreshold = scala.Double
  type NotificationWithSubscribersList = js.Array[typingsSlinky.awsSdk.budgetsMod.NotificationWithSubscribers]
  type Notifications = js.Array[typingsSlinky.awsSdk.budgetsMod.Notification]
  type NullableBoolean = scala.Boolean
  type NumericValue = java.lang.String
  type PlannedBudgetLimits = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.budgetsMod.Spend]
  type SubscriberAddress = java.lang.String
  type Subscribers = js.Array[typingsSlinky.awsSdk.budgetsMod.Subscriber]
  type UnitValue = java.lang.String
}
