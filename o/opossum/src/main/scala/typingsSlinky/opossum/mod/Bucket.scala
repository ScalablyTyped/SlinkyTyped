package typingsSlinky.opossum.mod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bucket extends js.Object {
  var cacheHits: Double = js.native
  var cacheMisses: Double = js.native
  var failures: Double = js.native
  var fallbacks: Double = js.native
  var fires: Double = js.native
  var latencyTimes: js.Array[Double] = js.native
  var percentiles: NumberDictionary[Double] = js.native
  var rejects: Double = js.native
  var semaphoreRejections: Double = js.native
  var successes: Double = js.native
  var timeouts: Double = js.native
}

object Bucket {
  @scala.inline
  def apply(
    cacheHits: Double,
    cacheMisses: Double,
    failures: Double,
    fallbacks: Double,
    fires: Double,
    latencyTimes: js.Array[Double],
    percentiles: NumberDictionary[Double],
    rejects: Double,
    semaphoreRejections: Double,
    successes: Double,
    timeouts: Double
  ): Bucket = {
    val __obj = js.Dynamic.literal(cacheHits = cacheHits.asInstanceOf[js.Any], cacheMisses = cacheMisses.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], fallbacks = fallbacks.asInstanceOf[js.Any], fires = fires.asInstanceOf[js.Any], latencyTimes = latencyTimes.asInstanceOf[js.Any], percentiles = percentiles.asInstanceOf[js.Any], rejects = rejects.asInstanceOf[js.Any], semaphoreRejections = semaphoreRejections.asInstanceOf[js.Any], successes = successes.asInstanceOf[js.Any], timeouts = timeouts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bucket]
  }
  @scala.inline
  implicit class BucketOps[Self <: Bucket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheHits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheHits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheMisses(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheMisses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailures(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFallbacks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFires(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatencyTimes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latencyTimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercentiles(value: NumberDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRejects(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSemaphoreRejections(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semaphoreRejections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccesses(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeouts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeouts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

