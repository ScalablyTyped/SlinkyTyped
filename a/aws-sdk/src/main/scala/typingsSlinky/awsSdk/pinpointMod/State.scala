package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.DRAFT
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
  - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
  - typingsSlinky.awsSdk.awsSdkStrings.CLOSED
  - java.lang.String
*/
trait State extends js.Object

object State {
  @scala.inline
  def DRAFT: typingsSlinky.awsSdk.awsSdkStrings.DRAFT = "DRAFT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DRAFT]
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def COMPLETED: typingsSlinky.awsSdk.awsSdkStrings.COMPLETED = "COMPLETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETED]
  @scala.inline
  def CANCELLED: typingsSlinky.awsSdk.awsSdkStrings.CANCELLED = "CANCELLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CANCELLED]
  @scala.inline
  def CLOSED: typingsSlinky.awsSdk.awsSdkStrings.CLOSED = "CLOSED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CLOSED]
  @scala.inline
  implicit def apply(value: String): State = value.asInstanceOf[State]
}

