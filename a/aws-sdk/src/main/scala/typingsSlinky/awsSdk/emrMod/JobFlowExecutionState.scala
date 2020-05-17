package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.STARTING
  - typingsSlinky.awsSdk.awsSdkStrings.BOOTSTRAPPING
  - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
  - typingsSlinky.awsSdk.awsSdkStrings.WAITING
  - typingsSlinky.awsSdk.awsSdkStrings.SHUTTING_DOWN
  - typingsSlinky.awsSdk.awsSdkStrings.TERMINATED
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
trait JobFlowExecutionState extends js.Object

object JobFlowExecutionState {
  @scala.inline
  def STARTING: typingsSlinky.awsSdk.awsSdkStrings.STARTING = "STARTING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STARTING]
  @scala.inline
  def BOOTSTRAPPING: typingsSlinky.awsSdk.awsSdkStrings.BOOTSTRAPPING = "BOOTSTRAPPING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BOOTSTRAPPING]
  @scala.inline
  def RUNNING: typingsSlinky.awsSdk.awsSdkStrings.RUNNING = "RUNNING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RUNNING]
  @scala.inline
  def WAITING: typingsSlinky.awsSdk.awsSdkStrings.WAITING = "WAITING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WAITING]
  @scala.inline
  def SHUTTING_DOWN: typingsSlinky.awsSdk.awsSdkStrings.SHUTTING_DOWN = "SHUTTING_DOWN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SHUTTING_DOWN]
  @scala.inline
  def TERMINATED: typingsSlinky.awsSdk.awsSdkStrings.TERMINATED = "TERMINATED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TERMINATED]
  @scala.inline
  def COMPLETED: typingsSlinky.awsSdk.awsSdkStrings.COMPLETED = "COMPLETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETED]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  implicit def apply(value: java.lang.String): JobFlowExecutionState = value.asInstanceOf[JobFlowExecutionState]
}

