package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object acmMod {
  type Arn = java.lang.String
  type CertificateBody = java.lang.String
  type CertificateChain = java.lang.String
  type CertificateStatuses = js.Array[typingsSlinky.awsSdk.acmMod.CertificateStatus]
  type CertificateSummaryList = js.Array[typingsSlinky.awsSdk.acmMod.CertificateSummary]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.acmMod.ClientApiVersions
  type DomainList = js.Array[typingsSlinky.awsSdk.acmMod.DomainNameString]
  type DomainNameString = java.lang.String
  type DomainValidationList = js.Array[typingsSlinky.awsSdk.acmMod.DomainValidation]
  type DomainValidationOptionList = js.Array[typingsSlinky.awsSdk.acmMod.DomainValidationOption]
  type ExtendedKeyUsageFilterList = js.Array[typingsSlinky.awsSdk.acmMod.ExtendedKeyUsageName]
  type ExtendedKeyUsageList = js.Array[typingsSlinky.awsSdk.acmMod.ExtendedKeyUsage]
  type IdempotencyToken = java.lang.String
  type InUseList = js.Array[typingsSlinky.awsSdk.acmMod.String]
  type KeyAlgorithmList = js.Array[typingsSlinky.awsSdk.acmMod.KeyAlgorithm]
  type KeyUsageFilterList = js.Array[typingsSlinky.awsSdk.acmMod.KeyUsageName]
  type KeyUsageList = js.Array[typingsSlinky.awsSdk.acmMod.KeyUsage]
  type MaxItems = scala.Double
  type NextToken = java.lang.String
  type PrivateKey = java.lang.String
  type String = java.lang.String
  type TStamp = js.Date
  type TagKey = java.lang.String
  type TagList = js.Array[typingsSlinky.awsSdk.acmMod.Tag]
  type TagValue = java.lang.String
  type ValidationEmailList = js.Array[typingsSlinky.awsSdk.acmMod.String]
}
