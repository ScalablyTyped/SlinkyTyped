package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsSlinky.awsSdk.awsSdkStrings.WAITING_FOR_DATA_COLLECTION
  - typingsSlinky.awsSdk.awsSdkStrings.CANCELED
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED_COMPLIANT
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED_NON_COMPLIANT
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
trait AuditCheckRunStatus extends js.Object

object AuditCheckRunStatus {
  @scala.inline
  def IN_PROGRESS: typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS = "IN_PROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS]
  @scala.inline
  def WAITING_FOR_DATA_COLLECTION: typingsSlinky.awsSdk.awsSdkStrings.WAITING_FOR_DATA_COLLECTION = "WAITING_FOR_DATA_COLLECTION".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WAITING_FOR_DATA_COLLECTION]
  @scala.inline
  def CANCELED: typingsSlinky.awsSdk.awsSdkStrings.CANCELED = "CANCELED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CANCELED]
  @scala.inline
  def COMPLETED_COMPLIANT: typingsSlinky.awsSdk.awsSdkStrings.COMPLETED_COMPLIANT = "COMPLETED_COMPLIANT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETED_COMPLIANT]
  @scala.inline
  def COMPLETED_NON_COMPLIANT: typingsSlinky.awsSdk.awsSdkStrings.COMPLETED_NON_COMPLIANT = "COMPLETED_NON_COMPLIANT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETED_NON_COMPLIANT]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  implicit def apply(value: java.lang.String): AuditCheckRunStatus = value.asInstanceOf[AuditCheckRunStatus]
}

