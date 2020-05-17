package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object machinelearningMod {
  type AwsUserArn = java.lang.String
  type BatchPredictions = js.Array[typingsSlinky.awsSdk.machinelearningMod.BatchPrediction]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.machinelearningMod.ClientApiVersions
  type ComparatorValue = java.lang.String
  type ComputeStatistics = scala.Boolean
  type DataRearrangement = java.lang.String
  type DataSchema = java.lang.String
  type DataSources = js.Array[typingsSlinky.awsSdk.machinelearningMod.DataSource]
  type DetailsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.machinelearningMod.DetailsValue]
  type DetailsValue = java.lang.String
  type EDPPipelineId = java.lang.String
  type EDPResourceRole = java.lang.String
  type EDPSecurityGroupId = java.lang.String
  type EDPSecurityGroupIds = js.Array[typingsSlinky.awsSdk.machinelearningMod.EDPSecurityGroupId]
  type EDPServiceRole = java.lang.String
  type EDPSubnetId = java.lang.String
  type EntityId = java.lang.String
  type EntityName = java.lang.String
  type EpochTime = js.Date
  type Evaluations = js.Array[typingsSlinky.awsSdk.machinelearningMod.Evaluation]
  type IntegerType = scala.Double
  type Label = java.lang.String
  type LongType = scala.Double
  type MLModelName = java.lang.String
  type MLModels = js.Array[typingsSlinky.awsSdk.machinelearningMod.MLModel]
  type Message = java.lang.String
  type PageLimit = scala.Double
  type PerformanceMetricsProperties = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.machinelearningMod.PerformanceMetricsPropertyValue]
  type PerformanceMetricsPropertyKey = java.lang.String
  type PerformanceMetricsPropertyValue = java.lang.String
  type PresignedS3Url = java.lang.String
  type RDSDatabaseName = java.lang.String
  type RDSDatabasePassword = java.lang.String
  type RDSDatabaseUsername = java.lang.String
  type RDSInstanceIdentifier = java.lang.String
  type RDSSelectSqlQuery = java.lang.String
  type Recipe = java.lang.String
  type Record = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.machinelearningMod.VariableValue]
  type RedshiftClusterIdentifier = java.lang.String
  type RedshiftDatabaseName = java.lang.String
  type RedshiftDatabasePassword = java.lang.String
  type RedshiftDatabaseUsername = java.lang.String
  type RedshiftSelectSqlQuery = java.lang.String
  type RoleARN = java.lang.String
  type S3Url = java.lang.String
  type ScoreThreshold = scala.Double
  type ScoreValue = scala.Double
  type ScoreValuePerLabelMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.machinelearningMod.ScoreValue]
  type StringType = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.machinelearningMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.machinelearningMod.Tag]
  type TagValue = java.lang.String
  type TrainingParameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.machinelearningMod.StringType]
  type VariableName = java.lang.String
  type VariableValue = java.lang.String
  type Verbose = scala.Boolean
  type VipURL = java.lang.String
  type floatLabel = scala.Double
}
