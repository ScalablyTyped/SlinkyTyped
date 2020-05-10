package typingsSlinky.karmaParallel.mod

import typingsSlinky.karmaParallel.karmaParallelStrings.`description-length`
import typingsSlinky.karmaParallel.karmaParallelStrings.`round-robin`
import typingsSlinky.karmaParallel.karmaParallelStrings.custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParallelOptions extends js.Object {
  /**
    * regex or function used to determine if a reporter needs to only received aggregated events from the browser shards.
    * It is used to ensure coverage reporting is accurate amongst all the shards of a browser
    *  It is also useful for some programmatic reporters such as junit reporters that need to operate on a single set of test outputs and not once for each shard.
    * Set to null to disable aggregated reporting
    */
  var aggregatedReporterTest: js.UndefOr[(js.Function1[/* reporter */ js.Object, Boolean]) | js.RegExp | Null] = js.native
  /**
    * Custom function that will determine if a describe block should run in the current executor.
    * It is a function that is serialized and re-constructed on each executor.
    * The function will be called for every top level describe block and should return true if the describe block should run for a the current executor
    */
  var customShardStrategy: js.UndefOr[js.Function1[/* options */ ShardStrategOptions, Boolean]] = js.native
  /**
    * The number of browser instances to use to test.
    * If you test on multiple types of browsers, this spin up the number of executors for each browser type
    * @default cpu_cores-1
    */
  var executors: js.UndefOr[Double] = js.native
  /**
    * This plugin works by overriding the test suite describe() function.
    * When it encounters a describe, it must decide if it will skip the tests inside of it, or not
    * @default 'round-robin'
    */
  var shardStrategy: js.UndefOr[`round-robin` | `description-length` | custom] = js.native
}

object ParallelOptions {
  @scala.inline
  def apply(): ParallelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParallelOptions]
  }
  @scala.inline
  implicit class ParallelOptionsOps[Self <: ParallelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregatedReporterTestFunction1(value: /* reporter */ js.Object => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedReporterTest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAggregatedReporterTestRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedReporterTest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAggregatedReporterTest(value: (js.Function1[/* reporter */ js.Object, Boolean]) | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedReporterTest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregatedReporterTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedReporterTest")(js.undefined)
        ret
    }
    @scala.inline
    def withAggregatedReporterTestNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedReporterTest")(null)
        ret
    }
    @scala.inline
    def withCustomShardStrategy(value: /* options */ ShardStrategOptions => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customShardStrategy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomShardStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customShardStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executors")(js.undefined)
        ret
    }
    @scala.inline
    def withShardStrategy(value: `round-robin` | `description-length` | custom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shardStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShardStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shardStrategy")(js.undefined)
        ret
    }
  }
  
}

