package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object computeoptimizerMod {
  type AccountId = java.lang.String
  type AccountIds = js.Array[typingsSlinky.awsSdk.computeoptimizerMod.AccountId]
  type AutoScalingGroupArn = java.lang.String
  type AutoScalingGroupArns = js.Array[typingsSlinky.awsSdk.computeoptimizerMod.AutoScalingGroupArn]
  type AutoScalingGroupName = java.lang.String
  type AutoScalingGroupRecommendationOptions = js.Array[typingsSlinky.awsSdk.computeoptimizerMod.AutoScalingGroupRecommendationOption]
  type AutoScalingGroupRecommendations = js.Array[typingsSlinky.awsSdk.computeoptimizerMod.AutoScalingGroupRecommendation]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.computeoptimizerMod.ClientApiVersions
  type Code = java.lang.String
  type CurrentInstanceType = java.lang.String
  type DesiredCapacity = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Finding_
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationSourceType
    - java.lang.String
  */
  type FilterName = typingsSlinky.awsSdk.computeoptimizerMod._FilterName | java.lang.String
  type FilterValue = java.lang.String
  type FilterValues = js.Array[typingsSlinky.awsSdk.computeoptimizerMod.FilterValue]
  type Filters = js.Array[typingsSlinky.awsSdk.computeoptimizerMod.Filter]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Underprovisioned
    - typingsSlinky.awsSdk.awsSdkStrings.Overprovisioned
    - typingsSlinky.awsSdk.awsSdkStrings.Optimized
    - typingsSlinky.awsSdk.awsSdkStrings.NotOptimized
    - java.lang.String
  */
  type Finding = typingsSlinky.awsSdk.computeoptimizerMod._Finding | java.lang.String
  type GetRecommendationErrors = js.Array[typingsSlinky.awsSdk.computeoptimizerMod.GetRecommendationError]
  type Identifier = java.lang.String
  type IncludeMemberAccounts = scala.Boolean
  type InstanceArn = java.lang.String
  type InstanceArns = js.Array[typingsSlinky.awsSdk.computeoptimizerMod.InstanceArn]
  type InstanceName = java.lang.String
  type InstanceRecommendations = js.Array[typingsSlinky.awsSdk.computeoptimizerMod.InstanceRecommendation]
  type InstanceType = java.lang.String
  type LastRefreshTimestamp = js.Date
  type LookBackPeriodInDays = scala.Double
  type MaxResults = scala.Double
  type MaxSize = scala.Double
  type MemberAccountsEnrolled = scala.Boolean
  type Message = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Cpu_
    - typingsSlinky.awsSdk.awsSdkStrings.Memory_
    - java.lang.String
  */
  type MetricName = typingsSlinky.awsSdk.computeoptimizerMod._MetricName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Maximum_
    - typingsSlinky.awsSdk.awsSdkStrings.Average_
    - java.lang.String
  */
  type MetricStatistic = typingsSlinky.awsSdk.computeoptimizerMod._MetricStatistic | java.lang.String
  type MetricValue = scala.Double
  type MetricValues = js.Array[typingsSlinky.awsSdk.computeoptimizerMod.MetricValue]
  type MinSize = scala.Double
  type NextToken = java.lang.String
  type PerformanceRisk = scala.Double
  type Period = scala.Double
  type ProjectedMetrics = js.Array[typingsSlinky.awsSdk.computeoptimizerMod.ProjectedMetric]
  type ProjectedUtilizationMetrics = js.Array[typingsSlinky.awsSdk.computeoptimizerMod.UtilizationMetric]
  type Rank = scala.Double
  type RecommendationOptions = js.Array[typingsSlinky.awsSdk.computeoptimizerMod.InstanceRecommendationOption]
  type RecommendationSourceArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Ec2Instance_
    - typingsSlinky.awsSdk.awsSdkStrings.AutoScalingGroup
    - java.lang.String
  */
  type RecommendationSourceType = typingsSlinky.awsSdk.computeoptimizerMod._RecommendationSourceType | java.lang.String
  type RecommendationSources = js.Array[typingsSlinky.awsSdk.computeoptimizerMod.RecommendationSource]
  type RecommendationSummaries = js.Array[typingsSlinky.awsSdk.computeoptimizerMod.RecommendationSummary]
  type RecommendedInstanceType = java.lang.String
  type RecommendedOptionProjectedMetrics = js.Array[typingsSlinky.awsSdk.computeoptimizerMod.RecommendedOptionProjectedMetric]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Active_
    - typingsSlinky.awsSdk.awsSdkStrings.Inactive_
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type Status = typingsSlinky.awsSdk.computeoptimizerMod._Status | java.lang.String
  type StatusReason = java.lang.String
  type Summaries = js.Array[typingsSlinky.awsSdk.computeoptimizerMod.Summary]
  type SummaryValue = scala.Double
  type Timestamp = js.Date
  type Timestamps = js.Array[js.Date]
  type UtilizationMetrics = js.Array[typingsSlinky.awsSdk.computeoptimizerMod.UtilizationMetric]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-11-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.computeoptimizerMod._apiVersion | java.lang.String
}
