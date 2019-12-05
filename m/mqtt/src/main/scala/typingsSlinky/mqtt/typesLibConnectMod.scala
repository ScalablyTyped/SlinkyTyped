package typingsSlinky.mqtt

import typingsSlinky.mqtt.typesLibClientDashOptionsMod.IClientOptions
import typingsSlinky.mqtt.typesLibClientMod.IStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mqtt/types/lib/connect", JSImport.Namespace)
@js.native
object typesLibConnectMod extends js.Object {
  @js.native
  class MqttClient protected ()
    extends typingsSlinky.mqtt.typesLibClientMod.MqttClient {
    def this(
      streamBuilder: js.Function1[/* client */ typingsSlinky.mqtt.typesLibClientMod.MqttClient, IStream],
      options: IClientOptions
    ) = this()
  }
  
  /**
    * connect - connect to an MQTT broker.
    *
    * @param {String} [brokerUrl] - url of the broker, optional
    * @param {Object} opts - see MqttClient#constructor
    */
  def connect(): typingsSlinky.mqtt.typesLibClientMod.MqttClient = js.native
  def connect(brokerUrl: String): typingsSlinky.mqtt.typesLibClientMod.MqttClient = js.native
  def connect(brokerUrl: String, opts: IClientOptions): typingsSlinky.mqtt.typesLibClientMod.MqttClient = js.native
  def connect(brokerUrl: js.Any): typingsSlinky.mqtt.typesLibClientMod.MqttClient = js.native
  def connect(brokerUrl: js.Any, opts: IClientOptions): typingsSlinky.mqtt.typesLibClientMod.MqttClient = js.native
}

