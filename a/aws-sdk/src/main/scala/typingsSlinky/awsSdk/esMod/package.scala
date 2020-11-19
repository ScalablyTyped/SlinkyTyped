package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object esMod {
  
  type ARN = java.lang.String
  
  type AdditionalLimitList = js.Array[typingsSlinky.awsSdk.esMod.AdditionalLimit]
  
  type AdvancedOptions = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.esMod.String]
  
  type Boolean = scala.Boolean
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.esMod.ClientApiVersions
  
  type CloudWatchLogsLogGroupArn = java.lang.String
  
  type CompatibleElasticsearchVersionsList = js.Array[typingsSlinky.awsSdk.esMod.CompatibleVersionsMap]
  
  type ConnectionAlias = java.lang.String
  
  type CreatedAt = js.Date
  
  type CrossClusterSearchConnectionId = java.lang.String
  
  type CrossClusterSearchConnectionStatusMessage = java.lang.String
  
  type DeploymentCloseDateTimeStamp = js.Date
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_UPDATE
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_ELIGIBLE
    - typingsSlinky.awsSdk.awsSdkStrings.ELIGIBLE
    - java.lang.String
  */
  type DeploymentStatus = typingsSlinky.awsSdk.esMod._DeploymentStatus | java.lang.String
  
  type DescribePackagesFilterList = js.Array[typingsSlinky.awsSdk.esMod.DescribePackagesFilter]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PackageID
    - typingsSlinky.awsSdk.awsSdkStrings.PackageName
    - typingsSlinky.awsSdk.awsSdkStrings.PackageStatus
    - java.lang.String
  */
  type DescribePackagesFilterName = typingsSlinky.awsSdk.esMod._DescribePackagesFilterName | java.lang.String
  
  type DescribePackagesFilterValue = java.lang.String
  
  type DescribePackagesFilterValues = js.Array[typingsSlinky.awsSdk.esMod.DescribePackagesFilterValue]
  
  type DomainId = java.lang.String
  
  type DomainInfoList = js.Array[typingsSlinky.awsSdk.esMod.DomainInfo]
  
  type DomainName = java.lang.String
  
  type DomainNameList = js.Array[typingsSlinky.awsSdk.esMod.DomainName]
  
  type DomainPackageDetailsList = js.Array[typingsSlinky.awsSdk.esMod.DomainPackageDetails]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ASSOCIATING
    - typingsSlinky.awsSdk.awsSdkStrings.ASSOCIATION_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DISSOCIATING
    - typingsSlinky.awsSdk.awsSdkStrings.DISSOCIATION_FAILED
    - java.lang.String
  */
  type DomainPackageStatus = typingsSlinky.awsSdk.esMod._DomainPackageStatus | java.lang.String
  
  type Double = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.m3DotmediumDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.m3DotlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.m3DotxlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.m3Dot2xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.m4DotlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.m4DotxlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.m4Dot2xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.m4Dot4xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.m4Dot10xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.m5DotlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.m5DotxlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dot2xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dot4xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dot12xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.r5DotlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.r5DotxlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.r5Dot2xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.r5Dot4xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.r5Dot12xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.c5DotlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.c5DotxlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.c5Dot2xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.c5Dot4xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.c5Dot9xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.c5Dot18xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.ultrawarm1DotmediumDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.ultrawarm1DotlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.t2DotmicroDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.t2DotsmallDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.t2DotmediumDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.r3DotlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.r3DotxlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.r3Dot2xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.r3Dot4xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.r3Dot8xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.i2DotxlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.i2Dot2xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.d2DotxlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.d2Dot2xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.d2Dot4xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.d2Dot8xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.c4DotlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.c4DotxlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.c4Dot2xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.c4Dot4xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.c4Dot8xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.r4DotlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.r4DotxlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.r4Dot2xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.r4Dot4xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.r4Dot8xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.r4Dot16xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.i3DotlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.i3DotxlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.i3Dot2xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.i3Dot4xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.i3Dot8xlargeDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.i3Dot16xlargeDotelasticsearch
    - java.lang.String
  */
  type ESPartitionInstanceType = typingsSlinky.awsSdk.esMod._ESPartitionInstanceType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ultrawarm1DotmediumDotelasticsearch
    - typingsSlinky.awsSdk.awsSdkStrings.ultrawarm1DotlargeDotelasticsearch
    - java.lang.String
  */
  type ESWarmPartitionInstanceType = typingsSlinky.awsSdk.esMod._ESWarmPartitionInstanceType | java.lang.String
  
  type ElasticsearchDomainStatusList = js.Array[typingsSlinky.awsSdk.esMod.ElasticsearchDomainStatus]
  
  type ElasticsearchInstanceTypeList = js.Array[typingsSlinky.awsSdk.esMod.ESPartitionInstanceType]
  
  type ElasticsearchVersionList = js.Array[typingsSlinky.awsSdk.esMod.ElasticsearchVersionString]
  
  type ElasticsearchVersionString = java.lang.String
  
  type EndpointsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.esMod.ServiceUrl]
  
  type ErrorMessage = java.lang.String
  
  type ErrorType = java.lang.String
  
  type FilterList = js.Array[typingsSlinky.awsSdk.esMod.Filter]
  
  type GUID = java.lang.String
  
  type IdentityPoolId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_ACCEPTANCE
    - typingsSlinky.awsSdk.awsSdkStrings.APPROVED
    - typingsSlinky.awsSdk.awsSdkStrings.REJECTING
    - typingsSlinky.awsSdk.awsSdkStrings.REJECTED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type InboundCrossClusterSearchConnectionStatusCode = typingsSlinky.awsSdk.esMod._InboundCrossClusterSearchConnectionStatusCode | java.lang.String
  
  type InboundCrossClusterSearchConnections = js.Array[typingsSlinky.awsSdk.esMod.InboundCrossClusterSearchConnection]
  
  type InstanceCount = scala.Double
  
  type InstanceRole = java.lang.String
  
  type Integer = scala.Double
  
  type IntegerClass = scala.Double
  
  type Issue = java.lang.String
  
  type Issues = js.Array[typingsSlinky.awsSdk.esMod.Issue]
  
  type KmsKeyId = java.lang.String
  
  type LastUpdated = js.Date
  
  type LimitName = java.lang.String
  
  type LimitValue = java.lang.String
  
  type LimitValueList = js.Array[typingsSlinky.awsSdk.esMod.LimitValue]
  
  type LimitsByRole = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.esMod.Limits]
  
  type LogPublishingOptions = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.esMod.LogPublishingOption]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INDEX_SLOW_LOGS
    - typingsSlinky.awsSdk.awsSdkStrings.SEARCH_SLOW_LOGS
    - typingsSlinky.awsSdk.awsSdkStrings.ES_APPLICATION_LOGS
    - java.lang.String
  */
  type LogType = typingsSlinky.awsSdk.esMod._LogType | java.lang.String
  
  type MaxResults = scala.Double
  
  type MaximumInstanceCount = scala.Double
  
  type MinimumInstanceCount = scala.Double
  
  type NextToken = java.lang.String
  
  type NonEmptyString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RequiresIndexDocuments
    - typingsSlinky.awsSdk.awsSdkStrings.Processing_
    - typingsSlinky.awsSdk.awsSdkStrings.Active_
    - java.lang.String
  */
  type OptionState = typingsSlinky.awsSdk.esMod._OptionState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_ACCEPTANCE
    - typingsSlinky.awsSdk.awsSdkStrings.VALIDATING
    - typingsSlinky.awsSdk.awsSdkStrings.VALIDATION_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.PROVISIONING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.REJECTED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type OutboundCrossClusterSearchConnectionStatusCode = typingsSlinky.awsSdk.esMod._OutboundCrossClusterSearchConnectionStatusCode | java.lang.String
  
  type OutboundCrossClusterSearchConnections = js.Array[typingsSlinky.awsSdk.esMod.OutboundCrossClusterSearchConnection]
  
  type OwnerId = java.lang.String
  
  type PackageDescription = java.lang.String
  
  type PackageDetailsList = js.Array[typingsSlinky.awsSdk.esMod.PackageDetails]
  
  type PackageID = java.lang.String
  
  type PackageName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.COPYING
    - typingsSlinky.awsSdk.awsSdkStrings.COPY_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.VALIDATING
    - typingsSlinky.awsSdk.awsSdkStrings.VALIDATION_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_FAILED
    - java.lang.String
  */
  type PackageStatus = typingsSlinky.awsSdk.esMod._PackageStatus | java.lang.String
  
  type PackageType = typingsSlinky.awsSdk.awsSdkStrings.`TXT-DICTIONARY` | java.lang.String
  
  type Password = java.lang.String
  
  type PolicyDocument = java.lang.String
  
  type RecurringChargeList = js.Array[typingsSlinky.awsSdk.esMod.RecurringCharge]
  
  type ReferencePath = java.lang.String
  
  type Region = java.lang.String
  
  type ReservationToken = java.lang.String
  
  type ReservedElasticsearchInstanceList = js.Array[typingsSlinky.awsSdk.esMod.ReservedElasticsearchInstance]
  
  type ReservedElasticsearchInstanceOfferingList = js.Array[typingsSlinky.awsSdk.esMod.ReservedElasticsearchInstanceOffering]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALL_UPFRONT
    - typingsSlinky.awsSdk.awsSdkStrings.PARTIAL_UPFRONT
    - typingsSlinky.awsSdk.awsSdkStrings.NO_UPFRONT
    - java.lang.String
  */
  type ReservedElasticsearchInstancePaymentOption = typingsSlinky.awsSdk.esMod._ReservedElasticsearchInstancePaymentOption | java.lang.String
  
  type RoleArn = java.lang.String
  
  type S3BucketName = java.lang.String
  
  type S3Key = java.lang.String
  
  type ServiceUrl = java.lang.String
  
  type StartTimestamp = js.Date
  
  type StorageSubTypeName = java.lang.String
  
  type StorageTypeLimitList = js.Array[typingsSlinky.awsSdk.esMod.StorageTypeLimit]
  
  type StorageTypeList = js.Array[typingsSlinky.awsSdk.esMod.StorageType]
  
  type StorageTypeName = java.lang.String
  
  type String = java.lang.String
  
  type StringList = js.Array[typingsSlinky.awsSdk.esMod.String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`Policy-Min-TLS-1-0-2019-07`
    - typingsSlinky.awsSdk.awsSdkStrings.`Policy-Min-TLS-1-2-2019-07`
    - java.lang.String
  */
  type TLSSecurityPolicy = typingsSlinky.awsSdk.esMod._TLSSecurityPolicy | java.lang.String
  
  type TagKey = java.lang.String
  
  type TagList = js.Array[typingsSlinky.awsSdk.esMod.Tag]
  
  type TagValue = java.lang.String
  
  type UIntValue = scala.Double
  
  type UpdateTimestamp = js.Date
  
  type UpgradeHistoryList = js.Array[typingsSlinky.awsSdk.esMod.UpgradeHistory]
  
  type UpgradeName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED_WITH_ISSUES
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type UpgradeStatus = typingsSlinky.awsSdk.esMod._UpgradeStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PRE_UPGRADE_CHECK
    - typingsSlinky.awsSdk.awsSdkStrings.SNAPSHOT
    - typingsSlinky.awsSdk.awsSdkStrings.UPGRADE
    - java.lang.String
  */
  type UpgradeStep = typingsSlinky.awsSdk.esMod._UpgradeStep | java.lang.String
  
  type UpgradeStepsList = js.Array[typingsSlinky.awsSdk.esMod.UpgradeStepItem]
  
  type UserPoolId = java.lang.String
  
  type Username = java.lang.String
  
  type ValueStringList = js.Array[typingsSlinky.awsSdk.esMod.NonEmptyString]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.standard__
    - typingsSlinky.awsSdk.awsSdkStrings.gp2
    - typingsSlinky.awsSdk.awsSdkStrings.io1
    - java.lang.String
  */
  type VolumeType = typingsSlinky.awsSdk.esMod._VolumeType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-01-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.esMod._apiVersion | java.lang.String
}
