package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object comprehendmedicalMod {
  type AnyLengthString = java.lang.String
  type AttributeList = js.Array[typingsSlinky.awsSdk.comprehendmedicalMod.Attribute]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SIGN
    - typingsSlinky.awsSdk.awsSdkStrings.SYMPTOM
    - typingsSlinky.awsSdk.awsSdkStrings.DIAGNOSIS
    - typingsSlinky.awsSdk.awsSdkStrings.NEGATION
    - java.lang.String
  */
  type AttributeName = typingsSlinky.awsSdk.comprehendmedicalMod._AttributeName | java.lang.String
  type BoundedLengthString = java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.comprehendmedicalMod.ClientApiVersions
  type ClientRequestTokenString = java.lang.String
  type ComprehendMedicalAsyncJobPropertiesList = js.Array[typingsSlinky.awsSdk.comprehendmedicalMod.ComprehendMedicalAsyncJobProperties]
  type EntityList = js.Array[typingsSlinky.awsSdk.comprehendmedicalMod.Entity]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NAME
    - typingsSlinky.awsSdk.awsSdkStrings.DOSAGE
    - typingsSlinky.awsSdk.awsSdkStrings.ROUTE_OR_MODE
    - typingsSlinky.awsSdk.awsSdkStrings.FORM
    - typingsSlinky.awsSdk.awsSdkStrings.FREQUENCY
    - typingsSlinky.awsSdk.awsSdkStrings.DURATION
    - typingsSlinky.awsSdk.awsSdkStrings.GENERIC_NAME
    - typingsSlinky.awsSdk.awsSdkStrings.BRAND_NAME
    - typingsSlinky.awsSdk.awsSdkStrings.STRENGTH
    - typingsSlinky.awsSdk.awsSdkStrings.RATE
    - typingsSlinky.awsSdk.awsSdkStrings.ACUITY
    - typingsSlinky.awsSdk.awsSdkStrings.TEST_NAME
    - typingsSlinky.awsSdk.awsSdkStrings.TEST_VALUE
    - typingsSlinky.awsSdk.awsSdkStrings.TEST_UNITS
    - typingsSlinky.awsSdk.awsSdkStrings.PROCEDURE_NAME
    - typingsSlinky.awsSdk.awsSdkStrings.TREATMENT_NAME
    - typingsSlinky.awsSdk.awsSdkStrings.DATE
    - typingsSlinky.awsSdk.awsSdkStrings.AGE
    - typingsSlinky.awsSdk.awsSdkStrings.CONTACT_POINT
    - typingsSlinky.awsSdk.awsSdkStrings.EMAIL
    - typingsSlinky.awsSdk.awsSdkStrings.IDENTIFIER
    - typingsSlinky.awsSdk.awsSdkStrings.URL
    - typingsSlinky.awsSdk.awsSdkStrings.ADDRESS
    - typingsSlinky.awsSdk.awsSdkStrings.PROFESSION
    - typingsSlinky.awsSdk.awsSdkStrings.SYSTEM_ORGAN_SITE
    - typingsSlinky.awsSdk.awsSdkStrings.DIRECTION
    - typingsSlinky.awsSdk.awsSdkStrings.QUALITY
    - typingsSlinky.awsSdk.awsSdkStrings.QUANTITY
    - typingsSlinky.awsSdk.awsSdkStrings.TIME_EXPRESSION
    - typingsSlinky.awsSdk.awsSdkStrings.TIME_TO_MEDICATION_NAME
    - typingsSlinky.awsSdk.awsSdkStrings.TIME_TO_DX_NAME
    - typingsSlinky.awsSdk.awsSdkStrings.TIME_TO_TEST_NAME
    - typingsSlinky.awsSdk.awsSdkStrings.TIME_TO_PROCEDURE_NAME
    - typingsSlinky.awsSdk.awsSdkStrings.TIME_TO_TREATMENT_NAME
    - java.lang.String
  */
  type EntitySubType = typingsSlinky.awsSdk.comprehendmedicalMod._EntitySubType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MEDICATION
    - typingsSlinky.awsSdk.awsSdkStrings.MEDICAL_CONDITION
    - typingsSlinky.awsSdk.awsSdkStrings.PROTECTED_HEALTH_INFORMATION
    - typingsSlinky.awsSdk.awsSdkStrings.TEST_TREATMENT_PROCEDURE
    - typingsSlinky.awsSdk.awsSdkStrings.ANATOMY
    - typingsSlinky.awsSdk.awsSdkStrings.TIME_EXPRESSION
    - java.lang.String
  */
  type EntityType = typingsSlinky.awsSdk.comprehendmedicalMod._EntityType | java.lang.String
  type Float = scala.Double
  type ICD10CMAttributeList = js.Array[typingsSlinky.awsSdk.comprehendmedicalMod.ICD10CMAttribute]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACUITY
    - typingsSlinky.awsSdk.awsSdkStrings.DIRECTION
    - typingsSlinky.awsSdk.awsSdkStrings.SYSTEM_ORGAN_SITE
    - typingsSlinky.awsSdk.awsSdkStrings.QUALITY
    - typingsSlinky.awsSdk.awsSdkStrings.QUANTITY
    - java.lang.String
  */
  type ICD10CMAttributeType = typingsSlinky.awsSdk.comprehendmedicalMod._ICD10CMAttributeType | java.lang.String
  type ICD10CMConceptList = js.Array[typingsSlinky.awsSdk.comprehendmedicalMod.ICD10CMConcept]
  type ICD10CMEntityCategory = typingsSlinky.awsSdk.awsSdkStrings.MEDICAL_CONDITION | java.lang.String
  type ICD10CMEntityList = js.Array[typingsSlinky.awsSdk.comprehendmedicalMod.ICD10CMEntity]
  type ICD10CMEntityType = typingsSlinky.awsSdk.awsSdkStrings.DX_NAME | java.lang.String
  type ICD10CMTraitList = js.Array[typingsSlinky.awsSdk.comprehendmedicalMod.ICD10CMTrait]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NEGATION
    - typingsSlinky.awsSdk.awsSdkStrings.DIAGNOSIS
    - typingsSlinky.awsSdk.awsSdkStrings.SIGN
    - typingsSlinky.awsSdk.awsSdkStrings.SYMPTOM
    - java.lang.String
  */
  type ICD10CMTraitName = typingsSlinky.awsSdk.comprehendmedicalMod._ICD10CMTraitName | java.lang.String
  type IamRoleArn = java.lang.String
  type Integer = scala.Double
  type JobId = java.lang.String
  type JobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUBMITTED
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.PARTIAL_SUCCESS
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.STOP_REQUESTED
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type JobStatus = typingsSlinky.awsSdk.comprehendmedicalMod._JobStatus | java.lang.String
  type KMSKey = java.lang.String
  type LanguageCode = typingsSlinky.awsSdk.awsSdkStrings.en_ | java.lang.String
  type ManifestFilePath = java.lang.String
  type MaxResultsInteger = scala.Double
  type ModelVersion = java.lang.String
  type OntologyLinkingBoundedLengthString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EVERY
    - typingsSlinky.awsSdk.awsSdkStrings.WITH_DOSAGE
    - typingsSlinky.awsSdk.awsSdkStrings.ADMINISTERED_VIA
    - typingsSlinky.awsSdk.awsSdkStrings.FOR
    - typingsSlinky.awsSdk.awsSdkStrings.NEGATIVE
    - typingsSlinky.awsSdk.awsSdkStrings.OVERLAP
    - typingsSlinky.awsSdk.awsSdkStrings.DOSAGE
    - typingsSlinky.awsSdk.awsSdkStrings.ROUTE_OR_MODE
    - typingsSlinky.awsSdk.awsSdkStrings.FORM
    - typingsSlinky.awsSdk.awsSdkStrings.FREQUENCY
    - typingsSlinky.awsSdk.awsSdkStrings.DURATION
    - typingsSlinky.awsSdk.awsSdkStrings.STRENGTH
    - typingsSlinky.awsSdk.awsSdkStrings.RATE
    - typingsSlinky.awsSdk.awsSdkStrings.ACUITY
    - typingsSlinky.awsSdk.awsSdkStrings.TEST_VALUE
    - typingsSlinky.awsSdk.awsSdkStrings.TEST_UNITS
    - typingsSlinky.awsSdk.awsSdkStrings.DIRECTION
    - typingsSlinky.awsSdk.awsSdkStrings.SYSTEM_ORGAN_SITE
    - java.lang.String
  */
  type RelationshipType = typingsSlinky.awsSdk.comprehendmedicalMod._RelationshipType | java.lang.String
  type RxNormAttributeList = js.Array[typingsSlinky.awsSdk.comprehendmedicalMod.RxNormAttribute]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DOSAGE
    - typingsSlinky.awsSdk.awsSdkStrings.DURATION
    - typingsSlinky.awsSdk.awsSdkStrings.FORM
    - typingsSlinky.awsSdk.awsSdkStrings.FREQUENCY
    - typingsSlinky.awsSdk.awsSdkStrings.RATE
    - typingsSlinky.awsSdk.awsSdkStrings.ROUTE_OR_MODE
    - typingsSlinky.awsSdk.awsSdkStrings.STRENGTH
    - java.lang.String
  */
  type RxNormAttributeType = typingsSlinky.awsSdk.comprehendmedicalMod._RxNormAttributeType | java.lang.String
  type RxNormConceptList = js.Array[typingsSlinky.awsSdk.comprehendmedicalMod.RxNormConcept]
  type RxNormEntityCategory = typingsSlinky.awsSdk.awsSdkStrings.MEDICATION | java.lang.String
  type RxNormEntityList = js.Array[typingsSlinky.awsSdk.comprehendmedicalMod.RxNormEntity]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BRAND_NAME
    - typingsSlinky.awsSdk.awsSdkStrings.GENERIC_NAME
    - java.lang.String
  */
  type RxNormEntityType = typingsSlinky.awsSdk.comprehendmedicalMod._RxNormEntityType | java.lang.String
  type RxNormTraitList = js.Array[typingsSlinky.awsSdk.comprehendmedicalMod.RxNormTrait]
  type RxNormTraitName = typingsSlinky.awsSdk.awsSdkStrings.NEGATION | java.lang.String
  type S3Bucket = java.lang.String
  type S3Key = java.lang.String
  type String = java.lang.String
  type Timestamp = js.Date
  type TraitList = js.Array[typingsSlinky.awsSdk.comprehendmedicalMod.Trait]
  type UnmappedAttributeList = js.Array[typingsSlinky.awsSdk.comprehendmedicalMod.UnmappedAttribute]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-10-30`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.comprehendmedicalMod._apiVersion | java.lang.String
}
