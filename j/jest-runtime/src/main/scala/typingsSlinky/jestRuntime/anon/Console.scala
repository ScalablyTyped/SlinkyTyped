package typingsSlinky.jestRuntime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Console extends js.Object {
  var console: js.UndefOr[org.scalajs.dom.raw.Console] = js.native
  var maxWorkers: Double = js.native
  var watch: js.UndefOr[Boolean] = js.native
  var watchman: Boolean = js.native
}

object Console {
  @scala.inline
  def apply(maxWorkers: Double, watchman: Boolean): Console = {
    val __obj = js.Dynamic.literal(maxWorkers = maxWorkers.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
    __obj.asInstanceOf[Console]
  }
  @scala.inline
  implicit class ConsoleOps[Self <: Console] (val x: Self) extends AnyVal {
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
    def withWatchman(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchman")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsole(value: org.scalajs.dom.raw.Console): Self = {
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

