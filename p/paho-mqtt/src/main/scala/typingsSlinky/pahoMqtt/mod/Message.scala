package typingsSlinky.pahoMqtt.mod

import typingsSlinky.pahoMqtt.mod._Global_.Paho.MQTT.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An application message, sent or received.
  */
@JSImport("paho-mqtt", "Message")
@js.native
class Message protected ()
  extends typingsSlinky.pahoMqtt.mod._Global_.Paho.MQTT.Message {
  /**
    * @param payload The message data to be sent.
    */
  def this(payload: String) = this()
  def this(payload: TypedArray) = this()
  def this(payload: js.typedarray.ArrayBuffer) = this()
}

