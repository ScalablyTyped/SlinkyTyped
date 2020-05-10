package typingsSlinky.karmaBrowserify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigOptions extends js.Object {
  /**
    * Config entry to configure how the bundle gets created
    * see {@link https://github.com/nikku/karma-browserify#usage}
    */
  var browserify: js.UndefOr[BrowserifyOptions] = js.native
  /**
    * You can configure the underlying watchify instance
    * see {@link https://github.com/nikku/karma-browserify#watchify-config}
    */
  var watchify: js.UndefOr[WatchifyOptions] = js.native
}

object ConfigOptions {
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowserify(value: BrowserifyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserify")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchify(value: WatchifyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchify")(js.undefined)
        ret
    }
  }
  
}

