package typingsSlinky.maxmind.mod

import typingsSlinky.maxmind.AnonMax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenOpts extends js.Object {
  var cache: js.UndefOr[AnonMax] = js.native
  var watchForUpdates: js.UndefOr[Boolean] = js.native
  var watchForUpdatesHook: js.UndefOr[Callback] = js.native
  var watchForUpdatesNonPersistent: js.UndefOr[Boolean] = js.native
}

object OpenOpts {
  @scala.inline
  def apply(): OpenOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenOpts]
  }
  @scala.inline
  implicit class OpenOptsOps[Self <: OpenOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: AnonMax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchForUpdates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchForUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchForUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchForUpdates")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchForUpdatesHook(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchForUpdatesHook")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutWatchForUpdatesHook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchForUpdatesHook")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchForUpdatesNonPersistent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchForUpdatesNonPersistent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchForUpdatesNonPersistent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchForUpdatesNonPersistent")(js.undefined)
        ret
    }
  }
  
}

