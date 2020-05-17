package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object applicationautoscalingMod {
  type Alarms = js.Array[typingsSlinky.awsSdk.applicationautoscalingMod.Alarm]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.applicationautoscalingMod.ClientApiVersions
  type Cooldown = scala.Double
  type DisableScaleIn = scala.Boolean
  type MaxResults = scala.Double
  type MetricDimensionName = java.lang.String
  type MetricDimensionValue = java.lang.String
  type MetricDimensions = js.Array[typingsSlinky.awsSdk.applicationautoscalingMod.MetricDimension]
  type MetricName = java.lang.String
  type MetricNamespace = java.lang.String
  type MetricScale = scala.Double
  type MetricUnit = java.lang.String
  type MinAdjustmentMagnitude = scala.Double
  type PolicyName = java.lang.String
  type ResourceCapacity = scala.Double
  type ResourceId = java.lang.String
  type ResourceIdMaxLen1600 = java.lang.String
  type ResourceIdsMaxLen1600 = js.Array[typingsSlinky.awsSdk.applicationautoscalingMod.ResourceIdMaxLen1600]
  type ResourceLabel = java.lang.String
  type ScalableTargets = js.Array[typingsSlinky.awsSdk.applicationautoscalingMod.ScalableTarget]
  type ScalingActivities = js.Array[typingsSlinky.awsSdk.applicationautoscalingMod.ScalingActivity]
  type ScalingAdjustment = scala.Double
  type ScalingPolicies = js.Array[typingsSlinky.awsSdk.applicationautoscalingMod.ScalingPolicy]
  type ScalingSuspended = scala.Boolean
  type ScheduledActionName = java.lang.String
  type ScheduledActions = js.Array[typingsSlinky.awsSdk.applicationautoscalingMod.ScheduledAction]
  type StepAdjustments = js.Array[typingsSlinky.awsSdk.applicationautoscalingMod.StepAdjustment]
  type TimestampType = js.Date
  type XmlString = java.lang.String
}
