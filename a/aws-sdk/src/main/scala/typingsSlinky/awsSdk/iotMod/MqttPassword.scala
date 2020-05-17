package typingsSlinky.awsSdk.iotMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.iotMod.Blob
  - java.lang.String
*/
trait MqttPassword extends js.Object

object MqttPassword {
  @scala.inline
  implicit def apply(value: Blob): MqttPassword = value.asInstanceOf[MqttPassword]
  @scala.inline
  implicit def apply(value: Buffer): MqttPassword = value.asInstanceOf[MqttPassword]
  @scala.inline
  implicit def apply(value: java.lang.String): MqttPassword = value.asInstanceOf[MqttPassword]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): MqttPassword = value.asInstanceOf[MqttPassword]
}

