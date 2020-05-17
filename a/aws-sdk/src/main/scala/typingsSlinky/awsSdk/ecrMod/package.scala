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
  type FindingSeverityCounts = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.ecrMod.SeverityCount]
  type ForceFlag = scala.Boolean
  type GetAuthorizationTokenRegistryIdList = js.Array[typingsSlinky.awsSdk.ecrMod.RegistryId]
  type ImageCount = scala.Double
  type ImageDetailList = js.Array[typingsSlinky.awsSdk.ecrMod.ImageDetail]
  type ImageDigest = java.lang.String
  type ImageFailureList = js.Array[typingsSlinky.awsSdk.ecrMod.ImageFailure]
  type ImageFailureReason = java.lang.String
  type ImageIdentifierList = js.Array[typingsSlinky.awsSdk.ecrMod.ImageIdentifier]
  type ImageList = js.Array[typingsSlinky.awsSdk.ecrMod.Image]
  type ImageManifest = java.lang.String
  type ImageScanFindingList = js.Array[typingsSlinky.awsSdk.ecrMod.ImageScanFinding]
  type ImageSizeInBytes = scala.Double
  type ImageTag = java.lang.String
  type ImageTagList = js.Array[typingsSlinky.awsSdk.ecrMod.ImageTag]
  type LayerDigest = java.lang.String
  type LayerDigestList = js.Array[typingsSlinky.awsSdk.ecrMod.LayerDigest]
  type LayerFailureList = js.Array[typingsSlinky.awsSdk.ecrMod.LayerFailure]
  type LayerFailureReason = java.lang.String
  type LayerList = js.Array[typingsSlinky.awsSdk.ecrMod.Layer]
  type LayerSizeInBytes = scala.Double
  type LifecyclePolicyPreviewResultList = js.Array[typingsSlinky.awsSdk.ecrMod.LifecyclePolicyPreviewResult]
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
  type ScanStatusDescription = java.lang.String
  type ScanTimestamp = js.Date
  type SeverityCount = scala.Double
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.ecrMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.ecrMod.Tag]
  type TagValue = java.lang.String
  type UploadId = java.lang.String
  type Url = java.lang.String
  type VulnerabilitySourceUpdateTimestamp = js.Date
}
