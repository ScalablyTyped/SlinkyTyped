package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.`in-alarm`
  - typingsSlinky.awsSdk.awsSdkStrings.`alarm-cleared`
  - typingsSlinky.awsSdk.awsSdkStrings.`alarm-invalidated`
  - java.lang.String
*/
trait ViolationEventType extends js.Object

object ViolationEventType {
  @scala.inline
  def `in-alarm`: typingsSlinky.awsSdk.awsSdkStrings.`in-alarm` = "in-alarm".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`in-alarm`]
  @scala.inline
  def `alarm-cleared`: typingsSlinky.awsSdk.awsSdkStrings.`alarm-cleared` = "alarm-cleared".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`alarm-cleared`]
  @scala.inline
  def `alarm-invalidated`: typingsSlinky.awsSdk.awsSdkStrings.`alarm-invalidated` = "alarm-invalidated".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`alarm-invalidated`]
  @scala.inline
  implicit def apply(value: java.lang.String): ViolationEventType = value.asInstanceOf[ViolationEventType]
}

