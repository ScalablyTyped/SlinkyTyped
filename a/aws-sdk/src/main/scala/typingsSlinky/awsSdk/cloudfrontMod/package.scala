package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object cloudfrontMod {
  
  type AliasICPRecordals = js.Array[typingsSlinky.awsSdk.cloudfrontMod.AliasICPRecordal]
  
  type AliasList = js.Array[java.lang.String]
  
  type AwsAccountNumberList = js.Array[java.lang.String]
  
  type CacheBehaviorList = js.Array[typingsSlinky.awsSdk.cloudfrontMod.CacheBehavior]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.none__
    - typingsSlinky.awsSdk.awsSdkStrings.whitelist
    - typingsSlinky.awsSdk.awsSdkStrings.allExcept
    - typingsSlinky.awsSdk.awsSdkStrings.all__
    - java.lang.String
  */
  type CachePolicyCookieBehavior = typingsSlinky.awsSdk.cloudfrontMod._CachePolicyCookieBehavior | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.none__
    - typingsSlinky.awsSdk.awsSdkStrings.whitelist
    - java.lang.String
  */
  type CachePolicyHeaderBehavior = typingsSlinky.awsSdk.cloudfrontMod._CachePolicyHeaderBehavior | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.none__
    - typingsSlinky.awsSdk.awsSdkStrings.whitelist
    - typingsSlinky.awsSdk.awsSdkStrings.allExcept
    - typingsSlinky.awsSdk.awsSdkStrings.all__
    - java.lang.String
  */
  type CachePolicyQueryStringBehavior = typingsSlinky.awsSdk.cloudfrontMod._CachePolicyQueryStringBehavior | java.lang.String
  
  type CachePolicySummaryList = js.Array[typingsSlinky.awsSdk.cloudfrontMod.CachePolicySummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.managed_
    - typingsSlinky.awsSdk.awsSdkStrings.custom__
    - java.lang.String
  */
  type CachePolicyType = typingsSlinky.awsSdk.cloudfrontMod._CachePolicyType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.cloudfront_
    - typingsSlinky.awsSdk.awsSdkStrings.iam_
    - typingsSlinky.awsSdk.awsSdkStrings.acm
    - java.lang.String
  */
  type CertificateSource = typingsSlinky.awsSdk.cloudfrontMod._CertificateSource | java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.cloudfrontMod.ClientApiVersions
  
  type CloudFrontOriginAccessIdentitySummaryList = js.Array[typingsSlinky.awsSdk.cloudfrontMod.CloudFrontOriginAccessIdentitySummary]
  
  type CommentType = java.lang.String
  
  type ContentTypeProfileList = js.Array[typingsSlinky.awsSdk.cloudfrontMod.ContentTypeProfile]
  
  type CookieNameList = js.Array[java.lang.String]
  
  type CustomErrorResponseList = js.Array[typingsSlinky.awsSdk.cloudfrontMod.CustomErrorResponse]
  
  type DistributionIdListSummary = js.Array[java.lang.String]
  
  type DistributionSummaryList = js.Array[typingsSlinky.awsSdk.cloudfrontMod.DistributionSummary]
  
  type EncryptionEntityList = js.Array[typingsSlinky.awsSdk.cloudfrontMod.EncryptionEntity]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`viewer-request`
    - typingsSlinky.awsSdk.awsSdkStrings.`viewer-response`
    - typingsSlinky.awsSdk.awsSdkStrings.`origin-request`
    - typingsSlinky.awsSdk.awsSdkStrings.`origin-response`
    - java.lang.String
  */
  type EventType = typingsSlinky.awsSdk.cloudfrontMod._EventType | java.lang.String
  
  type FieldLevelEncryptionProfileSummaryList = js.Array[typingsSlinky.awsSdk.cloudfrontMod.FieldLevelEncryptionProfileSummary]
  
  type FieldLevelEncryptionSummaryList = js.Array[typingsSlinky.awsSdk.cloudfrontMod.FieldLevelEncryptionSummary]
  
  type FieldPatternList = js.Array[java.lang.String]
  
  type Format = typingsSlinky.awsSdk.awsSdkStrings.URLEncoded | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.blacklist
    - typingsSlinky.awsSdk.awsSdkStrings.whitelist
    - typingsSlinky.awsSdk.awsSdkStrings.none__
    - java.lang.String
  */
  type GeoRestrictionType = typingsSlinky.awsSdk.cloudfrontMod._GeoRestrictionType | java.lang.String
  
  type HeaderList = js.Array[java.lang.String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.http1Dot1
    - typingsSlinky.awsSdk.awsSdkStrings.http2
    - java.lang.String
  */
  type HttpVersion = typingsSlinky.awsSdk.cloudfrontMod._HttpVersion | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.APPROVED
    - typingsSlinky.awsSdk.awsSdkStrings.SUSPENDED
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type ICPRecordalStatus = typingsSlinky.awsSdk.cloudfrontMod._ICPRecordalStatus | java.lang.String
  
  type InvalidationSummaryList = js.Array[typingsSlinky.awsSdk.cloudfrontMod.InvalidationSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.none__
    - typingsSlinky.awsSdk.awsSdkStrings.whitelist
    - typingsSlinky.awsSdk.awsSdkStrings.all__
    - java.lang.String
  */
  type ItemSelection = typingsSlinky.awsSdk.cloudfrontMod._ItemSelection | java.lang.String
  
  type KeyPairIdList = js.Array[java.lang.String]
  
  type LambdaFunctionARN = java.lang.String
  
  type LambdaFunctionAssociationList = js.Array[typingsSlinky.awsSdk.cloudfrontMod.LambdaFunctionAssociation]
  
  type LocationList = js.Array[java.lang.String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GET
    - typingsSlinky.awsSdk.awsSdkStrings.HEAD
    - typingsSlinky.awsSdk.awsSdkStrings.POST
    - typingsSlinky.awsSdk.awsSdkStrings.PUT
    - typingsSlinky.awsSdk.awsSdkStrings.PATCH
    - typingsSlinky.awsSdk.awsSdkStrings.OPTIONS
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE
    - java.lang.String
  */
  type Method = typingsSlinky.awsSdk.cloudfrontMod._Method | java.lang.String
  
  type MethodsList = js.Array[typingsSlinky.awsSdk.cloudfrontMod.Method]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SSLv3
    - typingsSlinky.awsSdk.awsSdkStrings.TLSv1
    - typingsSlinky.awsSdk.awsSdkStrings.TLSv1_2016
    - typingsSlinky.awsSdk.awsSdkStrings.TLSv1Dot1_2016
    - typingsSlinky.awsSdk.awsSdkStrings.TLSv1Dot2_2018
    - typingsSlinky.awsSdk.awsSdkStrings.TLSv1Dot2_2019
    - java.lang.String
  */
  type MinimumProtocolVersion = typingsSlinky.awsSdk.cloudfrontMod._MinimumProtocolVersion | java.lang.String
  
  type OriginCustomHeadersList = js.Array[typingsSlinky.awsSdk.cloudfrontMod.OriginCustomHeader]
  
  type OriginGroupList = js.Array[typingsSlinky.awsSdk.cloudfrontMod.OriginGroup]
  
  type OriginGroupMemberList = js.Array[typingsSlinky.awsSdk.cloudfrontMod.OriginGroupMember]
  
  type OriginList = js.Array[typingsSlinky.awsSdk.cloudfrontMod.Origin]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`http-only`
    - typingsSlinky.awsSdk.awsSdkStrings.`match-viewer`
    - typingsSlinky.awsSdk.awsSdkStrings.`https-only`
    - java.lang.String
  */
  type OriginProtocolPolicy = typingsSlinky.awsSdk.cloudfrontMod._OriginProtocolPolicy | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.none__
    - typingsSlinky.awsSdk.awsSdkStrings.whitelist
    - typingsSlinky.awsSdk.awsSdkStrings.all__
    - java.lang.String
  */
  type OriginRequestPolicyCookieBehavior = typingsSlinky.awsSdk.cloudfrontMod._OriginRequestPolicyCookieBehavior | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.none__
    - typingsSlinky.awsSdk.awsSdkStrings.whitelist
    - typingsSlinky.awsSdk.awsSdkStrings.allViewer
    - typingsSlinky.awsSdk.awsSdkStrings.allViewerAndWhitelistCloudFront
    - java.lang.String
  */
  type OriginRequestPolicyHeaderBehavior = typingsSlinky.awsSdk.cloudfrontMod._OriginRequestPolicyHeaderBehavior | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.none__
    - typingsSlinky.awsSdk.awsSdkStrings.whitelist
    - typingsSlinky.awsSdk.awsSdkStrings.all__
    - java.lang.String
  */
  type OriginRequestPolicyQueryStringBehavior = typingsSlinky.awsSdk.cloudfrontMod._OriginRequestPolicyQueryStringBehavior | java.lang.String
  
  type OriginRequestPolicySummaryList = js.Array[typingsSlinky.awsSdk.cloudfrontMod.OriginRequestPolicySummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.managed_
    - typingsSlinky.awsSdk.awsSdkStrings.custom__
    - java.lang.String
  */
  type OriginRequestPolicyType = typingsSlinky.awsSdk.cloudfrontMod._OriginRequestPolicyType | java.lang.String
  
  type PathList = js.Array[java.lang.String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PriceClass_100
    - typingsSlinky.awsSdk.awsSdkStrings.PriceClass_200
    - typingsSlinky.awsSdk.awsSdkStrings.PriceClass_All
    - java.lang.String
  */
  type PriceClass = typingsSlinky.awsSdk.cloudfrontMod._PriceClass | java.lang.String
  
  type PublicKeySummaryList = js.Array[typingsSlinky.awsSdk.cloudfrontMod.PublicKeySummary]
  
  type QueryArgProfileList = js.Array[typingsSlinky.awsSdk.cloudfrontMod.QueryArgProfile]
  
  type QueryStringCacheKeysList = js.Array[java.lang.String]
  
  type QueryStringNamesList = js.Array[java.lang.String]
  
  type ResourceARN = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`sni-only`
    - typingsSlinky.awsSdk.awsSdkStrings.vip
    - java.lang.String
  */
  type SSLSupportMethod = typingsSlinky.awsSdk.cloudfrontMod._SSLSupportMethod | java.lang.String
  
  type SignerList = js.Array[typingsSlinky.awsSdk.cloudfrontMod._Signer]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SSLv3
    - typingsSlinky.awsSdk.awsSdkStrings.TLSv1
    - typingsSlinky.awsSdk.awsSdkStrings.TLSv1Dot1
    - typingsSlinky.awsSdk.awsSdkStrings.TLSv1Dot2
    - java.lang.String
  */
  type SslProtocol = typingsSlinky.awsSdk.cloudfrontMod._SslProtocol | java.lang.String
  
  type SslProtocolsList = js.Array[typingsSlinky.awsSdk.cloudfrontMod.SslProtocol]
  
  type StatusCodeList = js.Array[typingsSlinky.awsSdk.cloudfrontMod.integer]
  
  type StreamingDistributionSummaryList = js.Array[typingsSlinky.awsSdk.cloudfrontMod.StreamingDistributionSummary]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.cloudfrontMod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.cloudfrontMod.Tag]
  
  type TagValue = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`allow-all`
    - typingsSlinky.awsSdk.awsSdkStrings.`https-only`
    - typingsSlinky.awsSdk.awsSdkStrings.`redirect-to-https`
    - java.lang.String
  */
  type ViewerProtocolPolicy = typingsSlinky.awsSdk.cloudfrontMod._ViewerProtocolPolicy | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2013-05-12`
    - typingsSlinky.awsSdk.awsSdkStrings.`2013-11-11`
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-05-31`
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-10-21`
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-11-06`
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-04-17`
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-07-27`
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-09-17`
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-01-13`
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-01-28`
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-08-01`
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-08-20`
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-09-07`
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-09-29`
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-11-25`
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-03-25`
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-10-30`
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-06-18`
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-11-05`
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-03-26`
    - typingsSlinky.awsSdk.awsSdkStrings.`2020-05-31`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.cloudfrontMod._apiVersion | java.lang.String
  
  type integer = scala.Double
  
  type long = scala.Double
  
  type timestamp = js.Date
}
