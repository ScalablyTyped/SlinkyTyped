package typingsSlinky.mqtt.clientOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mqtt.anon.AuthenticationData
import typingsSlinky.mqtt.anon.Host
import typingsSlinky.mqtt.anon.Payload
import typingsSlinky.mqtt.clientMod.MqttClient
import typingsSlinky.mqtt.mqttStrings.mqtt
import typingsSlinky.mqtt.mqttStrings.mqtts
import typingsSlinky.mqtt.mqttStrings.ssl
import typingsSlinky.mqtt.mqttStrings.tcp
import typingsSlinky.mqtt.mqttStrings.ws
import typingsSlinky.mqtt.mqttStrings.wss
import typingsSlinky.mqtt.mqttStrings.wx
import typingsSlinky.mqtt.mqttStrings.wxs
import typingsSlinky.mqtt.storeMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientOptions extends ISecureClientOptions {
  /**
    * true, set to false to receive QoS 1 and 2 messages while offline
    */
  var clean: js.UndefOr[Boolean] = js.native
  /**
    * 'mqttjs_' + Math.random().toString(16).substr(2, 8)
    */
  var clientId: js.UndefOr[String] = js.native
  /**
    * 30 * 1000 milliseconds, time to wait before a CONNACK is received
    */
  var connectTimeout: js.UndefOr[Double] = js.native
  // port is made into a number subsequently
  var host: js.UndefOr[String] = js.native
  // host does NOT include port
  var hostname: js.UndefOr[String] = js.native
  /**
    * a Store for the incoming packets
    */
  var incomingStore: js.UndefOr[Store] = js.native
  /**
    *  10 seconds, set to 0 to disable
    */
  var keepalive: js.UndefOr[Double] = js.native
  /**
    * a Store for the outgoing packets
    */
  var outgoingStore: js.UndefOr[Store] = js.native
  /**
    * the password required by your broker, if any
    */
  var password: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var properties: js.UndefOr[AuthenticationData] = js.native
  var protocol: js.UndefOr[wss | ws | mqtt | mqtts | tcp | ssl | wx | wxs] = js.native
  /**
    * 'MQTT'
    */
  var protocolId: js.UndefOr[String] = js.native
  /**
    * 4
    */
  var protocolVersion: js.UndefOr[Double] = js.native
  var queueQoSZero: js.UndefOr[Boolean] = js.native
  /**
    * 1000 milliseconds, interval between two reconnections
    */
  var reconnectPeriod: js.UndefOr[Double] = js.native
  var reschedulePings: js.UndefOr[Boolean] = js.native
  /**
    * true, set to false to disable re-subscribe functionality
    */
  var resubscribe: js.UndefOr[Boolean] = js.native
  var servers: js.UndefOr[js.Array[Host]] = js.native
  var transformWsUrl: js.UndefOr[
    js.Function3[/* url */ String, /* options */ IClientOptions, /* client */ MqttClient, String]
  ] = js.native
  /**
    * the username required by your broker, if any
    */
  var username: js.UndefOr[String] = js.native
  /**
    * a message that will sent by the broker automatically when the client disconnect badly.
    */
  var will: js.UndefOr[Payload] = js.native
  var wsOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object IClientOptions {
  @scala.inline
  def apply(): IClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientOptions]
  }
  @scala.inline
  implicit class IClientOptionsOps[Self <: IClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean")(js.undefined)
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withIncomingStore(value: Store): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomingStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncomingStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomingStore")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepalive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepalive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepalive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepalive")(js.undefined)
        ret
    }
    @scala.inline
    def withOutgoingStore(value: Store): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutgoingStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingStore")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: AuthenticationData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: wss | ws | mqtt | mqtts | tcp | ssl | wx | wxs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocolId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolId")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocolVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocolVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withQueueQoSZero(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueQoSZero")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueueQoSZero: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueQoSZero")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withReschedulePings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reschedulePings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReschedulePings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reschedulePings")(js.undefined)
        ret
    }
    @scala.inline
    def withResubscribe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resubscribe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResubscribe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resubscribe")(js.undefined)
        ret
    }
    @scala.inline
    def withServers(value: js.Array[Host]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servers")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformWsUrl(value: (/* url */ String, /* options */ IClientOptions, /* client */ MqttClient) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformWsUrl")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutTransformWsUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformWsUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
    @scala.inline
    def withWill(value: Payload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("will")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("will")(js.undefined)
        ret
    }
    @scala.inline
    def withWsOptions(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsOptions")(js.undefined)
        ret
    }
  }
  
}

