package typingsSlinky.mqtt.anon

import typingsSlinky.mqtt.mqttStrings.mqtt
import typingsSlinky.mqtt.mqttStrings.mqtts
import typingsSlinky.mqtt.mqttStrings.ssl
import typingsSlinky.mqtt.mqttStrings.tcp
import typingsSlinky.mqtt.mqttStrings.ws
import typingsSlinky.mqtt.mqttStrings.wss
import typingsSlinky.mqtt.mqttStrings.wx
import typingsSlinky.mqtt.mqttStrings.wxs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Host extends js.Object {
  var host: String
  var port: Double
  var protocol: js.UndefOr[wss | ws | mqtt | mqtts | tcp | ssl | wx | wxs] = js.undefined
}

object Host {
  @scala.inline
  def apply(host: String, port: Double, protocol: wss | ws | mqtt | mqtts | tcp | ssl | wx | wxs = null): Host = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
}

