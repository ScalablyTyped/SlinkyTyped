package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloudsearchMod {
  type APIVersion_ = java.lang.String
  type ARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.none__
    - typingsSlinky.awsSdk.awsSdkStrings.minimal
    - typingsSlinky.awsSdk.awsSdkStrings.light
    - typingsSlinky.awsSdk.awsSdkStrings.full_
    - java.lang.String
  */
  type AlgorithmicStemming = typingsSlinky.awsSdk.cloudsearchMod._AlgorithmicStemming | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ar_
    - typingsSlinky.awsSdk.awsSdkStrings.bg_
    - typingsSlinky.awsSdk.awsSdkStrings.ca_
    - typingsSlinky.awsSdk.awsSdkStrings.cs
    - typingsSlinky.awsSdk.awsSdkStrings.da
    - typingsSlinky.awsSdk.awsSdkStrings.de_
    - typingsSlinky.awsSdk.awsSdkStrings.el
    - typingsSlinky.awsSdk.awsSdkStrings.en_
    - typingsSlinky.awsSdk.awsSdkStrings.es_
    - typingsSlinky.awsSdk.awsSdkStrings.eu_
    - typingsSlinky.awsSdk.awsSdkStrings.fa
    - typingsSlinky.awsSdk.awsSdkStrings.fi_
    - typingsSlinky.awsSdk.awsSdkStrings.fr_
    - typingsSlinky.awsSdk.awsSdkStrings.ga_
    - typingsSlinky.awsSdk.awsSdkStrings.gl_
    - typingsSlinky.awsSdk.awsSdkStrings.he
    - typingsSlinky.awsSdk.awsSdkStrings.hi
    - typingsSlinky.awsSdk.awsSdkStrings.hu_
    - typingsSlinky.awsSdk.awsSdkStrings.hy
    - typingsSlinky.awsSdk.awsSdkStrings.id__
    - typingsSlinky.awsSdk.awsSdkStrings.it_
    - typingsSlinky.awsSdk.awsSdkStrings.ja_
    - typingsSlinky.awsSdk.awsSdkStrings.ko
    - typingsSlinky.awsSdk.awsSdkStrings.lv_
    - typingsSlinky.awsSdk.awsSdkStrings.mul
    - typingsSlinky.awsSdk.awsSdkStrings.nl_
    - typingsSlinky.awsSdk.awsSdkStrings.no_
    - typingsSlinky.awsSdk.awsSdkStrings.pt_
    - typingsSlinky.awsSdk.awsSdkStrings.ro_
    - typingsSlinky.awsSdk.awsSdkStrings.ru_
    - typingsSlinky.awsSdk.awsSdkStrings.sv_
    - typingsSlinky.awsSdk.awsSdkStrings.th_
    - typingsSlinky.awsSdk.awsSdkStrings.tr_
    - typingsSlinky.awsSdk.awsSdkStrings.`zh-Hans`
    - typingsSlinky.awsSdk.awsSdkStrings.`zh-Hant`
    - java.lang.String
  */
  type AnalysisSchemeLanguage = typingsSlinky.awsSdk.cloudsearchMod._AnalysisSchemeLanguage | java.lang.String
  type AnalysisSchemeStatusList = js.Array[typingsSlinky.awsSdk.cloudsearchMod.AnalysisSchemeStatus]
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.cloudsearchMod.ClientApiVersions
  type DomainId = java.lang.String
  type DomainName = java.lang.String
  type DomainNameList = js.Array[typingsSlinky.awsSdk.cloudsearchMod.DomainName]
  type DomainNameMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.cloudsearchMod.APIVersion_]
  type DomainStatusList = js.Array[typingsSlinky.awsSdk.cloudsearchMod.DomainStatus]
  type Double = scala.Double
  type DynamicFieldName = java.lang.String
  type DynamicFieldNameList = js.Array[typingsSlinky.awsSdk.cloudsearchMod.DynamicFieldName]
  type ExpressionStatusList = js.Array[typingsSlinky.awsSdk.cloudsearchMod.ExpressionStatus]
  type ExpressionValue = java.lang.String
  type FieldName = java.lang.String
  type FieldNameCommaList = java.lang.String
  type FieldNameList = js.Array[typingsSlinky.awsSdk.cloudsearchMod.FieldName]
  type FieldValue = java.lang.String
  type IndexFieldStatusList = js.Array[typingsSlinky.awsSdk.cloudsearchMod.IndexFieldStatus]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.int
    - typingsSlinky.awsSdk.awsSdkStrings.double_
    - typingsSlinky.awsSdk.awsSdkStrings.literal
    - typingsSlinky.awsSdk.awsSdkStrings.text_
    - typingsSlinky.awsSdk.awsSdkStrings.date_
    - typingsSlinky.awsSdk.awsSdkStrings.latlon
    - typingsSlinky.awsSdk.awsSdkStrings.`int-array`
    - typingsSlinky.awsSdk.awsSdkStrings.`double-array`
    - typingsSlinky.awsSdk.awsSdkStrings.`literal-array`
    - typingsSlinky.awsSdk.awsSdkStrings.`text-array`
    - typingsSlinky.awsSdk.awsSdkStrings.`date-array`
    - java.lang.String
  */
  type IndexFieldType = typingsSlinky.awsSdk.cloudsearchMod._IndexFieldType | java.lang.String
  type InstanceCount = scala.Double
  type Long = scala.Double
  type MaximumPartitionCount = scala.Double
  type MaximumReplicationCount = scala.Double
  type MultiAZ = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RequiresIndexDocuments
    - typingsSlinky.awsSdk.awsSdkStrings.Processing_
    - typingsSlinky.awsSdk.awsSdkStrings.Active_
    - typingsSlinky.awsSdk.awsSdkStrings.FailedToValidate
    - java.lang.String
  */
  type OptionState = typingsSlinky.awsSdk.cloudsearchMod._OptionState | java.lang.String
  type PartitionCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.searchDotm1Dotsmall
    - typingsSlinky.awsSdk.awsSdkStrings.searchDotm1Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.searchDotm2Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.searchDotm2Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.searchDotm3Dotmedium
    - typingsSlinky.awsSdk.awsSdkStrings.searchDotm3Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.searchDotm3Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.searchDotm3Dot2xlarge
    - java.lang.String
  */
  type PartitionInstanceType = typingsSlinky.awsSdk.cloudsearchMod._PartitionInstanceType | java.lang.String
  type PolicyDocument = java.lang.String
  type SearchInstanceType = java.lang.String
  type ServiceUrl = java.lang.String
  type StandardName = java.lang.String
  type StandardNameList = js.Array[typingsSlinky.awsSdk.cloudsearchMod.StandardName]
  type String = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.none__
    - typingsSlinky.awsSdk.awsSdkStrings.low__
    - typingsSlinky.awsSdk.awsSdkStrings.high__
    - java.lang.String
  */
  type SuggesterFuzzyMatching = typingsSlinky.awsSdk.cloudsearchMod._SuggesterFuzzyMatching | java.lang.String
  type SuggesterStatusList = js.Array[typingsSlinky.awsSdk.cloudsearchMod.SuggesterStatus]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`Policy-Min-TLS-1-0-2019-07`
    - typingsSlinky.awsSdk.awsSdkStrings.`Policy-Min-TLS-1-2-2019-07`
    - java.lang.String
  */
  type TLSSecurityPolicy = typingsSlinky.awsSdk.cloudsearchMod._TLSSecurityPolicy | java.lang.String
  type UIntValue = scala.Double
  type UpdateTimestamp = js.Date
  type Word = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2011-02-01`
    - typingsSlinky.awsSdk.awsSdkStrings.`2013-01-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.cloudsearchMod._apiVersion | java.lang.String
}
