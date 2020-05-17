package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CREATE
  - typingsSlinky.awsSdk.awsSdkStrings.UPDATE
  - typingsSlinky.awsSdk.awsSdkStrings.DELETE
  - typingsSlinky.awsSdk.awsSdkStrings.DETECT_DRIFT
  - java.lang.String
*/
trait StackSetOperationAction extends js.Object

object StackSetOperationAction {
  @scala.inline
  def CREATE: typingsSlinky.awsSdk.awsSdkStrings.CREATE = "CREATE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CREATE]
  @scala.inline
  def UPDATE: typingsSlinky.awsSdk.awsSdkStrings.UPDATE = "UPDATE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UPDATE]
  @scala.inline
  def DELETE: typingsSlinky.awsSdk.awsSdkStrings.DELETE = "DELETE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETE]
  @scala.inline
  def DETECT_DRIFT: typingsSlinky.awsSdk.awsSdkStrings.DETECT_DRIFT = "DETECT_DRIFT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DETECT_DRIFT]
  @scala.inline
  implicit def apply(value: String): StackSetOperationAction = value.asInstanceOf[StackSetOperationAction]
}

