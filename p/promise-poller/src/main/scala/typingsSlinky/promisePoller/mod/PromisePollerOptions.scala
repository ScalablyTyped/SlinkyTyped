package typingsSlinky.promisePoller.mod

import typingsSlinky.promisePoller.promisePollerStrings.`exponential-backoff`
import typingsSlinky.promisePoller.promisePollerStrings.`fixed-interval`
import typingsSlinky.promisePoller.promisePollerStrings.`linear-backoff`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromisePollerOptions[T] extends js.Object {
  /**
    * `strategy: 'linear-backoff'` --
    * The amount to increase the interval by on each poll attempt.
    */
  var increment: js.UndefOr[Double] = js.native
  /**
    * `strategy: 'fixed-interval'` --
    * Time to wait ms until taskFn runs again.
    * @default 1000
    */
  var interval: js.UndefOr[Double] = js.native
  /**
    * Timeout in ms to reject taskFn's promise regardless of retries -- A
    * timeout for the entire master polling operation.
    */
  var masterTimeout: js.UndefOr[Double] = js.native
  /**
    * `strategy: 'exponential-backoff'` --
    * The maximum interval amount to use
    * @default 30000
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * `strategy: 'exponential-backoff'` --
    * The minimum interval amount to use
    * @default 1000
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * ## Debugging
    * `promise-poller` uses the [debug](https://www.npmjs.com/package/debug)
    * library. The debug name is `promisePoller`. To run your program with
    * debug output for the `promise-poller`, set the `DEBUG` environment
    * variable accordingly:
    *
    * `% DEBUG=promisePoller node path/to/app.js`
    *
    * If you have more than one poller active at a time, and you need to
    * differentiate between them in debug output, you can give the
    * `promisePoller` options a `name` property.
    *
    * When this poller prints debug messages, the poller name will be included:
    * ```text
    * promisePoller (App Server Poller) Poll failed. 1 retries remaining. +504ms
    * ```
    * @example 'App Server Poller'
    */
  var name: js.UndefOr[String] = js.native
  /**
    * ## Progress notification
    * You can also specify a progress callback function. Each time the task
    * fails, the progress callback will be called with the number of retries
    * remaining and the error that occurred (the value that the task promise
    * was rejected with)
    */
  var progressCallback: js.UndefOr[js.Function2[/* retriesRemaining */ Double, /* error */ js.Any, Unit]] = js.native
  /**
    * Number of times to attempt taskFn.
    * @default 5
    */
  var retries: js.UndefOr[Double] = js.native
  /**
    * If the poll attempt failed, and you want to abort further polling, return
    * `false` from this function. On the other hand, if your poll resolved to a
    * value but you want to keep polling, return `true` from this function.
    *
    * @param reason a rejection reason when a poll fails
    * @param value the resolved value when a poll succeeds
    * @default err => !!err
    */
  var shouldContinue: js.UndefOr[js.Function2[/* reason */ js.Any, /* value */ js.UndefOr[T], Boolean]] = js.native
  /**
    * `strategy: 'linear-backoff'` --
    * The starting value to use for the polling interval
    * @default 1000
    */
  var start: js.UndefOr[Double] = js.native
  /**
    * ## Select polling strategy
    * By default, `promise-poller` will use a fixed interval between each poll
    * attempt. For example, with an `interval` option of 500, the poller will
    * poll approximately every 500 milliseconds. This is the `fixed-interval`
    * strategy. There are two other strategies available that may better suit
    * your use case. To select a polling strategy, specify the `strategy`
    * option, e.g.:
    *
    *     promisePoller({
    *       taskFn: myTask,
    *       strategy: 'linear-backoff'
    *     });
    *
    * ### Linear backoff (`linear-backoff`)
    * Options: `start`, `increment`
    *
    * Linear backoff will increase the interval linearly by some constant
    * amount for each poll attempt. For example, using the default options, the
    * first retry will wait 1000 milliseconds. Each successive retry will wait
    * an additional 1000 milliseconds: 1000, 2000, 3000, 4000, etc.
    *
    * ### Exponential backoff with jitter (`exponential-backoff`)
    * Options: `min`, `max`
    *
    * Exponential backoff increases the poll interval by a power of two for
    * each poll attempt. `promise-poller` uses exponential backoff with jitter.
    * Jitter takes a random value between `min` and 2^*n* on the *n*th polling
    * interval, not to exceed `max`.
    *
    * For more information about exponential backoff with jitter, and its
    * advantages, see
    * [this blog post from the AWS team](https://www.awsarchitectureblog.com/2015/03/backoff.html).
    *
    * @default 'fixed-interval'
    */
  var strategy: js.UndefOr[`fixed-interval` | `linear-backoff` | `exponential-backoff`] = js.native
  /**
    * For each poll attempt, reject after this timeout has passed
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * ## Basic usage
    * The core of `promise-poller` is a *task function*. This is simply a
    * function that starts your asynchronous task and returns a promise. If the
    * task function does not return a promise, it will be wrapped in a promise.
    * To start polling, pass your task function to the `promisePoller`
    * function, using this option.
    *
    * ## Cancel polling
    * You may want to cancel the polling early. For example, if the poll fails
    * because of an invalid password, that's not likely to change, so it would
    * be a waste of time to continue to poll. To cancel polling early, return
    * `false` from the task function instead of a promise.
    */
  def taskFn(): T | js.Thenable[T] = js.native
}

object PromisePollerOptions {
  @scala.inline
  def apply[T](taskFn: () => T | js.Thenable[T]): PromisePollerOptions[T] = {
    val __obj = js.Dynamic.literal(taskFn = js.Any.fromFunction0(taskFn))
    __obj.asInstanceOf[PromisePollerOptions[T]]
  }
  @scala.inline
  implicit class PromisePollerOptionsOps[Self[t] <: PromisePollerOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withTaskFn(value: () => T | js.Thenable[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskFn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIncrement(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncrement: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterTimeout(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterTimeout: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressCallback(value: (/* retriesRemaining */ Double, /* error */ js.Any) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutProgressCallback: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withRetries(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetries: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldContinue(value: (/* reason */ js.Any, /* value */ js.UndefOr[T]) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldContinue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutShouldContinue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldContinue")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStrategy(value: `fixed-interval` | `linear-backoff` | `exponential-backoff`): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrategy: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

