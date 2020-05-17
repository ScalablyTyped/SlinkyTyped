package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
  - java.lang.String
*/
trait ExportStatus extends js.Object

object ExportStatus {
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def SUCCEEDED: typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED]
  @scala.inline
  def IN_PROGRESS: typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS = "IN_PROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS]
  @scala.inline
  implicit def apply(value: java.lang.String): ExportStatus = value.asInstanceOf[ExportStatus]
}

