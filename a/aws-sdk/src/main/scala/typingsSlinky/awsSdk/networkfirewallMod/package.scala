package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object networkfirewallMod {
  
  type ActionName = java.lang.String
  
  type AddressDefinition = java.lang.String
  
  type Addresses = js.Array[typingsSlinky.awsSdk.networkfirewallMod.Address]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.SCALING
    - typingsSlinky.awsSdk.awsSdkStrings.READY
    - java.lang.String
  */
  type AttachmentStatus = typingsSlinky.awsSdk.networkfirewallMod._AttachmentStatus | java.lang.String
  
  type AvailabilityZone = java.lang.String
  
  type AzSubnet = java.lang.String
  
  type AzSubnets = js.Array[typingsSlinky.awsSdk.networkfirewallMod.AzSubnet]
  
  type Boolean = scala.Boolean
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.networkfirewallMod.ClientApiVersions
  
  type CollectionMemberString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.IN_SYNC
    - java.lang.String
  */
  type ConfigurationSyncState = typingsSlinky.awsSdk.networkfirewallMod._ConfigurationSyncState | java.lang.String
  
  type CustomActions = js.Array[typingsSlinky.awsSdk.networkfirewallMod.CustomAction]
  
  type Description = java.lang.String
  
  type Destination = java.lang.String
  
  type DimensionValue = java.lang.String
  
  type Dimensions = js.Array[typingsSlinky.awsSdk.networkfirewallMod.Dimension]
  
  type EndpointId = java.lang.String
  
  type FirewallPolicies = js.Array[typingsSlinky.awsSdk.networkfirewallMod.FirewallPolicyMetadata]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PROVISIONING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.READY
    - java.lang.String
  */
  type FirewallStatusValue = typingsSlinky.awsSdk.networkfirewallMod._FirewallStatusValue | java.lang.String
  
  type Firewalls = js.Array[typingsSlinky.awsSdk.networkfirewallMod.FirewallMetadata]
  
  type Flags = js.Array[typingsSlinky.awsSdk.networkfirewallMod.TCPFlag]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALLOWLIST
    - typingsSlinky.awsSdk.awsSdkStrings.DENYLIST
    - java.lang.String
  */
  type GeneratedRulesType = typingsSlinky.awsSdk.networkfirewallMod._GeneratedRulesType | java.lang.String
  
  type HashMapKey = java.lang.String
  
  type HashMapValue = java.lang.String
  
  type IPSets = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.networkfirewallMod.IPSet]
  
  type Keyword = java.lang.String
  
  type LogDestinationConfigs = js.Array[typingsSlinky.awsSdk.networkfirewallMod.LogDestinationConfig]
  
  type LogDestinationMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.networkfirewallMod.HashMapValue]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.S3
    - typingsSlinky.awsSdk.awsSdkStrings.CloudWatchLogs
    - typingsSlinky.awsSdk.awsSdkStrings.KinesisDataFirehose
    - java.lang.String
  */
  type LogDestinationType = typingsSlinky.awsSdk.networkfirewallMod._LogDestinationType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALERT
    - typingsSlinky.awsSdk.awsSdkStrings.FLOW
    - java.lang.String
  */
  type LogType = typingsSlinky.awsSdk.networkfirewallMod._LogType | java.lang.String
  
  type PaginationMaxResults = scala.Double
  
  type PaginationToken = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.IN_SYNC
    - java.lang.String
  */
  type PerObjectSyncStatus = typingsSlinky.awsSdk.networkfirewallMod._PerObjectSyncStatus | java.lang.String
  
  type PolicyString = java.lang.String
  
  type Port = java.lang.String
  
  type PortRangeBound = scala.Double
  
  type PortRanges = js.Array[typingsSlinky.awsSdk.networkfirewallMod.PortRange]
  
  type PortSets = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.networkfirewallMod.PortSet]
  
  type Priority = scala.Double
  
  type ProtocolNumber = scala.Double
  
  type ProtocolNumbers = js.Array[typingsSlinky.awsSdk.networkfirewallMod.ProtocolNumber]
  
  type ResourceArn = java.lang.String
  
  type ResourceId = java.lang.String
  
  type ResourceName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type ResourceStatus = typingsSlinky.awsSdk.networkfirewallMod._ResourceStatus | java.lang.String
  
  type RuleCapacity = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STATELESS
    - typingsSlinky.awsSdk.awsSdkStrings.STATEFUL
    - java.lang.String
  */
  type RuleGroupType = typingsSlinky.awsSdk.networkfirewallMod._RuleGroupType | java.lang.String
  
  type RuleGroups = js.Array[typingsSlinky.awsSdk.networkfirewallMod.RuleGroupMetadata]
  
  type RuleOptions = js.Array[typingsSlinky.awsSdk.networkfirewallMod.RuleOption]
  
  type RuleTargets = js.Array[typingsSlinky.awsSdk.networkfirewallMod.CollectionMemberString]
  
  type RuleVariableName = java.lang.String
  
  type RulesString = java.lang.String
  
  type Setting = java.lang.String
  
  type Settings = js.Array[typingsSlinky.awsSdk.networkfirewallMod.Setting]
  
  type Source = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PASS
    - typingsSlinky.awsSdk.awsSdkStrings.DROP
    - typingsSlinky.awsSdk.awsSdkStrings.ALERT
    - java.lang.String
  */
  type StatefulAction = typingsSlinky.awsSdk.networkfirewallMod._StatefulAction | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FORWARD
    - typingsSlinky.awsSdk.awsSdkStrings.ANY
    - java.lang.String
  */
  type StatefulRuleDirection = typingsSlinky.awsSdk.networkfirewallMod._StatefulRuleDirection | java.lang.String
  
  type StatefulRuleGroupReferences = js.Array[typingsSlinky.awsSdk.networkfirewallMod.StatefulRuleGroupReference]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IP
    - typingsSlinky.awsSdk.awsSdkStrings.TCP
    - typingsSlinky.awsSdk.awsSdkStrings.UDP
    - typingsSlinky.awsSdk.awsSdkStrings.ICMP
    - typingsSlinky.awsSdk.awsSdkStrings.HTTP
    - typingsSlinky.awsSdk.awsSdkStrings.FTP
    - typingsSlinky.awsSdk.awsSdkStrings.TLS
    - typingsSlinky.awsSdk.awsSdkStrings.SMB
    - typingsSlinky.awsSdk.awsSdkStrings.DNS
    - typingsSlinky.awsSdk.awsSdkStrings.DCERPC
    - typingsSlinky.awsSdk.awsSdkStrings.SSH
    - typingsSlinky.awsSdk.awsSdkStrings.SMTP
    - typingsSlinky.awsSdk.awsSdkStrings.IMAP
    - typingsSlinky.awsSdk.awsSdkStrings.MSN
    - typingsSlinky.awsSdk.awsSdkStrings.KRB5
    - typingsSlinky.awsSdk.awsSdkStrings.IKEV2
    - typingsSlinky.awsSdk.awsSdkStrings.TFTP
    - typingsSlinky.awsSdk.awsSdkStrings.NTP
    - typingsSlinky.awsSdk.awsSdkStrings.DHCP
    - java.lang.String
  */
  type StatefulRuleProtocol = typingsSlinky.awsSdk.networkfirewallMod._StatefulRuleProtocol | java.lang.String
  
  type StatefulRules = js.Array[typingsSlinky.awsSdk.networkfirewallMod.StatefulRule]
  
  type StatelessActions = js.Array[typingsSlinky.awsSdk.networkfirewallMod.CollectionMemberString]
  
  type StatelessRuleGroupReferences = js.Array[typingsSlinky.awsSdk.networkfirewallMod.StatelessRuleGroupReference]
  
  type StatelessRules = js.Array[typingsSlinky.awsSdk.networkfirewallMod.StatelessRule]
  
  type SubnetMappings = js.Array[typingsSlinky.awsSdk.networkfirewallMod.SubnetMapping]
  
  type SyncStateConfig = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.networkfirewallMod.PerObjectStatus]
  
  type SyncStates = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.networkfirewallMod.SyncState]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FIN
    - typingsSlinky.awsSdk.awsSdkStrings.SYN
    - typingsSlinky.awsSdk.awsSdkStrings.RST
    - typingsSlinky.awsSdk.awsSdkStrings.PSH
    - typingsSlinky.awsSdk.awsSdkStrings.ACK
    - typingsSlinky.awsSdk.awsSdkStrings.URG
    - typingsSlinky.awsSdk.awsSdkStrings.ECE
    - typingsSlinky.awsSdk.awsSdkStrings.CWR
    - java.lang.String
  */
  type TCPFlag = typingsSlinky.awsSdk.networkfirewallMod._TCPFlag | java.lang.String
  
  type TCPFlags = js.Array[typingsSlinky.awsSdk.networkfirewallMod.TCPFlagField]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.networkfirewallMod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.networkfirewallMod.Tag]
  
  type TagValue = java.lang.String
  
  type TagsPaginationMaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TLS_SNI
    - typingsSlinky.awsSdk.awsSdkStrings.HTTP_HOST
    - java.lang.String
  */
  type TargetType = typingsSlinky.awsSdk.networkfirewallMod._TargetType | java.lang.String
  
  type TargetTypes = js.Array[typingsSlinky.awsSdk.networkfirewallMod.TargetType]
  
  type UpdateToken = java.lang.String
  
  type VariableDefinition = java.lang.String
  
  type VariableDefinitionList = js.Array[typingsSlinky.awsSdk.networkfirewallMod.VariableDefinition]
  
  type VpcId = java.lang.String
  
  type VpcIds = js.Array[typingsSlinky.awsSdk.networkfirewallMod.VpcId]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2020-11-12`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.networkfirewallMod._apiVersion | java.lang.String
}
