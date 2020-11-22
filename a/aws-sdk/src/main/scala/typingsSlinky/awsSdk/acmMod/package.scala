package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object acmMod {
  
  type Arn = java.lang.String
  
  type CertificateBody = java.lang.String
  
  type CertificateBodyBlob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.acmMod.Blob | java.lang.String
  
  type CertificateChain = java.lang.String
  
  type CertificateChainBlob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.acmMod.Blob | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_VALIDATION
    - typingsSlinky.awsSdk.awsSdkStrings.ISSUED
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.EXPIRED
    - typingsSlinky.awsSdk.awsSdkStrings.VALIDATION_TIMED_OUT
    - typingsSlinky.awsSdk.awsSdkStrings.REVOKED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type CertificateStatus = typingsSlinky.awsSdk.acmMod._CertificateStatus | java.lang.String
  
  type CertificateStatuses = js.Array[typingsSlinky.awsSdk.acmMod.CertificateStatus]
  
  type CertificateSummaryList = js.Array[typingsSlinky.awsSdk.acmMod.CertificateSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type CertificateTransparencyLoggingPreference = typingsSlinky.awsSdk.acmMod._CertificateTransparencyLoggingPreference | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORTED
    - typingsSlinky.awsSdk.awsSdkStrings.AMAZON_ISSUED
    - typingsSlinky.awsSdk.awsSdkStrings.PRIVATE
    - java.lang.String
  */
  type CertificateType = typingsSlinky.awsSdk.acmMod._CertificateType | java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.acmMod.ClientApiVersions
  
  type DomainList = js.Array[typingsSlinky.awsSdk.acmMod.DomainNameString]
  
  type DomainNameString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_VALIDATION
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type DomainStatus = typingsSlinky.awsSdk.acmMod._DomainStatus | java.lang.String
  
  type DomainValidationList = js.Array[typingsSlinky.awsSdk.acmMod.DomainValidation]
  
  type DomainValidationOptionList = js.Array[typingsSlinky.awsSdk.acmMod.DomainValidationOption]
  
  type ExtendedKeyUsageFilterList = js.Array[typingsSlinky.awsSdk.acmMod.ExtendedKeyUsageName]
  
  type ExtendedKeyUsageList = js.Array[typingsSlinky.awsSdk.acmMod.ExtendedKeyUsage]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TLS_WEB_SERVER_AUTHENTICATION
    - typingsSlinky.awsSdk.awsSdkStrings.TLS_WEB_CLIENT_AUTHENTICATION
    - typingsSlinky.awsSdk.awsSdkStrings.CODE_SIGNING
    - typingsSlinky.awsSdk.awsSdkStrings.EMAIL_PROTECTION
    - typingsSlinky.awsSdk.awsSdkStrings.TIME_STAMPING
    - typingsSlinky.awsSdk.awsSdkStrings.OCSP_SIGNING
    - typingsSlinky.awsSdk.awsSdkStrings.IPSEC_END_SYSTEM
    - typingsSlinky.awsSdk.awsSdkStrings.IPSEC_TUNNEL
    - typingsSlinky.awsSdk.awsSdkStrings.IPSEC_USER
    - typingsSlinky.awsSdk.awsSdkStrings.ANY
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.CUSTOM
    - java.lang.String
  */
  type ExtendedKeyUsageName = typingsSlinky.awsSdk.acmMod._ExtendedKeyUsageName | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NO_AVAILABLE_CONTACTS
    - typingsSlinky.awsSdk.awsSdkStrings.ADDITIONAL_VERIFICATION_REQUIRED
    - typingsSlinky.awsSdk.awsSdkStrings.DOMAIN_NOT_ALLOWED
    - typingsSlinky.awsSdk.awsSdkStrings.INVALID_PUBLIC_DOMAIN
    - typingsSlinky.awsSdk.awsSdkStrings.DOMAIN_VALIDATION_DENIED
    - typingsSlinky.awsSdk.awsSdkStrings.CAA_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.PCA_LIMIT_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.PCA_INVALID_ARN
    - typingsSlinky.awsSdk.awsSdkStrings.PCA_INVALID_STATE
    - typingsSlinky.awsSdk.awsSdkStrings.PCA_REQUEST_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.PCA_NAME_CONSTRAINTS_VALIDATION
    - typingsSlinky.awsSdk.awsSdkStrings.PCA_RESOURCE_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.PCA_INVALID_ARGS
    - typingsSlinky.awsSdk.awsSdkStrings.PCA_INVALID_DURATION
    - typingsSlinky.awsSdk.awsSdkStrings.PCA_ACCESS_DENIED
    - typingsSlinky.awsSdk.awsSdkStrings.SLR_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.OTHER
    - java.lang.String
  */
  type FailureReason = typingsSlinky.awsSdk.acmMod._FailureReason | java.lang.String
  
  type IdempotencyToken = java.lang.String
  
  type InUseList = js.Array[typingsSlinky.awsSdk.acmMod.String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RSA_2048
    - typingsSlinky.awsSdk.awsSdkStrings.RSA_1024
    - typingsSlinky.awsSdk.awsSdkStrings.RSA_4096
    - typingsSlinky.awsSdk.awsSdkStrings.EC_prime256v1
    - typingsSlinky.awsSdk.awsSdkStrings.EC_secp384r1
    - typingsSlinky.awsSdk.awsSdkStrings.EC_secp521r1
    - java.lang.String
  */
  type KeyAlgorithm = typingsSlinky.awsSdk.acmMod._KeyAlgorithm | java.lang.String
  
  type KeyAlgorithmList = js.Array[typingsSlinky.awsSdk.acmMod.KeyAlgorithm]
  
  type KeyUsageFilterList = js.Array[typingsSlinky.awsSdk.acmMod.KeyUsageName]
  
  type KeyUsageList = js.Array[typingsSlinky.awsSdk.acmMod.KeyUsage]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DIGITAL_SIGNATURE
    - typingsSlinky.awsSdk.awsSdkStrings.NON_REPUDIATION
    - typingsSlinky.awsSdk.awsSdkStrings.KEY_ENCIPHERMENT
    - typingsSlinky.awsSdk.awsSdkStrings.DATA_ENCIPHERMENT
    - typingsSlinky.awsSdk.awsSdkStrings.KEY_AGREEMENT
    - typingsSlinky.awsSdk.awsSdkStrings.CERTIFICATE_SIGNING
    - typingsSlinky.awsSdk.awsSdkStrings.CRL_SIGNING
    - typingsSlinky.awsSdk.awsSdkStrings.ENCIPHER_ONLY
    - typingsSlinky.awsSdk.awsSdkStrings.DECIPHER_ONLY
    - typingsSlinky.awsSdk.awsSdkStrings.ANY
    - typingsSlinky.awsSdk.awsSdkStrings.CUSTOM
    - java.lang.String
  */
  type KeyUsageName = typingsSlinky.awsSdk.acmMod._KeyUsageName | java.lang.String
  
  type MaxItems = scala.Double
  
  type NextToken = java.lang.String
  
  type PassphraseBlob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.acmMod.Blob | java.lang.String
  
  type PrivateKey = java.lang.String
  
  type PrivateKeyBlob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.acmMod.Blob | java.lang.String
  
  type RecordType = typingsSlinky.awsSdk.awsSdkStrings.CNAME | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ELIGIBLE
    - typingsSlinky.awsSdk.awsSdkStrings.INELIGIBLE
    - java.lang.String
  */
  type RenewalEligibility = typingsSlinky.awsSdk.acmMod._RenewalEligibility | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_AUTO_RENEWAL
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_VALIDATION
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type RenewalStatus = typingsSlinky.awsSdk.acmMod._RenewalStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UNSPECIFIED
    - typingsSlinky.awsSdk.awsSdkStrings.KEY_COMPROMISE
    - typingsSlinky.awsSdk.awsSdkStrings.CA_COMPROMISE
    - typingsSlinky.awsSdk.awsSdkStrings.AFFILIATION_CHANGED
    - typingsSlinky.awsSdk.awsSdkStrings.SUPERCEDED
    - typingsSlinky.awsSdk.awsSdkStrings.CESSATION_OF_OPERATION
    - typingsSlinky.awsSdk.awsSdkStrings.CERTIFICATE_HOLD
    - typingsSlinky.awsSdk.awsSdkStrings.REMOVE_FROM_CRL
    - typingsSlinky.awsSdk.awsSdkStrings.PRIVILEGE_WITHDRAWN
    - typingsSlinky.awsSdk.awsSdkStrings.A_A_COMPROMISE
    - java.lang.String
  */
  type RevocationReason = typingsSlinky.awsSdk.acmMod._RevocationReason | java.lang.String
  
  type String = java.lang.String
  
  type TStamp = js.Date
  
  type TagKey = java.lang.String
  
  type TagList = js.Array[typingsSlinky.awsSdk.acmMod.Tag]
  
  type TagValue = java.lang.String
  
  type ValidationEmailList = js.Array[typingsSlinky.awsSdk.acmMod.String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EMAIL
    - typingsSlinky.awsSdk.awsSdkStrings.DNS
    - java.lang.String
  */
  type ValidationMethod = typingsSlinky.awsSdk.acmMod._ValidationMethod | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-12-08`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.acmMod._apiVersion | java.lang.String
}
