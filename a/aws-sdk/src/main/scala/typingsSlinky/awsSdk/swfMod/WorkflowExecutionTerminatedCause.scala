package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CHILD_POLICY_APPLIED
  - typingsSlinky.awsSdk.awsSdkStrings.EVENT_LIMIT_EXCEEDED
  - typingsSlinky.awsSdk.awsSdkStrings.OPERATOR_INITIATED
  - java.lang.String
*/
trait WorkflowExecutionTerminatedCause extends js.Object

object WorkflowExecutionTerminatedCause {
  @scala.inline
  def CHILD_POLICY_APPLIED: typingsSlinky.awsSdk.awsSdkStrings.CHILD_POLICY_APPLIED = "CHILD_POLICY_APPLIED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CHILD_POLICY_APPLIED]
  @scala.inline
  def EVENT_LIMIT_EXCEEDED: typingsSlinky.awsSdk.awsSdkStrings.EVENT_LIMIT_EXCEEDED = "EVENT_LIMIT_EXCEEDED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EVENT_LIMIT_EXCEEDED]
  @scala.inline
  def OPERATOR_INITIATED: typingsSlinky.awsSdk.awsSdkStrings.OPERATOR_INITIATED = "OPERATOR_INITIATED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OPERATOR_INITIATED]
  @scala.inline
  implicit def apply(value: String): WorkflowExecutionTerminatedCause = value.asInstanceOf[WorkflowExecutionTerminatedCause]
}

