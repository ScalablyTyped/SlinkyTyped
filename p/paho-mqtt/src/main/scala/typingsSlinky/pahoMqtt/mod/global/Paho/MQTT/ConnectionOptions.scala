package typingsSlinky.pahoMqtt.mod.global.Paho.MQTT

import typingsSlinky.pahoMqtt.pahoMqttNumbers.`3`
import typingsSlinky.pahoMqtt.pahoMqttNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attributes used with a connection.
  */
@js.native
trait ConnectionOptions extends js.Object {
  /**
    * If true(default) the client and server persistent state is deleted on successful connect.
    * @default true
    */
  var cleanSession: js.UndefOr[Boolean] = js.native
  /**
    * If present this contains either a set of hostnames or fully qualified
    * WebSocket URIs (ws://example.com:1883/mqtt), that are tried in order in place of the host and port
    * paramater on the construtor. The hosts are tried one at at time in order until one of then succeeds.
    */
  var hosts: js.UndefOr[js.Array[String]] = js.native
  /** Passed to the onSuccess callback or onFailure callback. */
  var invocationContext: js.UndefOr[js.Any] = js.native
  /**
    * The server disconnects this client if there is no activity for this number of seconds.
    * @default The default value of 60 seconds is assumed if not set.
    */
  var keepAliveInterval: js.UndefOr[Double] = js.native
  /**
    * Specifies the mqtt version to use when connecting
    * <dl>
    *     <dt>3 - MQTT 3.1</dt>
    *     <dt>4 - MQTT 3.1.1 (default)</dt>
    * </dl>
    * @default 4
    */
  var mqttVersion: js.UndefOr[`3` | `4`] = js.native
  /**
    * Called when the connect request has failed or timed out.
    */
  var onFailure: js.UndefOr[OnFailureCallback] = js.native
  /**
    * Called when the connect acknowledgement has been received from the server.
    */
  var onSuccess: js.UndefOr[OnSuccessCallback] = js.native
  /** Authentication password for this connection. */
  var password: js.UndefOr[String] = js.native
  /**
    * If present the set of ports matching the hosts. If hosts contains URIs, this property is not used.
    */
  var ports: js.UndefOr[js.Array[Double]] = js.native
  /**
    * If the connect has not succeeded within this number of seconds, it is deemed to have failed.
    * @default The default is 30 seconds.
    */
  var timeout: js.UndefOr[Double] = js.native
  /** If present and true, use an SSL Websocket connection. */
  var useSSL: js.UndefOr[Boolean] = js.native
  /** Authentication username for this connection. */
  var userName: js.UndefOr[String] = js.native
  /** Sent by the server when the client disconnects abnormally. */
  var willMessage: js.UndefOr[Message] = js.native
}

object ConnectionOptions {
  @scala.inline
  def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCleanSession(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanSession")(js.undefined)
        ret
    }
    @scala.inline
    def withHosts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHosts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hosts")(js.undefined)
        ret
    }
    @scala.inline
    def withInvocationContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invocationContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvocationContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invocationContext")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepAliveInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAliveInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withMqttVersion(value: `3` | `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mqttVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMqttVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mqttVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFailure(value: /* e */ ErrorWithInvocationContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFailure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuccess(value: /* o */ WithInvocationContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.undefined)
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
    def withPorts(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSSL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSSL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSSL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSSL")(js.undefined)
        ret
    }
    @scala.inline
    def withUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(js.undefined)
        ret
    }
    @scala.inline
    def withWillMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWillMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willMessage")(js.undefined)
        ret
    }
  }
  
}

