package typingsSlinky.amqpConnectionManager.mod

import typingsSlinky.amqpConnectionManager.anon.ConnectionOptionsnoDelayb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmqpConnectionManagerOptions extends js.Object {
  /**
  	 * TLS options
  	 *
  	 * These are passed through directly to amqplib (http://www.squaremobius.net/amqp.node/channel_api.html#connect),
  	 * which in turn passes them through to tls.connect (https://nodejs.org/api/tls.html#tls_tls_connect_options_callback)
  	 */
  var connectionOptions: js.UndefOr[ConnectionOptionsnoDelayb] = js.native
  /**
  	 * is a function which returns one or more servers to connect to. This should return either a single URL or an array of URLs.
  	 * This is handy when you're using a service discovery mechanism such as Consul or etcd. Instead of taking a callback, this can also
  	 * return a Promise. Note that if this is supplied, then urls is ignored.
  	 */
  var findServers: js.UndefOr[
    (js.Function1[/* callback */ js.Function1[/* urls */ String | js.Array[String], Unit], Unit]) | (js.Function0[js.Promise[String | js.Array[String]]])
  ] = js.native
  /**
  	 * Interval to send heartbeats to broker. Defaults to 5 seconds.
  	 */
  var heartbeatIntervalInSeconds: js.UndefOr[Double] = js.native
  /**
  	 * The time to wait before trying to reconnect. If not specified, defaults to heartbeatIntervalInSeconds
  	 */
  var reconnectTimeInSeconds: js.UndefOr[Double] = js.native
}

object AmqpConnectionManagerOptions {
  @scala.inline
  def apply(): AmqpConnectionManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmqpConnectionManagerOptions]
  }
  @scala.inline
  implicit class AmqpConnectionManagerOptionsOps[Self <: AmqpConnectionManagerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionOptions(value: ConnectionOptionsnoDelayb): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withFindServersFunction1(value: /* callback */ js.Function1[/* urls */ String | js.Array[String], Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findServers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindServersFunction0(value: () => js.Promise[String | js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findServers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFindServers(
      value: (js.Function1[/* callback */ js.Function1[/* urls */ String | js.Array[String], Unit], Unit]) | (js.Function0[js.Promise[String | js.Array[String]]])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindServers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findServers")(js.undefined)
        ret
    }
    @scala.inline
    def withHeartbeatIntervalInSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatIntervalInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeartbeatIntervalInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatIntervalInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectTimeInSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectTimeInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectTimeInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectTimeInSeconds")(js.undefined)
        ret
    }
  }
  
}

