package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NEW
  - typingsSlinky.awsSdk.awsSdkStrings.NOTIFIED
  - typingsSlinky.awsSdk.awsSdkStrings.RESOLVED
  - typingsSlinky.awsSdk.awsSdkStrings.SUPPRESSED
  - java.lang.String
*/
trait WorkflowStatus extends js.Object

object WorkflowStatus {
  @scala.inline
  def NEW: typingsSlinky.awsSdk.awsSdkStrings.NEW = "NEW".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NEW]
  @scala.inline
  def NOTIFIED: typingsSlinky.awsSdk.awsSdkStrings.NOTIFIED = "NOTIFIED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NOTIFIED]
  @scala.inline
  def RESOLVED: typingsSlinky.awsSdk.awsSdkStrings.RESOLVED = "RESOLVED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RESOLVED]
  @scala.inline
  def SUPPRESSED: typingsSlinky.awsSdk.awsSdkStrings.SUPPRESSED = "SUPPRESSED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUPPRESSED]
  @scala.inline
  implicit def apply(value: String): WorkflowStatus = value.asInstanceOf[WorkflowStatus]
}

