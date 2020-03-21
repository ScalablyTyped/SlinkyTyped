package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ecrMod {
  type Arn = java.lang.String
  type AttributeKey = java.lang.String
  type AttributeList = js.Array[typingsSlinky.awsSdk.ecrMod.Attribute]
  type AttributeValue = java.lang.String
  type AuthorizationDataList = js.Array[typingsSlinky.awsSdk.ecrMod.AuthorizationData]
  type Base64 = java.lang.String
  type BatchedOperationLayerDigest = java.lang.String
  type BatchedOperationLayerDigestList = js.Array[typingsSlinky.awsSdk.ecrMod.BatchedOperationLayerDigest]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.ecrMod.ClientApiVersions
  type CreationTimestamp = js.Date
  type EvaluationTimestamp = js.Date
  type ExpirationTimestamp = js.Date
  type FindingDescription = java.lang.String
  type FindingName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INFORMATIONAL
    - typingsSlinky.awsSdk.awsSdkStrings.LOW
    - typingsSlinky.awsSdk.awsSdkStrings.MEDIUM
    - typingsSlinky.awsSdk.awsSdkStrings.HIGH
    - typingsSlinky.awsSdk.awsSdkStrings.CRITICAL
    - typingsSlinky.awsSdk.awsSdkStrings.UNDEFINED
    - java.lang.String
  */
  type FindingSeverity = typingsSlinky.awsSdk.ecrMod._FindingSeverity | java.lang.String
  type FindingSeverityCounts = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.ecrMod.SeverityCount]
  type ForceFlag = scala.Boolean
  type GetAuthorizationTokenRegistryIdList = js.Array[typingsSlinky.awsSdk.ecrMod.RegistryId]
  type ImageActionType = typingsSlinky.awsSdk.awsSdkStrings.EXPIRE | java.lang.String
  type ImageCount = scala.Double
  type ImageDetailList = js.Array[typingsSlinky.awsSdk.ecrMod.ImageDetail]
  type ImageDigest = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidImageDigest
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidImageTag
    - typingsSlinky.awsSdk.awsSdkStrings.ImageTagDoesNotMatchDigest
    - typingsSlinky.awsSdk.awsSdkStrings.ImageNotFound
    - typingsSlinky.awsSdk.awsSdkStrings.MissingDigestAndTag
    - java.lang.String
  */
  type ImageFailureCode = typingsSlinky.awsSdk.ecrMod._ImageFailureCode | java.lang.String
  type ImageFailureList = js.Array[typingsSlinky.awsSdk.ecrMod.ImageFailure]
  type ImageFailureReason = java.lang.String
  type ImageIdentifierList = js.Array[typingsSlinky.awsSdk.ecrMod.ImageIdentifier]
  type ImageList = js.Array[typingsSlinky.awsSdk.ecrMod.Image]
  type ImageManifest = java.lang.String
  type ImageScanFindingList = js.Array[typingsSlinky.awsSdk.ecrMod.ImageScanFinding]
  type ImageSizeInBytes = scala.Double
  type ImageTag = java.lang.String
  type ImageTagList = js.Array[typingsSlinky.awsSdk.ecrMod.ImageTag]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MUTABLE
    - typingsSlinky.awsSdk.awsSdkStrings.IMMUTABLE
    - java.lang.String
  */
  type ImageTagMutability = typingsSlinky.awsSdk.ecrMod._ImageTagMutability | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE
    - java.lang.String
  */
  type LayerAvailability = typingsSlinky.awsSdk.ecrMod._LayerAvailability | java.lang.String
  type LayerDigest = java.lang.String
  type LayerDigestList = js.Array[typingsSlinky.awsSdk.ecrMod.LayerDigest]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidLayerDigest
    - typingsSlinky.awsSdk.awsSdkStrings.MissingLayerDigest
    - java.lang.String
  */
  type LayerFailureCode = typingsSlinky.awsSdk.ecrMod._LayerFailureCode | java.lang.String
  type LayerFailureList = js.Array[typingsSlinky.awsSdk.ecrMod.LayerFailure]
  type LayerFailureReason = java.lang.String
  type LayerList = js.Array[typingsSlinky.awsSdk.ecrMod.Layer]
  type LayerPartBlob = typingsSlinky.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsSlinky.awsSdk.ecrMod.Blob | java.lang.String
  type LayerSizeInBytes = scala.Double
  type LifecyclePolicyPreviewResultList = js.Array[typingsSlinky.awsSdk.ecrMod.LifecyclePolicyPreviewResult]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.EXPIRED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type LifecyclePolicyPreviewStatus = typingsSlinky.awsSdk.ecrMod._LifecyclePolicyPreviewStatus | java.lang.String
  type LifecyclePolicyRulePriority = scala.Double
  type LifecyclePolicyText = java.lang.String
  type LifecyclePreviewMaxResults = scala.Double
  type MaxResults = scala.Double
  type MediaType = java.lang.String
  type MediaTypeList = js.Array[typingsSlinky.awsSdk.ecrMod.MediaType]
  type NextToken = java.lang.String
  type PartSize = scala.Double
  type ProxyEndpoint = java.lang.String
  type PushTimestamp = js.Date
  type RegistryId = java.lang.String
  type RepositoryList = js.Array[typingsSlinky.awsSdk.ecrMod.Repository]
  type RepositoryName = java.lang.String
  type RepositoryNameList = js.Array[typingsSlinky.awsSdk.ecrMod.RepositoryName]
  type RepositoryPolicyText = java.lang.String
  type ScanOnPushFlag = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ScanStatus = typingsSlinky.awsSdk.ecrMod._ScanStatus | java.lang.String
  type ScanStatusDescription = java.lang.String
  type ScanTimestamp = js.Date
  type SeverityCount = scala.Double
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.ecrMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.ecrMod.Tag]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TAGGED
    - typingsSlinky.awsSdk.awsSdkStrings.UNTAGGED
    - typingsSlinky.awsSdk.awsSdkStrings.ANY
    - java.lang.String
  */
  type TagStatus = typingsSlinky.awsSdk.ecrMod._TagStatus | java.lang.String
  type TagValue = java.lang.String
  type UploadId = java.lang.String
  type Url = java.lang.String
  type VulnerabilitySourceUpdateTimestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-09-21`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.ecrMod._apiVersion | java.lang.String
}
