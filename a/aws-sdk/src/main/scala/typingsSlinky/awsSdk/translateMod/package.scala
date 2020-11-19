package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object translateMod {
  
  type AppliedTerminologyList = js.Array[typingsSlinky.awsSdk.translateMod.AppliedTerminology]
  
  type BoundedLengthString = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.translateMod.ClientApiVersions
  
  type ClientTokenString = java.lang.String
  
  type ContentType = java.lang.String
  
  type Description = java.lang.String
  
  type EncryptionKeyID = java.lang.String
  
  type EncryptionKeyType = typingsSlinky.awsSdk.awsSdkStrings.KMS | java.lang.String
  
  type IamRoleArn = java.lang.String
  
  type Integer = scala.Double
  
  type JobId = java.lang.String
  
  type JobName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUBMITTED
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED_WITH_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.STOP_REQUESTED
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type JobStatus = typingsSlinky.awsSdk.translateMod._JobStatus | java.lang.String
  
  type LanguageCodeString = java.lang.String
  
  type LanguageCodeStringList = js.Array[typingsSlinky.awsSdk.translateMod.LanguageCodeString]
  
  type MaxResultsInteger = scala.Double
  
  type MergeStrategy = typingsSlinky.awsSdk.awsSdkStrings.OVERWRITE | java.lang.String
  
  type NextToken = java.lang.String
  
  type ResourceName = java.lang.String
  
  type ResourceNameList = js.Array[typingsSlinky.awsSdk.translateMod.ResourceName]
  
  type S3Uri = java.lang.String
  
  type String = java.lang.String
  
  type TargetLanguageCodeStringList = js.Array[typingsSlinky.awsSdk.translateMod.LanguageCodeString]
  
  type TermList = js.Array[typingsSlinky.awsSdk.translateMod.Term]
  
  type TerminologyArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CSV
    - typingsSlinky.awsSdk.awsSdkStrings.TMX
    - java.lang.String
  */
  type TerminologyDataFormat = typingsSlinky.awsSdk.translateMod._TerminologyDataFormat | java.lang.String
  
  type TerminologyFile = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.translateMod.Blob | java.lang.String
  
  type TerminologyPropertiesList = js.Array[typingsSlinky.awsSdk.translateMod.TerminologyProperties]
  
  type TextTranslationJobPropertiesList = js.Array[typingsSlinky.awsSdk.translateMod.TextTranslationJobProperties]
  
  type Timestamp = js.Date
  
  type UnboundedLengthString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-07-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.translateMod._apiVersion | java.lang.String
}
