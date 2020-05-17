package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.TERMINATE
  - typingsSlinky.awsSdk.awsSdkStrings.REQUEST_CANCEL
  - typingsSlinky.awsSdk.awsSdkStrings.ABANDON
  - java.lang.String
*/
trait ChildPolicy extends js.Object

object ChildPolicy {
  @scala.inline
  def TERMINATE: typingsSlinky.awsSdk.awsSdkStrings.TERMINATE = "TERMINATE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TERMINATE]
  @scala.inline
  def REQUEST_CANCEL: typingsSlinky.awsSdk.awsSdkStrings.REQUEST_CANCEL = "REQUEST_CANCEL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REQUEST_CANCEL]
  @scala.inline
  def ABANDON: typingsSlinky.awsSdk.awsSdkStrings.ABANDON = "ABANDON".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ABANDON]
  @scala.inline
  implicit def apply(value: String): ChildPolicy = value.asInstanceOf[ChildPolicy]
}

