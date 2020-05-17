package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.WORK_IN_PROGRESS
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
trait ReportStatus extends js.Object

object ReportStatus {
  @scala.inline
  def WORK_IN_PROGRESS: typingsSlinky.awsSdk.awsSdkStrings.WORK_IN_PROGRESS = "WORK_IN_PROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WORK_IN_PROGRESS]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def COMPLETED: typingsSlinky.awsSdk.awsSdkStrings.COMPLETED = "COMPLETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETED]
  @scala.inline
  implicit def apply(value: String): ReportStatus = value.asInstanceOf[ReportStatus]
}

