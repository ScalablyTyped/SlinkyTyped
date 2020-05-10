package typingsSlinky.backboneLayoutmanager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutManagerOptions extends js.Object {
  var el: js.UndefOr[Boolean] = js.native
  var manage: js.UndefOr[Boolean] = js.native
}

object LayoutManagerOptions {
  @scala.inline
  def apply(): LayoutManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutManagerOptions]
  }
  @scala.inline
  implicit class LayoutManagerOptionsOps[Self <: LayoutManagerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(js.undefined)
        ret
    }
    @scala.inline
    def withManage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manage")(js.undefined)
        ret
    }
  }
  
}

