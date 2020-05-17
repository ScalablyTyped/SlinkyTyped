package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object forecastserviceMod {
  type Arn = java.lang.String
  type ArnList = js.Array[typingsSlinky.awsSdk.forecastserviceMod.Arn]
  type Boolean = scala.Boolean
  type CategoricalParameterRanges = js.Array[typingsSlinky.awsSdk.forecastserviceMod.CategoricalParameterRange]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.forecastserviceMod.ClientApiVersions
  type ContinuousParameterRanges = js.Array[typingsSlinky.awsSdk.forecastserviceMod.ContinuousParameterRange]
  type DatasetGroups = js.Array[typingsSlinky.awsSdk.forecastserviceMod.DatasetGroupSummary]
  type DatasetImportJobs = js.Array[typingsSlinky.awsSdk.forecastserviceMod.DatasetImportJobSummary]
  type Datasets = js.Array[typingsSlinky.awsSdk.forecastserviceMod.DatasetSummary]
  type Double = scala.Double
  type ErrorMessage = java.lang.String
  type FeaturizationMethodParameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.forecastserviceMod.ParameterValue]
  type FeaturizationPipeline = js.Array[typingsSlinky.awsSdk.forecastserviceMod.FeaturizationMethod]
  type Featurizations = js.Array[typingsSlinky.awsSdk.forecastserviceMod.Featurization]
  type FieldStatistics = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.forecastserviceMod.Statistics]
  type Filters = js.Array[typingsSlinky.awsSdk.forecastserviceMod.Filter]
  type ForecastDimensions = js.Array[typingsSlinky.awsSdk.forecastserviceMod.Name]
  type ForecastExportJobs = js.Array[typingsSlinky.awsSdk.forecastserviceMod.ForecastExportJobSummary]
  type ForecastType = java.lang.String
  type ForecastTypes = js.Array[typingsSlinky.awsSdk.forecastserviceMod.ForecastType]
  type Forecasts = js.Array[typingsSlinky.awsSdk.forecastserviceMod.ForecastSummary]
  type Frequency = java.lang.String
  type Integer = scala.Double
  type IntegerParameterRanges = js.Array[typingsSlinky.awsSdk.forecastserviceMod.IntegerParameterRange]
  type KMSKeyArn = java.lang.String
  type MaxResults = scala.Double
  type Message = java.lang.String
  type Name = java.lang.String
  type NextToken = java.lang.String
  type ParameterKey = java.lang.String
  type ParameterValue = java.lang.String
  type PredictorEvaluationResults = js.Array[typingsSlinky.awsSdk.forecastserviceMod.EvaluationResult]
  type PredictorExecutions = js.Array[typingsSlinky.awsSdk.forecastserviceMod.PredictorExecution]
  type Predictors = js.Array[typingsSlinky.awsSdk.forecastserviceMod.PredictorSummary]
  type S3Path = java.lang.String
  type SchemaAttributes = js.Array[typingsSlinky.awsSdk.forecastserviceMod.SchemaAttribute]
  type Status = java.lang.String
  type String = java.lang.String
  type SupplementaryFeatures = js.Array[typingsSlinky.awsSdk.forecastserviceMod.SupplementaryFeature]
  type TestWindowDetails = js.Array[typingsSlinky.awsSdk.forecastserviceMod.TestWindowSummary]
  type TestWindows = js.Array[typingsSlinky.awsSdk.forecastserviceMod.WindowSummary]
  type Timestamp = js.Date
  type TimestampFormat = java.lang.String
  type TrainingParameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.forecastserviceMod.ParameterValue]
  type Value = java.lang.String
  type Values = js.Array[typingsSlinky.awsSdk.forecastserviceMod.Value]
  type WeightedQuantileLosses = js.Array[typingsSlinky.awsSdk.forecastserviceMod.WeightedQuantileLoss]
}
