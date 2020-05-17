package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.TERMINATE_AT_INSTANCE_HOUR
  - typingsSlinky.awsSdk.awsSdkStrings.TERMINATE_AT_TASK_COMPLETION
  - java.lang.String
*/
trait ScaleDownBehavior extends js.Object

object ScaleDownBehavior {
  @scala.inline
  def TERMINATE_AT_INSTANCE_HOUR: typingsSlinky.awsSdk.awsSdkStrings.TERMINATE_AT_INSTANCE_HOUR = "TERMINATE_AT_INSTANCE_HOUR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TERMINATE_AT_INSTANCE_HOUR]
  @scala.inline
  def TERMINATE_AT_TASK_COMPLETION: typingsSlinky.awsSdk.awsSdkStrings.TERMINATE_AT_TASK_COMPLETION = "TERMINATE_AT_TASK_COMPLETION".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TERMINATE_AT_TASK_COMPLETION]
  @scala.inline
  implicit def apply(value: java.lang.String): ScaleDownBehavior = value.asInstanceOf[ScaleDownBehavior]
}

