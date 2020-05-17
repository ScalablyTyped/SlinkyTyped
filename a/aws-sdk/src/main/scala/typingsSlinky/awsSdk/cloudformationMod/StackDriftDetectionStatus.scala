package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.DETECTION_IN_PROGRESS
  - typingsSlinky.awsSdk.awsSdkStrings.DETECTION_FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.DETECTION_COMPLETE
  - java.lang.String
*/
trait StackDriftDetectionStatus extends js.Object

object StackDriftDetectionStatus {
  @scala.inline
  def DETECTION_IN_PROGRESS: typingsSlinky.awsSdk.awsSdkStrings.DETECTION_IN_PROGRESS = "DETECTION_IN_PROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DETECTION_IN_PROGRESS]
  @scala.inline
  def DETECTION_FAILED: typingsSlinky.awsSdk.awsSdkStrings.DETECTION_FAILED = "DETECTION_FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DETECTION_FAILED]
  @scala.inline
  def DETECTION_COMPLETE: typingsSlinky.awsSdk.awsSdkStrings.DETECTION_COMPLETE = "DETECTION_COMPLETE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DETECTION_COMPLETE]
  @scala.inline
  implicit def apply(value: String): StackDriftDetectionStatus = value.asInstanceOf[StackDriftDetectionStatus]
}

