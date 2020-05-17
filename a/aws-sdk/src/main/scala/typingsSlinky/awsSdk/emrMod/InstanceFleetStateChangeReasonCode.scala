package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typingsSlinky.awsSdk.awsSdkStrings.VALIDATION_ERROR
  - typingsSlinky.awsSdk.awsSdkStrings.INSTANCE_FAILURE
  - typingsSlinky.awsSdk.awsSdkStrings.CLUSTER_TERMINATED
  - java.lang.String
*/
trait InstanceFleetStateChangeReasonCode extends js.Object

object InstanceFleetStateChangeReasonCode {
  @scala.inline
  def INTERNAL_ERROR: typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_ERROR]
  @scala.inline
  def VALIDATION_ERROR: typingsSlinky.awsSdk.awsSdkStrings.VALIDATION_ERROR = "VALIDATION_ERROR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.VALIDATION_ERROR]
  @scala.inline
  def INSTANCE_FAILURE: typingsSlinky.awsSdk.awsSdkStrings.INSTANCE_FAILURE = "INSTANCE_FAILURE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INSTANCE_FAILURE]
  @scala.inline
  def CLUSTER_TERMINATED: typingsSlinky.awsSdk.awsSdkStrings.CLUSTER_TERMINATED = "CLUSTER_TERMINATED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CLUSTER_TERMINATED]
  @scala.inline
  implicit def apply(value: java.lang.String): InstanceFleetStateChangeReasonCode = value.asInstanceOf[InstanceFleetStateChangeReasonCode]
}

