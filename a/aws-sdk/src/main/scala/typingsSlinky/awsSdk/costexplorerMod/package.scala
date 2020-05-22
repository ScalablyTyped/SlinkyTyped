package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object costexplorerMod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PAYER
    - typingsSlinky.awsSdk.awsSdkStrings.LINKED
    - java.lang.String
  */
  type AccountScope = typingsSlinky.awsSdk.costexplorerMod._AccountScope | java.lang.String
  type AmortizedRecurringFee = java.lang.String
  type AmortizedUpfrontFee = java.lang.String
  type Arn = java.lang.String
  type AttributeType = java.lang.String
  type AttributeValue = java.lang.String
  type Attributes = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.costexplorerMod.AttributeValue]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.costexplorerMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.COST_AND_USAGE
    - typingsSlinky.awsSdk.awsSdkStrings.RESERVATIONS
    - typingsSlinky.awsSdk.awsSdkStrings.SAVINGS_PLANS
    - java.lang.String
  */
  type Context = typingsSlinky.awsSdk.costexplorerMod._Context | java.lang.String
  type CostCategoryMaxResults = scala.Double
  type CostCategoryName = java.lang.String
  type CostCategoryReferencesList = js.Array[typingsSlinky.awsSdk.costexplorerMod.CostCategoryReference]
  type CostCategoryRuleVersion = typingsSlinky.awsSdk.awsSdkStrings.CostCategoryExpressionDotv1 | java.lang.String
  type CostCategoryRulesList = js.Array[typingsSlinky.awsSdk.costexplorerMod.CostCategoryRule]
  type CostCategoryValue = java.lang.String
  type CoverageHoursPercentage = java.lang.String
  type CoverageNormalizedUnitsPercentage = java.lang.String
  type CoveragesByTime = js.Array[typingsSlinky.awsSdk.costexplorerMod.CoverageByTime]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AZ
    - typingsSlinky.awsSdk.awsSdkStrings.INSTANCE_TYPE
    - typingsSlinky.awsSdk.awsSdkStrings.LINKED_ACCOUNT
    - typingsSlinky.awsSdk.awsSdkStrings.LINKED_ACCOUNT_NAME
    - typingsSlinky.awsSdk.awsSdkStrings.OPERATION
    - typingsSlinky.awsSdk.awsSdkStrings.PURCHASE_TYPE
    - typingsSlinky.awsSdk.awsSdkStrings.REGION
    - typingsSlinky.awsSdk.awsSdkStrings.SERVICE
    - typingsSlinky.awsSdk.awsSdkStrings.SERVICE_CODE
    - typingsSlinky.awsSdk.awsSdkStrings.USAGE_TYPE
    - typingsSlinky.awsSdk.awsSdkStrings.USAGE_TYPE_GROUP
    - typingsSlinky.awsSdk.awsSdkStrings.RECORD_TYPE
    - typingsSlinky.awsSdk.awsSdkStrings.OPERATING_SYSTEM
    - typingsSlinky.awsSdk.awsSdkStrings.TENANCY
    - typingsSlinky.awsSdk.awsSdkStrings.SCOPE
    - typingsSlinky.awsSdk.awsSdkStrings.PLATFORM
    - typingsSlinky.awsSdk.awsSdkStrings.SUBSCRIPTION_ID
    - typingsSlinky.awsSdk.awsSdkStrings.LEGAL_ENTITY_NAME
    - typingsSlinky.awsSdk.awsSdkStrings.DEPLOYMENT_OPTION
    - typingsSlinky.awsSdk.awsSdkStrings.DATABASE_ENGINE
    - typingsSlinky.awsSdk.awsSdkStrings.CACHE_ENGINE
    - typingsSlinky.awsSdk.awsSdkStrings.INSTANCE_TYPE_FAMILY
    - typingsSlinky.awsSdk.awsSdkStrings.BILLING_ENTITY
    - typingsSlinky.awsSdk.awsSdkStrings.RESERVATION_ID
    - typingsSlinky.awsSdk.awsSdkStrings.RESOURCE_ID
    - typingsSlinky.awsSdk.awsSdkStrings.RIGHTSIZING_TYPE
    - typingsSlinky.awsSdk.awsSdkStrings.SAVINGS_PLANS_TYPE
    - typingsSlinky.awsSdk.awsSdkStrings.SAVINGS_PLAN_ARN
    - typingsSlinky.awsSdk.awsSdkStrings.PAYMENT_OPTION
    - java.lang.String
  */
  type Dimension = typingsSlinky.awsSdk.costexplorerMod._Dimension | java.lang.String
  type DimensionValuesWithAttributesList = js.Array[typingsSlinky.awsSdk.costexplorerMod.DimensionValuesWithAttributes]
  type Entity = java.lang.String
  type Estimated = scala.Boolean
  type Expressions = js.Array[typingsSlinky.awsSdk.costexplorerMod.Expression]
  type ForecastResultsByTime = js.Array[typingsSlinky.awsSdk.costexplorerMod.ForecastResult]
  type GenericBoolean = scala.Boolean
  type GenericString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DAILY
    - typingsSlinky.awsSdk.awsSdkStrings.MONTHLY
    - typingsSlinky.awsSdk.awsSdkStrings.HOURLY
    - java.lang.String
  */
  type Granularity = typingsSlinky.awsSdk.costexplorerMod._Granularity | java.lang.String
  type GroupDefinitionKey = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DIMENSION
    - typingsSlinky.awsSdk.awsSdkStrings.TAG
    - typingsSlinky.awsSdk.awsSdkStrings.COST_CATEGORY
    - java.lang.String
  */
  type GroupDefinitionType = typingsSlinky.awsSdk.costexplorerMod._GroupDefinitionType | java.lang.String
  type GroupDefinitions = js.Array[typingsSlinky.awsSdk.costexplorerMod.GroupDefinition]
  type Groups = js.Array[typingsSlinky.awsSdk.costexplorerMod.Group]
  type Key = java.lang.String
  type Keys = js.Array[typingsSlinky.awsSdk.costexplorerMod.Key]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SEVEN_DAYS
    - typingsSlinky.awsSdk.awsSdkStrings.THIRTY_DAYS
    - typingsSlinky.awsSdk.awsSdkStrings.SIXTY_DAYS
    - java.lang.String
  */
  type LookbackPeriodInDays = typingsSlinky.awsSdk.costexplorerMod._LookbackPeriodInDays | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EQUALS
    - typingsSlinky.awsSdk.awsSdkStrings.STARTS_WITH
    - typingsSlinky.awsSdk.awsSdkStrings.ENDS_WITH
    - typingsSlinky.awsSdk.awsSdkStrings.CONTAINS
    - typingsSlinky.awsSdk.awsSdkStrings.CASE_SENSITIVE
    - typingsSlinky.awsSdk.awsSdkStrings.CASE_INSENSITIVE
    - java.lang.String
  */
  type MatchOption = typingsSlinky.awsSdk.costexplorerMod._MatchOption | java.lang.String
  type MatchOptions = js.Array[typingsSlinky.awsSdk.costexplorerMod.MatchOption]
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BLENDED_COST
    - typingsSlinky.awsSdk.awsSdkStrings.UNBLENDED_COST
    - typingsSlinky.awsSdk.awsSdkStrings.AMORTIZED_COST
    - typingsSlinky.awsSdk.awsSdkStrings.NET_UNBLENDED_COST
    - typingsSlinky.awsSdk.awsSdkStrings.NET_AMORTIZED_COST
    - typingsSlinky.awsSdk.awsSdkStrings.USAGE_QUANTITY
    - typingsSlinky.awsSdk.awsSdkStrings.NORMALIZED_USAGE_AMOUNT
    - java.lang.String
  */
  type Metric = typingsSlinky.awsSdk.costexplorerMod._Metric | java.lang.String
  type MetricAmount = java.lang.String
  type MetricName = java.lang.String
  type MetricNames = js.Array[typingsSlinky.awsSdk.costexplorerMod.MetricName]
  type MetricUnit = java.lang.String
  type Metrics = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.costexplorerMod.MetricValue]
  type NetRISavings = java.lang.String
  type NextPageToken = java.lang.String
  type NonNegativeInteger = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD
    - typingsSlinky.awsSdk.awsSdkStrings.CONVERTIBLE
    - java.lang.String
  */
  type OfferingClass = typingsSlinky.awsSdk.costexplorerMod._OfferingClass | java.lang.String
  type OnDemandCost = java.lang.String
  type OnDemandCostOfRIHoursUsed = java.lang.String
  type OnDemandHours = java.lang.String
  type OnDemandNormalizedUnits = java.lang.String
  type PageSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NO_UPFRONT
    - typingsSlinky.awsSdk.awsSdkStrings.PARTIAL_UPFRONT
    - typingsSlinky.awsSdk.awsSdkStrings.ALL_UPFRONT
    - typingsSlinky.awsSdk.awsSdkStrings.LIGHT_UTILIZATION
    - typingsSlinky.awsSdk.awsSdkStrings.MEDIUM_UTILIZATION
    - typingsSlinky.awsSdk.awsSdkStrings.HEAVY_UTILIZATION
    - java.lang.String
  */
  type PaymentOption = typingsSlinky.awsSdk.costexplorerMod._PaymentOption | java.lang.String
  type PredictionIntervalLevel = scala.Double
  type PurchasedHours = java.lang.String
  type PurchasedUnits = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SAME_INSTANCE_FAMILY
    - typingsSlinky.awsSdk.awsSdkStrings.CROSS_INSTANCE_FAMILY
    - java.lang.String
  */
  type RecommendationTarget = typingsSlinky.awsSdk.costexplorerMod._RecommendationTarget | java.lang.String
  type ReservationCoverageGroups = js.Array[typingsSlinky.awsSdk.costexplorerMod.ReservationCoverageGroup]
  type ReservationGroupKey = java.lang.String
  type ReservationGroupValue = java.lang.String
  type ReservationPurchaseRecommendationDetails = js.Array[typingsSlinky.awsSdk.costexplorerMod.ReservationPurchaseRecommendationDetail]
  type ReservationPurchaseRecommendations = js.Array[typingsSlinky.awsSdk.costexplorerMod.ReservationPurchaseRecommendation]
  type ReservationUtilizationGroups = js.Array[typingsSlinky.awsSdk.costexplorerMod.ReservationUtilizationGroup]
  type ReservedHours = java.lang.String
  type ReservedNormalizedUnits = java.lang.String
  type ResultsByTime = js.Array[typingsSlinky.awsSdk.costexplorerMod.ResultByTime]
  type RightsizingRecommendationList = js.Array[typingsSlinky.awsSdk.costexplorerMod.RightsizingRecommendation]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATE
    - typingsSlinky.awsSdk.awsSdkStrings.MODIFY
    - java.lang.String
  */
  type RightsizingType = typingsSlinky.awsSdk.costexplorerMod._RightsizingType | java.lang.String
  type SavingsPlanArn = java.lang.String
  type SavingsPlansCoverages = js.Array[typingsSlinky.awsSdk.costexplorerMod.SavingsPlansCoverage]
  type SavingsPlansPurchaseRecommendationDetailList = js.Array[typingsSlinky.awsSdk.costexplorerMod.SavingsPlansPurchaseRecommendationDetail]
  type SavingsPlansUtilizationDetails = js.Array[typingsSlinky.awsSdk.costexplorerMod.SavingsPlansUtilizationDetail]
  type SavingsPlansUtilizationsByTime = js.Array[typingsSlinky.awsSdk.costexplorerMod.SavingsPlansUtilizationByTime]
  type SearchString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.COMPUTE_SP
    - typingsSlinky.awsSdk.awsSdkStrings.EC2_INSTANCE_SP
    - java.lang.String
  */
  type SupportedSavingsPlansType = typingsSlinky.awsSdk.costexplorerMod._SupportedSavingsPlansType | java.lang.String
  type TagKey = java.lang.String
  type TagList = js.Array[typingsSlinky.awsSdk.costexplorerMod.Entity]
  type TagValuesList = js.Array[typingsSlinky.awsSdk.costexplorerMod.TagValues]
  type TargetInstancesList = js.Array[typingsSlinky.awsSdk.costexplorerMod.TargetInstance]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ONE_YEAR
    - typingsSlinky.awsSdk.awsSdkStrings.THREE_YEARS
    - java.lang.String
  */
  type TermInYears = typingsSlinky.awsSdk.costexplorerMod._TermInYears | java.lang.String
  type TotalActualHours = java.lang.String
  type TotalActualUnits = java.lang.String
  type TotalAmortizedFee = java.lang.String
  type TotalPotentialRISavings = java.lang.String
  type TotalRunningHours = java.lang.String
  type TotalRunningNormalizedUnits = java.lang.String
  type UnusedHours = java.lang.String
  type UnusedUnits = java.lang.String
  type UtilizationPercentage = java.lang.String
  type UtilizationPercentageInUnits = java.lang.String
  type UtilizationsByTime = js.Array[typingsSlinky.awsSdk.costexplorerMod.UtilizationByTime]
  type Value = java.lang.String
  type Values = js.Array[typingsSlinky.awsSdk.costexplorerMod.Value]
  type YearMonthDay = java.lang.String
  type ZonedDateTime = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-10-25`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.costexplorerMod._apiVersion | java.lang.String
}
