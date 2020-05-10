package typingsSlinky.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatcherOptions extends js.Object {
  var chokidar: js.UndefOr[Boolean | WatchOptions] = js.native
  var clearScreen: js.UndefOr[Boolean] = js.native
  var exclude: js.UndefOr[js.Array[String]] = js.native
  var include: js.UndefOr[js.Array[String]] = js.native
}

object WatcherOptions {
  @scala.inline
  def apply(): WatcherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherOptions]
  }
  @scala.inline
  implicit class WatcherOptionsOps[Self <: WatcherOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChokidar(value: Boolean | WatchOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chokidar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChokidar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chokidar")(js.undefined)
        ret
    }
    @scala.inline
    def withClearScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
  }
  
}

