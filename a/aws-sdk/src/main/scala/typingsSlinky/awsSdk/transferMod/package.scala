package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transferMod {
  type AddressAllocationId = java.lang.String
  type AddressAllocationIds = js.Array[typingsSlinky.awsSdk.transferMod.AddressAllocationId]
  type Arn = java.lang.String
  type Certificate = java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.transferMod.ClientApiVersions
  type DateImported = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PUBLIC
    - typingsSlinky.awsSdk.awsSdkStrings.VPC
    - typingsSlinky.awsSdk.awsSdkStrings.VPC_ENDPOINT
    - java.lang.String
  */
  type EndpointType = typingsSlinky.awsSdk.transferMod._EndpointType | java.lang.String
  type HomeDirectory = java.lang.String
  type HomeDirectoryMappings = js.Array[typingsSlinky.awsSdk.transferMod.HomeDirectoryMapEntry]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PATH
    - typingsSlinky.awsSdk.awsSdkStrings.LOGICAL
    - java.lang.String
  */
  type HomeDirectoryType = typingsSlinky.awsSdk.transferMod._HomeDirectoryType | java.lang.String
  type HostKey = java.lang.String
  type HostKeyFingerprint = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SERVICE_MANAGED
    - typingsSlinky.awsSdk.awsSdkStrings.API_GATEWAY
    - java.lang.String
  */
  type IdentityProviderType = typingsSlinky.awsSdk.transferMod._IdentityProviderType | java.lang.String
  type ListedServers = js.Array[typingsSlinky.awsSdk.transferMod.ListedServer]
  type ListedUsers = js.Array[typingsSlinky.awsSdk.transferMod.ListedUser]
  type MapEntry = java.lang.String
  type MapTarget = java.lang.String
  type MaxResults = scala.Double
  type Message = java.lang.String
  type NextToken = java.lang.String
  type NullableRole = java.lang.String
  type Policy = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SFTP
    - typingsSlinky.awsSdk.awsSdkStrings.FTP
    - typingsSlinky.awsSdk.awsSdkStrings.FTPS
    - java.lang.String
  */
  type Protocol = typingsSlinky.awsSdk.transferMod._Protocol | java.lang.String
  type Protocols = js.Array[typingsSlinky.awsSdk.transferMod.Protocol]
  type Response = java.lang.String
  type Role = java.lang.String
  type ServerId = java.lang.String
  type SshPublicKeyBody = java.lang.String
  type SshPublicKeyCount = scala.Double
  type SshPublicKeyId = java.lang.String
  type SshPublicKeys = js.Array[typingsSlinky.awsSdk.transferMod.SshPublicKey]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OFFLINE
    - typingsSlinky.awsSdk.awsSdkStrings.ONLINE
    - typingsSlinky.awsSdk.awsSdkStrings.STARTING
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
    - typingsSlinky.awsSdk.awsSdkStrings.START_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.STOP_FAILED
    - java.lang.String
  */
  type State = typingsSlinky.awsSdk.transferMod._State | java.lang.String
  type StatusCode = scala.Double
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[typingsSlinky.awsSdk.transferMod.SubnetId]
  type TagKey = java.lang.String
  type TagKeys = js.Array[typingsSlinky.awsSdk.transferMod.TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[typingsSlinky.awsSdk.transferMod.Tag]
  type Url = java.lang.String
  type UserCount = scala.Double
  type UserName = java.lang.String
  type UserPassword = java.lang.String
  type VpcEndpointId = java.lang.String
  type VpcId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-11-05`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.transferMod._apiVersion | java.lang.String
}
