package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Idle_
  - typingsSlinky.awsSdk.awsSdkStrings.Creating_
  - typingsSlinky.awsSdk.awsSdkStrings.Restoring_
  - typingsSlinky.awsSdk.awsSdkStrings.EniLimitExceeded_
  - typingsSlinky.awsSdk.awsSdkStrings.InsufficientRolePermissions
  - typingsSlinky.awsSdk.awsSdkStrings.InvalidConfiguration
  - typingsSlinky.awsSdk.awsSdkStrings.InternalError
  - typingsSlinky.awsSdk.awsSdkStrings.SubnetOutOfIPAddresses
  - typingsSlinky.awsSdk.awsSdkStrings.InvalidSubnet
  - typingsSlinky.awsSdk.awsSdkStrings.InvalidSecurityGroup
  - java.lang.String
*/
trait StateReasonCode extends js.Object

object StateReasonCode {
  @scala.inline
  def Idle_ : typingsSlinky.awsSdk.awsSdkStrings.Idle_ = "Idle".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Idle_]
  @scala.inline
  def Creating_ : typingsSlinky.awsSdk.awsSdkStrings.Creating_ = "Creating".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Creating_]
  @scala.inline
  def Restoring_ : typingsSlinky.awsSdk.awsSdkStrings.Restoring_ = "Restoring".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Restoring_]
  @scala.inline
  def EniLimitExceeded_ : typingsSlinky.awsSdk.awsSdkStrings.EniLimitExceeded_ = "EniLimitExceeded".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EniLimitExceeded_]
  @scala.inline
  def InsufficientRolePermissions: typingsSlinky.awsSdk.awsSdkStrings.InsufficientRolePermissions = "InsufficientRolePermissions".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InsufficientRolePermissions]
  @scala.inline
  def InvalidConfiguration: typingsSlinky.awsSdk.awsSdkStrings.InvalidConfiguration = "InvalidConfiguration".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InvalidConfiguration]
  @scala.inline
  def InternalError: typingsSlinky.awsSdk.awsSdkStrings.InternalError = "InternalError".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InternalError]
  @scala.inline
  def SubnetOutOfIPAddresses: typingsSlinky.awsSdk.awsSdkStrings.SubnetOutOfIPAddresses = "SubnetOutOfIPAddresses".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SubnetOutOfIPAddresses]
  @scala.inline
  def InvalidSubnet: typingsSlinky.awsSdk.awsSdkStrings.InvalidSubnet = "InvalidSubnet".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InvalidSubnet]
  @scala.inline
  def InvalidSecurityGroup: typingsSlinky.awsSdk.awsSdkStrings.InvalidSecurityGroup = "InvalidSecurityGroup".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InvalidSecurityGroup]
  @scala.inline
  implicit def apply(value: java.lang.String): StateReasonCode = value.asInstanceOf[StateReasonCode]
}

