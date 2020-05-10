package typingsSlinky.properLockfile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckOptions extends js.Object {
   // default: true
  var fs: js.UndefOr[js.Any] = js.native
   // default: graceful-fs
  var lockfilePath: js.UndefOr[String] = js.native
   // default: 10000
  var realpath: js.UndefOr[Boolean] = js.native
  var stale: js.UndefOr[Double] = js.native
}

object CheckOptions {
  @scala.inline
  def apply(): CheckOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckOptions]
  }
  @scala.inline
  implicit class CheckOptionsOps[Self <: CheckOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(js.undefined)
        ret
    }
    @scala.inline
    def withLockfilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockfilePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockfilePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockfilePath")(js.undefined)
        ret
    }
    @scala.inline
    def withRealpath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realpath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealpath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realpath")(js.undefined)
        ret
    }
    @scala.inline
    def withStale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stale")(js.undefined)
        ret
    }
  }
  
}

