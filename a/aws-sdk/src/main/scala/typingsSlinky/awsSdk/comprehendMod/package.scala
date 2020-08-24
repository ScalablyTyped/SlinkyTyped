package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object comprehendMod {
  type AnyLengthString = java.lang.String
  type BatchItemErrorList = js.Array[typingsSlinky.awsSdk.comprehendMod.BatchItemError]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.comprehendMod.ClientApiVersions
  type ClientRequestTokenString = java.lang.String
  type ComprehendArn = java.lang.String
  type ComprehendArnName = java.lang.String
  type ComprehendEndpointArn = java.lang.String
  type ComprehendEndpointName = java.lang.String
  type ComprehendModelArn = java.lang.String
  type CustomerInputString = java.lang.String
  type CustomerInputStringList = js.Array[typingsSlinky.awsSdk.comprehendMod.CustomerInputString]
  type DocumentClassificationJobPropertiesList = js.Array[typingsSlinky.awsSdk.comprehendMod.DocumentClassificationJobProperties]
  type DocumentClassifierArn = java.lang.String
  type DocumentClassifierEndpointArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MULTI_CLASS
    - typingsSlinky.awsSdk.awsSdkStrings.MULTI_LABEL
    - java.lang.String
  */
  type DocumentClassifierMode = typingsSlinky.awsSdk.comprehendMod._DocumentClassifierMode | java.lang.String
  type DocumentClassifierPropertiesList = js.Array[typingsSlinky.awsSdk.comprehendMod.DocumentClassifierProperties]
  type DominantLanguageDetectionJobPropertiesList = js.Array[typingsSlinky.awsSdk.comprehendMod.DominantLanguageDetectionJobProperties]
  type Double = scala.Double
  type EndpointPropertiesList = js.Array[typingsSlinky.awsSdk.comprehendMod.EndpointProperties]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.IN_SERVICE
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type EndpointStatus = typingsSlinky.awsSdk.comprehendMod._EndpointStatus | java.lang.String
  type EntitiesDetectionJobPropertiesList = js.Array[typingsSlinky.awsSdk.comprehendMod.EntitiesDetectionJobProperties]
  type EntityRecognizerArn = java.lang.String
  type EntityRecognizerEndpointArn = java.lang.String
  type EntityRecognizerMetadataEntityTypesList = js.Array[typingsSlinky.awsSdk.comprehendMod.EntityRecognizerMetadataEntityTypesListItem]
  type EntityRecognizerPropertiesList = js.Array[typingsSlinky.awsSdk.comprehendMod.EntityRecognizerProperties]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PERSON
    - typingsSlinky.awsSdk.awsSdkStrings.LOCATION
    - typingsSlinky.awsSdk.awsSdkStrings.ORGANIZATION
    - typingsSlinky.awsSdk.awsSdkStrings.COMMERCIAL_ITEM
    - typingsSlinky.awsSdk.awsSdkStrings.EVENT
    - typingsSlinky.awsSdk.awsSdkStrings.DATE
    - typingsSlinky.awsSdk.awsSdkStrings.QUANTITY
    - typingsSlinky.awsSdk.awsSdkStrings.TITLE
    - typingsSlinky.awsSdk.awsSdkStrings.OTHER
    - java.lang.String
  */
  type EntityType = typingsSlinky.awsSdk.comprehendMod._EntityType | java.lang.String
  type EntityTypeName = java.lang.String
  type EntityTypesList = js.Array[typingsSlinky.awsSdk.comprehendMod.EntityTypesListItem]
  type Float = scala.Double
  type IamRoleArn = java.lang.String
  type InferenceUnitsInteger = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ONE_DOC_PER_FILE
    - typingsSlinky.awsSdk.awsSdkStrings.ONE_DOC_PER_LINE
    - java.lang.String
  */
  type InputFormat = typingsSlinky.awsSdk.comprehendMod._InputFormat | java.lang.String
  type Integer = scala.Double
  type JobId = java.lang.String
  type JobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUBMITTED
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.STOP_REQUESTED
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type JobStatus = typingsSlinky.awsSdk.comprehendMod._JobStatus | java.lang.String
  type KeyPhrasesDetectionJobPropertiesList = js.Array[typingsSlinky.awsSdk.comprehendMod.KeyPhrasesDetectionJobProperties]
  type KmsKeyId = java.lang.String
  type LabelDelimiter = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.en_
    - typingsSlinky.awsSdk.awsSdkStrings.es_
    - typingsSlinky.awsSdk.awsSdkStrings.fr_
    - typingsSlinky.awsSdk.awsSdkStrings.de_
    - typingsSlinky.awsSdk.awsSdkStrings.it_
    - typingsSlinky.awsSdk.awsSdkStrings.pt_
    - typingsSlinky.awsSdk.awsSdkStrings.ar_
    - typingsSlinky.awsSdk.awsSdkStrings.hi
    - typingsSlinky.awsSdk.awsSdkStrings.ja_
    - typingsSlinky.awsSdk.awsSdkStrings.ko
    - typingsSlinky.awsSdk.awsSdkStrings.zh
    - typingsSlinky.awsSdk.awsSdkStrings.`zh-TW`
    - java.lang.String
  */
  type LanguageCode = typingsSlinky.awsSdk.comprehendMod._LanguageCode | java.lang.String
  type ListOfClasses = js.Array[typingsSlinky.awsSdk.comprehendMod.DocumentClass]
  type ListOfDetectDominantLanguageResult = js.Array[typingsSlinky.awsSdk.comprehendMod.BatchDetectDominantLanguageItemResult]
  type ListOfDetectEntitiesResult = js.Array[typingsSlinky.awsSdk.comprehendMod.BatchDetectEntitiesItemResult]
  type ListOfDetectKeyPhrasesResult = js.Array[typingsSlinky.awsSdk.comprehendMod.BatchDetectKeyPhrasesItemResult]
  type ListOfDetectSentimentResult = js.Array[typingsSlinky.awsSdk.comprehendMod.BatchDetectSentimentItemResult]
  type ListOfDetectSyntaxResult = js.Array[typingsSlinky.awsSdk.comprehendMod.BatchDetectSyntaxItemResult]
  type ListOfDominantLanguages = js.Array[typingsSlinky.awsSdk.comprehendMod.DominantLanguage]
  type ListOfEntities = js.Array[typingsSlinky.awsSdk.comprehendMod.Entity]
  type ListOfKeyPhrases = js.Array[typingsSlinky.awsSdk.comprehendMod.KeyPhrase]
  type ListOfLabels = js.Array[typingsSlinky.awsSdk.comprehendMod.DocumentLabel]
  type ListOfSyntaxTokens = js.Array[typingsSlinky.awsSdk.comprehendMod.SyntaxToken]
  type MaxResultsInteger = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUBMITTED
    - typingsSlinky.awsSdk.awsSdkStrings.TRAINING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.STOP_REQUESTED
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
    - typingsSlinky.awsSdk.awsSdkStrings.IN_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.TRAINED
    - java.lang.String
  */
  type ModelStatus = typingsSlinky.awsSdk.comprehendMod._ModelStatus | java.lang.String
  type NumberOfTopicsInteger = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ADJ
    - typingsSlinky.awsSdk.awsSdkStrings.ADP
    - typingsSlinky.awsSdk.awsSdkStrings.ADV
    - typingsSlinky.awsSdk.awsSdkStrings.AUX
    - typingsSlinky.awsSdk.awsSdkStrings.CONJ
    - typingsSlinky.awsSdk.awsSdkStrings.CCONJ
    - typingsSlinky.awsSdk.awsSdkStrings.DET
    - typingsSlinky.awsSdk.awsSdkStrings.INTJ
    - typingsSlinky.awsSdk.awsSdkStrings.NOUN
    - typingsSlinky.awsSdk.awsSdkStrings.NUM
    - typingsSlinky.awsSdk.awsSdkStrings.O
    - typingsSlinky.awsSdk.awsSdkStrings.PART
    - typingsSlinky.awsSdk.awsSdkStrings.PRON
    - typingsSlinky.awsSdk.awsSdkStrings.PROPN
    - typingsSlinky.awsSdk.awsSdkStrings.PUNCT
    - typingsSlinky.awsSdk.awsSdkStrings.SCONJ
    - typingsSlinky.awsSdk.awsSdkStrings.SYM
    - typingsSlinky.awsSdk.awsSdkStrings.VERB
    - java.lang.String
  */
  type PartOfSpeechTagType = typingsSlinky.awsSdk.comprehendMod._PartOfSpeechTagType | java.lang.String
  type S3Uri = java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[typingsSlinky.awsSdk.comprehendMod.SecurityGroupId]
  type SentimentDetectionJobPropertiesList = js.Array[typingsSlinky.awsSdk.comprehendMod.SentimentDetectionJobProperties]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.POSITIVE
    - typingsSlinky.awsSdk.awsSdkStrings.NEGATIVE
    - typingsSlinky.awsSdk.awsSdkStrings.NEUTRAL
    - typingsSlinky.awsSdk.awsSdkStrings.MIXED
    - java.lang.String
  */
  type SentimentType = typingsSlinky.awsSdk.comprehendMod._SentimentType | java.lang.String
  type String = java.lang.String
  type SubnetId = java.lang.String
  type Subnets = js.Array[typingsSlinky.awsSdk.comprehendMod.SubnetId]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.en_
    - typingsSlinky.awsSdk.awsSdkStrings.es_
    - typingsSlinky.awsSdk.awsSdkStrings.fr_
    - typingsSlinky.awsSdk.awsSdkStrings.de_
    - typingsSlinky.awsSdk.awsSdkStrings.it_
    - typingsSlinky.awsSdk.awsSdkStrings.pt_
    - java.lang.String
  */
  type SyntaxLanguageCode = typingsSlinky.awsSdk.comprehendMod._SyntaxLanguageCode | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.comprehendMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.comprehendMod.Tag]
  type TagValue = java.lang.String
  type Timestamp = js.Date
  type TopicsDetectionJobPropertiesList = js.Array[typingsSlinky.awsSdk.comprehendMod.TopicsDetectionJobProperties]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-11-27`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.comprehendMod._apiVersion | java.lang.String
}
