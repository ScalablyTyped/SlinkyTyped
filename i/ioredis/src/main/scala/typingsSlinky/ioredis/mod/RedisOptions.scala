package typingsSlinky.ioredis.mod

import typingsSlinky.ioredis.anon.Host
import typingsSlinky.ioredis.ioredisNumbers.`1`
import typingsSlinky.ioredis.ioredisNumbers.`2`
import typingsSlinky.ioredis.ioredisStrings.master
import typingsSlinky.ioredis.ioredisStrings.slave
import typingsSlinky.node.tlsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedisOptions extends js.Object {
  /**
    * If true, client will resend unfulfilled commands(e.g. block commands) in the previous connection when reconnected.
    * default: true.
    */
  var autoResendUnfulfilledCommands: js.UndefOr[Boolean] = js.native
  /**
    * After reconnected, if the previous connection was in the subscriber mode, client will auto re-subscribe these channels.
    * default: true.
    */
  var autoResubscribe: js.UndefOr[Boolean] = js.native
  /**
    * The milliseconds before a timeout occurs during the initial connection to the Redis server.
    * default: 10000.
    */
  var connectTimeout: js.UndefOr[Double] = js.native
  var connectionName: js.UndefOr[String] = js.native
  /**
    * Database index to use.
    */
  var db: js.UndefOr[Double] = js.native
  /**
    * If you are using the hiredis parser, it's highly recommended to enable this option.
    * Create another instance with dropBufferSupport disabled for other commands that you want to return binary instead of string
    */
  var dropBufferSupport: js.UndefOr[Boolean] = js.native
  /**
    * By default, if there is no active connection to the Redis server, commands are added to a queue
    * and are executed once the connection is "ready" (when enableReadyCheck is true, "ready" means
    * the Redis server has loaded the database from disk, otherwise means the connection to the Redis
    * server has been established). If this option is false, when execute the command when the connection
    * isn't ready, an error will be returned.
    */
  var enableOfflineQueue: js.UndefOr[Boolean] = js.native
  /**
    * When a connection is established to the Redis server, the server might still be loading
    * the database from disk. While loading, the server not respond to any commands.
    * To work around this, when this option is true, ioredis will check the status of the Redis server,
    * and when the Redis server is able to process commands, a ready event will be emitted.
    */
  var enableReadyCheck: js.UndefOr[Boolean] = js.native
  /**
    * Whether to support the `tls` option when connecting to Redis via sentinel mode.
    * default: false.
    */
  var enableTLSForSentinelMode: js.UndefOr[Boolean] = js.native
  /**
    * 4 (IPv4) or 6 (IPv6), Defaults to 4.
    */
  var family: js.UndefOr[Double] = js.native
  var host: js.UndefOr[String] = js.native
  /**
    * TCP KeepAlive on the socket with a X ms delay before start. Set to a non-number value to disable keepAlive.
    */
  var keepAlive: js.UndefOr[Double] = js.native
  var keyPrefix: js.UndefOr[String] = js.native
  var lazyConnect: js.UndefOr[Boolean] = js.native
  /**
    * By default, all pending commands will be flushed with an error every
    * 20 retry attempts. That makes sure commands won't wait forever when
    * the connection is down. You can change this behavior by setting
    * `maxRetriesPerRequest`.
    *
    * Set maxRetriesPerRequest to `null` to disable this behavior, and
    * every command will wait forever until the connection is alive again
    * (which is the default behavior before ioredis v4).
    */
  var maxRetriesPerRequest: js.UndefOr[Double | Null] = js.native
  /**
    * default: null.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * NAT map for sentinel connector.
    * default: null.
    */
  var natMap: js.UndefOr[NatMap] = js.native
  /**
    * If set, client will send AUTH command with the value of this option when connected.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * Local domain socket path. If set the port, host and family will be ignored.
    */
  var path: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  /**
    * Can be used to prefer a particular slave or set of slaves based on priority.
    */
  var preferredSlaves: js.UndefOr[PreferredSlaves] = js.native
  /**
    * Enable READONLY mode for the connection. Only available for cluster mode.
    * default: false.
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /**
    * 1/true means reconnect, 2 means reconnect and resend failed command. Returning false will ignore
    * the error and do nothing.
    */
  var reconnectOnError: js.UndefOr[js.Function1[/* error */ js.Error, Boolean | `1` | `2`]] = js.native
  /**
    * When the return value isn't a number, ioredis will stop trying to reconnect.
    * Fixed in: https://github.com/DefinitelyTyped/DefinitelyTyped/pull/15858
    */
  var retryStrategy: js.UndefOr[js.Function1[/* times */ Double, Double | Unit | Null]] = js.native
  /**
    * default: "master".
    */
  var role: js.UndefOr[master | slave] = js.native
  var sentinelPassword: js.UndefOr[String] = js.native
  /**
    * If `sentinelRetryStrategy` returns a valid delay time, ioredis will try to reconnect from scratch.
    * default: function(times) { return Math.min(times * 10, 1000); }
    */
  var sentinelRetryStrategy: js.UndefOr[js.Function1[/* times */ Double, Double | Unit | Null]] = js.native
  var sentinelTLS: js.UndefOr[SecureContextOptions] = js.native
  var sentinels: js.UndefOr[js.Array[Host]] = js.native
  /**
    * Whether to show a friendly error stack. Will decrease the performance significantly.
    */
  var showFriendlyErrorStack: js.UndefOr[Boolean] = js.native
  var tls: js.UndefOr[ConnectionOptions] = js.native
  /**
    * Update the given `sentinels` list with new IP addresses when communicating with existing sentinels.
    * default: true.
    */
  var updateSentinels: js.UndefOr[Boolean] = js.native
}

