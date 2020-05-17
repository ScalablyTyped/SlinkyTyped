package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SEND
  - typingsSlinky.awsSdk.awsSdkStrings.REJECT
  - typingsSlinky.awsSdk.awsSdkStrings.BOUNCE
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLAINT
  - typingsSlinky.awsSdk.awsSdkStrings.DELIVERY
  - typingsSlinky.awsSdk.awsSdkStrings.OPEN
  - typingsSlinky.awsSdk.awsSdkStrings.CLICK
  - typingsSlinky.awsSdk.awsSdkStrings.RENDERING_FAILURE
  - java.lang.String
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def SEND: typingsSlinky.awsSdk.awsSdkStrings.SEND = "SEND".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SEND]
  @scala.inline
  def REJECT: typingsSlinky.awsSdk.awsSdkStrings.REJECT = "REJECT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REJECT]
  @scala.inline
  def BOUNCE: typingsSlinky.awsSdk.awsSdkStrings.BOUNCE = "BOUNCE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BOUNCE]
  @scala.inline
  def COMPLAINT: typingsSlinky.awsSdk.awsSdkStrings.COMPLAINT = "COMPLAINT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLAINT]
  @scala.inline
  def DELIVERY: typingsSlinky.awsSdk.awsSdkStrings.DELIVERY = "DELIVERY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELIVERY]
  @scala.inline
  def OPEN: typingsSlinky.awsSdk.awsSdkStrings.OPEN = "OPEN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OPEN]
  @scala.inline
  def CLICK: typingsSlinky.awsSdk.awsSdkStrings.CLICK = "CLICK".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CLICK]
  @scala.inline
  def RENDERING_FAILURE: typingsSlinky.awsSdk.awsSdkStrings.RENDERING_FAILURE = "RENDERING_FAILURE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RENDERING_FAILURE]
  @scala.inline
  implicit def apply(value: String): EventType = value.asInstanceOf[EventType]
}

