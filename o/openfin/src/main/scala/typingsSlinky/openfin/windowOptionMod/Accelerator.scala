package typingsSlinky.openfin.windowOptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accelerator extends js.Object {
  var devtools: js.UndefOr[Boolean] = js.native
  var reload: js.UndefOr[Boolean] = js.native
  var reloadIgnoringCache: js.UndefOr[Boolean] = js.native
  var zoom: js.UndefOr[Boolean] = js.native
}

object Accelerator {
  @scala.inline
  def apply(): Accelerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accelerator]
  }
  @scala.inline
  implicit class AcceleratorOps[Self <: Accelerator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevtools(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevtools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtools")(js.undefined)
        ret
    }
    @scala.inline
    def withReload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reload")(js.undefined)
        ret
    }
    @scala.inline
    def withReloadIgnoringCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadIgnoringCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReloadIgnoringCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadIgnoringCache")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

