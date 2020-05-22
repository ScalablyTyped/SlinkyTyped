package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object textractMod {
  type BlockList = js.Array[typingsSlinky.awsSdk.textractMod.Block]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.KEY_VALUE_SET
    - typingsSlinky.awsSdk.awsSdkStrings.PAGE
    - typingsSlinky.awsSdk.awsSdkStrings.LINE
    - typingsSlinky.awsSdk.awsSdkStrings.WORD
    - typingsSlinky.awsSdk.awsSdkStrings.TABLE
    - typingsSlinky.awsSdk.awsSdkStrings.CELL
    - typingsSlinky.awsSdk.awsSdkStrings.SELECTION_ELEMENT
    - java.lang.String
  */
  type BlockType = typingsSlinky.awsSdk.textractMod._BlockType | java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.textractMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FreeOfPersonallyIdentifiableInformation
    - typingsSlinky.awsSdk.awsSdkStrings.FreeOfAdultContent
    - java.lang.String
  */
  type ContentClassifier = typingsSlinky.awsSdk.textractMod._ContentClassifier | java.lang.String
  type ContentClassifiers = js.Array[typingsSlinky.awsSdk.textractMod.ContentClassifier]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.KEY
    - typingsSlinky.awsSdk.awsSdkStrings.VALUE
    - java.lang.String
  */
  type EntityType = typingsSlinky.awsSdk.textractMod._EntityType | java.lang.String
  type EntityTypes = js.Array[typingsSlinky.awsSdk.textractMod.EntityType]
  type ErrorCode = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TABLES
    - typingsSlinky.awsSdk.awsSdkStrings.FORMS
    - java.lang.String
  */
  type FeatureType = typingsSlinky.awsSdk.textractMod._FeatureType | java.lang.String
  type FeatureTypes = js.Array[typingsSlinky.awsSdk.textractMod.FeatureType]
  type Float = scala.Double
  type FlowDefinitionArn = java.lang.String
  type HumanLoopActivationConditionsEvaluationResults = java.lang.String
  type HumanLoopActivationReason = java.lang.String
  type HumanLoopActivationReasons = js.Array[typingsSlinky.awsSdk.textractMod.HumanLoopActivationReason]
  type HumanLoopArn = java.lang.String
  type HumanLoopName = java.lang.String
  type IdList = js.Array[typingsSlinky.awsSdk.textractMod.NonEmptyString]
  type ImageBlob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.textractMod.Blob | java.lang.String
  type JobId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.PARTIAL_SUCCESS
    - java.lang.String
  */
  type JobStatus = typingsSlinky.awsSdk.textractMod._JobStatus | java.lang.String
  type JobTag = java.lang.String
  type MaxResults = scala.Double
  type NonEmptyString = java.lang.String
  type Pages = js.Array[typingsSlinky.awsSdk.textractMod.UInteger]
  type PaginationToken = java.lang.String
  type Percent = scala.Double
  type Polygon = js.Array[typingsSlinky.awsSdk.textractMod.Point]
  type RelationshipList = js.Array[typingsSlinky.awsSdk.textractMod.Relationship]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.VALUE
    - typingsSlinky.awsSdk.awsSdkStrings.CHILD
    - java.lang.String
  */
  type RelationshipType = typingsSlinky.awsSdk.textractMod._RelationshipType | java.lang.String
  type RoleArn = java.lang.String
  type S3Bucket = java.lang.String
  type S3ObjectName = java.lang.String
  type S3ObjectVersion = java.lang.String
  type SNSTopicArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SELECTED
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_SELECTED
    - java.lang.String
  */
  type SelectionStatus = typingsSlinky.awsSdk.textractMod._SelectionStatus | java.lang.String
  type StatusMessage = java.lang.String
  type String = java.lang.String
  type UInteger = scala.Double
  type Warnings = js.Array[typingsSlinky.awsSdk.textractMod.Warning]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-06-27`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.textractMod._apiVersion | java.lang.String
}
