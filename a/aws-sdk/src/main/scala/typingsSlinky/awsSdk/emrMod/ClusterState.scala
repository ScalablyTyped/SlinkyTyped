package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.STARTING
  - typingsSlinky.awsSdk.awsSdkStrings.BOOTSTRAPPING
  - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
  - typingsSlinky.awsSdk.awsSdkStrings.WAITING
  - typingsSlinky.awsSdk.awsSdkStrings.TERMINATING
  - typingsSlinky.awsSdk.awsSdkStrings.TERMINATED
  - typingsSlinky.awsSdk.awsSdkStrings.TERMINATED_WITH_ERRORS
  - java.lang.String
*/
trait ClusterState extends js.Object

object ClusterState {
  @scala.inline
  def STARTING: typingsSlinky.awsSdk.awsSdkStrings.STARTING = "STARTING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STARTING]
  @scala.inline
  def BOOTSTRAPPING: typingsSlinky.awsSdk.awsSdkStrings.BOOTSTRAPPING = "BOOTSTRAPPING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BOOTSTRAPPING]
  @scala.inline
  def RUNNING: typingsSlinky.awsSdk.awsSdkStrings.RUNNING = "RUNNING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RUNNING]
  @scala.inline
  def WAITING: typingsSlinky.awsSdk.awsSdkStrings.WAITING = "WAITING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WAITING]
  @scala.inline
  def TERMINATING: typingsSlinky.awsSdk.awsSdkStrings.TERMINATING = "TERMINATING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TERMINATING]
  @scala.inline
  def TERMINATED: typingsSlinky.awsSdk.awsSdkStrings.TERMINATED = "TERMINATED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TERMINATED]
  @scala.inline
  def TERMINATED_WITH_ERRORS: typingsSlinky.awsSdk.awsSdkStrings.TERMINATED_WITH_ERRORS = "TERMINATED_WITH_ERRORS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TERMINATED_WITH_ERRORS]
  @scala.inline
  implicit def apply(value: java.lang.String): ClusterState = value.asInstanceOf[ClusterState]
}

