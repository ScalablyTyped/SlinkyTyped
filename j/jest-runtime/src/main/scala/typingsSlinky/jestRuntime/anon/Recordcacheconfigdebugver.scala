package typingsSlinky.jestRuntime.anon

import typingsSlinky.yargs.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<'cache' | 'config' | 'debug' | 'version' | 'watchman', yargs.yargs.Options> */
@js.native
trait Recordcacheconfigdebugver extends js.Object {
  var cache: Options = js.native
  var config: Options = js.native
  var debug: Options = js.native
  var version: Options = js.native
  var watchman: Options = js.native
}

object Recordcacheconfigdebugver {
  @scala.inline
  def apply(cache: Options, config: Options, debug: Options, version: Options, watchman: Options): Recordcacheconfigdebugver = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordcacheconfigdebugver]
  }
  @scala.inline
  implicit class RecordcacheconfigdebugverOps[Self <: Recordcacheconfigdebugver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatchman(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchman")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

