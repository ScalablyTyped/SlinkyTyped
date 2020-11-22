package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object applicationautoscalingMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ChangeInCapacity
    - typingsSlinky.awsSdk.awsSdkStrings.PercentChangeInCapacity
    - typingsSlinky.awsSdk.awsSdkStrings.ExactCapacity
    - java.lang.String
  */
  type AdjustmentType = typingsSlinky.awsSdk.applicationautoscalingMod._AdjustmentType | java.lang.String
  
  type Alarms = js.Array[typingsSlinky.awsSdk.applicationautoscalingMod.Alarm]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.applicationautoscalingMod.ClientApiVersions
  
  type Cooldown = scala.Double
  
  type DisableScaleIn = scala.Boolean
  
  type MaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Average_
    - typingsSlinky.awsSdk.awsSdkStrings.Minimum_
    - typingsSlinky.awsSdk.awsSdkStrings.Maximum_
    - java.lang.String
  */
  type MetricAggregationType = typingsSlinky.awsSdk.applicationautoscalingMod._MetricAggregationType | java.lang.String
  
  type MetricDimensionName = java.lang.String
  
  type MetricDimensionValue = java.lang.String
  
  type MetricDimensions = js.Array[typingsSlinky.awsSdk.applicationautoscalingMod.MetricDimension]
  
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
  type MetricStatistic = typingsSlinky.awsSdk.applicationautoscalingMod._MetricStatistic | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DynamoDBReadCapacityUtilization
    - typingsSlinky.awsSdk.awsSdkStrings.DynamoDBWriteCapacityUtilization
    - typingsSlinky.awsSdk.awsSdkStrings.ALBRequestCountPerTarget
    - typingsSlinky.awsSdk.awsSdkStrings.RDSReaderAverageCPUUtilization
    - typingsSlinky.awsSdk.awsSdkStrings.RDSReaderAverageDatabaseConnections
    - typingsSlinky.awsSdk.awsSdkStrings.EC2SpotFleetRequestAverageCPUUtilization
    - typingsSlinky.awsSdk.awsSdkStrings.EC2SpotFleetRequestAverageNetworkIn
    - typingsSlinky.awsSdk.awsSdkStrings.EC2SpotFleetRequestAverageNetworkOut
    - typingsSlinky.awsSdk.awsSdkStrings.SageMakerVariantInvocationsPerInstance
    - typingsSlinky.awsSdk.awsSdkStrings.ECSServiceAverageCPUUtilization
    - typingsSlinky.awsSdk.awsSdkStrings.ECSServiceAverageMemoryUtilization
    - typingsSlinky.awsSdk.awsSdkStrings.AppStreamAverageCapacityUtilization
    - typingsSlinky.awsSdk.awsSdkStrings.ComprehendInferenceUtilization
    - typingsSlinky.awsSdk.awsSdkStrings.LambdaProvisionedConcurrencyUtilization
    - typingsSlinky.awsSdk.awsSdkStrings.CassandraReadCapacityUtilization
    - typingsSlinky.awsSdk.awsSdkStrings.CassandraWriteCapacityUtilization
    - typingsSlinky.awsSdk.awsSdkStrings.KafkaBrokerStorageUtilization
    - java.lang.String
  */
  type MetricType = typingsSlinky.awsSdk.applicationautoscalingMod._MetricType | java.lang.String
  
  type MetricUnit = java.lang.String
  
  type MinAdjustmentMagnitude = scala.Double
  
  type PolicyName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.StepScaling
    - typingsSlinky.awsSdk.awsSdkStrings.TargetTrackingScaling
    - java.lang.String
  */
  type PolicyType = typingsSlinky.awsSdk.applicationautoscalingMod._PolicyType | java.lang.String
  
  type ResourceCapacity = scala.Double
  
  type ResourceId = java.lang.String
  
  type ResourceIdMaxLen1600 = java.lang.String
  
  type ResourceIdsMaxLen1600 = js.Array[typingsSlinky.awsSdk.applicationautoscalingMod.ResourceIdMaxLen1600]
  
  type ResourceLabel = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ecsColonserviceColonDesiredCount
    - typingsSlinky.awsSdk.awsSdkStrings.`ec2Colonspot-fleet-requestColonTargetCapacity`
    - typingsSlinky.awsSdk.awsSdkStrings.elasticmapreduceColoninstancegroupColonInstanceCount
    - typingsSlinky.awsSdk.awsSdkStrings.appstreamColonfleetColonDesiredCapacity
    - typingsSlinky.awsSdk.awsSdkStrings.dynamodbColontableColonReadCapacityUnits
    - typingsSlinky.awsSdk.awsSdkStrings.dynamodbColontableColonWriteCapacityUnits
    - typingsSlinky.awsSdk.awsSdkStrings.dynamodbColonindexColonReadCapacityUnits
    - typingsSlinky.awsSdk.awsSdkStrings.dynamodbColonindexColonWriteCapacityUnits
    - typingsSlinky.awsSdk.awsSdkStrings.rdsColonclusterColonReadReplicaCount
    - typingsSlinky.awsSdk.awsSdkStrings.sagemakerColonvariantColonDesiredInstanceCount
    - typingsSlinky.awsSdk.awsSdkStrings.`custom-resourceColonResourceTypeColonProperty`
    - typingsSlinky.awsSdk.awsSdkStrings.`comprehendColondocument-classifier-endpointColonDesiredInferenceUnits`
    - typingsSlinky.awsSdk.awsSdkStrings.`comprehendColonentity-recognizer-endpointColonDesiredInferenceUnits`
    - typingsSlinky.awsSdk.awsSdkStrings.lambdaColonfunctionColonProvisionedConcurrency
    - typingsSlinky.awsSdk.awsSdkStrings.cassandraColontableColonReadCapacityUnits
    - typingsSlinky.awsSdk.awsSdkStrings.cassandraColontableColonWriteCapacityUnits
    - typingsSlinky.awsSdk.awsSdkStrings.`kafkaColonbroker-storageColonVolumeSize`
    - java.lang.String
  */
  type ScalableDimension = typingsSlinky.awsSdk.applicationautoscalingMod._ScalableDimension | java.lang.String
  
  type ScalableTargets = js.Array[typingsSlinky.awsSdk.applicationautoscalingMod.ScalableTarget]
  
  type ScalingActivities = js.Array[typingsSlinky.awsSdk.applicationautoscalingMod.ScalingActivity]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Successful_
    - typingsSlinky.awsSdk.awsSdkStrings.Overridden_
    - typingsSlinky.awsSdk.awsSdkStrings.Unfulfilled
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type ScalingActivityStatusCode = typingsSlinky.awsSdk.applicationautoscalingMod._ScalingActivityStatusCode | java.lang.String
  
  type ScalingAdjustment = scala.Double
  
  type ScalingPolicies = js.Array[typingsSlinky.awsSdk.applicationautoscalingMod.ScalingPolicy]
  
  type ScalingSuspended = scala.Boolean
  
  type ScheduledActionName = java.lang.String
  
  type ScheduledActions = js.Array[typingsSlinky.awsSdk.applicationautoscalingMod.ScheduledAction]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ecs_
    - typingsSlinky.awsSdk.awsSdkStrings.elasticmapreduce
    - typingsSlinky.awsSdk.awsSdkStrings.ec2_
    - typingsSlinky.awsSdk.awsSdkStrings.appstream
    - typingsSlinky.awsSdk.awsSdkStrings.dynamodb
    - typingsSlinky.awsSdk.awsSdkStrings.rds_
    - typingsSlinky.awsSdk.awsSdkStrings.sagemaker_
    - typingsSlinky.awsSdk.awsSdkStrings.`custom-resource`
    - typingsSlinky.awsSdk.awsSdkStrings.comprehend
    - typingsSlinky.awsSdk.awsSdkStrings.lambda__
    - typingsSlinky.awsSdk.awsSdkStrings.cassandra
    - typingsSlinky.awsSdk.awsSdkStrings.kafka_
    - java.lang.String
  */
  type ServiceNamespace = typingsSlinky.awsSdk.applicationautoscalingMod._ServiceNamespace | java.lang.String
  
  type StepAdjustments = js.Array[typingsSlinky.awsSdk.applicationautoscalingMod.StepAdjustment]
  
  type TimestampType = js.Date
  
  type XmlString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-02-06`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.applicationautoscalingMod._apiVersion | java.lang.String
}
