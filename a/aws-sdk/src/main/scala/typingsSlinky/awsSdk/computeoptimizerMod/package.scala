package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  type CreationTimestamp = js.Date
  
  type CurrentInstanceType = java.lang.String
  
  type DesiredCapacity = scala.Double
  
  type DestinationBucket = java.lang.String
  
  type DestinationKey = java.lang.String
  
  type DestinationKeyPrefix = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AccountId
    - typingsSlinky.awsSdk.awsSdkStrings.AutoScalingGroupArn
    - typingsSlinky.awsSdk.awsSdkStrings.AutoScalingGroupName
    - typingsSlinky.awsSdk.awsSdkStrings.Finding_
    - typingsSlinky.awsSdk.awsSdkStrings.UtilizationMetricsCpuMaximum
    - typingsSlinky.awsSdk.awsSdkStrings.UtilizationMetricsMemoryMaximum
    - typingsSlinky.awsSdk.awsSdkStrings.LookbackPeriodInDays
    - typingsSlinky.awsSdk.awsSdkStrings.CurrentConfigurationInstanceType
    - typingsSlinky.awsSdk.awsSdkStrings.CurrentConfigurationDesiredCapacity
    - typingsSlinky.awsSdk.awsSdkStrings.CurrentConfigurationMinSize
    - typingsSlinky.awsSdk.awsSdkStrings.CurrentConfigurationMaxSize
    - typingsSlinky.awsSdk.awsSdkStrings.CurrentOnDemandPrice
    - typingsSlinky.awsSdk.awsSdkStrings.CurrentStandardOneYearNoUpfrontReservedPrice
    - typingsSlinky.awsSdk.awsSdkStrings.CurrentStandardThreeYearNoUpfrontReservedPrice
    - typingsSlinky.awsSdk.awsSdkStrings.CurrentVCpus
    - typingsSlinky.awsSdk.awsSdkStrings.CurrentMemory
    - typingsSlinky.awsSdk.awsSdkStrings.CurrentStorage
    - typingsSlinky.awsSdk.awsSdkStrings.CurrentNetwork
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationInstanceType
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationDesiredCapacity
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationMinSize
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationMaxSize
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationOptionsProjectedUtilizationMetricsCpuMaximum
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationOptionsPerformanceRisk
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationOptionsOnDemandPrice
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationOptionsStandardOneYearNoUpfrontReservedPrice
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationOptionsVcpus
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationOptionsMemory
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationOptionsStorage
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationOptionsNetwork
    - typingsSlinky.awsSdk.awsSdkStrings.LastRefreshTimestamp
    - java.lang.String
  */
  type ExportableAutoScalingGroupField = typingsSlinky.awsSdk.computeoptimizerMod._ExportableAutoScalingGroupField | java.lang.String
  
  type ExportableAutoScalingGroupFields = js.Array[typingsSlinky.awsSdk.computeoptimizerMod.ExportableAutoScalingGroupField]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AccountId
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceArn
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceName
    - typingsSlinky.awsSdk.awsSdkStrings.Finding_
    - typingsSlinky.awsSdk.awsSdkStrings.LookbackPeriodInDays
    - typingsSlinky.awsSdk.awsSdkStrings.CurrentInstanceType
    - typingsSlinky.awsSdk.awsSdkStrings.UtilizationMetricsCpuMaximum
    - typingsSlinky.awsSdk.awsSdkStrings.UtilizationMetricsMemoryMaximum
    - typingsSlinky.awsSdk.awsSdkStrings.CurrentOnDemandPrice
    - typingsSlinky.awsSdk.awsSdkStrings.CurrentStandardOneYearNoUpfrontReservedPrice
    - typingsSlinky.awsSdk.awsSdkStrings.CurrentStandardThreeYearNoUpfrontReservedPrice
    - typingsSlinky.awsSdk.awsSdkStrings.CurrentVCpus
    - typingsSlinky.awsSdk.awsSdkStrings.CurrentMemory
    - typingsSlinky.awsSdk.awsSdkStrings.CurrentStorage
    - typingsSlinky.awsSdk.awsSdkStrings.CurrentNetwork
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationOptionsInstanceType
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationOptionsProjectedUtilizationMetricsCpuMaximum
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationOptionsPerformanceRisk
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationOptionsVcpus
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationOptionsMemory
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationOptionsStorage
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationOptionsNetwork
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationOptionsOnDemandPrice
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationOptionsStandardOneYearNoUpfrontReservedPrice
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationsSourcesRecommendationSourceArn
    - typingsSlinky.awsSdk.awsSdkStrings.RecommendationsSourcesRecommendationSourceType
    - typingsSlinky.awsSdk.awsSdkStrings.LastRefreshTimestamp
    - java.lang.String
  */
  type ExportableInstanceField = typingsSlinky.awsSdk.computeoptimizerMod._ExportableInstanceField | java.lang.String
  
  type ExportableInstanceFields = js.Array[typingsSlinky.awsSdk.computeoptimizerMod.ExportableInstanceField]
  
  type FailureReason = java.lang.String
  
  type FileFormat = typingsSlinky.awsSdk.awsSdkStrings.Csv_ | java.lang.String
  
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
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ResourceType
    - typingsSlinky.awsSdk.awsSdkStrings.JobStatus
    - java.lang.String
  */
  type JobFilterName = typingsSlinky.awsSdk.computeoptimizerMod._JobFilterName | java.lang.String
  
  type JobFilters = js.Array[typingsSlinky.awsSdk.computeoptimizerMod.JobFilter]
  
  type JobId = java.lang.String
  
  type JobIds = js.Array[typingsSlinky.awsSdk.computeoptimizerMod.JobId]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Queued_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Complete_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type JobStatus = typingsSlinky.awsSdk.computeoptimizerMod._JobStatus | java.lang.String
  
  type LastRefreshTimestamp = js.Date
  
  type LastUpdatedTimestamp = js.Date
  
  type LookBackPeriodInDays = scala.Double
  
  type MaxResults = scala.Double
  
  type MaxSize = scala.Double
  
  type MemberAccountsEnrolled = scala.Boolean
  
  type Message = java.lang.String
  
  type MetadataKey = java.lang.String
  
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
  
  type RecommendationExportJobs = js.Array[typingsSlinky.awsSdk.computeoptimizerMod.RecommendationExportJob]
  
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
    - typingsSlinky.awsSdk.awsSdkStrings.Ec2Instance_
    - typingsSlinky.awsSdk.awsSdkStrings.AutoScalingGroup
    - java.lang.String
  */
  type ResourceType = typingsSlinky.awsSdk.computeoptimizerMod._ResourceType | java.lang.String
  
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
