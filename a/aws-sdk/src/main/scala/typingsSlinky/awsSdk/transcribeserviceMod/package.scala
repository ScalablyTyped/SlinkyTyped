package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transcribeserviceMod {
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.transcribeserviceMod.ClientApiVersions
  type DataAccessRoleArn = java.lang.String
  type DateTime = js.Date
  type FailureReason = java.lang.String
  type KMSKeyId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`en-US`
    - typingsSlinky.awsSdk.awsSdkStrings.`es-US`
    - typingsSlinky.awsSdk.awsSdkStrings.`en-AU`
    - typingsSlinky.awsSdk.awsSdkStrings.`fr-CA`
    - typingsSlinky.awsSdk.awsSdkStrings.`en-GB`
    - typingsSlinky.awsSdk.awsSdkStrings.`de-DE`
    - typingsSlinky.awsSdk.awsSdkStrings.`pt-BR`
    - typingsSlinky.awsSdk.awsSdkStrings.`fr-FR`
    - typingsSlinky.awsSdk.awsSdkStrings.`it-IT`
    - typingsSlinky.awsSdk.awsSdkStrings.`ko-KR`
    - typingsSlinky.awsSdk.awsSdkStrings.`es-ES`
    - typingsSlinky.awsSdk.awsSdkStrings.`en-IN`
    - typingsSlinky.awsSdk.awsSdkStrings.`hi-IN`
    - typingsSlinky.awsSdk.awsSdkStrings.`ar-SA`
    - typingsSlinky.awsSdk.awsSdkStrings.`ru-RU`
    - typingsSlinky.awsSdk.awsSdkStrings.`zh-CN`
    - typingsSlinky.awsSdk.awsSdkStrings.`nl-NL`
    - typingsSlinky.awsSdk.awsSdkStrings.`id-ID`
    - typingsSlinky.awsSdk.awsSdkStrings.`ta-IN`
    - typingsSlinky.awsSdk.awsSdkStrings.`fa-IR`
    - typingsSlinky.awsSdk.awsSdkStrings.`en-IE`
    - typingsSlinky.awsSdk.awsSdkStrings.`en-AB`
    - typingsSlinky.awsSdk.awsSdkStrings.`en-WL`
    - typingsSlinky.awsSdk.awsSdkStrings.`pt-PT`
    - typingsSlinky.awsSdk.awsSdkStrings.`te-IN`
    - typingsSlinky.awsSdk.awsSdkStrings.`tr-TR`
    - typingsSlinky.awsSdk.awsSdkStrings.`de-CH`
    - typingsSlinky.awsSdk.awsSdkStrings.`he-IL`
    - typingsSlinky.awsSdk.awsSdkStrings.`ms-MY`
    - typingsSlinky.awsSdk.awsSdkStrings.`ja-JP`
    - typingsSlinky.awsSdk.awsSdkStrings.`ar-AE`
    - java.lang.String
  */
  type LanguageCode = typingsSlinky.awsSdk.transcribeserviceMod._LanguageCode | java.lang.String
  type MaxAlternatives = scala.Double
  type MaxResults = scala.Double
  type MaxSpeakers = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.mp3_
    - typingsSlinky.awsSdk.awsSdkStrings.mp4_
    - typingsSlinky.awsSdk.awsSdkStrings.wav_
    - typingsSlinky.awsSdk.awsSdkStrings.flac
    - java.lang.String
  */
  type MediaFormat = typingsSlinky.awsSdk.transcribeserviceMod._MediaFormat | java.lang.String
  type MediaSampleRateHertz = scala.Double
  type NextToken = java.lang.String
  type OutputBucketName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CUSTOMER_BUCKET
    - typingsSlinky.awsSdk.awsSdkStrings.SERVICE_BUCKET
    - java.lang.String
  */
  type OutputLocationType = typingsSlinky.awsSdk.transcribeserviceMod._OutputLocationType | java.lang.String
  type Phrase = java.lang.String
  type Phrases = js.Array[typingsSlinky.awsSdk.transcribeserviceMod.Phrase]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.redacted
    - typingsSlinky.awsSdk.awsSdkStrings.redacted_and_unredacted
    - java.lang.String
  */
  type RedactionOutput = typingsSlinky.awsSdk.transcribeserviceMod._RedactionOutput | java.lang.String
  type RedactionType = typingsSlinky.awsSdk.awsSdkStrings.PII | java.lang.String
  type TranscriptionJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.QUEUED
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - java.lang.String
  */
  type TranscriptionJobStatus = typingsSlinky.awsSdk.transcribeserviceMod._TranscriptionJobStatus | java.lang.String
  type TranscriptionJobSummaries = js.Array[typingsSlinky.awsSdk.transcribeserviceMod.TranscriptionJobSummary]
  type Uri = java.lang.String
  type Vocabularies = js.Array[typingsSlinky.awsSdk.transcribeserviceMod.VocabularyInfo]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.remove__
    - typingsSlinky.awsSdk.awsSdkStrings.mask
    - java.lang.String
  */
  type VocabularyFilterMethod = typingsSlinky.awsSdk.transcribeserviceMod._VocabularyFilterMethod | java.lang.String
  type VocabularyFilterName = java.lang.String
  type VocabularyFilters = js.Array[typingsSlinky.awsSdk.transcribeserviceMod.VocabularyFilterInfo]
  type VocabularyName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.READY
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type VocabularyState = typingsSlinky.awsSdk.transcribeserviceMod._VocabularyState | java.lang.String
  type Word = java.lang.String
  type Words = js.Array[typingsSlinky.awsSdk.transcribeserviceMod.Word]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-10-26`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.transcribeserviceMod._apiVersion | java.lang.String
}
