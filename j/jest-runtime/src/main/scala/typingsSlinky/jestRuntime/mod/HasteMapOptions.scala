package typingsSlinky.jestRuntime.mod

import typingsSlinky.std.Console_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasteMapOptions extends js.Object {
  var console: js.UndefOr[Console_] = js.native
  var maxWorkers: Double = js.native
  var resetCache: Boolean = js.native
  var watch: js.UndefOr[Boolean] = js.native
  var watchman: Boolean = js.native
}

object HasteMapOptions {
  @scala.inline
  def apply(maxWorkers: Double, resetCache: Boolean, watchman: Boolean): HasteMapOptions = {
    val __obj = js.Dynamic.literal(maxWorkers = maxWorkers.asInstanceOf[js.Any], resetCache = resetCache.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasteMapOptions]
  }
  @scala.inline
  implicit class HasteMapOptionsOps[Self <: HasteMapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxWorkers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatchman(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchman")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsole(value: Console_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("console")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("console")(js.undefined)
        ret
    }
    @scala.inline
    def withWatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.undefined)
        ret
    }
  }
  
}

