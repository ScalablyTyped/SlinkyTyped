package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object cloudhsmMod {
  
  type AZ = java.lang.String
  
  type AZList = js.Array[typingsSlinky.awsSdk.cloudhsmMod.AZ]
  
  type Certificate = java.lang.String
  
  type CertificateFingerprint = java.lang.String
  
  type ClientArn = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.cloudhsmMod.ClientApiVersions
  
  type ClientLabel = java.lang.String
  
  type ClientList = js.Array[typingsSlinky.awsSdk.cloudhsmMod.ClientArn]
  
  type ClientToken = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`5Dot1`
    - typingsSlinky.awsSdk.awsSdkStrings.`5Dot3`
    - java.lang.String
  */
  type ClientVersion = typingsSlinky.awsSdk.cloudhsmMod._ClientVersion | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.READY
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.DEGRADED
    - java.lang.String
  */
  type CloudHsmObjectState = typingsSlinky.awsSdk.cloudhsmMod._CloudHsmObjectState | java.lang.String
  
  type EniId = java.lang.String
  
  type ExternalId = java.lang.String
  
  type HapgArn = java.lang.String
  
  type HapgList = js.Array[typingsSlinky.awsSdk.cloudhsmMod.HapgArn]
  
  type HsmArn = java.lang.String
  
  type HsmList = js.Array[typingsSlinky.awsSdk.cloudhsmMod.HsmArn]
  
  type HsmSerialNumber = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.SUSPENDED
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATING
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATED
    - typingsSlinky.awsSdk.awsSdkStrings.DEGRADED
    - java.lang.String
  */
  type HsmStatus = typingsSlinky.awsSdk.cloudhsmMod._HsmStatus | java.lang.String
  
  type IamRoleArn = java.lang.String
  
  type IpAddress = java.lang.String
  
  type Label = java.lang.String
  
  type PaginationToken = java.lang.String
  
  type PartitionArn = java.lang.String
  
  type PartitionList = js.Array[typingsSlinky.awsSdk.cloudhsmMod.PartitionArn]
  
  type PartitionSerial = java.lang.String
  
  type PartitionSerialList = js.Array[typingsSlinky.awsSdk.cloudhsmMod.PartitionSerial]
  
  type SshKey = java.lang.String
  
  type String = java.lang.String
  
  type SubnetId = java.lang.String
  
  type SubscriptionType = typingsSlinky.awsSdk.awsSdkStrings.PRODUCTION | java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.cloudhsmMod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.cloudhsmMod.Tag]
  
  type TagValue = java.lang.String
  
  type Timestamp = java.lang.String
  
  type VpcId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-05-30`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.cloudhsmMod._apiVersion | java.lang.String
}
