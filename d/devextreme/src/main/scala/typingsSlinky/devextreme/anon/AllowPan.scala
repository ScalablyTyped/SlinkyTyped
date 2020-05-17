package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowPan extends js.Object {
  var allowPan: js.UndefOr[Boolean] = js.native
  var allowSelection: js.UndefOr[Boolean] = js.native
  var allowZoom: js.UndefOr[Boolean] = js.native
}

object AllowPan {
  @scala.inline
  def apply(): AllowPan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowPan]
  }
  @scala.inline
  implicit class AllowPanOps[Self <: AllowPan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowPan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPan")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowZoom")(js.undefined)
        ret
    }
  }
  
}

