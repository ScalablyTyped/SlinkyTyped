package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lightsailMod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.inbound__
    - typingsSlinky.awsSdk.awsSdkStrings.outbound__
    - java.lang.String
  */
  type AccessDirection = typingsSlinky.awsSdk.lightsailMod._AccessDirection | java.lang.String
  type AddOnList = js.Array[typingsSlinky.awsSdk.lightsailMod.AddOn]
  type AddOnRequestList = js.Array[typingsSlinky.awsSdk.lightsailMod.AddOnRequest]
  type AddOnType = typingsSlinky.awsSdk.awsSdkStrings.AutoSnapshot | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OK
    - typingsSlinky.awsSdk.awsSdkStrings.ALARM
    - typingsSlinky.awsSdk.awsSdkStrings.INSUFFICIENT_DATA
    - java.lang.String
  */
  type AlarmState = typingsSlinky.awsSdk.lightsailMod._AlarmState | java.lang.String
  type AlarmsList = js.Array[typingsSlinky.awsSdk.lightsailMod.Alarm]
  type AttachedDiskList = js.Array[typingsSlinky.awsSdk.lightsailMod.AttachedDisk]
  type AttachedDiskMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.lightsailMod.DiskMapList]
  type AutoSnapshotDate = java.lang.String
  type AutoSnapshotDetailsList = js.Array[typingsSlinky.awsSdk.lightsailMod.AutoSnapshotDetails]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Success_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.NotFound
    - java.lang.String
  */
  type AutoSnapshotStatus = typingsSlinky.awsSdk.lightsailMod._AutoSnapshotStatus | java.lang.String
  type AvailabilityZoneList = js.Array[typingsSlinky.awsSdk.lightsailMod.AvailabilityZone]
  type Base64 = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`dont-cache`
    - typingsSlinky.awsSdk.awsSdkStrings.cache
    - java.lang.String
  */
  type BehaviorEnum = typingsSlinky.awsSdk.lightsailMod._BehaviorEnum | java.lang.String
  type BlueprintList = js.Array[typingsSlinky.awsSdk.lightsailMod.Blueprint]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.os_
    - typingsSlinky.awsSdk.awsSdkStrings.app
    - java.lang.String
  */
  type BlueprintType = typingsSlinky.awsSdk.lightsailMod._BlueprintType | java.lang.String
  type BundleList = js.Array[typingsSlinky.awsSdk.lightsailMod.Bundle]
  type CacheBehaviorList = js.Array[typingsSlinky.awsSdk.lightsailMod.CacheBehaviorPerPath]
  type CertificateName = java.lang.String
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
  type CertificateStatus = typingsSlinky.awsSdk.lightsailMod._CertificateStatus | java.lang.String
  type CertificateStatusList = js.Array[typingsSlinky.awsSdk.lightsailMod.CertificateStatus]
  type CertificateSummaryList = js.Array[typingsSlinky.awsSdk.lightsailMod.CertificateSummary]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.lightsailMod.ClientApiVersions
  type CloudFormationStackRecordList = js.Array[typingsSlinky.awsSdk.lightsailMod.CloudFormationStackRecord]
  type CloudFormationStackRecordSourceInfoList = js.Array[typingsSlinky.awsSdk.lightsailMod.CloudFormationStackRecordSourceInfo]
  type CloudFormationStackRecordSourceType = typingsSlinky.awsSdk.awsSdkStrings.ExportSnapshotRecord | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GreaterThanOrEqualToThreshold
    - typingsSlinky.awsSdk.awsSdkStrings.GreaterThanThreshold
    - typingsSlinky.awsSdk.awsSdkStrings.LessThanThreshold
    - typingsSlinky.awsSdk.awsSdkStrings.LessThanOrEqualToThreshold
    - java.lang.String
  */
  type ComparisonOperator = typingsSlinky.awsSdk.lightsailMod._ComparisonOperator | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PendingVerification
    - typingsSlinky.awsSdk.awsSdkStrings.Valid_
    - typingsSlinky.awsSdk.awsSdkStrings.Invalid_
    - java.lang.String
  */
  type ContactMethodStatus = typingsSlinky.awsSdk.lightsailMod._ContactMethodStatus | java.lang.String
  type ContactMethodVerificationProtocol = typingsSlinky.awsSdk.awsSdkStrings.Email_ | java.lang.String
  type ContactMethodsList = js.Array[typingsSlinky.awsSdk.lightsailMod.ContactMethod]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Email_
    - typingsSlinky.awsSdk.awsSdkStrings.SMS
    - java.lang.String
  */
  type ContactProtocol = typingsSlinky.awsSdk.lightsailMod._ContactProtocol | java.lang.String
  type ContactProtocolsList = js.Array[typingsSlinky.awsSdk.lightsailMod.ContactProtocol]
  type DiskInfoList = js.Array[typingsSlinky.awsSdk.lightsailMod.DiskInfo]
  type DiskList = js.Array[typingsSlinky.awsSdk.lightsailMod.Disk]
  type DiskMapList = js.Array[typingsSlinky.awsSdk.lightsailMod.DiskMap]
  type DiskSnapshotList = js.Array[typingsSlinky.awsSdk.lightsailMod.DiskSnapshot]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.completed__
    - typingsSlinky.awsSdk.awsSdkStrings.error__
    - typingsSlinky.awsSdk.awsSdkStrings.unknown__
    - java.lang.String
  */
  type DiskSnapshotState = typingsSlinky.awsSdk.lightsailMod._DiskSnapshotState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.error__
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - typingsSlinky.awsSdk.awsSdkStrings.`in-use`
    - typingsSlinky.awsSdk.awsSdkStrings.unknown__
    - java.lang.String
  */
  type DiskState = typingsSlinky.awsSdk.lightsailMod._DiskState | java.lang.String
  type DistributionBundleList = js.Array[typingsSlinky.awsSdk.lightsailMod.DistributionBundle]
  type DistributionList = js.Array[typingsSlinky.awsSdk.lightsailMod.LightsailDistribution]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Requests_
    - typingsSlinky.awsSdk.awsSdkStrings.BytesDownloaded
    - typingsSlinky.awsSdk.awsSdkStrings.BytesUploaded
    - typingsSlinky.awsSdk.awsSdkStrings.TotalErrorRate
    - typingsSlinky.awsSdk.awsSdkStrings.Http4xxErrorRate
    - typingsSlinky.awsSdk.awsSdkStrings.Http5xxErrorRate
    - java.lang.String
  */
  type DistributionMetricName = typingsSlinky.awsSdk.lightsailMod._DistributionMetricName | java.lang.String
  type DomainEntryList = js.Array[typingsSlinky.awsSdk.lightsailMod.DomainEntry]
  type DomainEntryOptions = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type DomainEntryOptionsKeys = java.lang.String
  type DomainEntryType = java.lang.String
  type DomainList = js.Array[typingsSlinky.awsSdk.lightsailMod.Domain]
  type DomainName = java.lang.String
  type DomainNameList = js.Array[typingsSlinky.awsSdk.lightsailMod.DomainName]
  type DomainValidationRecordList = js.Array[typingsSlinky.awsSdk.lightsailMod.DomainValidationRecord]
  type EligibleToRenew = java.lang.String
  type ExportSnapshotRecordList = js.Array[typingsSlinky.awsSdk.lightsailMod.ExportSnapshotRecord]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceSnapshot
    - typingsSlinky.awsSdk.awsSdkStrings.DiskSnapshot
    - java.lang.String
  */
  type ExportSnapshotRecordSourceType = typingsSlinky.awsSdk.lightsailMod._ExportSnapshotRecordSourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.none__
    - typingsSlinky.awsSdk.awsSdkStrings.`allow-list`
    - typingsSlinky.awsSdk.awsSdkStrings.all__
    - java.lang.String
  */
  type ForwardValues = typingsSlinky.awsSdk.lightsailMod._ForwardValues | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Accept_
    - typingsSlinky.awsSdk.awsSdkStrings.`Accept-Charset`
    - typingsSlinky.awsSdk.awsSdkStrings.`Accept-Datetime`
    - typingsSlinky.awsSdk.awsSdkStrings.`Accept-Encoding`
    - typingsSlinky.awsSdk.awsSdkStrings.`Accept-Language`
    - typingsSlinky.awsSdk.awsSdkStrings.Authorization
    - typingsSlinky.awsSdk.awsSdkStrings.`CloudFront-Forwarded-Proto`
    - typingsSlinky.awsSdk.awsSdkStrings.`CloudFront-Is-Desktop-Viewer`
    - typingsSlinky.awsSdk.awsSdkStrings.`CloudFront-Is-Mobile-Viewer`
    - typingsSlinky.awsSdk.awsSdkStrings.`CloudFront-Is-SmartTV-Viewer`
    - typingsSlinky.awsSdk.awsSdkStrings.`CloudFront-Is-Tablet-Viewer`
    - typingsSlinky.awsSdk.awsSdkStrings.`CloudFront-Viewer-Country`
    - typingsSlinky.awsSdk.awsSdkStrings.Host_
    - typingsSlinky.awsSdk.awsSdkStrings.Origin
    - typingsSlinky.awsSdk.awsSdkStrings.Referer
    - java.lang.String
  */
  type HeaderEnum = typingsSlinky.awsSdk.lightsailMod._HeaderEnum | java.lang.String
  type HeaderForwardList = js.Array[typingsSlinky.awsSdk.lightsailMod.HeaderEnum]
  type HostKeysList = js.Array[typingsSlinky.awsSdk.lightsailMod.HostKeyAttributes]
  type InUseResourceCount = scala.Double
  type IncludeCertificateDetails = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ssh_
    - typingsSlinky.awsSdk.awsSdkStrings.rdp
    - java.lang.String
  */
  type InstanceAccessProtocol = typingsSlinky.awsSdk.lightsailMod._InstanceAccessProtocol | java.lang.String
  type InstanceEntryList = js.Array[typingsSlinky.awsSdk.lightsailMod.InstanceEntry]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.LbDotRegistrationInProgress
    - typingsSlinky.awsSdk.awsSdkStrings.LbDotInitialHealthChecking
    - typingsSlinky.awsSdk.awsSdkStrings.LbDotInternalError
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceDotResponseCodeMismatch
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceDotTimeout
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceDotFailedHealthChecks
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceDotNotRegistered
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceDotNotInUse
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceDotDeregistrationInProgress
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceDotInvalidState
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceDotIpUnusable
    - java.lang.String
  */
  type InstanceHealthReason = typingsSlinky.awsSdk.lightsailMod._InstanceHealthReason | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.initial_
    - typingsSlinky.awsSdk.awsSdkStrings.healthy__
    - typingsSlinky.awsSdk.awsSdkStrings.unhealthy__
    - typingsSlinky.awsSdk.awsSdkStrings.unused
    - typingsSlinky.awsSdk.awsSdkStrings.draining_
    - typingsSlinky.awsSdk.awsSdkStrings.unavailable__
    - java.lang.String
  */
  type InstanceHealthState = typingsSlinky.awsSdk.lightsailMod._InstanceHealthState | java.lang.String
  type InstanceHealthSummaryList = js.Array[typingsSlinky.awsSdk.lightsailMod.InstanceHealthSummary]
  type InstanceList = js.Array[typingsSlinky.awsSdk.lightsailMod.Instance]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CPUUtilization
    - typingsSlinky.awsSdk.awsSdkStrings.NetworkIn
    - typingsSlinky.awsSdk.awsSdkStrings.NetworkOut
    - typingsSlinky.awsSdk.awsSdkStrings.StatusCheckFailed
    - typingsSlinky.awsSdk.awsSdkStrings.StatusCheckFailed_Instance
    - typingsSlinky.awsSdk.awsSdkStrings.StatusCheckFailed_System
    - typingsSlinky.awsSdk.awsSdkStrings.BurstCapacityTime
    - typingsSlinky.awsSdk.awsSdkStrings.BurstCapacityPercentage
    - java.lang.String
  */
  type InstanceMetricName = typingsSlinky.awsSdk.lightsailMod._InstanceMetricName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.LINUX_UNIX
    - typingsSlinky.awsSdk.awsSdkStrings.WINDOWS
    - java.lang.String
  */
  type InstancePlatform = typingsSlinky.awsSdk.lightsailMod._InstancePlatform | java.lang.String
  type InstancePlatformList = js.Array[typingsSlinky.awsSdk.lightsailMod.InstancePlatform]
  type InstancePortInfoList = js.Array[typingsSlinky.awsSdk.lightsailMod.InstancePortInfo]
  type InstancePortStateList = js.Array[typingsSlinky.awsSdk.lightsailMod.InstancePortState]
  type InstanceSnapshotList = js.Array[typingsSlinky.awsSdk.lightsailMod.InstanceSnapshot]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.error__
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - java.lang.String
  */
  type InstanceSnapshotState = typingsSlinky.awsSdk.lightsailMod._InstanceSnapshotState | java.lang.String
  type IpAddress = java.lang.String
  type IpV6Address = java.lang.String
  type IsoDate = js.Date
  type IssuerCA = java.lang.String
  type KeyAlgorithm = java.lang.String
  type KeyPairList = js.Array[typingsSlinky.awsSdk.lightsailMod.KeyPair]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HealthCheckPath
    - typingsSlinky.awsSdk.awsSdkStrings.SessionStickinessEnabled
    - typingsSlinky.awsSdk.awsSdkStrings.SessionStickiness_LB_CookieDurationSeconds
    - java.lang.String
  */
  type LoadBalancerAttributeName = typingsSlinky.awsSdk.lightsailMod._LoadBalancerAttributeName | java.lang.String
  type LoadBalancerConfigurationOptions = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type LoadBalancerList = js.Array[typingsSlinky.awsSdk.lightsailMod.LoadBalancer]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ClientTLSNegotiationErrorCount
    - typingsSlinky.awsSdk.awsSdkStrings.HealthyHostCount
    - typingsSlinky.awsSdk.awsSdkStrings.UnhealthyHostCount
    - typingsSlinky.awsSdk.awsSdkStrings.HTTPCode_LB_4XX_Count
    - typingsSlinky.awsSdk.awsSdkStrings.HTTPCode_LB_5XX_Count
    - typingsSlinky.awsSdk.awsSdkStrings.HTTPCode_Instance_2XX_Count
    - typingsSlinky.awsSdk.awsSdkStrings.HTTPCode_Instance_3XX_Count
    - typingsSlinky.awsSdk.awsSdkStrings.HTTPCode_Instance_4XX_Count
    - typingsSlinky.awsSdk.awsSdkStrings.HTTPCode_Instance_5XX_Count
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceResponseTime
    - typingsSlinky.awsSdk.awsSdkStrings.RejectedConnectionCount
    - typingsSlinky.awsSdk.awsSdkStrings.RequestCount
    - java.lang.String
  */
  type LoadBalancerMetricName = typingsSlinky.awsSdk.lightsailMod._LoadBalancerMetricName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HTTP_HTTPS
    - typingsSlinky.awsSdk.awsSdkStrings.HTTP
    - java.lang.String
  */
  type LoadBalancerProtocol = typingsSlinky.awsSdk.lightsailMod._LoadBalancerProtocol | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.active__
    - typingsSlinky.awsSdk.awsSdkStrings.provisioning_
    - typingsSlinky.awsSdk.awsSdkStrings.active_impaired
    - typingsSlinky.awsSdk.awsSdkStrings.failed__
    - typingsSlinky.awsSdk.awsSdkStrings.unknown__
    - java.lang.String
  */
  type LoadBalancerState = typingsSlinky.awsSdk.lightsailMod._LoadBalancerState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_VALIDATION
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
    - java.lang.String
  */
  type LoadBalancerTlsCertificateDomainStatus = typingsSlinky.awsSdk.lightsailMod._LoadBalancerTlsCertificateDomainStatus | java.lang.String
  type LoadBalancerTlsCertificateDomainValidationOptionList = js.Array[
    typingsSlinky.awsSdk.lightsailMod.LoadBalancerTlsCertificateDomainValidationOption
  ]
  type LoadBalancerTlsCertificateDomainValidationRecordList = js.Array[
    typingsSlinky.awsSdk.lightsailMod.LoadBalancerTlsCertificateDomainValidationRecord
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NO_AVAILABLE_CONTACTS
    - typingsSlinky.awsSdk.awsSdkStrings.ADDITIONAL_VERIFICATION_REQUIRED
    - typingsSlinky.awsSdk.awsSdkStrings.DOMAIN_NOT_ALLOWED
    - typingsSlinky.awsSdk.awsSdkStrings.INVALID_PUBLIC_DOMAIN
    - typingsSlinky.awsSdk.awsSdkStrings.OTHER
    - java.lang.String
  */
  type LoadBalancerTlsCertificateFailureReason = typingsSlinky.awsSdk.lightsailMod._LoadBalancerTlsCertificateFailureReason | java.lang.String
  type LoadBalancerTlsCertificateList = js.Array[typingsSlinky.awsSdk.lightsailMod.LoadBalancerTlsCertificate]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_AUTO_RENEWAL
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_VALIDATION
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type LoadBalancerTlsCertificateRenewalStatus = typingsSlinky.awsSdk.lightsailMod._LoadBalancerTlsCertificateRenewalStatus | java.lang.String
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
  type LoadBalancerTlsCertificateRevocationReason = typingsSlinky.awsSdk.lightsailMod._LoadBalancerTlsCertificateRevocationReason | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_VALIDATION
    - typingsSlinky.awsSdk.awsSdkStrings.ISSUED
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.EXPIRED
    - typingsSlinky.awsSdk.awsSdkStrings.VALIDATION_TIMED_OUT
    - typingsSlinky.awsSdk.awsSdkStrings.REVOKED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type LoadBalancerTlsCertificateStatus = typingsSlinky.awsSdk.lightsailMod._LoadBalancerTlsCertificateStatus | java.lang.String
  type LoadBalancerTlsCertificateSummaryList = js.Array[typingsSlinky.awsSdk.lightsailMod.LoadBalancerTlsCertificateSummary]
  type LogEventList = js.Array[typingsSlinky.awsSdk.lightsailMod.LogEvent]
  type MetricDatapointList = js.Array[typingsSlinky.awsSdk.lightsailMod.MetricDatapoint]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CPUUtilization
    - typingsSlinky.awsSdk.awsSdkStrings.NetworkIn
    - typingsSlinky.awsSdk.awsSdkStrings.NetworkOut
    - typingsSlinky.awsSdk.awsSdkStrings.StatusCheckFailed
    - typingsSlinky.awsSdk.awsSdkStrings.StatusCheckFailed_Instance
    - typingsSlinky.awsSdk.awsSdkStrings.StatusCheckFailed_System
    - typingsSlinky.awsSdk.awsSdkStrings.ClientTLSNegotiationErrorCount
    - typingsSlinky.awsSdk.awsSdkStrings.HealthyHostCount
    - typingsSlinky.awsSdk.awsSdkStrings.UnhealthyHostCount
    - typingsSlinky.awsSdk.awsSdkStrings.HTTPCode_LB_4XX_Count
    - typingsSlinky.awsSdk.awsSdkStrings.HTTPCode_LB_5XX_Count
    - typingsSlinky.awsSdk.awsSdkStrings.HTTPCode_Instance_2XX_Count
    - typingsSlinky.awsSdk.awsSdkStrings.HTTPCode_Instance_3XX_Count
    - typingsSlinky.awsSdk.awsSdkStrings.HTTPCode_Instance_4XX_Count
    - typingsSlinky.awsSdk.awsSdkStrings.HTTPCode_Instance_5XX_Count
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceResponseTime
    - typingsSlinky.awsSdk.awsSdkStrings.RejectedConnectionCount
    - typingsSlinky.awsSdk.awsSdkStrings.RequestCount
    - typingsSlinky.awsSdk.awsSdkStrings.DatabaseConnections
    - typingsSlinky.awsSdk.awsSdkStrings.DiskQueueDepth
    - typingsSlinky.awsSdk.awsSdkStrings.FreeStorageSpace
    - typingsSlinky.awsSdk.awsSdkStrings.NetworkReceiveThroughput
    - typingsSlinky.awsSdk.awsSdkStrings.NetworkTransmitThroughput
    - typingsSlinky.awsSdk.awsSdkStrings.BurstCapacityTime
    - typingsSlinky.awsSdk.awsSdkStrings.BurstCapacityPercentage
    - java.lang.String
  */
  type MetricName = typingsSlinky.awsSdk.lightsailMod._MetricName | java.lang.String
  type MetricPeriod = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Minimum_
    - typingsSlinky.awsSdk.awsSdkStrings.Maximum_
    - typingsSlinky.awsSdk.awsSdkStrings.Sum_
    - typingsSlinky.awsSdk.awsSdkStrings.Average_
    - typingsSlinky.awsSdk.awsSdkStrings.SampleCount
    - java.lang.String
  */
  type MetricStatistic = typingsSlinky.awsSdk.lightsailMod._MetricStatistic | java.lang.String
  type MetricStatisticList = js.Array[typingsSlinky.awsSdk.lightsailMod.MetricStatistic]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Seconds_
    - typingsSlinky.awsSdk.awsSdkStrings.Microseconds
    - typingsSlinky.awsSdk.awsSdkStrings.Milliseconds_
    - typingsSlinky.awsSdk.awsSdkStrings.Bytes_
    - typingsSlinky.awsSdk.awsSdkStrings.Kilobytes
    - typingsSlinky.awsSdk.awsSdkStrings.Megabytes
    - typingsSlinky.awsSdk.awsSdkStrings.Gigabytes
    - typingsSlinky.awsSdk.awsSdkStrings.Terabytes_
    - typingsSlinky.awsSdk.awsSdkStrings.Bits_
    - typingsSlinky.awsSdk.awsSdkStrings.Kilobits
    - typingsSlinky.awsSdk.awsSdkStrings.Megabits
    - typingsSlinky.awsSdk.awsSdkStrings.Gigabits
    - typingsSlinky.awsSdk.awsSdkStrings.Terabits
    - typingsSlinky.awsSdk.awsSdkStrings.Percent_
    - typingsSlinky.awsSdk.awsSdkStrings.Count_
    - typingsSlinky.awsSdk.awsSdkStrings.BytesSlashSecond
    - typingsSlinky.awsSdk.awsSdkStrings.KilobytesSlashSecond
    - typingsSlinky.awsSdk.awsSdkStrings.MegabytesSlashSecond
    - typingsSlinky.awsSdk.awsSdkStrings.GigabytesSlashSecond
    - typingsSlinky.awsSdk.awsSdkStrings.TerabytesSlashSecond
    - typingsSlinky.awsSdk.awsSdkStrings.BitsSlashSecond
    - typingsSlinky.awsSdk.awsSdkStrings.KilobitsSlashSecond
    - typingsSlinky.awsSdk.awsSdkStrings.MegabitsSlashSecond
    - typingsSlinky.awsSdk.awsSdkStrings.GigabitsSlashSecond
    - typingsSlinky.awsSdk.awsSdkStrings.TerabitsSlashSecond
    - typingsSlinky.awsSdk.awsSdkStrings.CountSlashSecond
    - typingsSlinky.awsSdk.awsSdkStrings.None_
    - java.lang.String
  */
  type MetricUnit = typingsSlinky.awsSdk.lightsailMod._MetricUnit | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.tcp_
    - typingsSlinky.awsSdk.awsSdkStrings.all__
    - typingsSlinky.awsSdk.awsSdkStrings.udp_
    - typingsSlinky.awsSdk.awsSdkStrings.icmp
    - java.lang.String
  */
  type NetworkProtocol = typingsSlinky.awsSdk.lightsailMod._NetworkProtocol | java.lang.String
  type NonEmptyString = java.lang.String
  type NotificationTriggerList = js.Array[typingsSlinky.awsSdk.lightsailMod.AlarmState]
  type OperationList = js.Array[typingsSlinky.awsSdk.lightsailMod.Operation]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NotStarted
    - typingsSlinky.awsSdk.awsSdkStrings.Started_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Completed_
    - typingsSlinky.awsSdk.awsSdkStrings.Succeeded_
    - java.lang.String
  */
  type OperationStatus = typingsSlinky.awsSdk.lightsailMod._OperationStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DeleteKnownHostKeys
    - typingsSlinky.awsSdk.awsSdkStrings.DeleteInstance
    - typingsSlinky.awsSdk.awsSdkStrings.CreateInstance
    - typingsSlinky.awsSdk.awsSdkStrings.StopInstance
    - typingsSlinky.awsSdk.awsSdkStrings.StartInstance
    - typingsSlinky.awsSdk.awsSdkStrings.RebootInstance
    - typingsSlinky.awsSdk.awsSdkStrings.OpenInstancePublicPorts
    - typingsSlinky.awsSdk.awsSdkStrings.PutInstancePublicPorts
    - typingsSlinky.awsSdk.awsSdkStrings.CloseInstancePublicPorts
    - typingsSlinky.awsSdk.awsSdkStrings.AllocateStaticIp
    - typingsSlinky.awsSdk.awsSdkStrings.ReleaseStaticIp
    - typingsSlinky.awsSdk.awsSdkStrings.AttachStaticIp
    - typingsSlinky.awsSdk.awsSdkStrings.DetachStaticIp
    - typingsSlinky.awsSdk.awsSdkStrings.UpdateDomainEntry
    - typingsSlinky.awsSdk.awsSdkStrings.DeleteDomainEntry
    - typingsSlinky.awsSdk.awsSdkStrings.CreateDomain
    - typingsSlinky.awsSdk.awsSdkStrings.DeleteDomain
    - typingsSlinky.awsSdk.awsSdkStrings.CreateInstanceSnapshot
    - typingsSlinky.awsSdk.awsSdkStrings.DeleteInstanceSnapshot
    - typingsSlinky.awsSdk.awsSdkStrings.CreateInstancesFromSnapshot
    - typingsSlinky.awsSdk.awsSdkStrings.CreateLoadBalancer
    - typingsSlinky.awsSdk.awsSdkStrings.DeleteLoadBalancer
    - typingsSlinky.awsSdk.awsSdkStrings.AttachInstancesToLoadBalancer
    - typingsSlinky.awsSdk.awsSdkStrings.DetachInstancesFromLoadBalancer
    - typingsSlinky.awsSdk.awsSdkStrings.UpdateLoadBalancerAttribute
    - typingsSlinky.awsSdk.awsSdkStrings.CreateLoadBalancerTlsCertificate
    - typingsSlinky.awsSdk.awsSdkStrings.DeleteLoadBalancerTlsCertificate
    - typingsSlinky.awsSdk.awsSdkStrings.AttachLoadBalancerTlsCertificate
    - typingsSlinky.awsSdk.awsSdkStrings.CreateDisk
    - typingsSlinky.awsSdk.awsSdkStrings.DeleteDisk
    - typingsSlinky.awsSdk.awsSdkStrings.AttachDisk
    - typingsSlinky.awsSdk.awsSdkStrings.DetachDisk
    - typingsSlinky.awsSdk.awsSdkStrings.CreateDiskSnapshot
    - typingsSlinky.awsSdk.awsSdkStrings.DeleteDiskSnapshot
    - typingsSlinky.awsSdk.awsSdkStrings.CreateDiskFromSnapshot
    - typingsSlinky.awsSdk.awsSdkStrings.CreateRelationalDatabase
    - typingsSlinky.awsSdk.awsSdkStrings.UpdateRelationalDatabase
    - typingsSlinky.awsSdk.awsSdkStrings.DeleteRelationalDatabase
    - typingsSlinky.awsSdk.awsSdkStrings.CreateRelationalDatabaseFromSnapshot
    - typingsSlinky.awsSdk.awsSdkStrings.CreateRelationalDatabaseSnapshot
    - typingsSlinky.awsSdk.awsSdkStrings.DeleteRelationalDatabaseSnapshot
    - typingsSlinky.awsSdk.awsSdkStrings.UpdateRelationalDatabaseParameters
    - typingsSlinky.awsSdk.awsSdkStrings.StartRelationalDatabase
    - typingsSlinky.awsSdk.awsSdkStrings.RebootRelationalDatabase
    - typingsSlinky.awsSdk.awsSdkStrings.StopRelationalDatabase
    - typingsSlinky.awsSdk.awsSdkStrings.EnableAddOn
    - typingsSlinky.awsSdk.awsSdkStrings.DisableAddOn
    - typingsSlinky.awsSdk.awsSdkStrings.PutAlarm
    - typingsSlinky.awsSdk.awsSdkStrings.GetAlarms
    - typingsSlinky.awsSdk.awsSdkStrings.DeleteAlarm
    - typingsSlinky.awsSdk.awsSdkStrings.TestAlarm
    - typingsSlinky.awsSdk.awsSdkStrings.CreateContactMethod
    - typingsSlinky.awsSdk.awsSdkStrings.GetContactMethods
    - typingsSlinky.awsSdk.awsSdkStrings.SendContactMethodVerification
    - typingsSlinky.awsSdk.awsSdkStrings.DeleteContactMethod
    - typingsSlinky.awsSdk.awsSdkStrings.CreateDistribution
    - typingsSlinky.awsSdk.awsSdkStrings.UpdateDistribution
    - typingsSlinky.awsSdk.awsSdkStrings.DeleteDistribution
    - typingsSlinky.awsSdk.awsSdkStrings.ResetDistributionCache
    - typingsSlinky.awsSdk.awsSdkStrings.AttachCertificateToDistribution
    - typingsSlinky.awsSdk.awsSdkStrings.DetachCertificateFromDistribution
    - typingsSlinky.awsSdk.awsSdkStrings.UpdateDistributionBundle
    - typingsSlinky.awsSdk.awsSdkStrings.CreateCertificate
    - typingsSlinky.awsSdk.awsSdkStrings.DeleteCertificate
    - java.lang.String
  */
  type OperationType = typingsSlinky.awsSdk.lightsailMod._OperationType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`http-only`
    - typingsSlinky.awsSdk.awsSdkStrings.`https-only`
    - java.lang.String
  */
  type OriginProtocolPolicyEnum = typingsSlinky.awsSdk.lightsailMod._OriginProtocolPolicyEnum | java.lang.String
  type PendingMaintenanceActionList = js.Array[typingsSlinky.awsSdk.lightsailMod.PendingMaintenanceAction]
  type Port = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Public_
    - typingsSlinky.awsSdk.awsSdkStrings.Private_
    - java.lang.String
  */
  type PortAccessType = typingsSlinky.awsSdk.lightsailMod._PortAccessType | java.lang.String
  type PortInfoList = js.Array[typingsSlinky.awsSdk.lightsailMod.PortInfo]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT
    - typingsSlinky.awsSdk.awsSdkStrings.INSTANCE
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.CLOSED
    - java.lang.String
  */
  type PortInfoSourceType = typingsSlinky.awsSdk.lightsailMod._PortInfoSourceType | java.lang.String
  type PortList = js.Array[typingsSlinky.awsSdk.lightsailMod.Port]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.open__
    - typingsSlinky.awsSdk.awsSdkStrings.closed__
    - java.lang.String
  */
  type PortState = typingsSlinky.awsSdk.lightsailMod._PortState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Started_
    - typingsSlinky.awsSdk.awsSdkStrings.Succeeded_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type RecordState = typingsSlinky.awsSdk.lightsailMod._RecordState | java.lang.String
  type RegionList = js.Array[typingsSlinky.awsSdk.lightsailMod.Region]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`us-east-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-east-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-west-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-west-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-west-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-west-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-west-3`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-central-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ca-central-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-south-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-southeast-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-southeast-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-northeast-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-northeast-2`
    - java.lang.String
  */
  type RegionName = typingsSlinky.awsSdk.lightsailMod._RegionName | java.lang.String
  type RelationalDatabaseBlueprintList = js.Array[typingsSlinky.awsSdk.lightsailMod.RelationalDatabaseBlueprint]
  type RelationalDatabaseBundleList = js.Array[typingsSlinky.awsSdk.lightsailMod.RelationalDatabaseBundle]
  type RelationalDatabaseEngine = typingsSlinky.awsSdk.awsSdkStrings.mysql_ | java.lang.String
  type RelationalDatabaseEventList = js.Array[typingsSlinky.awsSdk.lightsailMod.RelationalDatabaseEvent]
  type RelationalDatabaseList = js.Array[typingsSlinky.awsSdk.lightsailMod.RelationalDatabase]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CPUUtilization
    - typingsSlinky.awsSdk.awsSdkStrings.DatabaseConnections
    - typingsSlinky.awsSdk.awsSdkStrings.DiskQueueDepth
    - typingsSlinky.awsSdk.awsSdkStrings.FreeStorageSpace
    - typingsSlinky.awsSdk.awsSdkStrings.NetworkReceiveThroughput
    - typingsSlinky.awsSdk.awsSdkStrings.NetworkTransmitThroughput
    - java.lang.String
  */
  type RelationalDatabaseMetricName = typingsSlinky.awsSdk.lightsailMod._RelationalDatabaseMetricName | java.lang.String
  type RelationalDatabaseParameterList = js.Array[typingsSlinky.awsSdk.lightsailMod.RelationalDatabaseParameter]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CURRENT
    - typingsSlinky.awsSdk.awsSdkStrings.PREVIOUS
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type RelationalDatabasePasswordVersion = typingsSlinky.awsSdk.lightsailMod._RelationalDatabasePasswordVersion | java.lang.String
  type RelationalDatabaseSnapshotList = js.Array[typingsSlinky.awsSdk.lightsailMod.RelationalDatabaseSnapshot]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PendingAutoRenewal
    - typingsSlinky.awsSdk.awsSdkStrings.PendingValidation
    - typingsSlinky.awsSdk.awsSdkStrings.Success_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type RenewalStatus = typingsSlinky.awsSdk.lightsailMod._RenewalStatus | java.lang.String
  type RenewalStatusReason = java.lang.String
  type RequestFailureReason = java.lang.String
  type ResourceArn = java.lang.String
  type ResourceName = java.lang.String
  type ResourceNameList = js.Array[typingsSlinky.awsSdk.lightsailMod.ResourceName]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Instance_
    - typingsSlinky.awsSdk.awsSdkStrings.StaticIp
    - typingsSlinky.awsSdk.awsSdkStrings.KeyPair
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceSnapshot
    - typingsSlinky.awsSdk.awsSdkStrings.Domain_
    - typingsSlinky.awsSdk.awsSdkStrings.PeeredVpc
    - typingsSlinky.awsSdk.awsSdkStrings.LoadBalancer
    - typingsSlinky.awsSdk.awsSdkStrings.LoadBalancerTlsCertificate
    - typingsSlinky.awsSdk.awsSdkStrings.Disk
    - typingsSlinky.awsSdk.awsSdkStrings.DiskSnapshot
    - typingsSlinky.awsSdk.awsSdkStrings.RelationalDatabase
    - typingsSlinky.awsSdk.awsSdkStrings.RelationalDatabaseSnapshot
    - typingsSlinky.awsSdk.awsSdkStrings.ExportSnapshotRecord
    - typingsSlinky.awsSdk.awsSdkStrings.CloudFormationStackRecord
    - typingsSlinky.awsSdk.awsSdkStrings.Alarm_
    - typingsSlinky.awsSdk.awsSdkStrings.ContactMethod
    - typingsSlinky.awsSdk.awsSdkStrings.Distribution
    - typingsSlinky.awsSdk.awsSdkStrings.Certificate_
    - java.lang.String
  */
  type ResourceType = typingsSlinky.awsSdk.lightsailMod._ResourceType | java.lang.String
  type RevocationReason = java.lang.String
  type SensitiveString = java.lang.String
  type SerialNumber = java.lang.String
  type StaticIpList = js.Array[typingsSlinky.awsSdk.lightsailMod.StaticIp]
  type StringList = js.Array[java.lang.String]
  type StringMax256 = java.lang.String
  type SubjectAlternativeNameList = js.Array[typingsSlinky.awsSdk.lightsailMod.DomainName]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.lightsailMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.lightsailMod.Tag]
  type TagValue = java.lang.String
  type TimeOfDay = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.breaching
    - typingsSlinky.awsSdk.awsSdkStrings.notBreaching
    - typingsSlinky.awsSdk.awsSdkStrings.ignore__
    - typingsSlinky.awsSdk.awsSdkStrings.missing_
    - java.lang.String
  */
  type TreatMissingData = typingsSlinky.awsSdk.lightsailMod._TreatMissingData | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-11-28`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.lightsailMod._apiVersion | java.lang.String
  type double = scala.Double
  type float = scala.Double
  type integer = scala.Double
  type long = scala.Double
  type timestamp = js.Date
}
