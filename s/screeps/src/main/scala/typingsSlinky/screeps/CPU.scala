package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CPU extends js.Object {
  /**
    * An amount of unused CPU accumulated in your bucket.
    * @see http://docs.screeps.com/cpu-limit.html#Bucket
    */
  var bucket: Double = js.native
  /**
    * Use this method to get heap statistics for your virtual machine.
    *
    * This method will be undefined if you are not using IVM.
    *
    * The return value is almost identical to the Node.js function v8.getHeapStatistics().
    * This function returns one additional property: externally_allocated_size which is the total amount of currently
    * allocated memory which is not included in the v8 heap but counts against this isolate's memory limit.
    * ArrayBuffer instances over a certain size are externally allocated and will be counted here.
    */
  var getHeapStatistics: js.UndefOr[js.Function0[HeapStatistics]] = js.native
  /**
    * This method will be undefined if you are not using IVM.
    *
    * Reset your runtime environment and wipe all data in heap memory.
    * Player code execution stops immediately.
    */
  var halt: js.UndefOr[js.Function0[scala.Nothing]] = js.native
  /**
    * Your assigned CPU limit for the current shard.
    */
  var limit: Double = js.native
  /**
    * An object with limits for each shard with shard names as keys. You can use `setShardLimits` method to re-assign them.
    */
  var shardLimits: CPUShardLimits = js.native
  /**
    * An amount of available CPU time at the current game tick. Usually it is higher than `Game.cpu.limit`.
    */
  var tickLimit: Double = js.native
  /**
    * Get amount of CPU time used from the beginning of the current game tick. Always returns 0 in the Simulation mode.
    */
  def getUsed(): Double = js.native
  /**
    * Allocate CPU limits to different shards. Total amount of CPU should remain equal to `Game.cpu.shardLimits`.
    * This method can be used only once per 12 hours.
    *
    * @param limits An object with CPU values for each shard in the same format as `Game.cpu.shardLimits`.
    * @returns One of the following codes: `OK | ERR_BUSY | ERR_INVALID_ARGS`
    */
  def setShardLimits(limits: CPUShardLimits): OK | ERR_BUSY | ERR_INVALID_ARGS = js.native
}

object CPU {
  @scala.inline
  def apply(
    bucket: Double,
    getUsed: () => Double,
    limit: Double,
    setShardLimits: CPUShardLimits => OK | ERR_BUSY | ERR_INVALID_ARGS,
    shardLimits: CPUShardLimits,
    tickLimit: Double
  ): CPU = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], getUsed = js.Any.fromFunction0(getUsed), limit = limit.asInstanceOf[js.Any], setShardLimits = js.Any.fromFunction1(setShardLimits), shardLimits = shardLimits.asInstanceOf[js.Any], tickLimit = tickLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPU]
  }
  @scala.inline
  implicit class CPUOps[Self <: CPU] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetUsed(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUsed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetShardLimits(value: CPUShardLimits => OK | ERR_BUSY | ERR_INVALID_ARGS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setShardLimits")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShardLimits(value: CPUShardLimits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shardLimits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetHeapStatistics(value: () => HeapStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeapStatistics")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHeapStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeapStatistics")(js.undefined)
        ret
    }
    @scala.inline
    def withHalt(value: () => scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halt")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHalt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halt")(js.undefined)
        ret
    }
  }
  
}

