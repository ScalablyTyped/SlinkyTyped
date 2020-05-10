package typingsSlinky.bull.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvancedSettings extends js.Object {
  /**
    * Define a custom backoff strategy
    */
  var backoffStrategies: js.UndefOr[
    StringDictionary[js.Function2[/* attemptsMade */ Double, /* err */ js.Error, Double]]
  ] = js.native
  /**
    * A timeout for when the queue is in `drained` state (empty waiting for jobs).
    * It is used when calling `queue.getNextJob()`, which will pass it to `.brpoplpush` on the Redis client.
    */
  var drainDelay: js.UndefOr[Double] = js.native
  /**
    * Poll interval for delayed jobs and added jobs
    */
  var guardInterval: js.UndefOr[Double] = js.native
  /**
    * Key expiration time for job locks
    */
  var lockDuration: js.UndefOr[Double] = js.native
  /**
    * Interval in milliseconds on which to acquire the job lock.
    */
  var lockRenewTime: js.UndefOr[Double] = js.native
  /**
    * Max amount of times a stalled job will be re-processed
    */
  var maxStalledCount: js.UndefOr[Double] = js.native
  /**
    * Delay before processing next job in case of internal error
    */
  var retryProcessDelay: js.UndefOr[Double] = js.native
  /**
    * How often check for stalled jobs (use 0 for never checking)
    */
  var stalledInterval: js.UndefOr[Double] = js.native
}

object AdvancedSettings {
  @scala.inline
  def apply(): AdvancedSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedSettings]
  }
  @scala.inline
  implicit class AdvancedSettingsOps[Self <: AdvancedSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackoffStrategies(value: StringDictionary[js.Function2[/* attemptsMade */ Double, /* err */ js.Error, Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoffStrategies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackoffStrategies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoffStrategies")(js.undefined)
        ret
    }
    @scala.inline
    def withDrainDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drainDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrainDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drainDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withGuardInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuardInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withLockDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withLockRenewTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockRenewTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockRenewTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockRenewTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxStalledCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStalledCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxStalledCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStalledCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryProcessDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryProcessDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryProcessDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryProcessDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withStalledInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stalledInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStalledInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stalledInterval")(js.undefined)
        ret
    }
  }
  
}

