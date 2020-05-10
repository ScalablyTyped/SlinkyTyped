package typingsSlinky.kiiCloudSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KiiMqttEndpoint extends js.Object {
  var `X-MQTT-TTL`: Double = js.native
  var host: String = js.native
  var installationID: String = js.native
  var mqttTopic: String = js.native
  var password: String = js.native
  var portSSL: Double = js.native
  var portTCP: Double = js.native
  var portWS: Double = js.native
  var portWSS: Double = js.native
  var username: String = js.native
}

object KiiMqttEndpoint {
  @scala.inline
  def apply(
    `X-MQTT-TTL`: Double,
    host: String,
    installationID: String,
    mqttTopic: String,
    password: String,
    portSSL: Double,
    portTCP: Double,
    portWS: Double,
    portWSS: Double,
    username: String
  ): KiiMqttEndpoint = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], installationID = installationID.asInstanceOf[js.Any], mqttTopic = mqttTopic.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], portSSL = portSSL.asInstanceOf[js.Any], portTCP = portTCP.asInstanceOf[js.Any], portWS = portWS.asInstanceOf[js.Any], portWSS = portWSS.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("X-MQTT-TTL")(`X-MQTT-TTL`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KiiMqttEndpoint]
  }
  @scala.inline
  implicit class KiiMqttEndpointOps[Self <: KiiMqttEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withX-MQTT-TTL`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X-MQTT-TTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallationID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMqttTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mqttTopic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortSSL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portSSL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortTCP(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portTCP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortWS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portWS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortWSS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portWSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

