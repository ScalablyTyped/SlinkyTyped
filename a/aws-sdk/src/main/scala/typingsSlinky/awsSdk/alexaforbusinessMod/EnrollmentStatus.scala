package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.INITIALIZED
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.REGISTERED
  - typingsSlinky.awsSdk.awsSdkStrings.DISASSOCIATING
  - typingsSlinky.awsSdk.awsSdkStrings.DEREGISTERING
  - java.lang.String
*/
trait EnrollmentStatus extends js.Object

object EnrollmentStatus {
  @scala.inline
  def INITIALIZED: typingsSlinky.awsSdk.awsSdkStrings.INITIALIZED = "INITIALIZED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INITIALIZED]
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  def REGISTERED: typingsSlinky.awsSdk.awsSdkStrings.REGISTERED = "REGISTERED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REGISTERED]
  @scala.inline
  def DISASSOCIATING: typingsSlinky.awsSdk.awsSdkStrings.DISASSOCIATING = "DISASSOCIATING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DISASSOCIATING]
  @scala.inline
  def DEREGISTERING: typingsSlinky.awsSdk.awsSdkStrings.DEREGISTERING = "DEREGISTERING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEREGISTERING]
  @scala.inline
  implicit def apply(value: String): EnrollmentStatus = value.asInstanceOf[EnrollmentStatus]
}