object RedisOptions {
  @scala.inline
  def apply(): RedisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedisOptions]
  }
  @scala.inline
  implicit class RedisOptionsOps[Self <: RedisOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoResendUnfulfilledCommands(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResendUnfulfilledCommands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResendUnfulfilledCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResendUnfulfilledCommands")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoResubscribe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResubscribe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResubscribe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResubscribe")(js.undefined)
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
    def withConnectionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionName")(js.undefined)
        ret
    }
    @scala.inline
    def withDb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db")(js.undefined)
        ret
    }
    @scala.inline
    def withDropBufferSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropBufferSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropBufferSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropBufferSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableOfflineQueue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOfflineQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableOfflineQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOfflineQueue")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableReadyCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableReadyCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableReadyCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableReadyCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTLSForSentinelMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTLSForSentinelMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTLSForSentinelMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTLSForSentinelMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFamily(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(js.undefined)
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
    def withKeepAlive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAlive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyConnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyConnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetriesPerRequest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetriesPerRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetriesPerRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetriesPerRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetriesPerRequestNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetriesPerRequest")(null)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNatMap(value: NatMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNatMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natMap")(js.undefined)
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
    def withPreferredSlavesFunction1(value: /* slaves */ js.Array[AddressFromResponse] => AddressFromResponse | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredSlaves")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPreferredSlaves(value: PreferredSlaves): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredSlaves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredSlaves: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredSlaves")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectOnError(value: /* error */ js.Error => Boolean | `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectOnError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReconnectOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectOnError")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryStrategy(value: /* times */ Double => Double | Unit | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryStrategy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRetryStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: master | slave): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withSentinelPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentinelPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentinelPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentinelPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withSentinelRetryStrategy(value: /* times */ Double => Double | Unit | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentinelRetryStrategy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSentinelRetryStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentinelRetryStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withSentinelTLS(value: SecureContextOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentinelTLS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentinelTLS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentinelTLS")(js.undefined)
        ret
    }
    @scala.inline
    def withSentinels(value: js.Array[Host]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentinels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentinels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentinels")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFriendlyErrorStack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFriendlyErrorStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFriendlyErrorStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFriendlyErrorStack")(js.undefined)
        ret
    }
    @scala.inline
    def withTls(value: ConnectionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tls")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateSentinels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSentinels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateSentinels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSentinels")(js.undefined)
        ret
    }
  }
  
}

