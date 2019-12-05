package typingsSlinky.mqtt

import typingsSlinky.mqtt.typesLibClientDashOptionsMod.IClientOptions
import typingsSlinky.mqtt.typesLibClientMod.IStream
import typingsSlinky.mqtt.typesLibStoreDashOptionsMod.IStoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mqtt", JSImport.Namespace)
@js.native
object mqttMod extends js.Object {
  @js.native
  class Client protected ()
    extends typingsSlinky.mqtt.typesLibClientMod.MqttClient {
    def this(
      streamBuilder: js.Function1[/* client */ typingsSlinky.mqtt.typesLibClientMod.MqttClient, IStream],
      options: IClientOptions
    ) = this()
  }
  
  @js.native
  class MqttClient protected ()
    extends typingsSlinky.mqtt.typesLibConnectMod.MqttClient {
    def this(
      streamBuilder: js.Function1[/* client */ typingsSlinky.mqtt.typesLibClientMod.MqttClient, IStream],
      options: IClientOptions
    ) = this()
  }
  
  /**
    * In-memory implementation of the message store
    * This can actually be saved into files.
    *
    */
  @js.native
  class Store protected ()
    extends typingsSlinky.mqtt.typesLibStoreMod.Store {
    /**
      * Store constructor
      *
      * @param {Object} [options] - store options
      */
    def this(options: IStoreOptions) = this()
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

