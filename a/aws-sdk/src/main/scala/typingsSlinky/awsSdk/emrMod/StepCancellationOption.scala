package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SEND_INTERRUPT
  - typingsSlinky.awsSdk.awsSdkStrings.TERMINATE_PROCESS
  - java.lang.String
*/
trait StepCancellationOption extends js.Object

object StepCancellationOption {
  @scala.inline
  def SEND_INTERRUPT: typingsSlinky.awsSdk.awsSdkStrings.SEND_INTERRUPT = "SEND_INTERRUPT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SEND_INTERRUPT]
  @scala.inline
  def TERMINATE_PROCESS: typingsSlinky.awsSdk.awsSdkStrings.TERMINATE_PROCESS = "TERMINATE_PROCESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TERMINATE_PROCESS]
  @scala.inline
  implicit def apply(value: java.lang.String): StepCancellationOption = value.asInstanceOf[StepCancellationOption]
}

