package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object personalizeMod {
  type AccountId = java.lang.String
  type Arn = java.lang.String
  type ArnList = js.Array[typingsSlinky.awsSdk.personalizeMod.Arn]
  type AvroSchema = java.lang.String
  type BatchInferenceJobs = js.Array[typingsSlinky.awsSdk.personalizeMod.BatchInferenceJobSummary]
  type Boolean = scala.Boolean
  type Campaigns = js.Array[typingsSlinky.awsSdk.personalizeMod.CampaignSummary]
  type CategoricalHyperParameterRanges = js.Array[typingsSlinky.awsSdk.personalizeMod.CategoricalHyperParameterRange]
  type CategoricalValue = java.lang.String
  type CategoricalValues = js.Array[typingsSlinky.awsSdk.personalizeMod.CategoricalValue]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.personalizeMod.ClientApiVersions
  type ContinuousHyperParameterRanges = js.Array[typingsSlinky.awsSdk.personalizeMod.ContinuousHyperParameterRange]
  type ContinuousMaxValue = scala.Double
  type ContinuousMinValue = scala.Double
  type DatasetGroups = js.Array[typingsSlinky.awsSdk.personalizeMod.DatasetGroupSummary]
  type DatasetImportJobs = js.Array[typingsSlinky.awsSdk.personalizeMod.DatasetImportJobSummary]
  type DatasetType = java.lang.String
  type Datasets = js.Array[typingsSlinky.awsSdk.personalizeMod.DatasetSummary]
  type Date = js.Date
  type DefaultCategoricalHyperParameterRanges = js.Array[typingsSlinky.awsSdk.personalizeMod.DefaultCategoricalHyperParameterRange]
  type DefaultContinuousHyperParameterRanges = js.Array[typingsSlinky.awsSdk.personalizeMod.DefaultContinuousHyperParameterRange]
  type DefaultIntegerHyperParameterRanges = js.Array[typingsSlinky.awsSdk.personalizeMod.DefaultIntegerHyperParameterRange]
  type Description = java.lang.String
  type DockerURI = java.lang.String
  type EventTrackers = js.Array[typingsSlinky.awsSdk.personalizeMod.EventTrackerSummary]
  type EventType = java.lang.String
  type EventValueThreshold = java.lang.String
  type FailureReason = java.lang.String
  type FeatureTransformationParameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.personalizeMod.ParameterValue]
  type FeaturizationParameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.personalizeMod.ParameterValue]
  type HPOObjectiveType = java.lang.String
  type HPOResource = java.lang.String
  type HyperParameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.personalizeMod.ParameterValue]
  type IntegerHyperParameterRanges = js.Array[typingsSlinky.awsSdk.personalizeMod.IntegerHyperParameterRange]
  type IntegerMaxValue = scala.Double
  type IntegerMinValue = scala.Double
  type KmsKeyArn = java.lang.String
  type MaxResults = scala.Double
  type MetricName = java.lang.String
  type MetricRegex = java.lang.String
  type MetricValue = scala.Double
  type Metrics = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.personalizeMod.MetricValue]
  type Name = java.lang.String
  type NextToken = java.lang.String
  type NumBatchResults = scala.Double
  type ParameterName = java.lang.String
  type ParameterValue = java.lang.String
  type PerformAutoML = scala.Boolean
  type PerformHPO = scala.Boolean
  type RecipeType = java.lang.String
  type Recipes = js.Array[typingsSlinky.awsSdk.personalizeMod.RecipeSummary]
  type ResourceConfig = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.personalizeMod.ParameterValue]
  type RoleArn = java.lang.String
  type S3Location = java.lang.String
  type Schemas = js.Array[typingsSlinky.awsSdk.personalizeMod.DatasetSchemaSummary]
  type SolutionVersions = js.Array[typingsSlinky.awsSdk.personalizeMod.SolutionVersionSummary]
  type Solutions = js.Array[typingsSlinky.awsSdk.personalizeMod.SolutionSummary]
  type Status = java.lang.String
  type TrackingId = java.lang.String
  type TrainingHours = scala.Double
  type TrainingInputMode = java.lang.String
  type TransactionsPerSecond = scala.Double
  type Tunable = scala.Boolean
}
