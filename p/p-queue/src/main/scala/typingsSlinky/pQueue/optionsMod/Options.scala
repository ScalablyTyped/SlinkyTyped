package typingsSlinky.pQueue.optionsMod

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.pQueue.queueMod.Queue
import typingsSlinky.pQueue.queueMod.RunFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[QueueType /* <: Queue[RunFunction, QueueOptions] */, QueueOptions /* <: QueueAddOptions */] extends js.Object {
  /**
    Whether queue tasks within concurrency limit, are auto-executed as soon as they're added.
    @default true
    */
  val autoStart: js.UndefOr[Boolean] = js.native
  /**
    Whether the task must finish in the given interval or will be carried over into the next interval count.
    @default false
    */
  val carryoverConcurrencyCount: js.UndefOr[Boolean] = js.native
  /**
    Concurrency limit.
    Minimum: `1`.
    @default Infinity
    */
  val concurrency: js.UndefOr[Double] = js.native
  /**
    The length of time in milliseconds before the interval count resets. Must be finite.
    Minimum: `0`.
    @default 0
    */
  val interval: js.UndefOr[Double] = js.native
  /**
    The max number of runs in the given interval of time.
    Minimum: `1`.
    @default Infinity
    */
  val intervalCap: js.UndefOr[Double] = js.native
  /**
    Class with a `enqueue` and `dequeue` method, and a `size` getter. See the [Custom QueueClass](https://github.com/sindresorhus/p-queue#custom-queueclass) section.
    */
  val queueClass: js.UndefOr[Instantiable0[QueueType]] = js.native
  /**
    Whether or not a timeout is considered an exception.
    @default false
    */
  var throwOnTimeout: js.UndefOr[Boolean] = js.native
  /**
    Per-operation timeout in milliseconds. Operations fulfill once `timeout` elapses if they haven't already.
    */
  var timeout: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply[QueueType, QueueOptions](): Options[QueueType, QueueOptions] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[QueueType, QueueOptions]]
  }
  @scala.inline
  implicit class OptionsOps[Self[queuetype, queueoptions] <: Options[queuetype, queueoptions], QueueType, QueueOptions] (val x: Self[QueueType, QueueOptions]) extends AnyVal {
    @scala.inline
    def duplicate: Self[QueueType, QueueOptions] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[QueueType, QueueOptions]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[QueueType, QueueOptions]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[QueueType, QueueOptions]) with Other]
    @scala.inline
    def withAutoStart(value: Boolean): Self[QueueType, QueueOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoStart: Self[QueueType, QueueOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(js.undefined)
        ret
    }
    @scala.inline
    def withCarryoverConcurrencyCount(value: Boolean): Self[QueueType, QueueOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carryoverConcurrencyCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarryoverConcurrencyCount: Self[QueueType, QueueOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carryoverConcurrencyCount")(js.undefined)
        ret
    }
    @scala.inline
    def withConcurrency(value: Double): Self[QueueType, QueueOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrency: Self[QueueType, QueueOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self[QueueType, QueueOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self[QueueType, QueueOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withIntervalCap(value: Double): Self[QueueType, QueueOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntervalCap: Self[QueueType, QueueOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalCap")(js.undefined)
        ret
    }
    @scala.inline
    def withQueueClass(value: Instantiable0[QueueType]): Self[QueueType, QueueOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueueClass: Self[QueueType, QueueOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueClass")(js.undefined)
        ret
    }
    @scala.inline
    def withThrowOnTimeout(value: Boolean): Self[QueueType, QueueOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwOnTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrowOnTimeout: Self[QueueType, QueueOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwOnTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self[QueueType, QueueOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self[QueueType, QueueOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

