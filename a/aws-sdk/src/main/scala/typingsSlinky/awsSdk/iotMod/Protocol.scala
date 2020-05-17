package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.MQTT
  - typingsSlinky.awsSdk.awsSdkStrings.HTTP
  - java.lang.String
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  def MQTT: typingsSlinky.awsSdk.awsSdkStrings.MQTT = "MQTT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MQTT]
  @scala.inline
  def HTTP: typingsSlinky.awsSdk.awsSdkStrings.HTTP = "HTTP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HTTP]
  @scala.inline
  implicit def apply(value: java.lang.String): Protocol = value.asInstanceOf[Protocol]
}

