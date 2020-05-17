package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.pending__
  - typingsSlinky.awsSdk.awsSdkStrings.granted_
  - typingsSlinky.awsSdk.awsSdkStrings.revoking
  - typingsSlinky.awsSdk.awsSdkStrings.revoked__
  - java.lang.String
*/
trait NetworkInterfacePermissionStateCode extends js.Object

object NetworkInterfacePermissionStateCode {
  @scala.inline
  def pending__ : typingsSlinky.awsSdk.awsSdkStrings.pending__ = "pending".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.pending__]
  @scala.inline
  def granted_ : typingsSlinky.awsSdk.awsSdkStrings.granted_ = "granted".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.granted_]
  @scala.inline
  def revoking: typingsSlinky.awsSdk.awsSdkStrings.revoking = "revoking".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.revoking]
  @scala.inline
  def revoked__ : typingsSlinky.awsSdk.awsSdkStrings.revoked__ = "revoked".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.revoked__]
  @scala.inline
  implicit def apply(value: java.lang.String): NetworkInterfacePermissionStateCode = value.asInstanceOf[NetworkInterfacePermissionStateCode]
}

