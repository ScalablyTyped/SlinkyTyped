package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typingsSlinky.awsSdk.awsSdkStrings.VALIDATION_ERROR
  - typingsSlinky.awsSdk.awsSdkStrings.INSTANCE_FAILURE
  - typingsSlinky.awsSdk.awsSdkStrings.INSTANCE_FLEET_TIMEOUT
  - typingsSlinky.awsSdk.awsSdkStrings.BOOTSTRAP_FAILURE
  - typingsSlinky.awsSdk.awsSdkStrings.USER_REQUEST
  - typingsSlinky.awsSdk.awsSdkStrings.STEP_FAILURE
  - typingsSlinky.awsSdk.awsSdkStrings.ALL_STEPS_COMPLETED
  - java.lang.String
*/
trait ClusterStateChangeReasonCode extends js.Object

object ClusterStateChangeReasonCode {
  @scala.inline
  def INTERNAL_ERROR: typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_ERROR]
  @scala.inline
  def VALIDATION_ERROR: typingsSlinky.awsSdk.awsSdkStrings.VALIDATION_ERROR = "VALIDATION_ERROR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.VALIDATION_ERROR]
  @scala.inline
  def INSTANCE_FAILURE: typingsSlinky.awsSdk.awsSdkStrings.INSTANCE_FAILURE = "INSTANCE_FAILURE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INSTANCE_FAILURE]
  @scala.inline
  def INSTANCE_FLEET_TIMEOUT: typingsSlinky.awsSdk.awsSdkStrings.INSTANCE_FLEET_TIMEOUT = "INSTANCE_FLEET_TIMEOUT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INSTANCE_FLEET_TIMEOUT]
  @scala.inline
  def BOOTSTRAP_FAILURE: typingsSlinky.awsSdk.awsSdkStrings.BOOTSTRAP_FAILURE = "BOOTSTRAP_FAILURE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BOOTSTRAP_FAILURE]
  @scala.inline
  def USER_REQUEST: typingsSlinky.awsSdk.awsSdkStrings.USER_REQUEST = "USER_REQUEST".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.USER_REQUEST]
  @scala.inline
  def STEP_FAILURE: typingsSlinky.awsSdk.awsSdkStrings.STEP_FAILURE = "STEP_FAILURE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STEP_FAILURE]
  @scala.inline
  def ALL_STEPS_COMPLETED: typingsSlinky.awsSdk.awsSdkStrings.ALL_STEPS_COMPLETED = "ALL_STEPS_COMPLETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ALL_STEPS_COMPLETED]
  @scala.inline
  implicit def apply(value: java.lang.String): ClusterStateChangeReasonCode = value.asInstanceOf[ClusterStateChangeReasonCode]
}

