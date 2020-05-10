package typingsSlinky.opossum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Determines whether to allow failures without opening the circuit during a brief warmup period (`rollingCountDuration`)
    * This can help in situations where no matter what your `errorThresholdPercentage` is, if the
    * first execution times out or fails, the circuit immediately opens.
    * @default false
    */
  var allowWarmUp: js.UndefOr[Boolean] = js.native
  /**
    * Whether the return value of the first successful execution of the circuit's function will be cached.
    * Once a value has been cached that value will be returned for every subsequent execution: the cache can be cleared using `clearCache`.
    * (The metrics cacheHit and cacheMiss reflect cache activity.)
    * @default false
    */
  var cache: js.UndefOr[Boolean] = js.native
  /**
    * The number of concurrent requests allowed.
    * If the number currently executing function calls is equal to options.capacity, further calls
    * to `fire()` are rejected until at least one of the current requests completes.
    * @default MAX_SAFE_INTEGER
    */
  var capacity: js.UndefOr[Double] = js.native
  /**
    * Whether this circuit is enabled upon construction.
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * An optional function that will be called when the circuit's function fails (returns a rejected Promise).
    * If this function returns truthy, the circuit's `failPure` statistics will not be incremented.
    * This is useful, for example, when you don't want HTTP 404 to trip the circuit, but still want to handle it as a failure case.
    */
  var errorFilter: js.UndefOr[js.Function0[Boolean]] = js.native
  /**
    * The error percentage at which to open the circuit and start short-circuiting requests to fallback.
    * @default 50
    */
  var errorThresholdPercentage: js.UndefOr[Double] = js.native
  /**
    * A grouping key for reporting.
    * Defaults to the computed value of `name`
    */
  var group: js.UndefOr[String] = js.native
  /**
    * The number of times the circuit can fail before opening.
    * @default 10
    * @deprecated see options.errorThresholdPercentage
    */
  var maxFailures: js.UndefOr[Double] = js.native
  /**
    * The circuit name to use when reporting stats.
    * Defaults to the name of the function this circuit controls then falls back to a UUID
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The time in milliseconds to wait before setting the breaker to `halfOpen` state, and trying the action again.
    * @default 30000 (30 seconds)
    */
  var resetTimeout: js.UndefOr[Double] = js.native
  /**
    * Sets the number of buckets the rolling statistical window is divided into.
    * So, if options.rollingCountTimeout is 10,000, and options.rollingCountBuckets is 10, then the
    * statistical window will be 1,000 1 second snapshots in the statistical window.
    * @default 10
    */
  var rollingCountBuckets: js.UndefOr[Double] = js.native
  /**
    * Sets the duration of the statistical rolling window, in milliseconds.
    * This is how long Opossum keeps metrics for the circuit breaker to use and for publishing.
    * @default 10000
    */
  var rollingCountTimeout: js.UndefOr[Double] = js.native
  /**
    * This property indicates whether execution latencies should be tracked and calculated as percentiles.
    * If they are disabled, all summary statistics (mean, percentiles) are returned as -1.
    * @default false
    */
  var rollingPercentilesEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The time in milliseconds that action should be allowed to execute before timing out.
    * @default 10000 (10 seconds)
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * The minimum number of requests within the rolling statistical window that must exist before
    * the circuit breaker can open. This is similar to `allowWarmUp` in that no matter how many
    * failures there are, if the number of requests within the statistical window does not exceed
    * this threshold, the circuit will remain closed.
    * @default 0
    */
  var volumeThreshold: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowWarmUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowWarmUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowWarmUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowWarmUp")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorFilter(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorFilter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutErrorFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorThresholdPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorThresholdPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorThresholdPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorThresholdPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFailures(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFailures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFailures")(js.undefined)
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
    def withResetTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withRollingCountBuckets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollingCountBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRollingCountBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollingCountBuckets")(js.undefined)
        ret
    }
    @scala.inline
    def withRollingCountTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollingCountTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRollingCountTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollingCountTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withRollingPercentilesEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollingPercentilesEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRollingPercentilesEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollingPercentilesEnabled")(js.undefined)
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
    def withVolumeThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeThreshold")(js.undefined)
        ret
    }
  }
  
}

