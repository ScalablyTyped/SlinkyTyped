package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object accessanalyzerMod {
  
  type ActionList = js.Array[typingsSlinky.awsSdk.accessanalyzerMod.String]
  
  type AnalyzedResourcesList = js.Array[typingsSlinky.awsSdk.accessanalyzerMod.AnalyzedResourceSummary]
  
  type AnalyzerArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type AnalyzerStatus = typingsSlinky.awsSdk.accessanalyzerMod._AnalyzerStatus | java.lang.String
  
  type AnalyzersList = js.Array[typingsSlinky.awsSdk.accessanalyzerMod.AnalyzerSummary]
  
  type ArchiveRulesList = js.Array[typingsSlinky.awsSdk.accessanalyzerMod.ArchiveRuleSummary]
  
  type Boolean = scala.Boolean
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.accessanalyzerMod.ClientApiVersions
  
  type ConditionKeyMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.accessanalyzerMod.String]
  
  type FilterCriteriaMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.accessanalyzerMod.Criterion]
  
  type FindingId = java.lang.String
  
  type FindingIdList = js.Array[typingsSlinky.awsSdk.accessanalyzerMod.FindingId]
  
  type FindingSourceList = js.Array[typingsSlinky.awsSdk.accessanalyzerMod.FindingSource]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.POLICY
    - typingsSlinky.awsSdk.awsSdkStrings.BUCKET_ACL
    - typingsSlinky.awsSdk.awsSdkStrings.S3_ACCESS_POINT
    - java.lang.String
  */
  type FindingSourceType = typingsSlinky.awsSdk.accessanalyzerMod._FindingSourceType | java.lang.String
  
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
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AWS_SERVICE_ACCESS_DISABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DELEGATED_ADMINISTRATOR_DEREGISTERED
    - typingsSlinky.awsSdk.awsSdkStrings.ORGANIZATION_DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.SERVICE_LINKED_ROLE_CREATION_FAILED
    - java.lang.String
  */
  type ReasonCode = typingsSlinky.awsSdk.accessanalyzerMod._ReasonCode | java.lang.String
  
  type ResourceArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonS3ColonColonBucket
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonRole
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonSQSColonColonQueue
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonLambdaColonColonFunction
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonLambdaColonColonLayerVersion
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonKMSColonColonKey
    - java.lang.String
  */
  type ResourceType = typingsSlinky.awsSdk.accessanalyzerMod._ResourceType | java.lang.String
  
  type SharedViaList = js.Array[typingsSlinky.awsSdk.accessanalyzerMod.String]
  
  type String = java.lang.String
  
  type TagKeys = js.Array[typingsSlinky.awsSdk.accessanalyzerMod.String]
  
  type TagsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.accessanalyzerMod.String]
  
  type Timestamp = js.Date
  
  type Token = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT
    - typingsSlinky.awsSdk.awsSdkStrings.ORGANIZATION
    - java.lang.String
  */
  type Type = typingsSlinky.awsSdk.accessanalyzerMod._Type | java.lang.String
  
  type ValueList = js.Array[typingsSlinky.awsSdk.accessanalyzerMod.String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-11-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.accessanalyzerMod._apiVersion | java.lang.String
}
