package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object worklinkMod {
  type AcmCertificateArn = java.lang.String
  type AuditStreamArn = java.lang.String
  type AuthorizationProviderType = typingsSlinky.awsSdk.awsSdkStrings.SAML | java.lang.String
  type Boolean = scala.Boolean
  type Certificate = java.lang.String
  type CertificateChain = java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.worklinkMod.ClientApiVersions
  type CompanyCode = java.lang.String
  type DateTime = js.Date
  type DeviceManufacturer = java.lang.String
  type DeviceModel = java.lang.String
  type DeviceOperatingSystemName = java.lang.String
  type DeviceOperatingSystemVersion = java.lang.String
  type DevicePatchLevel = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.SIGNED_OUT
    - java.lang.String
  */
  type DeviceStatus = typingsSlinky.awsSdk.worklinkMod._DeviceStatus | java.lang.String
  type DeviceSummaryList = js.Array[typingsSlinky.awsSdk.worklinkMod.DeviceSummary]
  type DisplayName = java.lang.String
  type DomainName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_VALIDATION
    - typingsSlinky.awsSdk.awsSdkStrings.ASSOCIATING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DISASSOCIATING
    - typingsSlinky.awsSdk.awsSdkStrings.DISASSOCIATED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED_TO_ASSOCIATE
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED_TO_DISASSOCIATE
    - java.lang.String
  */
  type DomainStatus = typingsSlinky.awsSdk.worklinkMod._DomainStatus | java.lang.String
  type DomainSummaryList = js.Array[typingsSlinky.awsSdk.worklinkMod.DomainSummary]
  type FleetArn = java.lang.String
  type FleetName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED_TO_CREATE
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED_TO_DELETE
    - java.lang.String
  */
  type FleetStatus = typingsSlinky.awsSdk.worklinkMod._FleetStatus | java.lang.String
  type FleetSummaryList = js.Array[typingsSlinky.awsSdk.worklinkMod.FleetSummary]
  type Id = java.lang.String
  type IdentityProviderType = typingsSlinky.awsSdk.awsSdkStrings.SAML | java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type SamlMetadata = java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[typingsSlinky.awsSdk.worklinkMod.SecurityGroupId]
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[typingsSlinky.awsSdk.worklinkMod.SubnetId]
  type Username = java.lang.String
  type VpcId = java.lang.String
  type WebsiteAuthorizationProvidersSummaryList = js.Array[typingsSlinky.awsSdk.worklinkMod.WebsiteAuthorizationProviderSummary]
  type WebsiteCaSummaryList = js.Array[typingsSlinky.awsSdk.worklinkMod.WebsiteCaSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-09-25`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.worklinkMod._apiVersion | java.lang.String
}
