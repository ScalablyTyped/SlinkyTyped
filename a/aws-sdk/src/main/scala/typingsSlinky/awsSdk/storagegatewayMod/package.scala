package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object storagegatewayMod {
  
  type ActivationKey = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACCESS_DENIED
    - typingsSlinky.awsSdk.awsSdkStrings.DETACHED
    - typingsSlinky.awsSdk.awsSdkStrings.JOINED
    - typingsSlinky.awsSdk.awsSdkStrings.JOINING
    - typingsSlinky.awsSdk.awsSdkStrings.NETWORK_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.TIMEOUT
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN_ERROR
    - java.lang.String
  */
  type ActiveDirectoryStatus = typingsSlinky.awsSdk.storagegatewayMod._ActiveDirectoryStatus | java.lang.String
  
  type AuditDestinationARN = java.lang.String
  
  type Authentication = java.lang.String
  
  type AutomaticTapeCreationPolicyInfos = js.Array[typingsSlinky.awsSdk.storagegatewayMod.AutomaticTapeCreationPolicyInfo]
  
  type AutomaticTapeCreationRules = js.Array[typingsSlinky.awsSdk.storagegatewayMod.AutomaticTapeCreationRule]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type AvailabilityMonitorTestStatus = typingsSlinky.awsSdk.storagegatewayMod._AvailabilityMonitorTestStatus | java.lang.String
  
  type BandwidthDownloadRateLimit = scala.Double
  
  type BandwidthRateLimitIntervals = js.Array[typingsSlinky.awsSdk.storagegatewayMod.BandwidthRateLimitInterval]
  
  type BandwidthType = java.lang.String
  
  type BandwidthUploadRateLimit = scala.Double
  
  type Boolean = scala.Boolean
  
  type CacheStaleTimeoutInSeconds = scala.Double
  
  type CachediSCSIVolumes = js.Array[typingsSlinky.awsSdk.storagegatewayMod.CachediSCSIVolume]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ClientSpecified
    - typingsSlinky.awsSdk.awsSdkStrings.CaseSensitive
    - java.lang.String
  */
  type CaseSensitivity = typingsSlinky.awsSdk.storagegatewayMod._CaseSensitivity | java.lang.String
  
  type ChapCredentials = js.Array[typingsSlinky.awsSdk.storagegatewayMod.ChapInfo]
  
  type ChapSecret = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.storagegatewayMod.ClientApiVersions
  
  type ClientToken = java.lang.String
  
  type CloudWatchLogGroupARN = java.lang.String
  
  type CreatedDate = js.Date
  
  type DayOfMonth = scala.Double
  
  type DayOfWeek = scala.Double
  
  type DaysOfWeek = js.Array[typingsSlinky.awsSdk.storagegatewayMod.DayOfWeek]
  
  type DeprecationDate = java.lang.String
  
  type Description = java.lang.String
  
  type DeviceType = java.lang.String
  
  type DiskAllocationType = java.lang.String
  
  type DiskAttribute = java.lang.String
  
  type DiskAttributeList = js.Array[typingsSlinky.awsSdk.storagegatewayMod.DiskAttribute]
  
  type DiskId = java.lang.String
  
  type DiskIds = js.Array[typingsSlinky.awsSdk.storagegatewayMod.DiskId]
  
  type Disks = js.Array[typingsSlinky.awsSdk.storagegatewayMod.Disk]
  
  type DomainName = java.lang.String
  
  type DomainUserName = java.lang.String
  
  type DomainUserPassword = java.lang.String
  
  type DoubleObject = scala.Double
  
  type Ec2InstanceId = java.lang.String
  
  type Ec2InstanceRegion = java.lang.String
  
  type EndpointType = java.lang.String
  
  type FileShareARN = java.lang.String
  
  type FileShareARNList = js.Array[typingsSlinky.awsSdk.storagegatewayMod.FileShareARN]
  
  type FileShareClientList = js.Array[typingsSlinky.awsSdk.storagegatewayMod.IPV4AddressCIDR]
  
  type FileShareId = java.lang.String
  
  type FileShareInfoList = js.Array[typingsSlinky.awsSdk.storagegatewayMod.FileShareInfo]
  
  type FileShareName = java.lang.String
  
  type FileShareStatus = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NFS
    - typingsSlinky.awsSdk.awsSdkStrings.SMB
    - java.lang.String
  */
  type FileShareType = typingsSlinky.awsSdk.storagegatewayMod._FileShareType | java.lang.String
  
  type FileShareUser = java.lang.String
  
  type FileShareUserList = js.Array[typingsSlinky.awsSdk.storagegatewayMod.FileShareUser]
  
  type Folder = java.lang.String
  
  type FolderList = js.Array[typingsSlinky.awsSdk.storagegatewayMod.Folder]
  
  type GatewayARN = java.lang.String
  
  type GatewayId = java.lang.String
  
  type GatewayName = java.lang.String
  
  type GatewayNetworkInterfaces = js.Array[typingsSlinky.awsSdk.storagegatewayMod.NetworkInterface]
  
  type GatewayOperationalState = java.lang.String
  
  type GatewayState = java.lang.String
  
  type GatewayTimezone = java.lang.String
  
  type GatewayType = java.lang.String
  
  type Gateways = js.Array[typingsSlinky.awsSdk.storagegatewayMod.GatewayInfo]
  
  type Host = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.VMWARE
    - typingsSlinky.awsSdk.awsSdkStrings.`HYPER-V`
    - typingsSlinky.awsSdk.awsSdkStrings.EC2
    - typingsSlinky.awsSdk.awsSdkStrings.KVM
    - typingsSlinky.awsSdk.awsSdkStrings.OTHER
    - java.lang.String
  */
  type HostEnvironment = typingsSlinky.awsSdk.storagegatewayMod._HostEnvironment | java.lang.String
  
  type Hosts = js.Array[typingsSlinky.awsSdk.storagegatewayMod.Host]
  
  type HourOfDay = scala.Double
  
  type IPV4AddressCIDR = java.lang.String
  
  type Initiator = java.lang.String
  
  type Initiators = js.Array[typingsSlinky.awsSdk.storagegatewayMod.Initiator]
  
  type IqnName = java.lang.String
  
  type KMSKey = java.lang.String
  
  type LastSoftwareUpdate = java.lang.String
  
  type LocalConsolePassword = java.lang.String
  
  type LocationARN = java.lang.String
  
  type Marker = java.lang.String
  
  type MediumChangerType = java.lang.String
  
  type MinimumNumTapes = scala.Double
  
  type MinuteOfHour = scala.Double
  
  type NFSFileShareInfoList = js.Array[typingsSlinky.awsSdk.storagegatewayMod.NFSFileShareInfo]
  
  type NetworkInterfaceId = java.lang.String
  
  type NextUpdateAvailabilityDate = java.lang.String
  
  type NotificationId = java.lang.String
  
  type NotificationPolicy = java.lang.String
  
  type NumTapesToCreate = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.private__
    - typingsSlinky.awsSdk.awsSdkStrings.`public-read`
    - typingsSlinky.awsSdk.awsSdkStrings.`public-read-write`
    - typingsSlinky.awsSdk.awsSdkStrings.`authenticated-read`
    - typingsSlinky.awsSdk.awsSdkStrings.`bucket-owner-read`
    - typingsSlinky.awsSdk.awsSdkStrings.`bucket-owner-full-control`
    - typingsSlinky.awsSdk.awsSdkStrings.`aws-exec-read`
    - java.lang.String
  */
  type ObjectACL = typingsSlinky.awsSdk.storagegatewayMod._ObjectACL | java.lang.String
  
  type OrganizationalUnit = java.lang.String
  
  type Path = java.lang.String
  
  type PermissionId = scala.Double
  
  type PermissionMode = java.lang.String
  
  type PoolARN = java.lang.String
  
  type PoolARNs = js.Array[typingsSlinky.awsSdk.storagegatewayMod.PoolARN]
  
  type PoolId = java.lang.String
  
  type PoolInfos = js.Array[typingsSlinky.awsSdk.storagegatewayMod.PoolInfo]
  
  type PoolName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type PoolStatus = typingsSlinky.awsSdk.storagegatewayMod._PoolStatus | java.lang.String
  
  type PositiveIntObject = scala.Double
  
  type RecurrenceInHours = scala.Double
  
  type RegionId = java.lang.String
  
  type ResourceARN = java.lang.String
  
  type RetentionLockTimeInDays = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLIANCE
    - typingsSlinky.awsSdk.awsSdkStrings.GOVERNANCE
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type RetentionLockType = typingsSlinky.awsSdk.storagegatewayMod._RetentionLockType | java.lang.String
  
  type Role = java.lang.String
  
  type SMBFileShareInfoList = js.Array[typingsSlinky.awsSdk.storagegatewayMod.SMBFileShareInfo]
  
  type SMBGuestPassword = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ClientSpecified
    - typingsSlinky.awsSdk.awsSdkStrings.MandatorySigning
    - typingsSlinky.awsSdk.awsSdkStrings.MandatoryEncryption
    - java.lang.String
  */
  type SMBSecurityStrategy = typingsSlinky.awsSdk.storagegatewayMod._SMBSecurityStrategy | java.lang.String
  
  type SnapshotDescription = java.lang.String
  
  type SnapshotId = java.lang.String
  
  type SoftwareUpdatesEndDate = java.lang.String
  
  type Squash = java.lang.String
  
  type StorageClass = java.lang.String
  
  type StorediSCSIVolumes = js.Array[typingsSlinky.awsSdk.storagegatewayMod.StorediSCSIVolume]
  
  type TagKey = java.lang.String
  
  type TagKeys = js.Array[typingsSlinky.awsSdk.storagegatewayMod.TagKey]
  
  type TagValue = java.lang.String
  
  type Tags = js.Array[typingsSlinky.awsSdk.storagegatewayMod.Tag]
  
  type TapeARN = java.lang.String
  
  type TapeARNs = js.Array[typingsSlinky.awsSdk.storagegatewayMod.TapeARN]
  
  type TapeArchiveStatus = java.lang.String
  
  type TapeArchives = js.Array[typingsSlinky.awsSdk.storagegatewayMod.TapeArchive]
  
  type TapeBarcode = java.lang.String
  
  type TapeBarcodePrefix = java.lang.String
  
  type TapeDriveType = java.lang.String
  
  type TapeInfos = js.Array[typingsSlinky.awsSdk.storagegatewayMod.TapeInfo]
  
  type TapeRecoveryPointInfos = js.Array[typingsSlinky.awsSdk.storagegatewayMod.TapeRecoveryPointInfo]
  
  type TapeRecoveryPointStatus = java.lang.String
  
  type TapeSize = scala.Double
  
  type TapeStatus = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DEEP_ARCHIVE
    - typingsSlinky.awsSdk.awsSdkStrings.GLACIER
    - java.lang.String
  */
  type TapeStorageClass = typingsSlinky.awsSdk.storagegatewayMod._TapeStorageClass | java.lang.String
  
  type TapeUsage = scala.Double
  
  type Tapes = js.Array[typingsSlinky.awsSdk.storagegatewayMod.Tape]
  
  type TargetARN = java.lang.String
  
  type TargetName = java.lang.String
  
  type Time = js.Date
  
  type TimeoutInSeconds = scala.Double
  
  type VTLDeviceARN = java.lang.String
  
  type VTLDeviceARNs = js.Array[typingsSlinky.awsSdk.storagegatewayMod.VTLDeviceARN]
  
  type VTLDeviceProductIdentifier = java.lang.String
  
  type VTLDeviceType = java.lang.String
  
  type VTLDeviceVendor = java.lang.String
  
  type VTLDevices = js.Array[typingsSlinky.awsSdk.storagegatewayMod.VTLDevice]
  
  type VolumeARN = java.lang.String
  
  type VolumeARNs = js.Array[typingsSlinky.awsSdk.storagegatewayMod.VolumeARN]
  
  type VolumeAttachmentStatus = java.lang.String
  
  type VolumeId = java.lang.String
  
  type VolumeInfos = js.Array[typingsSlinky.awsSdk.storagegatewayMod.VolumeInfo]
  
  type VolumeRecoveryPointInfos = js.Array[typingsSlinky.awsSdk.storagegatewayMod.VolumeRecoveryPointInfo]
  
  type VolumeStatus = java.lang.String
  
  type VolumeType = java.lang.String
  
  type VolumeUsedInBytes = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2013-06-30`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.storagegatewayMod._apiVersion | java.lang.String
  
  type double = scala.Double
  
  type integer = scala.Double
  
  type long = scala.Double
}
