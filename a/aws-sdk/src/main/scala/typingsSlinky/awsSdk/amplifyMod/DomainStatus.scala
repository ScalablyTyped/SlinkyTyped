package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING_VERIFICATION
  - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING_DEPLOYMENT
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.CREATING
  - typingsSlinky.awsSdk.awsSdkStrings.REQUESTING_CERTIFICATE
  - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
trait DomainStatus extends js.Object

object DomainStatus {
  @scala.inline
  def PENDING_VERIFICATION: typingsSlinky.awsSdk.awsSdkStrings.PENDING_VERIFICATION = "PENDING_VERIFICATION".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING_VERIFICATION]
  @scala.inline
  def IN_PROGRESS: typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS = "IN_PROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS]
  @scala.inline
  def AVAILABLE: typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE = "AVAILABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE]
  @scala.inline
  def PENDING_DEPLOYMENT: typingsSlinky.awsSdk.awsSdkStrings.PENDING_DEPLOYMENT = "PENDING_DEPLOYMENT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING_DEPLOYMENT]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def CREATING: typingsSlinky.awsSdk.awsSdkStrings.CREATING = "CREATING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CREATING]
  @scala.inline
  def REQUESTING_CERTIFICATE: typingsSlinky.awsSdk.awsSdkStrings.REQUESTING_CERTIFICATE = "REQUESTING_CERTIFICATE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REQUESTING_CERTIFICATE]
  @scala.inline
  def UPDATING: typingsSlinky.awsSdk.awsSdkStrings.UPDATING = "UPDATING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UPDATING]
  @scala.inline
  implicit def apply(value: String): DomainStatus = value.asInstanceOf[DomainStatus]
}

