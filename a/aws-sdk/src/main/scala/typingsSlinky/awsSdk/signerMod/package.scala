package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object signerMod {
  type BucketName = java.lang.String
  type Category = typingsSlinky.awsSdk.awsSdkStrings.AWSIoT | java.lang.String
  type CertificateArn = java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.signerMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  type CompletedAt = js.Date
  type CreatedAt = js.Date
  type DisplayName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RSA
    - typingsSlinky.awsSdk.awsSdkStrings.ECDSA
    - java.lang.String
  */
  type EncryptionAlgorithm = typingsSlinky.awsSdk.signerMod._EncryptionAlgorithm | java.lang.String
  type EncryptionAlgorithms = js.Array[typingsSlinky.awsSdk.signerMod.EncryptionAlgorithm]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SHA1
    - typingsSlinky.awsSdk.awsSdkStrings.SHA256
    - java.lang.String
  */
  type HashAlgorithm = typingsSlinky.awsSdk.signerMod._HashAlgorithm | java.lang.String
  type HashAlgorithms = js.Array[typingsSlinky.awsSdk.signerMod.HashAlgorithm]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.JSON
    - typingsSlinky.awsSdk.awsSdkStrings.JSONEmbedded
    - typingsSlinky.awsSdk.awsSdkStrings.JSONDetached
    - java.lang.String
  */
  type ImageFormat = typingsSlinky.awsSdk.signerMod._ImageFormat | java.lang.String
  type ImageFormats = js.Array[typingsSlinky.awsSdk.signerMod.ImageFormat]
  type JobId = java.lang.String
  type Key_ = java.lang.String
  type MaxResults = scala.Double
  type MaxSizeInMB = scala.Double
  type NextToken = java.lang.String
  type PlatformId = java.lang.String
  type Prefix = java.lang.String
  type ProfileName = java.lang.String
  type RequestedBy = java.lang.String
  type SigningJobs = js.Array[typingsSlinky.awsSdk.signerMod.SigningJob]
  type SigningParameterKey = java.lang.String
  type SigningParameterValue = java.lang.String
  type SigningParameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.signerMod.SigningParameterValue]
  type SigningPlatforms = js.Array[typingsSlinky.awsSdk.signerMod.SigningPlatform]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Active_
    - typingsSlinky.awsSdk.awsSdkStrings.Canceled_
    - java.lang.String
  */
  type SigningProfileStatus = typingsSlinky.awsSdk.signerMod._SigningProfileStatus | java.lang.String
  type SigningProfiles = js.Array[typingsSlinky.awsSdk.signerMod.SigningProfile]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Succeeded_
    - java.lang.String
  */
  type SigningStatus = typingsSlinky.awsSdk.signerMod._SigningStatus | java.lang.String
  type StatusReason = java.lang.String
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.signerMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.signerMod.TagValue]
  type TagValue = java.lang.String
  type Version = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-08-25`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.signerMod._apiVersion | java.lang.String
  type bool = scala.Boolean
  type key = java.lang.String
}
