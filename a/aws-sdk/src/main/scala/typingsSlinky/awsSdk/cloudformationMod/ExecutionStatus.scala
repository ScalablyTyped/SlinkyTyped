package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE
  - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
  - typingsSlinky.awsSdk.awsSdkStrings.EXECUTE_IN_PROGRESS
  - typingsSlinky.awsSdk.awsSdkStrings.EXECUTE_COMPLETE
  - typingsSlinky.awsSdk.awsSdkStrings.EXECUTE_FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.OBSOLETE
  - java.lang.String
*/
trait ExecutionStatus extends js.Object

object ExecutionStatus {
  @scala.inline
  def UNAVAILABLE: typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE = "UNAVAILABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE]
  @scala.inline
  def AVAILABLE: typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE = "AVAILABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE]
  @scala.inline
  def EXECUTE_IN_PROGRESS: typingsSlinky.awsSdk.awsSdkStrings.EXECUTE_IN_PROGRESS = "EXECUTE_IN_PROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EXECUTE_IN_PROGRESS]
  @scala.inline
  def EXECUTE_COMPLETE: typingsSlinky.awsSdk.awsSdkStrings.EXECUTE_COMPLETE = "EXECUTE_COMPLETE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EXECUTE_COMPLETE]
  @scala.inline
  def EXECUTE_FAILED: typingsSlinky.awsSdk.awsSdkStrings.EXECUTE_FAILED = "EXECUTE_FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EXECUTE_FAILED]
  @scala.inline
  def OBSOLETE: typingsSlinky.awsSdk.awsSdkStrings.OBSOLETE = "OBSOLETE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OBSOLETE]
  @scala.inline
  implicit def apply(value: String): ExecutionStatus = value.asInstanceOf[ExecutionStatus]
}

