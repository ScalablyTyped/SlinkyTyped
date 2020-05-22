package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object globalacceleratorMod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DEPLOYED
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - java.lang.String
  */
  type AcceleratorStatus = typingsSlinky.awsSdk.globalacceleratorMod._AcceleratorStatus | java.lang.String
  type Accelerators = js.Array[typingsSlinky.awsSdk.globalacceleratorMod.Accelerator]
  type ByoipCidrEvents = js.Array[typingsSlinky.awsSdk.globalacceleratorMod.ByoipCidrEvent]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_PROVISIONING
    - typingsSlinky.awsSdk.awsSdkStrings.READY
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_ADVERTISING
    - typingsSlinky.awsSdk.awsSdkStrings.ADVERTISING
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_WITHDRAWING
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_DEPROVISIONING
    - typingsSlinky.awsSdk.awsSdkStrings.DEPROVISIONED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED_PROVISION
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED_ADVERTISING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED_WITHDRAW
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED_DEPROVISION
    - java.lang.String
  */
  type ByoipCidrState = typingsSlinky.awsSdk.globalacceleratorMod._ByoipCidrState | java.lang.String
  type ByoipCidrs = js.Array[typingsSlinky.awsSdk.globalacceleratorMod.ByoipCidr]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.SOURCE_IP
    - java.lang.String
  */
  type ClientAffinity = typingsSlinky.awsSdk.globalacceleratorMod._ClientAffinity | java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.globalacceleratorMod.ClientApiVersions
  type EndpointConfigurations = js.Array[typingsSlinky.awsSdk.globalacceleratorMod.EndpointConfiguration]
  type EndpointDescriptions = js.Array[typingsSlinky.awsSdk.globalacceleratorMod.EndpointDescription]
  type EndpointGroups = js.Array[typingsSlinky.awsSdk.globalacceleratorMod.EndpointGroup]
  type EndpointWeight = scala.Double
  type GenericBoolean = scala.Boolean
  type GenericString = java.lang.String
  type HealthCheckIntervalSeconds = scala.Double
  type HealthCheckPort = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TCP
    - typingsSlinky.awsSdk.awsSdkStrings.HTTP
    - typingsSlinky.awsSdk.awsSdkStrings.HTTPS
    - java.lang.String
  */
  type HealthCheckProtocol = typingsSlinky.awsSdk.globalacceleratorMod._HealthCheckProtocol | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INITIAL
    - typingsSlinky.awsSdk.awsSdkStrings.HEALTHY
    - typingsSlinky.awsSdk.awsSdkStrings.UNHEALTHY
    - java.lang.String
  */
  type HealthState = typingsSlinky.awsSdk.globalacceleratorMod._HealthState | java.lang.String
  type IdempotencyToken = java.lang.String
  type IpAddress = java.lang.String
  type IpAddressType = typingsSlinky.awsSdk.awsSdkStrings.IPV4 | java.lang.String
  type IpAddresses = js.Array[typingsSlinky.awsSdk.globalacceleratorMod.IpAddress]
  type IpSets = js.Array[typingsSlinky.awsSdk.globalacceleratorMod.IpSet]
  type Listeners = js.Array[typingsSlinky.awsSdk.globalacceleratorMod.Listener]
  type MaxResults = scala.Double
  type PortNumber = scala.Double
  type PortRanges = js.Array[typingsSlinky.awsSdk.globalacceleratorMod.PortRange]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TCP
    - typingsSlinky.awsSdk.awsSdkStrings.UDP
    - java.lang.String
  */
  type Protocol = typingsSlinky.awsSdk.globalacceleratorMod._Protocol | java.lang.String
  type ResourceArn = java.lang.String
  type TagKey = java.lang.String
  type TagKeys = js.Array[typingsSlinky.awsSdk.globalacceleratorMod.TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[typingsSlinky.awsSdk.globalacceleratorMod.Tag]
  type ThresholdCount = scala.Double
  type Timestamp = js.Date
  type TrafficDialPercentage = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-08-08`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.globalacceleratorMod._apiVersion | java.lang.String
}
