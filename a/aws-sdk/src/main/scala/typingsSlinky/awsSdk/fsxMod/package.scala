package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fsxMod {
  
  type AWSAccountId = java.lang.String
  
  type ActiveDirectoryFullyQualifiedName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FILE_SYSTEM_UPDATE
    - typingsSlinky.awsSdk.awsSdkStrings.STORAGE_OPTIMIZATION
    - typingsSlinky.awsSdk.awsSdkStrings.FILE_SYSTEM_ALIAS_ASSOCIATION
    - typingsSlinky.awsSdk.awsSdkStrings.FILE_SYSTEM_ALIAS_DISASSOCIATION
    - java.lang.String
  */
  type AdministrativeActionType = typingsSlinky.awsSdk.fsxMod._AdministrativeActionType | java.lang.String
  
  type AdministrativeActions = js.Array[typingsSlinky.awsSdk.fsxMod.AdministrativeAction]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_FAILED
    - java.lang.String
  */
  type AliasLifecycle = typingsSlinky.awsSdk.fsxMod._AliasLifecycle | java.lang.String
  
  type Aliases = js.Array[typingsSlinky.awsSdk.fsxMod.Alias]
  
  type AlternateDNSName = java.lang.String
  
  type AlternateDNSNames = js.Array[typingsSlinky.awsSdk.fsxMod.AlternateDNSName]
  
  type ArchivePath = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.NEW
    - typingsSlinky.awsSdk.awsSdkStrings.NEW_CHANGED
    - java.lang.String
  */
  type AutoImportPolicyType = typingsSlinky.awsSdk.fsxMod._AutoImportPolicyType | java.lang.String
  
  type AutomaticBackupRetentionDays = scala.Double
  
  type BackupId = java.lang.String
  
  type BackupIds = js.Array[typingsSlinky.awsSdk.fsxMod.BackupId]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.TRANSFERRING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type BackupLifecycle = typingsSlinky.awsSdk.fsxMod._BackupLifecycle | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AUTOMATIC
    - typingsSlinky.awsSdk.awsSdkStrings.USER_INITIATED
    - typingsSlinky.awsSdk.awsSdkStrings.AWS_BACKUP
    - java.lang.String
  */
  type BackupType = typingsSlinky.awsSdk.fsxMod._BackupType | java.lang.String
  
  type Backups = js.Array[typingsSlinky.awsSdk.fsxMod.Backup]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.fsxMod.ClientApiVersions
  
  type ClientRequestToken = java.lang.String
  
  type CreationTime = js.Date
  
  type DNSName = java.lang.String
  
  type DailyTime = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.MISCONFIGURED
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type DataRepositoryLifecycle = typingsSlinky.awsSdk.fsxMod._DataRepositoryLifecycle | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`file-system-id`
    - typingsSlinky.awsSdk.awsSdkStrings.`task-lifecycle`
    - java.lang.String
  */
  type DataRepositoryTaskFilterName = typingsSlinky.awsSdk.fsxMod._DataRepositoryTaskFilterName | java.lang.String
  
  type DataRepositoryTaskFilterValue = java.lang.String
  
  type DataRepositoryTaskFilterValues = js.Array[typingsSlinky.awsSdk.fsxMod.DataRepositoryTaskFilterValue]
  
  type DataRepositoryTaskFilters = js.Array[typingsSlinky.awsSdk.fsxMod.DataRepositoryTaskFilter]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.EXECUTING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELING
    - java.lang.String
  */
  type DataRepositoryTaskLifecycle = typingsSlinky.awsSdk.fsxMod._DataRepositoryTaskLifecycle | java.lang.String
  
  type DataRepositoryTaskPath = java.lang.String
  
  type DataRepositoryTaskPaths = js.Array[typingsSlinky.awsSdk.fsxMod.DataRepositoryTaskPath]
  
  type DataRepositoryTaskType = typingsSlinky.awsSdk.awsSdkStrings.EXPORT_TO_REPOSITORY | java.lang.String
  
  type DataRepositoryTasks = js.Array[typingsSlinky.awsSdk.fsxMod.DataRepositoryTask]
  
  type DirectoryId = java.lang.String
  
  type DirectoryPassword = java.lang.String
  
  type DirectoryUserName = java.lang.String
  
  type DnsIps = js.Array[typingsSlinky.awsSdk.fsxMod.IpAddress]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.READ
    - java.lang.String
  */
  type DriveCacheType = typingsSlinky.awsSdk.fsxMod._DriveCacheType | java.lang.String
  
  type EndTime = js.Date
  
  type ErrorMessage = java.lang.String
  
  type FailedCount = scala.Double
  
  type FileSystemAdministratorsGroupName = java.lang.String
  
  type FileSystemId = java.lang.String
  
  type FileSystemIds = js.Array[typingsSlinky.awsSdk.fsxMod.FileSystemId]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.MISCONFIGURED
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type FileSystemLifecycle = typingsSlinky.awsSdk.fsxMod._FileSystemLifecycle | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PATCHING
    - typingsSlinky.awsSdk.awsSdkStrings.BACKING_UP
    - java.lang.String
  */
  type FileSystemMaintenanceOperation = typingsSlinky.awsSdk.fsxMod._FileSystemMaintenanceOperation | java.lang.String
  
  type FileSystemMaintenanceOperations = js.Array[typingsSlinky.awsSdk.fsxMod.FileSystemMaintenanceOperation]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.WINDOWS
    - typingsSlinky.awsSdk.awsSdkStrings.LUSTRE
    - java.lang.String
  */
  type FileSystemType = typingsSlinky.awsSdk.fsxMod._FileSystemType | java.lang.String
  
  type FileSystems = js.Array[typingsSlinky.awsSdk.fsxMod.FileSystem]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`file-system-id`
    - typingsSlinky.awsSdk.awsSdkStrings.`backup-type`
    - typingsSlinky.awsSdk.awsSdkStrings.`file-system-type`
    - java.lang.String
  */
  type FilterName = typingsSlinky.awsSdk.fsxMod._FilterName | java.lang.String
  
  type FilterValue = java.lang.String
  
  type FilterValues = js.Array[typingsSlinky.awsSdk.fsxMod.FilterValue]
  
  type Filters = js.Array[typingsSlinky.awsSdk.fsxMod.Filter]
  
  type Flag = scala.Boolean
  
  type IpAddress = java.lang.String
  
  type KmsKeyId = java.lang.String
  
  type LastUpdatedTime = js.Date
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SCRATCH_1
    - typingsSlinky.awsSdk.awsSdkStrings.SCRATCH_2
    - typingsSlinky.awsSdk.awsSdkStrings.PERSISTENT_1
    - java.lang.String
  */
  type LustreDeploymentType = typingsSlinky.awsSdk.fsxMod._LustreDeploymentType | java.lang.String
  
  type LustreFileSystemMountName = java.lang.String
  
  type MaxResults = scala.Double
  
  type Megabytes = scala.Double
  
  type MegabytesPerSecond = scala.Double
  
  type NetworkInterfaceId = java.lang.String
  
  type NetworkInterfaceIds = js.Array[typingsSlinky.awsSdk.fsxMod.NetworkInterfaceId]
  
  type NextToken = java.lang.String
  
  type OrganizationalUnitDistinguishedName = java.lang.String
  
  type PerUnitStorageThroughput = scala.Double
  
  type ProgressPercent = scala.Double
  
  type ReportFormat = typingsSlinky.awsSdk.awsSdkStrings.REPORT_CSV_20191124 | java.lang.String
  
  type ReportScope = typingsSlinky.awsSdk.awsSdkStrings.FAILED_FILES_ONLY | java.lang.String
  
  type RequestTime = js.Date
  
  type ResourceARN = java.lang.String
  
  type SecurityGroupId = java.lang.String
  
  type SecurityGroupIds = js.Array[typingsSlinky.awsSdk.fsxMod.SecurityGroupId]
  
  type StartTime = js.Date
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATED_OPTIMIZING
    - java.lang.String
  */
  type Status = typingsSlinky.awsSdk.fsxMod._Status | java.lang.String
  
  type StorageCapacity = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SSD
    - typingsSlinky.awsSdk.awsSdkStrings.HDD
    - java.lang.String
  */
  type StorageType = typingsSlinky.awsSdk.fsxMod._StorageType | java.lang.String
  
  type SubnetId = java.lang.String
  
  type SubnetIds = js.Array[typingsSlinky.awsSdk.fsxMod.SubnetId]
  
  type SucceededCount = scala.Double
  
  type TagKey = java.lang.String
  
  type TagKeys = js.Array[typingsSlinky.awsSdk.fsxMod.TagKey]
  
  type TagValue = java.lang.String
  
  type Tags = js.Array[typingsSlinky.awsSdk.fsxMod.Tag]
  
  type TaskId = java.lang.String
  
  type TaskIds = js.Array[typingsSlinky.awsSdk.fsxMod.TaskId]
  
  type TotalCount = scala.Double
  
  type VpcId = java.lang.String
  
  type WeeklyTime = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MULTI_AZ_1
    - typingsSlinky.awsSdk.awsSdkStrings.SINGLE_AZ_1
    - typingsSlinky.awsSdk.awsSdkStrings.SINGLE_AZ_2
    - java.lang.String
  */
  type WindowsDeploymentType = typingsSlinky.awsSdk.fsxMod._WindowsDeploymentType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-03-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.fsxMod._apiVersion | java.lang.String
}
