package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object forecastserviceMod {
  
  type Arn = java.lang.String
  
  type ArnList = js.Array[typingsSlinky.awsSdk.forecastserviceMod.Arn]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.string__
    - typingsSlinky.awsSdk.awsSdkStrings.integer__
    - typingsSlinky.awsSdk.awsSdkStrings.float_
    - typingsSlinky.awsSdk.awsSdkStrings.timestamp_
    - java.lang.String
  */
  type AttributeType = typingsSlinky.awsSdk.forecastserviceMod._AttributeType | java.lang.String
  
  type Boolean = scala.Boolean
  
  type CategoricalParameterRanges = js.Array[typingsSlinky.awsSdk.forecastserviceMod.CategoricalParameterRange]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.forecastserviceMod.ClientApiVersions
  
  type ContinuousParameterRanges = js.Array[typingsSlinky.awsSdk.forecastserviceMod.ContinuousParameterRange]
  
  type DatasetGroups = js.Array[typingsSlinky.awsSdk.forecastserviceMod.DatasetGroupSummary]
  
  type DatasetImportJobs = js.Array[typingsSlinky.awsSdk.forecastserviceMod.DatasetImportJobSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TARGET_TIME_SERIES
    - typingsSlinky.awsSdk.awsSdkStrings.RELATED_TIME_SERIES
    - typingsSlinky.awsSdk.awsSdkStrings.ITEM_METADATA
    - java.lang.String
  */
  type DatasetType = typingsSlinky.awsSdk.forecastserviceMod._DatasetType | java.lang.String
  
  type Datasets = js.Array[typingsSlinky.awsSdk.forecastserviceMod.DatasetSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RETAIL
    - typingsSlinky.awsSdk.awsSdkStrings.CUSTOM
    - typingsSlinky.awsSdk.awsSdkStrings.INVENTORY_PLANNING
    - typingsSlinky.awsSdk.awsSdkStrings.EC2_CAPACITY
    - typingsSlinky.awsSdk.awsSdkStrings.WORK_FORCE
    - typingsSlinky.awsSdk.awsSdkStrings.WEB_TRAFFIC
    - typingsSlinky.awsSdk.awsSdkStrings.METRICS
    - java.lang.String
  */
  type Domain = typingsSlinky.awsSdk.forecastserviceMod._Domain | java.lang.String
  
  type Double = scala.Double
  
  type ErrorMessage = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUMMARY
    - typingsSlinky.awsSdk.awsSdkStrings.COMPUTED
    - java.lang.String
  */
  type EvaluationType = typingsSlinky.awsSdk.forecastserviceMod._EvaluationType | java.lang.String
  
  type FeaturizationMethodName = typingsSlinky.awsSdk.awsSdkStrings.filling | java.lang.String
  
  type FeaturizationMethodParameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.forecastserviceMod.ParameterValue]
  
  type FeaturizationPipeline = js.Array[typingsSlinky.awsSdk.forecastserviceMod.FeaturizationMethod]
  
  type Featurizations = js.Array[typingsSlinky.awsSdk.forecastserviceMod.Featurization]
  
  type FieldStatistics = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.forecastserviceMod.Statistics]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IS
    - typingsSlinky.awsSdk.awsSdkStrings.IS_NOT
    - java.lang.String
  */
  type FilterConditionString = typingsSlinky.awsSdk.forecastserviceMod._FilterConditionString | java.lang.String
  
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
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Auto_
    - typingsSlinky.awsSdk.awsSdkStrings.Linear_
    - typingsSlinky.awsSdk.awsSdkStrings.Logarithmic
    - typingsSlinky.awsSdk.awsSdkStrings.ReverseLogarithmic
    - java.lang.String
  */
  type ScalingType = typingsSlinky.awsSdk.forecastserviceMod._ScalingType | java.lang.String
  
  type SchemaAttributes = js.Array[typingsSlinky.awsSdk.forecastserviceMod.SchemaAttribute]
  
  type Status = java.lang.String
  
  type String = java.lang.String
  
  type SupplementaryFeatures = js.Array[typingsSlinky.awsSdk.forecastserviceMod.SupplementaryFeature]
  
  type TagKey = java.lang.String
  
  type TagKeys = js.Array[typingsSlinky.awsSdk.forecastserviceMod.TagKey]
  
  type TagValue = java.lang.String
  
  type Tags = js.Array[typingsSlinky.awsSdk.forecastserviceMod.Tag]
  
  type TestWindowDetails = js.Array[typingsSlinky.awsSdk.forecastserviceMod.TestWindowSummary]
  
  type TestWindows = js.Array[typingsSlinky.awsSdk.forecastserviceMod.WindowSummary]
  
  type Timestamp = js.Date
  
  type TimestampFormat = java.lang.String
  
  type TrainingParameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.forecastserviceMod.ParameterValue]
  
  type Value = java.lang.String
  
  type Values = js.Array[typingsSlinky.awsSdk.forecastserviceMod.Value]
  
  type WeightedQuantileLosses = js.Array[typingsSlinky.awsSdk.forecastserviceMod.WeightedQuantileLoss]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-06-26`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.forecastserviceMod._apiVersion | java.lang.String
}
