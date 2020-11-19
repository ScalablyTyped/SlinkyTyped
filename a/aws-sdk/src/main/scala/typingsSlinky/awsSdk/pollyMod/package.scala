package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object pollyMod {
  
  type Alphabet = java.lang.String
  
  type AudioStream = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.pollyMod.Blob | java.lang.String | typingsSlinky.node.streamMod.Readable
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.pollyMod.ClientApiVersions
  
  type ContentType = java.lang.String
  
  type DateTime = js.Date
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.standard__
    - typingsSlinky.awsSdk.awsSdkStrings.neural
    - java.lang.String
  */
  type Engine = typingsSlinky.awsSdk.pollyMod._Engine | java.lang.String
  
  type EngineList = js.Array[typingsSlinky.awsSdk.pollyMod.Engine]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Female
    - typingsSlinky.awsSdk.awsSdkStrings.Male
    - java.lang.String
  */
  type Gender = typingsSlinky.awsSdk.pollyMod._Gender | java.lang.String
  
  type IncludeAdditionalLanguageCodes = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.arb
    - typingsSlinky.awsSdk.awsSdkStrings.`cmn-CN`
    - typingsSlinky.awsSdk.awsSdkStrings.`cy-GB`
    - typingsSlinky.awsSdk.awsSdkStrings.`da-DK`
    - typingsSlinky.awsSdk.awsSdkStrings.`de-DE`
    - typingsSlinky.awsSdk.awsSdkStrings.`en-AU`
    - typingsSlinky.awsSdk.awsSdkStrings.`en-GB`
    - typingsSlinky.awsSdk.awsSdkStrings.`en-GB-WLS`
    - typingsSlinky.awsSdk.awsSdkStrings.`en-IN`
    - typingsSlinky.awsSdk.awsSdkStrings.`en-US`
    - typingsSlinky.awsSdk.awsSdkStrings.`es-ES`
    - typingsSlinky.awsSdk.awsSdkStrings.`es-MX`
    - typingsSlinky.awsSdk.awsSdkStrings.`es-US`
    - typingsSlinky.awsSdk.awsSdkStrings.`fr-CA`
    - typingsSlinky.awsSdk.awsSdkStrings.`fr-FR`
    - typingsSlinky.awsSdk.awsSdkStrings.`is-IS`
    - typingsSlinky.awsSdk.awsSdkStrings.`it-IT`
    - typingsSlinky.awsSdk.awsSdkStrings.`ja-JP`
    - typingsSlinky.awsSdk.awsSdkStrings.`hi-IN`
    - typingsSlinky.awsSdk.awsSdkStrings.`ko-KR`
    - typingsSlinky.awsSdk.awsSdkStrings.`nb-NO`
    - typingsSlinky.awsSdk.awsSdkStrings.`nl-NL`
    - typingsSlinky.awsSdk.awsSdkStrings.`pl-PL`
    - typingsSlinky.awsSdk.awsSdkStrings.`pt-BR`
    - typingsSlinky.awsSdk.awsSdkStrings.`pt-PT`
    - typingsSlinky.awsSdk.awsSdkStrings.`ro-RO`
    - typingsSlinky.awsSdk.awsSdkStrings.`ru-RU`
    - typingsSlinky.awsSdk.awsSdkStrings.`sv-SE`
    - typingsSlinky.awsSdk.awsSdkStrings.`tr-TR`
    - java.lang.String
  */
  type LanguageCode = typingsSlinky.awsSdk.pollyMod._LanguageCode | java.lang.String
  
  type LanguageCodeList = js.Array[typingsSlinky.awsSdk.pollyMod.LanguageCode]
  
  type LanguageName = java.lang.String
  
  type LastModified = js.Date
  
  type LexemesCount = scala.Double
  
  type LexiconArn = java.lang.String
  
  type LexiconContent = java.lang.String
  
  type LexiconDescriptionList = js.Array[typingsSlinky.awsSdk.pollyMod.LexiconDescription]
  
  type LexiconName = java.lang.String
  
  type LexiconNameList = js.Array[typingsSlinky.awsSdk.pollyMod.LexiconName]
  
  type MaxResults = scala.Double
  
  type NextToken = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.json_
    - typingsSlinky.awsSdk.awsSdkStrings.mp3_
    - typingsSlinky.awsSdk.awsSdkStrings.ogg_vorbis
    - typingsSlinky.awsSdk.awsSdkStrings.pcm
    - java.lang.String
  */
  type OutputFormat = typingsSlinky.awsSdk.pollyMod._OutputFormat | java.lang.String
  
  type OutputS3BucketName = java.lang.String
  
  type OutputS3KeyPrefix = java.lang.String
  
  type OutputUri = java.lang.String
  
  type RequestCharacters = scala.Double
  
  type SampleRate = java.lang.String
  
  type Size = scala.Double
  
  type SnsTopicArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.sentence
    - typingsSlinky.awsSdk.awsSdkStrings.ssml_
    - typingsSlinky.awsSdk.awsSdkStrings.viseme
    - typingsSlinky.awsSdk.awsSdkStrings.word_
    - java.lang.String
  */
  type SpeechMarkType = typingsSlinky.awsSdk.pollyMod._SpeechMarkType | java.lang.String
  
  type SpeechMarkTypeList = js.Array[typingsSlinky.awsSdk.pollyMod.SpeechMarkType]
  
  type SynthesisTasks = js.Array[typingsSlinky.awsSdk.pollyMod.SynthesisTask]
  
  type TaskId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.scheduled__
    - typingsSlinky.awsSdk.awsSdkStrings.inProgress__
    - typingsSlinky.awsSdk.awsSdkStrings.completed__
    - typingsSlinky.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type TaskStatus = typingsSlinky.awsSdk.pollyMod._TaskStatus | java.lang.String
  
  type TaskStatusReason = java.lang.String
  
  type Text = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ssml_
    - typingsSlinky.awsSdk.awsSdkStrings.text_
    - java.lang.String
  */
  type TextType = typingsSlinky.awsSdk.pollyMod._TextType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Aditi
    - typingsSlinky.awsSdk.awsSdkStrings.Amy
    - typingsSlinky.awsSdk.awsSdkStrings.Astrid
    - typingsSlinky.awsSdk.awsSdkStrings.Bianca
    - typingsSlinky.awsSdk.awsSdkStrings.Brian
    - typingsSlinky.awsSdk.awsSdkStrings.Camila
    - typingsSlinky.awsSdk.awsSdkStrings.Carla
    - typingsSlinky.awsSdk.awsSdkStrings.Carmen
    - typingsSlinky.awsSdk.awsSdkStrings.Celine
    - typingsSlinky.awsSdk.awsSdkStrings.Chantal
    - typingsSlinky.awsSdk.awsSdkStrings.Conchita
    - typingsSlinky.awsSdk.awsSdkStrings.Cristiano
    - typingsSlinky.awsSdk.awsSdkStrings.Dora
    - typingsSlinky.awsSdk.awsSdkStrings.Emma
    - typingsSlinky.awsSdk.awsSdkStrings.Enrique
    - typingsSlinky.awsSdk.awsSdkStrings.Ewa
    - typingsSlinky.awsSdk.awsSdkStrings.Filiz
    - typingsSlinky.awsSdk.awsSdkStrings.Geraint
    - typingsSlinky.awsSdk.awsSdkStrings.Giorgio
    - typingsSlinky.awsSdk.awsSdkStrings.Gwyneth
    - typingsSlinky.awsSdk.awsSdkStrings.Hans_
    - typingsSlinky.awsSdk.awsSdkStrings.Ines
    - typingsSlinky.awsSdk.awsSdkStrings.Ivy
    - typingsSlinky.awsSdk.awsSdkStrings.Jacek
    - typingsSlinky.awsSdk.awsSdkStrings.Jan
    - typingsSlinky.awsSdk.awsSdkStrings.Joanna
    - typingsSlinky.awsSdk.awsSdkStrings.Joey
    - typingsSlinky.awsSdk.awsSdkStrings.Justin
    - typingsSlinky.awsSdk.awsSdkStrings.Karl
    - typingsSlinky.awsSdk.awsSdkStrings.Kendra
    - typingsSlinky.awsSdk.awsSdkStrings.Kevin
    - typingsSlinky.awsSdk.awsSdkStrings.Kimberly
    - typingsSlinky.awsSdk.awsSdkStrings.Lea
    - typingsSlinky.awsSdk.awsSdkStrings.Liv
    - typingsSlinky.awsSdk.awsSdkStrings.Lotte
    - typingsSlinky.awsSdk.awsSdkStrings.Lucia
    - typingsSlinky.awsSdk.awsSdkStrings.Lupe
    - typingsSlinky.awsSdk.awsSdkStrings.Mads
    - typingsSlinky.awsSdk.awsSdkStrings.Maja
    - typingsSlinky.awsSdk.awsSdkStrings.Marlene
    - typingsSlinky.awsSdk.awsSdkStrings.Mathieu
    - typingsSlinky.awsSdk.awsSdkStrings.Matthew
    - typingsSlinky.awsSdk.awsSdkStrings.Maxim
    - typingsSlinky.awsSdk.awsSdkStrings.Mia
    - typingsSlinky.awsSdk.awsSdkStrings.Miguel
    - typingsSlinky.awsSdk.awsSdkStrings.Mizuki
    - typingsSlinky.awsSdk.awsSdkStrings.Naja
    - typingsSlinky.awsSdk.awsSdkStrings.Nicole
    - typingsSlinky.awsSdk.awsSdkStrings.Penelope
    - typingsSlinky.awsSdk.awsSdkStrings.Raveena
    - typingsSlinky.awsSdk.awsSdkStrings.Ricardo
    - typingsSlinky.awsSdk.awsSdkStrings.Ruben
    - typingsSlinky.awsSdk.awsSdkStrings.Russell
    - typingsSlinky.awsSdk.awsSdkStrings.Salli
    - typingsSlinky.awsSdk.awsSdkStrings.Seoyeon
    - typingsSlinky.awsSdk.awsSdkStrings.Takumi
    - typingsSlinky.awsSdk.awsSdkStrings.Tatyana
    - typingsSlinky.awsSdk.awsSdkStrings.Vicki
    - typingsSlinky.awsSdk.awsSdkStrings.Vitoria
    - typingsSlinky.awsSdk.awsSdkStrings.Zeina
    - typingsSlinky.awsSdk.awsSdkStrings.Zhiyu
    - java.lang.String
  */
  type VoiceId = typingsSlinky.awsSdk.pollyMod._VoiceId | java.lang.String
  
  type VoiceList = js.Array[typingsSlinky.awsSdk.pollyMod.Voice]
  
  type VoiceName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-06-10`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.pollyMod._apiVersion | java.lang.String
}
