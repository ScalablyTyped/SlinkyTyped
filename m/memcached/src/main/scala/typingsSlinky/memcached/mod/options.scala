package typingsSlinky.memcached.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait options extends js.Object {
  /**
    * md5, the hashing algorithm used to generate the hashRing values.
    */
  var algorithm: js.UndefOr[String] = js.native
  /**
    * undefined, an array of server_locations to replace servers that fail and that are removed from the consistent hashing scheme.
    */
  var failOverServers: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * 5, the number of failed-attempts to a server before it is regarded as 'dead'.
    */
  var failures: js.UndefOr[Double] = js.native
  /**
    * 5000, the idle timeout for the connections.
    */
  var idle: js.UndefOr[Double] = js.native
  /**
    * true, whether to use md5 as hashing scheme when keys exceed maxKeySize.
    */
  var keyCompression: js.UndefOr[Boolean] = js.native
  /**
    * 2592000, the maximum expiration time of keys (in seconds).
    */
  var maxExpiration: js.UndefOr[Double] = js.native
  /**
    * 250, the maximum key size allowed.
    */
  var maxKeySize: js.UndefOr[Double] = js.native
  /**
    * 1048576, the maximum size of a value.
    */
  var maxValue: js.UndefOr[Double] = js.native
  /**
    * '', sentinel to prepend to all memcache keys for namespacing the entries.
    */
  var namespace: js.UndefOr[String] = js.native
  /**
    * 10, the maximum size of the connection pool.
    */
  var poolSize: js.UndefOr[Double] = js.native
  /**
    * 18000000, the time between reconnection attempts (in milliseconds).
    */
  var reconnect: js.UndefOr[Double] = js.native
  /**
    * false, if true, authorizes the automatic removal of dead servers from the pool.
    */
  var remove: js.UndefOr[Boolean] = js.native
  /**
    * 5, the number of socket allocation retries per request.
    */
  var retries: js.UndefOr[Double] = js.native
  /**
    * 30000, the time between a server failure and an attempt to set it up back in service.
    */
  var retry: js.UndefOr[Double] = js.native
  /**
    * 5000, the time after which Memcached sends a connection timeout (in milliseconds).
    */
  var timeout: js.UndefOr[Double] = js.native
}

object options {
  @scala.inline
  def apply(): options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[options]
  }
  @scala.inline
  implicit class optionsOps[Self <: options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withFailOverServers(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOverServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailOverServers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOverServers")(js.undefined)
        ret
    }
    @scala.inline
    def withFailures(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(js.undefined)
        ret
    }
    @scala.inline
    def withIdle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idle")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyCompression(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyCompression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyCompression")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxExpiration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxExpiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxExpiration")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxKeySize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxKeySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxKeySize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxKeySize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withPoolSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoolSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolSize")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnect(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(js.undefined)
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
  }
  
}

