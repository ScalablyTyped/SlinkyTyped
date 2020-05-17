package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.SKIPPED
  - java.lang.String
*/
trait AccountGateStatus extends js.Object

object AccountGateStatus {
  @scala.inline
  def SUCCEEDED: typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def SKIPPED: typingsSlinky.awsSdk.awsSdkStrings.SKIPPED = "SKIPPED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SKIPPED]
  @scala.inline
  implicit def apply(value: String): AccountGateStatus = value.asInstanceOf[AccountGateStatus]
}

