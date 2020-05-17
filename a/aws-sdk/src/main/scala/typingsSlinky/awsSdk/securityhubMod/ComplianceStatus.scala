package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PASSED
  - typingsSlinky.awsSdk.awsSdkStrings.WARNING
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.NOT_AVAILABLE
  - java.lang.String
*/
trait ComplianceStatus extends js.Object

object ComplianceStatus {
  @scala.inline
  def PASSED: typingsSlinky.awsSdk.awsSdkStrings.PASSED = "PASSED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PASSED]
  @scala.inline
  def WARNING: typingsSlinky.awsSdk.awsSdkStrings.WARNING = "WARNING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WARNING]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def NOT_AVAILABLE: typingsSlinky.awsSdk.awsSdkStrings.NOT_AVAILABLE = "NOT_AVAILABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NOT_AVAILABLE]
  @scala.inline
  implicit def apply(value: String): ComplianceStatus = value.asInstanceOf[ComplianceStatus]
}

