package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.USER_REQUEST
  - typingsSlinky.awsSdk.awsSdkStrings.PROVISION_FAILURE
  - typingsSlinky.awsSdk.awsSdkStrings.CLEANUP_FAILURE
  - java.lang.String
*/
trait AutoScalingPolicyStateChangeReasonCode extends js.Object

object AutoScalingPolicyStateChangeReasonCode {
  @scala.inline
  def USER_REQUEST: typingsSlinky.awsSdk.awsSdkStrings.USER_REQUEST = "USER_REQUEST".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.USER_REQUEST]
  @scala.inline
  def PROVISION_FAILURE: typingsSlinky.awsSdk.awsSdkStrings.PROVISION_FAILURE = "PROVISION_FAILURE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PROVISION_FAILURE]
  @scala.inline
  def CLEANUP_FAILURE: typingsSlinky.awsSdk.awsSdkStrings.CLEANUP_FAILURE = "CLEANUP_FAILURE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CLEANUP_FAILURE]
  @scala.inline
  implicit def apply(value: java.lang.String): AutoScalingPolicyStateChangeReasonCode = value.asInstanceOf[AutoScalingPolicyStateChangeReasonCode]
}

