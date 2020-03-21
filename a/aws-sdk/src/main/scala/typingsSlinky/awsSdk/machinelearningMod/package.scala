package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object machinelearningMod {
  type Algorithm = typingsSlinky.awsSdk.awsSdkStrings.sgd | java.lang.String
  type AwsUserArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CreatedAt
    - typingsSlinky.awsSdk.awsSdkStrings.LastUpdatedAt
    - typingsSlinky.awsSdk.awsSdkStrings.Status_
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.IAMUser
    - typingsSlinky.awsSdk.awsSdkStrings.MLModelId
    - typingsSlinky.awsSdk.awsSdkStrings.DataSourceId
    - typingsSlinky.awsSdk.awsSdkStrings.DataURI
    - java.lang.String
  */
  type BatchPredictionFilterVariable = typingsSlinky.awsSdk.machinelearningMod._BatchPredictionFilterVariable | java.lang.String
  type BatchPredictions = js.Array[typingsSlinky.awsSdk.machinelearningMod.BatchPrediction]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.machinelearningMod.ClientApiVersions
  type ComparatorValue = java.lang.String
  type ComputeStatistics = scala.Boolean
  type DataRearrangement = java.lang.String
  type DataSchema = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CreatedAt
    - typingsSlinky.awsSdk.awsSdkStrings.LastUpdatedAt
    - typingsSlinky.awsSdk.awsSdkStrings.Status_
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.DataLocationS3
    - typingsSlinky.awsSdk.awsSdkStrings.IAMUser
    - java.lang.String
  */
  type DataSourceFilterVariable = typingsSlinky.awsSdk.machinelearningMod._DataSourceFilterVariable | java.lang.String
  type DataSources = js.Array[typingsSlinky.awsSdk.machinelearningMod.DataSource]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PredictiveModelType
    - typingsSlinky.awsSdk.awsSdkStrings.Algorithm
    - java.lang.String
  */
  type DetailsAttributes = typingsSlinky.awsSdk.machinelearningMod._DetailsAttributes | java.lang.String
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
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.INPROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type EntityStatus = typingsSlinky.awsSdk.machinelearningMod._EntityStatus | java.lang.String
  type EpochTime = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CreatedAt
    - typingsSlinky.awsSdk.awsSdkStrings.LastUpdatedAt
    - typingsSlinky.awsSdk.awsSdkStrings.Status_
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.IAMUser
    - typingsSlinky.awsSdk.awsSdkStrings.MLModelId
    - typingsSlinky.awsSdk.awsSdkStrings.DataSourceId
    - typingsSlinky.awsSdk.awsSdkStrings.DataURI
    - java.lang.String
  */
  type EvaluationFilterVariable = typingsSlinky.awsSdk.machinelearningMod._EvaluationFilterVariable | java.lang.String
  type Evaluations = js.Array[typingsSlinky.awsSdk.machinelearningMod.Evaluation]
  type IntegerType = scala.Double
  type Label = java.lang.String
  type LongType = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CreatedAt
    - typingsSlinky.awsSdk.awsSdkStrings.LastUpdatedAt
    - typingsSlinky.awsSdk.awsSdkStrings.Status_
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.IAMUser
    - typingsSlinky.awsSdk.awsSdkStrings.TrainingDataSourceId
    - typingsSlinky.awsSdk.awsSdkStrings.RealtimeEndpointStatus
    - typingsSlinky.awsSdk.awsSdkStrings.MLModelType
    - typingsSlinky.awsSdk.awsSdkStrings.Algorithm
    - typingsSlinky.awsSdk.awsSdkStrings.TrainingDataURI
    - java.lang.String
  */
  type MLModelFilterVariable = typingsSlinky.awsSdk.machinelearningMod._MLModelFilterVariable | java.lang.String
  type MLModelName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.REGRESSION
    - typingsSlinky.awsSdk.awsSdkStrings.BINARY
    - typingsSlinky.awsSdk.awsSdkStrings.MULTICLASS
    - java.lang.String
  */
  type MLModelType = typingsSlinky.awsSdk.machinelearningMod._MLModelType | java.lang.String
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
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.READY
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type RealtimeEndpointStatus = typingsSlinky.awsSdk.machinelearningMod._RealtimeEndpointStatus | java.lang.String
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
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.asc_
    - typingsSlinky.awsSdk.awsSdkStrings.dsc
    - java.lang.String
  */
  type SortOrder = typingsSlinky.awsSdk.machinelearningMod._SortOrder | java.lang.String
  type StringType = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.machinelearningMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.machinelearningMod.Tag]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BatchPrediction
    - typingsSlinky.awsSdk.awsSdkStrings.DataSource
    - typingsSlinky.awsSdk.awsSdkStrings.Evaluation_
    - typingsSlinky.awsSdk.awsSdkStrings.MLModel
    - java.lang.String
  */
  type TaggableResourceType = typingsSlinky.awsSdk.machinelearningMod._TaggableResourceType | java.lang.String
  type TrainingParameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.machinelearningMod.StringType]
  type VariableName = java.lang.String
  type VariableValue = java.lang.String
  type Verbose = scala.Boolean
  type VipURL = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-12-12`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.machinelearningMod._apiVersion | java.lang.String
  type floatLabel = scala.Double
}
