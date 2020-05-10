package typingsSlinky.rollup.mod

import typingsSlinky.rollup.AnonPollInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchOptions extends js.Object {
  var alwaysStat: js.UndefOr[Boolean] = js.native
  var atomic: js.UndefOr[Boolean | Double] = js.native
  var awaitWriteFinish: js.UndefOr[AnonPollInterval | Boolean] = js.native
  var binaryInterval: js.UndefOr[Double] = js.native
  var cwd: js.UndefOr[String] = js.native
  var depth: js.UndefOr[Double] = js.native
  var disableGlobbing: js.UndefOr[Boolean] = js.native
  var followSymlinks: js.UndefOr[Boolean] = js.native
  var ignoreInitial: js.UndefOr[Boolean] = js.native
  var ignorePermissionErrors: js.UndefOr[Boolean] = js.native
  var ignored: js.UndefOr[js.Any] = js.native
  var interval: js.UndefOr[Double] = js.native
  var persistent: js.UndefOr[Boolean] = js.native
  var useFsEvents: js.UndefOr[Boolean] = js.native
  var usePolling: js.UndefOr[Boolean] = js.native
}

object WatchOptions {
  @scala.inline
  def apply(): WatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchOptions]
  }
  @scala.inline
  implicit class WatchOptionsOps[Self <: WatchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysStat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysStat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysStat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysStat")(js.undefined)
        ret
    }
    @scala.inline
    def withAtomic(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atomic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtomic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atomic")(js.undefined)
        ret
    }
    @scala.inline
    def withAwaitWriteFinish(value: AnonPollInterval | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awaitWriteFinish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwaitWriteFinish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awaitWriteFinish")(js.undefined)
        ret
    }
    @scala.inline
    def withBinaryInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaryInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableGlobbing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableGlobbing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableGlobbing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableGlobbing")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowSymlinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followSymlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowSymlinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followSymlinks")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreInitial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreInitial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreInitial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreInitial")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnorePermissionErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePermissionErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnorePermissionErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePermissionErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnored(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnored: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignored")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistent")(js.undefined)
        ret
    }
    @scala.inline
    def withUseFsEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFsEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseFsEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFsEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePolling")(js.undefined)
        ret
    }
  }
  
}

