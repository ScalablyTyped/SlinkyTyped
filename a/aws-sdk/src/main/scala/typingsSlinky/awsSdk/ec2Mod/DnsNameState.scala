package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.pendingVerification_
  - typingsSlinky.awsSdk.awsSdkStrings.verified_
  - typingsSlinky.awsSdk.awsSdkStrings.failed__
  - java.lang.String
*/
trait DnsNameState extends js.Object

object DnsNameState {
  @scala.inline
  def pendingVerification_ : typingsSlinky.awsSdk.awsSdkStrings.pendingVerification_ = "pendingVerification".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.pendingVerification_]
  @scala.inline
  def verified_ : typingsSlinky.awsSdk.awsSdkStrings.verified_ = "verified".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.verified_]
  @scala.inline
  def failed__ : typingsSlinky.awsSdk.awsSdkStrings.failed__ = "failed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.failed__]
  @scala.inline
  implicit def apply(value: java.lang.String): DnsNameState = value.asInstanceOf[DnsNameState]
}

