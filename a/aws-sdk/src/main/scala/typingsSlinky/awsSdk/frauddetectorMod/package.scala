package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object frauddetectorMod {
  
  type BatchCreateVariableErrorList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.BatchCreateVariableError]
  
  type BatchGetVariableErrorList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.BatchGetVariableError]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.frauddetectorMod.ClientApiVersions
  
  type CsvIndexToVariableMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EVENT
    - typingsSlinky.awsSdk.awsSdkStrings.MODEL_SCORE
    - typingsSlinky.awsSdk.awsSdkStrings.EXTERNAL_MODEL_SCORE
    - java.lang.String
  */
  type DataSource = typingsSlinky.awsSdk.frauddetectorMod._DataSource | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STRING
    - typingsSlinky.awsSdk.awsSdkStrings.INTEGER
    - typingsSlinky.awsSdk.awsSdkStrings.FLOAT
    - typingsSlinky.awsSdk.awsSdkStrings.BOOLEAN
    - java.lang.String
  */
  type DataType = typingsSlinky.awsSdk.frauddetectorMod._DataType | java.lang.String
  
  type DetectorList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.Detector]
  
  type DetectorVersionMaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DRAFT
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type DetectorVersionStatus = typingsSlinky.awsSdk.frauddetectorMod._DetectorVersionStatus | java.lang.String
  
  type DetectorVersionSummaryList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.DetectorVersionSummary]
  
  type DetectorsMaxResults = scala.Double
  
  type EventVariableMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.frauddetectorMod.variableValue]
  
  type ExternalModelEndpointDataBlobMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.frauddetectorMod.ModelEndpointDataBlob]
  
  type ExternalModelList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.ExternalModel]
  
  type ExternalModelsMaxResults = scala.Double
  
  type JsonKeyToVariableMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type KmsEncryptionKeyArn = java.lang.String
  
  type Language = typingsSlinky.awsSdk.awsSdkStrings.DETECTORPL | java.lang.String
  
  type ListOfModelScores = js.Array[typingsSlinky.awsSdk.frauddetectorMod.ModelScores]
  
  type ListOfModelVersions = js.Array[typingsSlinky.awsSdk.frauddetectorMod.ModelVersion]
  
  type ListOfRuleResults = js.Array[typingsSlinky.awsSdk.frauddetectorMod.RuleResult]
  
  type ListOfStrings = js.Array[java.lang.String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ASSOCIATED
    - typingsSlinky.awsSdk.awsSdkStrings.DISSOCIATED
    - java.lang.String
  */
  type ModelEndpointStatus = typingsSlinky.awsSdk.frauddetectorMod._ModelEndpointStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TEXT_CSV
    - typingsSlinky.awsSdk.awsSdkStrings.APPLICATION_JSON
    - java.lang.String
  */
  type ModelInputDataFormat = typingsSlinky.awsSdk.frauddetectorMod._ModelInputDataFormat | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TEXT_CSV
    - typingsSlinky.awsSdk.awsSdkStrings.APPLICATION_JSONLINES
    - java.lang.String
  */
  type ModelOutputDataFormat = typingsSlinky.awsSdk.frauddetectorMod._ModelOutputDataFormat | java.lang.String
  
  type ModelPredictionMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.frauddetectorMod.float]
  
  type ModelSource = typingsSlinky.awsSdk.awsSdkStrings.SAGEMAKER | java.lang.String
  
  type ModelTypeEnum = typingsSlinky.awsSdk.awsSdkStrings.ONLINE_FRAUD_INSIGHTS | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type ModelVersionStatus = typingsSlinky.awsSdk.frauddetectorMod._ModelVersionStatus | java.lang.String
  
  type NameList = js.Array[java.lang.String]
  
  type NonEmptyListOfStrings = js.Array[java.lang.String]
  
  type OutcomeList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.Outcome]
  
  type OutcomesMaxResults = scala.Double
  
  type RuleDetailList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.RuleDetail]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALL_MATCHED
    - typingsSlinky.awsSdk.awsSdkStrings.FIRST_MATCHED
    - java.lang.String
  */
  type RuleExecutionMode = typingsSlinky.awsSdk.frauddetectorMod._RuleExecutionMode | java.lang.String
  
  type RuleList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.Rule]
  
  type RulesMaxResults = scala.Double
  
  type TagsMaxResults = scala.Double
  
  type TrainingDataSourceEnum = typingsSlinky.awsSdk.awsSdkStrings.EXTERNAL_EVENTS | java.lang.String
  
  type UseEventVariables = scala.Boolean
  
  type VariableEntryList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.VariableEntry]
  
  type VariableList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.Variable]
  
  type VariablesMaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-11-15`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.frauddetectorMod._apiVersion | java.lang.String
  
  type blob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.frauddetectorMod.Blob_ | java.lang.String
  
  type contentType = java.lang.String
  
  type description = java.lang.String
  
  type entityTypeList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.EntityType]
  
  type entityTypesMaxResults = scala.Double
  
  type eventTypeList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.EventType]
  
  type eventTypesMaxResults = scala.Double
  
  type fieldValidationMessageList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.FieldValidationMessage]
  
  type fileValidationMessageList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.FileValidationMessage]
  
  type float = scala.Double
  
  type floatVersionString = java.lang.String
  
  type fraudDetectorArn = java.lang.String
  
  type iamRoleArn = java.lang.String
  
  type identifier = java.lang.String
  
  type integer = scala.Double
  
  type labelList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.Label]
  
  type labelMapper = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.frauddetectorMod.ListOfStrings]
  
  type labelsMaxResults = scala.Double
  
  type listOfEntities = js.Array[typingsSlinky.awsSdk.frauddetectorMod.Entity]
  
  type metricDataPointsList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.MetricDataPoint]
  
  type modelIdentifier = java.lang.String
  
  type modelList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.Model]
  
  type modelVersionDetailList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.ModelVersionDetail]
  
  type modelsMaxPageSize = scala.Double
  
  type nonEmptyString = java.lang.String
  
  type ruleExpression = java.lang.String
  
  type s3BucketLocation = java.lang.String
  
  type sageMakerEndpointIdentifier = java.lang.String
  
  type tagKey = java.lang.String
  
  type tagKeyList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.tagKey]
  
  type tagList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.Tag]
  
  type tagValue = java.lang.String
  
  type time = java.lang.String
  
  type variableName = java.lang.String
  
  type variableValue = java.lang.String
  
  type wholeNumberVersionString = java.lang.String
}
