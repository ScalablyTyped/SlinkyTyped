package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.INSTALLED
  - typingsSlinky.awsSdk.awsSdkStrings.INSTALLED_OTHER
  - typingsSlinky.awsSdk.awsSdkStrings.INSTALLED_PENDING_REBOOT
  - typingsSlinky.awsSdk.awsSdkStrings.INSTALLED_REJECTED
  - typingsSlinky.awsSdk.awsSdkStrings.MISSING
  - typingsSlinky.awsSdk.awsSdkStrings.NOT_APPLICABLE
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
trait PatchComplianceDataState extends js.Object

object PatchComplianceDataState {
  @scala.inline
  def INSTALLED: typingsSlinky.awsSdk.awsSdkStrings.INSTALLED = "INSTALLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INSTALLED]
  @scala.inline
  def INSTALLED_OTHER: typingsSlinky.awsSdk.awsSdkStrings.INSTALLED_OTHER = "INSTALLED_OTHER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INSTALLED_OTHER]
  @scala.inline
  def INSTALLED_PENDING_REBOOT: typingsSlinky.awsSdk.awsSdkStrings.INSTALLED_PENDING_REBOOT = "INSTALLED_PENDING_REBOOT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INSTALLED_PENDING_REBOOT]
  @scala.inline
  def INSTALLED_REJECTED: typingsSlinky.awsSdk.awsSdkStrings.INSTALLED_REJECTED = "INSTALLED_REJECTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INSTALLED_REJECTED]
  @scala.inline
  def MISSING: typingsSlinky.awsSdk.awsSdkStrings.MISSING = "MISSING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MISSING]
  @scala.inline
  def NOT_APPLICABLE: typingsSlinky.awsSdk.awsSdkStrings.NOT_APPLICABLE = "NOT_APPLICABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NOT_APPLICABLE]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  implicit def apply(value: java.lang.String): PatchComplianceDataState = value.asInstanceOf[PatchComplianceDataState]
}

