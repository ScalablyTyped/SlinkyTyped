package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  type EventAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.frauddetectorMod.attributeValue]
  type ExternalModelEndpointDataBlobMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.frauddetectorMod.ModelEndpointDataBlob]
  type ExternalModelList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.ExternalModel]
  type ExternalModelsMaxResults = scala.Double
  type IsOpaque = scala.Boolean
  type JsonKeyToVariableMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type LabelMapper = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.frauddetectorMod.ListOfStrings]
  type Language = typingsSlinky.awsSdk.awsSdkStrings.DETECTORPL | java.lang.String
  type ListOfModelScores = js.Array[typingsSlinky.awsSdk.frauddetectorMod.ModelScores]
  type ListOfModelVersions = js.Array[typingsSlinky.awsSdk.frauddetectorMod.ModelVersion]
  type ListOfStrings = js.Array[java.lang.String]
  type MaxResults = scala.Double
  type MetricsMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
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
  type ModelList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.Model]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TEXT_CSV
    - typingsSlinky.awsSdk.awsSdkStrings.APPLICATION_JSONLINES
    - java.lang.String
  */
  type ModelOutputDataFormat = typingsSlinky.awsSdk.frauddetectorMod._ModelOutputDataFormat | java.lang.String
  type ModelPredictionMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.frauddetectorMod.float]
  type ModelSource = typingsSlinky.awsSdk.awsSdkStrings.SAGEMAKER | java.lang.String
  type ModelTypeEnum = typingsSlinky.awsSdk.awsSdkStrings.ONLINE_FRAUD_INSIGHTS | java.lang.String
  type ModelVariableIndex = scala.Double
  type ModelVariablesList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.ModelVariable]
  type ModelVersionDetailList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.ModelVersionDetail]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TRAINING_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.TRAINING_COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVATE_REQUESTED
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type ModelVersionStatus = typingsSlinky.awsSdk.frauddetectorMod._ModelVersionStatus | java.lang.String
  type NameList = js.Array[java.lang.String]
  type NonEmptyListOfStrings = js.Array[java.lang.String]
  type OutcomeList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.Outcome]
  type OutcomesMaxResults = scala.Double
  type RuleDetailList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.RuleDetail]
  type RuleList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.Rule]
  type RulesMaxResults = scala.Double
  type VariableEntryList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.VariableEntry]
  type VariableList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.Variable]
  type VariablesMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-11-15`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.frauddetectorMod._apiVersion | java.lang.String
  type attributeKey = java.lang.String
  type attributeValue = java.lang.String
  type blob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.frauddetectorMod.Blob_ | java.lang.String
  type contentType = java.lang.String
  type description = java.lang.String
  type float = scala.Double
  type iamRoleArn = java.lang.String
  type identifier = java.lang.String
  type integer = scala.Double
  type nonEmptyString = java.lang.String
  type ruleExpression = java.lang.String
  type s3BucketLocation = java.lang.String
  type time = java.lang.String
}
