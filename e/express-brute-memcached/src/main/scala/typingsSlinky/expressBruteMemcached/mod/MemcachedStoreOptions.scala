package typingsSlinky.expressBruteMemcached.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemcachedStoreOptions extends js.Object {
  /**
    * @summary Hashing algorithm used to generate the  hashRing  values
    * @type {string}
    */
  var algorithm: String = js.native
  /**
    * @summary An array of  server_locations  to replace servers that fail and that are removed from the consistent hashing scheme.
    * @type {Array}
    */
  var failOverServers: js.Array[_] = js.native
  /**
    * @summary Number of failed-attempts to a server before it is regarded as 'dead'.
    * @type {number}
    */
  var failures: Double = js.native
  /**
    * @summary Idle timeout for the connections.
    * @type {number}
    */
  var idle: Double = js.native
  /**
    * @summary True, whether to use  md5  as hashing scheme when keys exceed  maxKeySize .
    * @type
    */
  var keyCompression: Boolean = js.native
  /**
    * @summary Maximum expiration time of keys (in seconds).
    * @type {number}
    */
  var maxExpiration: Double = js.native
  /**
    * @summary Maximum key size allowed.
    * @type {number}
    */
  var maxKeySize: Double = js.native
  /**
    * @summary Maximum size of a value.
    * @type {number}
    */
  var maxValue: Double = js.native
  /**
    * @summary Maximum size of the connection pool.
    * @type {number}
    */
  var poolSize: Double = js.native
  var prefix: String = js.native
  /**
    * @summary Time between reconnection attempts (in milliseconds).
    * @type {number}
    */
  var reconnect: Double = js.native
  /**
    * @summary If true, authorizes the automatic removal of dead servers from the pool.
    * @type {boolean}
    */
  var remove: Boolean = js.native
  /**
    * @summary Number of socket allocation retries per request.
    * @type {number}
    */
  var retries: Double = js.native
  /**
    * @summary Time between a server failure and an attempt to set it up back in service.
    * @type {number}
    */
  var retry: Double = js.native
  /**
    * @summary Time after which Memcached sends a connection timeout (in milliseconds).
    * @type {number}
    */
  var timeout: Double = js.native
}

object MemcachedStoreOptions {
  @scala.inline
  def apply(
    algorithm: String,
    failOverServers: js.Array[_],
    failures: Double,
    idle: Double,
    keyCompression: Boolean,
    maxExpiration: Double,
    maxKeySize: Double,
    maxValue: Double,
    poolSize: Double,
    prefix: String,
    reconnect: Double,
    remove: Boolean,
    retries: Double,
    retry: Double,
    timeout: Double
  ): MemcachedStoreOptions = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], failOverServers = failOverServers.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], keyCompression = keyCompression.asInstanceOf[js.Any], maxExpiration = maxExpiration.asInstanceOf[js.Any], maxKeySize = maxKeySize.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], poolSize = poolSize.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], reconnect = reconnect.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemcachedStoreOptions]
  }
  @scala.inline
  implicit class MemcachedStoreOptionsOps[Self <: MemcachedStoreOptions] (val x: Self) extends AnyVal {
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
    def withFailOverServers(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOverServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailures(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyCompression(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyCompression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxExpiration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxExpiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxKeySize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxKeySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoolSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReconnect(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetry(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

