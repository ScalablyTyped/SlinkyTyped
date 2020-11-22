package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object autoscalingplansMod {
  
  type ApplicationSources = js.Array[typingsSlinky.awsSdk.autoscalingplansMod.ApplicationSource]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.autoscalingplansMod.ClientApiVersions
  
  type Cooldown = scala.Double
  
  type Datapoints = js.Array[typingsSlinky.awsSdk.autoscalingplansMod.Datapoint]
  
  type DisableDynamicScaling = scala.Boolean
  
  type DisableScaleIn = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CapacityForecast
    - typingsSlinky.awsSdk.awsSdkStrings.LoadForecast
    - typingsSlinky.awsSdk.awsSdkStrings.ScheduledActionMinCapacity
    - typingsSlinky.awsSdk.awsSdkStrings.ScheduledActionMaxCapacity
    - java.lang.String
  */
  type ForecastDataType = typingsSlinky.awsSdk.autoscalingplansMod._ForecastDataType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ASGTotalCPUUtilization
    - typingsSlinky.awsSdk.awsSdkStrings.ASGTotalNetworkIn
    - typingsSlinky.awsSdk.awsSdkStrings.ASGTotalNetworkOut
    - typingsSlinky.awsSdk.awsSdkStrings.ALBTargetGroupRequestCount
    - java.lang.String
  */
  type LoadMetricType = typingsSlinky.awsSdk.autoscalingplansMod._LoadMetricType | java.lang.String
  
  type MaxResults = scala.Double
  
  type MetricDimensionName = java.lang.String
  
  type MetricDimensionValue = java.lang.String
  
  type MetricDimensions = js.Array[typingsSlinky.awsSdk.autoscalingplansMod.MetricDimension]
  
  type MetricName = java.lang.String
  
  type MetricNamespace = java.lang.String
  
  type MetricScale = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Average_
    - typingsSlinky.awsSdk.awsSdkStrings.Minimum_
    - typingsSlinky.awsSdk.awsSdkStrings.Maximum_
    - typingsSlinky.awsSdk.awsSdkStrings.SampleCount
    - typingsSlinky.awsSdk.awsSdkStrings.Sum_
    - java.lang.String
  */
  type MetricStatistic = typingsSlinky.awsSdk.autoscalingplansMod._MetricStatistic | java.lang.String
  
  type MetricUnit = java.lang.String
  
  type NextToken = java.lang.String
  
  type PolicyName = java.lang.String
  
  type PolicyType = typingsSlinky.awsSdk.awsSdkStrings.TargetTrackingScaling | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SetForecastCapacityToMaxCapacity
    - typingsSlinky.awsSdk.awsSdkStrings.SetMaxCapacityToForecastCapacity
    - typingsSlinky.awsSdk.awsSdkStrings.SetMaxCapacityAboveForecastCapacity
    - java.lang.String
  */
  type PredictiveScalingMaxCapacityBehavior = typingsSlinky.awsSdk.autoscalingplansMod._PredictiveScalingMaxCapacityBehavior | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ForecastAndScale
    - typingsSlinky.awsSdk.awsSdkStrings.ForecastOnly
    - java.lang.String
  */
  type PredictiveScalingMode = typingsSlinky.awsSdk.autoscalingplansMod._PredictiveScalingMode | java.lang.String
  
  type ResourceCapacity = scala.Double
  
  type ResourceIdMaxLen1600 = java.lang.String
  
  type ResourceLabel = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.autoscalingColonautoScalingGroupColonDesiredCapacity
    - typingsSlinky.awsSdk.awsSdkStrings.ecsColonserviceColonDesiredCount
    - typingsSlinky.awsSdk.awsSdkStrings.`ec2Colonspot-fleet-requestColonTargetCapacity`
    - typingsSlinky.awsSdk.awsSdkStrings.rdsColonclusterColonReadReplicaCount
    - typingsSlinky.awsSdk.awsSdkStrings.dynamodbColontableColonReadCapacityUnits
    - typingsSlinky.awsSdk.awsSdkStrings.dynamodbColontableColonWriteCapacityUnits
    - typingsSlinky.awsSdk.awsSdkStrings.dynamodbColonindexColonReadCapacityUnits
    - typingsSlinky.awsSdk.awsSdkStrings.dynamodbColonindexColonWriteCapacityUnits
    - java.lang.String
  */
  type ScalableDimension = typingsSlinky.awsSdk.autoscalingplansMod._ScalableDimension | java.lang.String
  
  type ScalingInstructions = js.Array[typingsSlinky.awsSdk.autoscalingplansMod.ScalingInstruction]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ASGAverageCPUUtilization
    - typingsSlinky.awsSdk.awsSdkStrings.ASGAverageNetworkIn
    - typingsSlinky.awsSdk.awsSdkStrings.ASGAverageNetworkOut
    - typingsSlinky.awsSdk.awsSdkStrings.DynamoDBReadCapacityUtilization
    - typingsSlinky.awsSdk.awsSdkStrings.DynamoDBWriteCapacityUtilization
    - typingsSlinky.awsSdk.awsSdkStrings.ECSServiceAverageCPUUtilization
    - typingsSlinky.awsSdk.awsSdkStrings.ECSServiceAverageMemoryUtilization
    - typingsSlinky.awsSdk.awsSdkStrings.ALBRequestCountPerTarget
    - typingsSlinky.awsSdk.awsSdkStrings.RDSReaderAverageCPUUtilization
    - typingsSlinky.awsSdk.awsSdkStrings.RDSReaderAverageDatabaseConnections
    - typingsSlinky.awsSdk.awsSdkStrings.EC2SpotFleetRequestAverageCPUUtilization
    - typingsSlinky.awsSdk.awsSdkStrings.EC2SpotFleetRequestAverageNetworkIn
    - typingsSlinky.awsSdk.awsSdkStrings.EC2SpotFleetRequestAverageNetworkOut
    - java.lang.String
  */
  type ScalingMetricType = typingsSlinky.awsSdk.autoscalingplansMod._ScalingMetricType | java.lang.String
  
  type ScalingPlanName = java.lang.String
  
  type ScalingPlanNames = js.Array[typingsSlinky.awsSdk.autoscalingplansMod.ScalingPlanName]
  
  type ScalingPlanResources = js.Array[typingsSlinky.awsSdk.autoscalingplansMod.ScalingPlanResource]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Active_
    - typingsSlinky.awsSdk.awsSdkStrings.ActiveWithProblems
    - typingsSlinky.awsSdk.awsSdkStrings.CreationInProgress
    - typingsSlinky.awsSdk.awsSdkStrings.CreationFailed
    - typingsSlinky.awsSdk.awsSdkStrings.DeletionInProgress
    - typingsSlinky.awsSdk.awsSdkStrings.DeletionFailed
    - typingsSlinky.awsSdk.awsSdkStrings.UpdateInProgress
    - typingsSlinky.awsSdk.awsSdkStrings.UpdateFailed
    - java.lang.String
  */
  type ScalingPlanStatusCode = typingsSlinky.awsSdk.autoscalingplansMod._ScalingPlanStatusCode | java.lang.String
  
  type ScalingPlanVersion = scala.Double
  
  type ScalingPlans = js.Array[typingsSlinky.awsSdk.autoscalingplansMod.ScalingPlan]
  
  type ScalingPolicies = js.Array[typingsSlinky.awsSdk.autoscalingplansMod.ScalingPolicy]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.KeepExternalPolicies
    - typingsSlinky.awsSdk.awsSdkStrings.ReplaceExternalPolicies
    - java.lang.String
  */
  type ScalingPolicyUpdateBehavior = typingsSlinky.awsSdk.autoscalingplansMod._ScalingPolicyUpdateBehavior | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Inactive_
    - typingsSlinky.awsSdk.awsSdkStrings.PartiallyActive
    - typingsSlinky.awsSdk.awsSdkStrings.Active_
    - java.lang.String
  */
  type ScalingStatusCode = typingsSlinky.awsSdk.autoscalingplansMod._ScalingStatusCode | java.lang.String
  
  type ScheduledActionBufferTime = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.autoscaling_
    - typingsSlinky.awsSdk.awsSdkStrings.ecs_
    - typingsSlinky.awsSdk.awsSdkStrings.ec2_
    - typingsSlinky.awsSdk.awsSdkStrings.rds_
    - typingsSlinky.awsSdk.awsSdkStrings.dynamodb
    - java.lang.String
  */
  type ServiceNamespace = typingsSlinky.awsSdk.autoscalingplansMod._ServiceNamespace | java.lang.String
  
  type TagFilters = js.Array[typingsSlinky.awsSdk.autoscalingplansMod.TagFilter]
  
  type TagValues = js.Array[typingsSlinky.awsSdk.autoscalingplansMod.XmlStringMaxLen256]
  
  type TargetTrackingConfigurations = js.Array[typingsSlinky.awsSdk.autoscalingplansMod.TargetTrackingConfiguration]
  
  type TimestampType = js.Date
  
  type XmlString = java.lang.String
  
  type XmlStringMaxLen128 = java.lang.String
  
  type XmlStringMaxLen256 = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-01-06`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.autoscalingplansMod._apiVersion | java.lang.String
}
