package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object route53Mod {
  
  type AWSAccountID = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MAX_HEALTH_CHECKS_BY_OWNER
    - typingsSlinky.awsSdk.awsSdkStrings.MAX_HOSTED_ZONES_BY_OWNER
    - typingsSlinky.awsSdk.awsSdkStrings.MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER
    - typingsSlinky.awsSdk.awsSdkStrings.MAX_REUSABLE_DELEGATION_SETS_BY_OWNER
    - typingsSlinky.awsSdk.awsSdkStrings.MAX_TRAFFIC_POLICIES_BY_OWNER
    - java.lang.String
  */
  type AccountLimitType = typingsSlinky.awsSdk.route53Mod._AccountLimitType | java.lang.String
  
  type AlarmName = java.lang.String
  
  type AliasHealthEnabled = scala.Boolean
  
  type AssociateVPCComment = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE
    - typingsSlinky.awsSdk.awsSdkStrings.UPSERT
    - java.lang.String
  */
  type ChangeAction = typingsSlinky.awsSdk.route53Mod._ChangeAction | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.INSYNC
    - java.lang.String
  */
  type ChangeStatus = typingsSlinky.awsSdk.route53Mod._ChangeStatus | java.lang.String
  
  type Changes = js.Array[typingsSlinky.awsSdk.route53Mod.Change]
  
  type CheckerIpRanges = js.Array[typingsSlinky.awsSdk.route53Mod.IPAddressCidr]
  
  type ChildHealthCheckList = js.Array[typingsSlinky.awsSdk.route53Mod.HealthCheckId]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.route53Mod.ClientApiVersions
  
  type CloudWatchLogsLogGroupArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`us-east-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-east-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-west-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-west-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`ca-central-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-central-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-west-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-west-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-west-3`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-east-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`me-south-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-south-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-southeast-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-southeast-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-northeast-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-northeast-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-northeast-3`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-north-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`sa-east-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`cn-northwest-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`cn-north-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`af-south-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-south-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-gov-west-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-gov-east-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-iso-east-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-isob-east-1`
    - java.lang.String
  */
  type CloudWatchRegion = typingsSlinky.awsSdk.route53Mod._CloudWatchRegion | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GreaterThanOrEqualToThreshold
    - typingsSlinky.awsSdk.awsSdkStrings.GreaterThanThreshold
    - typingsSlinky.awsSdk.awsSdkStrings.LessThanThreshold
    - typingsSlinky.awsSdk.awsSdkStrings.LessThanOrEqualToThreshold
    - java.lang.String
  */
  type ComparisonOperator = typingsSlinky.awsSdk.route53Mod._ComparisonOperator | java.lang.String
  
  type DNSName = java.lang.String
  
  type DNSRCode = java.lang.String
  
  type DelegationSetNameServers = js.Array[typingsSlinky.awsSdk.route53Mod.DNSName]
  
  type DelegationSets = js.Array[typingsSlinky.awsSdk.route53Mod.DelegationSet]
  
  type DimensionField = java.lang.String
  
  type DimensionList = js.Array[typingsSlinky.awsSdk.route53Mod.Dimension]
  
  type Disabled = scala.Boolean
  
  type DisassociateVPCComment = java.lang.String
  
  type EnableSNI = scala.Boolean
  
  type EvaluationPeriods = scala.Double
  
  type FailureThreshold = scala.Double
  
  type FullyQualifiedDomainName = java.lang.String
  
  type GeoLocationContinentCode = java.lang.String
  
  type GeoLocationContinentName = java.lang.String
  
  type GeoLocationCountryCode = java.lang.String
  
  type GeoLocationCountryName = java.lang.String
  
  type GeoLocationDetailsList = js.Array[typingsSlinky.awsSdk.route53Mod.GeoLocationDetails]
  
  type GeoLocationSubdivisionCode = java.lang.String
  
  type GeoLocationSubdivisionName = java.lang.String
  
  type HealthCheckCount = scala.Double
  
  type HealthCheckId = java.lang.String
  
  type HealthCheckNonce = java.lang.String
  
  type HealthCheckObservations = js.Array[typingsSlinky.awsSdk.route53Mod.HealthCheckObservation]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`us-east-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-west-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-west-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-west-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-southeast-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-southeast-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-northeast-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`sa-east-1`
    - java.lang.String
  */
  type HealthCheckRegion = typingsSlinky.awsSdk.route53Mod._HealthCheckRegion | java.lang.String
  
  type HealthCheckRegionList = js.Array[typingsSlinky.awsSdk.route53Mod.HealthCheckRegion]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HTTP
    - typingsSlinky.awsSdk.awsSdkStrings.HTTPS
    - typingsSlinky.awsSdk.awsSdkStrings.HTTP_STR_MATCH
    - typingsSlinky.awsSdk.awsSdkStrings.HTTPS_STR_MATCH
    - typingsSlinky.awsSdk.awsSdkStrings.TCP
    - typingsSlinky.awsSdk.awsSdkStrings.CALCULATED
    - typingsSlinky.awsSdk.awsSdkStrings.CLOUDWATCH_METRIC
    - java.lang.String
  */
  type HealthCheckType = typingsSlinky.awsSdk.route53Mod._HealthCheckType | java.lang.String
  
  type HealthCheckVersion = scala.Double
  
  type HealthChecks = js.Array[typingsSlinky.awsSdk.route53Mod.HealthCheck]
  
  type HealthThreshold = scala.Double
  
  type HostedZoneCount = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MAX_RRSETS_BY_ZONE
    - typingsSlinky.awsSdk.awsSdkStrings.MAX_VPCS_ASSOCIATED_BY_ZONE
    - java.lang.String
  */
  type HostedZoneLimitType = typingsSlinky.awsSdk.route53Mod._HostedZoneLimitType | java.lang.String
  
  type HostedZoneOwningService = java.lang.String
  
  type HostedZoneRRSetCount = scala.Double
  
  type HostedZoneSummaries = js.Array[typingsSlinky.awsSdk.route53Mod.HostedZoneSummary]
  
  type HostedZones = js.Array[typingsSlinky.awsSdk.route53Mod.HostedZone]
  
  type IPAddress = java.lang.String
  
  type IPAddressCidr = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Healthy_
    - typingsSlinky.awsSdk.awsSdkStrings.Unhealthy_
    - typingsSlinky.awsSdk.awsSdkStrings.LastKnownStatus
    - java.lang.String
  */
  type InsufficientDataHealthStatus = typingsSlinky.awsSdk.route53Mod._InsufficientDataHealthStatus | java.lang.String
  
  type Inverted = scala.Boolean
  
  type IsPrivateZone = scala.Boolean
  
  type LimitValue = scala.Double
  
  type MaxResults = java.lang.String
  
  type MeasureLatency = scala.Boolean
  
  type Message = java.lang.String
  
  type MetricName = java.lang.String
  
  type Nameserver = java.lang.String
  
  type Namespace = java.lang.String
  
  type Nonce = java.lang.String
  
  type PageMarker = java.lang.String
  
  type PageMaxItems = java.lang.String
  
  type PageTruncated = scala.Boolean
  
  type PaginationToken = java.lang.String
  
  type Period = scala.Double
  
  type Port = scala.Double
  
  type QueryLoggingConfigId = java.lang.String
  
  type QueryLoggingConfigs = js.Array[typingsSlinky.awsSdk.route53Mod.QueryLoggingConfig]
  
  type RData = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SOA
    - typingsSlinky.awsSdk.awsSdkStrings.A
    - typingsSlinky.awsSdk.awsSdkStrings.TXT
    - typingsSlinky.awsSdk.awsSdkStrings.NS
    - typingsSlinky.awsSdk.awsSdkStrings.CNAME
    - typingsSlinky.awsSdk.awsSdkStrings.MX
    - typingsSlinky.awsSdk.awsSdkStrings.NAPTR
    - typingsSlinky.awsSdk.awsSdkStrings.PTR
    - typingsSlinky.awsSdk.awsSdkStrings.SRV
    - typingsSlinky.awsSdk.awsSdkStrings.SPF
    - typingsSlinky.awsSdk.awsSdkStrings.AAAA
    - typingsSlinky.awsSdk.awsSdkStrings.CAA
    - java.lang.String
  */
  type RRType = typingsSlinky.awsSdk.route53Mod._RRType | java.lang.String
  
  type RecordData = js.Array[typingsSlinky.awsSdk.route53Mod.RecordDataEntry]
  
  type RecordDataEntry = java.lang.String
  
  type RequestInterval = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FullyQualifiedDomainName
    - typingsSlinky.awsSdk.awsSdkStrings.Regions
    - typingsSlinky.awsSdk.awsSdkStrings.ResourcePath
    - typingsSlinky.awsSdk.awsSdkStrings.ChildHealthChecks
    - java.lang.String
  */
  type ResettableElementName = typingsSlinky.awsSdk.route53Mod._ResettableElementName | java.lang.String
  
  type ResettableElementNameList = js.Array[typingsSlinky.awsSdk.route53Mod.ResettableElementName]
  
  type ResourceDescription = java.lang.String
  
  type ResourceId = java.lang.String
  
  type ResourcePath = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PRIMARY
    - typingsSlinky.awsSdk.awsSdkStrings.SECONDARY
    - java.lang.String
  */
  type ResourceRecordSetFailover = typingsSlinky.awsSdk.route53Mod._ResourceRecordSetFailover | java.lang.String
  
  type ResourceRecordSetIdentifier = java.lang.String
  
  type ResourceRecordSetMultiValueAnswer = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`us-east-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-east-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-west-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-west-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`ca-central-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-west-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-west-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-west-3`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-central-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-southeast-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-southeast-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-northeast-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-northeast-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-northeast-3`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-north-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`sa-east-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`cn-north-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`cn-northwest-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-east-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`me-south-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-south-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`af-south-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-south-1`
    - java.lang.String
  */
  type ResourceRecordSetRegion = typingsSlinky.awsSdk.route53Mod._ResourceRecordSetRegion | java.lang.String
  
  type ResourceRecordSetWeight = scala.Double
  
  type ResourceRecordSets = js.Array[typingsSlinky.awsSdk.route53Mod.ResourceRecordSet]
  
  type ResourceRecords = js.Array[typingsSlinky.awsSdk.route53Mod.ResourceRecord]
  
  type ResourceTagSetList = js.Array[typingsSlinky.awsSdk.route53Mod.ResourceTagSet]
  
  type ResourceURI = java.lang.String
  
  type ReusableDelegationSetLimitType = typingsSlinky.awsSdk.awsSdkStrings.MAX_ZONES_BY_REUSABLE_DELEGATION_SET | java.lang.String
  
  type SearchString = java.lang.String
  
  type ServicePrincipal = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Average_
    - typingsSlinky.awsSdk.awsSdkStrings.Sum_
    - typingsSlinky.awsSdk.awsSdkStrings.SampleCount
    - typingsSlinky.awsSdk.awsSdkStrings.Maximum_
    - typingsSlinky.awsSdk.awsSdkStrings.Minimum_
    - java.lang.String
  */
  type Statistic = typingsSlinky.awsSdk.route53Mod._Statistic | java.lang.String
  
  type Status = java.lang.String
  
  type SubnetMask = java.lang.String
  
  type TTL = scala.Double
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.route53Mod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.route53Mod.Tag]
  
  type TagResourceId = java.lang.String
  
  type TagResourceIdList = js.Array[typingsSlinky.awsSdk.route53Mod.TagResourceId]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.healthcheck
    - typingsSlinky.awsSdk.awsSdkStrings.hostedzone
    - java.lang.String
  */
  type TagResourceType = typingsSlinky.awsSdk.route53Mod._TagResourceType | java.lang.String
  
  type TagValue = java.lang.String
  
  type Threshold = scala.Double
  
  type TimeStamp = js.Date
  
  type TrafficPolicies = js.Array[typingsSlinky.awsSdk.route53Mod.TrafficPolicy]
  
  type TrafficPolicyComment = java.lang.String
  
  type TrafficPolicyDocument = java.lang.String
  
  type TrafficPolicyId = java.lang.String
  
  type TrafficPolicyInstanceCount = scala.Double
  
  type TrafficPolicyInstanceId = java.lang.String
  
  type TrafficPolicyInstanceState = java.lang.String
  
  type TrafficPolicyInstances = js.Array[typingsSlinky.awsSdk.route53Mod.TrafficPolicyInstance]
  
  type TrafficPolicyName = java.lang.String
  
  type TrafficPolicySummaries = js.Array[typingsSlinky.awsSdk.route53Mod.TrafficPolicySummary]
  
  type TrafficPolicyVersion = scala.Double
  
  type TrafficPolicyVersionMarker = java.lang.String
  
  type TransportProtocol = java.lang.String
  
  type UsageCount = scala.Double
  
  type VPCId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`us-east-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-east-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-west-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-west-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-west-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-west-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-west-3`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-central-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-east-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`me-south-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-gov-west-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-gov-east-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-iso-east-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-isob-east-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-southeast-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-southeast-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-south-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-northeast-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-northeast-2`
    - typingsSlinky.awsSdk.awsSdkStrings.`ap-northeast-3`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-north-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`sa-east-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`ca-central-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`cn-north-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`af-south-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`eu-south-1`
    - java.lang.String
  */
  type VPCRegion = typingsSlinky.awsSdk.route53Mod._VPCRegion | java.lang.String
  
  type VPCs = js.Array[typingsSlinky.awsSdk.route53Mod.VPC]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2013-04-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.route53Mod._apiVersion | java.lang.String
}
