package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object frauddetectorMod {
  type BatchCreateVariableErrorList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.BatchCreateVariableError]
  type BatchGetVariableErrorList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.BatchGetVariableError]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.frauddetectorMod.ClientApiVersions
  type CsvIndexToVariableMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type DetectorList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.Detector]
  type DetectorVersionMaxResults = scala.Double
  type DetectorVersionSummaryList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.DetectorVersionSummary]
  type DetectorsMaxResults = scala.Double
  type EventAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.frauddetectorMod.attributeValue]
  type ExternalModelEndpointDataBlobMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.frauddetectorMod.ModelEndpointDataBlob]
  type ExternalModelList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.ExternalModel]
  type ExternalModelsMaxResults = scala.Double
  type IsOpaque = scala.Boolean
  type JsonKeyToVariableMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type LabelMapper = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.frauddetectorMod.ListOfStrings]
  type ListOfModelScores = js.Array[typingsSlinky.awsSdk.frauddetectorMod.ModelScores]
  type ListOfModelVersions = js.Array[typingsSlinky.awsSdk.frauddetectorMod.ModelVersion]
  type ListOfStrings = js.Array[java.lang.String]
  type MaxResults = scala.Double
  type MetricsMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type ModelList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.Model]
  type ModelPredictionMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.frauddetectorMod.float]
  type ModelVariableIndex = scala.Double
  type ModelVariablesList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.ModelVariable]
  type ModelVersionDetailList = js.Array[typingsSlinky.awsSdk.frauddetectorMod.ModelVersionDetail]
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
  type attributeKey = java.lang.String
  type attributeValue = java.lang.String
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
