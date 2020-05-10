package typingsSlinky.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollupBuild extends js.Object {
  var cache: RollupCache = js.native
  var getTimings: js.UndefOr[js.Function0[SerializedTimings]] = js.native
  var watchFiles: js.Array[String] = js.native
  def generate(outputOptions: OutputOptions): js.Promise[RollupOutput] = js.native
  def write(options: OutputOptions): js.Promise[RollupOutput] = js.native
}

object RollupBuild {
  @scala.inline
  def apply(
    cache: RollupCache,
    generate: OutputOptions => js.Promise[RollupOutput],
    watchFiles: js.Array[String],
    write: OutputOptions => js.Promise[RollupOutput]
  ): RollupBuild = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], generate = js.Any.fromFunction1(generate), watchFiles = watchFiles.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[RollupBuild]
  }
  @scala.inline
  implicit class RollupBuildOps[Self <: RollupBuild] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: RollupCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerate(value: OutputOptions => js.Promise[RollupOutput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWatchFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrite(value: OutputOptions => js.Promise[RollupOutput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTimings(value: () => SerializedTimings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTimings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimings")(js.undefined)
        ret
    }
  }
  
}

