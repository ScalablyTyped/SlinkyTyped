package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object acmpcaMod {
  
  type ASN1PrintableString64 = java.lang.String
  
  type AWSPolicy = java.lang.String
  
  type AccountId = java.lang.String
  
  type ActionList = js.Array[typingsSlinky.awsSdk.acmpcaMod.ActionType]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IssueCertificate
    - typingsSlinky.awsSdk.awsSdkStrings.GetCertificate
    - typingsSlinky.awsSdk.awsSdkStrings.ListPermissions
    - java.lang.String
  */
  type ActionType = typingsSlinky.awsSdk.acmpcaMod._ActionType | java.lang.String
  
  type Arn = java.lang.String
  
  type AuditReportId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.JSON
    - typingsSlinky.awsSdk.awsSdkStrings.CSV
    - java.lang.String
  */
  type AuditReportResponseFormat = typingsSlinky.awsSdk.acmpcaMod._AuditReportResponseFormat | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type AuditReportStatus = typingsSlinky.awsSdk.acmpcaMod._AuditReportStatus | java.lang.String
  
  type Boolean = scala.Boolean
  
  type CertificateAuthorities = js.Array[typingsSlinky.awsSdk.acmpcaMod.CertificateAuthority]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_CERTIFICATE
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - typingsSlinky.awsSdk.awsSdkStrings.EXPIRED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type CertificateAuthorityStatus = typingsSlinky.awsSdk.acmpcaMod._CertificateAuthorityStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ROOT
    - typingsSlinky.awsSdk.awsSdkStrings.SUBORDINATE
    - java.lang.String
  */
  type CertificateAuthorityType = typingsSlinky.awsSdk.acmpcaMod._CertificateAuthorityType | java.lang.String
  
  type CertificateBody = java.lang.String
  
  type CertificateBodyBlob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.acmpcaMod.Blob | java.lang.String
  
  type CertificateChain = java.lang.String
  
  type CertificateChainBlob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.acmpcaMod.Blob | java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.acmpcaMod.ClientApiVersions
  
  type CountryCodeString = java.lang.String
  
  type CsrBlob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.acmpcaMod.Blob | java.lang.String
  
  type CsrBody = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.REQUEST_TIMED_OUT
    - typingsSlinky.awsSdk.awsSdkStrings.UNSUPPORTED_ALGORITHM
    - typingsSlinky.awsSdk.awsSdkStrings.OTHER
    - java.lang.String
  */
  type FailureReason = typingsSlinky.awsSdk.acmpcaMod._FailureReason | java.lang.String
  
  type IdempotencyToken = java.lang.String
  
  type Integer1To5000 = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RSA_2048
    - typingsSlinky.awsSdk.awsSdkStrings.RSA_4096
    - typingsSlinky.awsSdk.awsSdkStrings.EC_prime256v1
    - typingsSlinky.awsSdk.awsSdkStrings.EC_secp384r1
    - java.lang.String
  */
  type KeyAlgorithm = typingsSlinky.awsSdk.acmpcaMod._KeyAlgorithm | java.lang.String
  
  type MaxResults = scala.Double
  
  type NextToken = java.lang.String
  
  type PermanentDeletionTimeInDays = scala.Double
  
  type PermissionList = js.Array[typingsSlinky.awsSdk.acmpcaMod.Permission]
  
  type PositiveLong = scala.Double
  
  type Principal = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SELF
    - typingsSlinky.awsSdk.awsSdkStrings.OTHER_ACCOUNTS
    - java.lang.String
  */
  type ResourceOwner = typingsSlinky.awsSdk.acmpcaMod._ResourceOwner | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UNSPECIFIED
    - typingsSlinky.awsSdk.awsSdkStrings.KEY_COMPROMISE
    - typingsSlinky.awsSdk.awsSdkStrings.CERTIFICATE_AUTHORITY_COMPROMISE
    - typingsSlinky.awsSdk.awsSdkStrings.AFFILIATION_CHANGED
    - typingsSlinky.awsSdk.awsSdkStrings.SUPERSEDED
    - typingsSlinky.awsSdk.awsSdkStrings.CESSATION_OF_OPERATION
    - typingsSlinky.awsSdk.awsSdkStrings.PRIVILEGE_WITHDRAWN
    - typingsSlinky.awsSdk.awsSdkStrings.A_A_COMPROMISE
    - java.lang.String
  */
  type RevocationReason = typingsSlinky.awsSdk.acmpcaMod._RevocationReason | java.lang.String
  
  type S3BucketName = java.lang.String
  
  type S3Key = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SHA256WITHECDSA
    - typingsSlinky.awsSdk.awsSdkStrings.SHA384WITHECDSA
    - typingsSlinky.awsSdk.awsSdkStrings.SHA512WITHECDSA
    - typingsSlinky.awsSdk.awsSdkStrings.SHA256WITHRSA
    - typingsSlinky.awsSdk.awsSdkStrings.SHA384WITHRSA
    - typingsSlinky.awsSdk.awsSdkStrings.SHA512WITHRSA
    - java.lang.String
  */
  type SigningAlgorithm = typingsSlinky.awsSdk.acmpcaMod._SigningAlgorithm | java.lang.String
  
  type String = java.lang.String
  
  type String128 = java.lang.String
  
  type String16 = java.lang.String
  
  type String253 = java.lang.String
  
  type String3 = java.lang.String
  
  type String3To255 = java.lang.String
  
  type String40 = java.lang.String
  
  type String5 = java.lang.String
  
  type String64 = java.lang.String
  
  type TStamp = js.Date
  
  type TagKey = java.lang.String
  
  type TagList = js.Array[typingsSlinky.awsSdk.acmpcaMod.Tag]
  
  type TagValue = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.END_DATE
    - typingsSlinky.awsSdk.awsSdkStrings.ABSOLUTE
    - typingsSlinky.awsSdk.awsSdkStrings.DAYS
    - typingsSlinky.awsSdk.awsSdkStrings.MONTHS
    - typingsSlinky.awsSdk.awsSdkStrings.YEARS
    - java.lang.String
  */
  type ValidityPeriodType = typingsSlinky.awsSdk.acmpcaMod._ValidityPeriodType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-08-22`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.acmpcaMod._apiVersion | java.lang.String
}
