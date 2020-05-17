package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object autoscalingplansMod {
  type ApplicationSources = js.Array[typingsSlinky.awsSdk.autoscalingplansMod.ApplicationSource]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.autoscalingplansMod.ClientApiVersions
  type Cooldown = scala.Double
  type Datapoints = js.Array[typingsSlinky.awsSdk.autoscalingplansMod.Datapoint]
  type DisableDynamicScaling = scala.Boolean
  type DisableScaleIn = scala.Boolean
  type MaxResults = scala.Double
  type MetricDimensionName = java.lang.String
  type MetricDimensionValue = java.lang.String
  type MetricDimensions = js.Array[typingsSlinky.awsSdk.autoscalingplansMod.MetricDimension]
  type MetricName = java.lang.String
  type MetricNamespace = java.lang.String
  type MetricScale = scala.Double
  type MetricUnit = java.lang.String
  type NextToken = java.lang.String
  type PolicyName = java.lang.String
  type ResourceCapacity = scala.Double
  type ResourceIdMaxLen1600 = java.lang.String
  type ResourceLabel = java.lang.String
  type ScalingInstructions = js.Array[typingsSlinky.awsSdk.autoscalingplansMod.ScalingInstruction]
  type ScalingPlanName = java.lang.String
  type ScalingPlanNames = js.Array[typingsSlinky.awsSdk.autoscalingplansMod.ScalingPlanName]
  type ScalingPlanResources = js.Array[typingsSlinky.awsSdk.autoscalingplansMod.ScalingPlanResource]
  type ScalingPlanVersion = scala.Double
  type ScalingPlans = js.Array[typingsSlinky.awsSdk.autoscalingplansMod.ScalingPlan]
  type ScalingPolicies = js.Array[typingsSlinky.awsSdk.autoscalingplansMod.ScalingPolicy]
  type ScheduledActionBufferTime = scala.Double
  type TagFilters = js.Array[typingsSlinky.awsSdk.autoscalingplansMod.TagFilter]
  type TagValues = js.Array[typingsSlinky.awsSdk.autoscalingplansMod.XmlStringMaxLen256]
  type TargetTrackingConfigurations = js.Array[typingsSlinky.awsSdk.autoscalingplansMod.TargetTrackingConfiguration]
  type TimestampType = js.Date
  type XmlString = java.lang.String
  type XmlStringMaxLen128 = java.lang.String
  type XmlStringMaxLen256 = java.lang.String
}
