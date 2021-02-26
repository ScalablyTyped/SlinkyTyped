package typingsSlinky.mqtt

import typingsSlinky.mqtt.clientMod.IStream
import typingsSlinky.mqtt.clientOptionsMod.IClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectMod {
  
  @JSImport("mqtt/types/lib/connect", "MqttClient")
  @js.native
  class MqttClient protected ()
    extends typingsSlinky.mqtt.clientMod.MqttClient {
    def this(
      streamBuilder: js.Function1[/* client */ typingsSlinky.mqtt.clientMod.MqttClient, IStream],
      options: IClientOptions
    ) = this()
  }
  
  /**
    * connect - connect to an MQTT broker.
    *
    * @param {String} [brokerUrl] - url of the broker, optional
    * @param {Object} opts - see MqttClient#constructor
    */
  @JSImport("mqtt/types/lib/connect", "connect")
  @js.native
  def connect(): typingsSlinky.mqtt.clientMod.MqttClient = js.native
  @JSImport("mqtt/types/lib/connect", "connect")
  @js.native
  def connect(brokerUrl: js.UndefOr[scala.Nothing], opts: IClientOptions): typingsSlinky.mqtt.clientMod.MqttClient = js.native
  @JSImport("mqtt/types/lib/connect", "connect")
  @js.native
  def connect(brokerUrl: String): typingsSlinky.mqtt.clientMod.MqttClient = js.native
  @JSImport("mqtt/types/lib/connect", "connect")
  @js.native
  def connect(brokerUrl: String, opts: IClientOptions): typingsSlinky.mqtt.clientMod.MqttClient = js.native
  @JSImport("mqtt/types/lib/connect", "connect")
  @js.native
  def connect(brokerUrl: js.Any): typingsSlinky.mqtt.clientMod.MqttClient = js.native
  @JSImport("mqtt/types/lib/connect", "connect")
  @js.native
  def connect(brokerUrl: js.Any, opts: IClientOptions): typingsSlinky.mqtt.clientMod.MqttClient = js.native
}
