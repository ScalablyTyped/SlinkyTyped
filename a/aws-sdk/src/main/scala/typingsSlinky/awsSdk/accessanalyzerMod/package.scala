package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object accessanalyzerMod {
  type ActionList = js.Array[typingsSlinky.awsSdk.accessanalyzerMod.String]
  type AnalyzedResourcesList = js.Array[typingsSlinky.awsSdk.accessanalyzerMod.AnalyzedResourceSummary]
  type AnalyzerArn = java.lang.String
  type AnalyzersList = js.Array[typingsSlinky.awsSdk.accessanalyzerMod.AnalyzerSummary]
  type ArchiveRulesList = js.Array[typingsSlinky.awsSdk.accessanalyzerMod.ArchiveRuleSummary]
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.accessanalyzerMod.ClientApiVersions
  type ConditionKeyMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.accessanalyzerMod.String]
  type FilterCriteriaMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.accessanalyzerMod.Criterion]
  type FindingId = java.lang.String
  type FindingIdList = js.Array[typingsSlinky.awsSdk.accessanalyzerMod.FindingId]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.ARCHIVED
    - typingsSlinky.awsSdk.awsSdkStrings.RESOLVED
    - java.lang.String
  */
  type FindingStatus = typingsSlinky.awsSdk.accessanalyzerMod._FindingStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.ARCHIVED
    - java.lang.String
  */
  type FindingStatusUpdate = typingsSlinky.awsSdk.accessanalyzerMod._FindingStatusUpdate | java.lang.String
  type FindingsList = js.Array[typingsSlinky.awsSdk.accessanalyzerMod.FindingSummary]
  type InlineArchiveRulesList = js.Array[typingsSlinky.awsSdk.accessanalyzerMod.InlineArchiveRule]
  type Integer = scala.Double
  type Name = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ASC
    - typingsSlinky.awsSdk.awsSdkStrings.DESC
    - java.lang.String
  */
  type OrderBy = typingsSlinky.awsSdk.accessanalyzerMod._OrderBy | java.lang.String
  type PrincipalMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.accessanalyzerMod.String]
  type ResourceArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonRole
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonKMSColonColonKey
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonLambdaColonColonFunction
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonLambdaColonColonLayerVersion
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonS3ColonColonBucket
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonSQSColonColonQueue
    - java.lang.String
  */
  type ResourceType = typingsSlinky.awsSdk.accessanalyzerMod._ResourceType | java.lang.String
  type SharedViaList = js.Array[typingsSlinky.awsSdk.accessanalyzerMod.String]
  type String = java.lang.String
  type TagKeys = js.Array[typingsSlinky.awsSdk.accessanalyzerMod.String]
  type TagsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.accessanalyzerMod.String]
  type Timestamp = js.Date
  type Token = java.lang.String
  type Type = typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT | java.lang.String
  type ValueList = js.Array[typingsSlinky.awsSdk.accessanalyzerMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-11-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.accessanalyzerMod._apiVersion | java.lang.String
}
