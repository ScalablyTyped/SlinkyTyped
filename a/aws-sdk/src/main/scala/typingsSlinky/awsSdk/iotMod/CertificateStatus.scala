package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.REVOKED
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING_TRANSFER
  - typingsSlinky.awsSdk.awsSdkStrings.REGISTER_INACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING_ACTIVATION
  - java.lang.String
*/
trait CertificateStatus extends js.Object

object CertificateStatus {
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def INACTIVE: typingsSlinky.awsSdk.awsSdkStrings.INACTIVE = "INACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INACTIVE]
  @scala.inline
  def REVOKED: typingsSlinky.awsSdk.awsSdkStrings.REVOKED = "REVOKED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REVOKED]
  @scala.inline
  def PENDING_TRANSFER: typingsSlinky.awsSdk.awsSdkStrings.PENDING_TRANSFER = "PENDING_TRANSFER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING_TRANSFER]
  @scala.inline
  def REGISTER_INACTIVE: typingsSlinky.awsSdk.awsSdkStrings.REGISTER_INACTIVE = "REGISTER_INACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REGISTER_INACTIVE]
  @scala.inline
  def PENDING_ACTIVATION: typingsSlinky.awsSdk.awsSdkStrings.PENDING_ACTIVATION = "PENDING_ACTIVATION".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING_ACTIVATION]
  @scala.inline
  implicit def apply(value: java.lang.String): CertificateStatus = value.asInstanceOf[CertificateStatus]
}

