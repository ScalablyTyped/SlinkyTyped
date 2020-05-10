package typingsSlinky.leafletResponsivePopup.mod

import typingsSlinky.leaflet.mod.PopupOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponsivePopupOptions extends PopupOptions {
  var hasTip: js.UndefOr[Boolean] = js.native
}

object ResponsivePopupOptions {
  @scala.inline
  def apply(): ResponsivePopupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsivePopupOptions]
  }
  @scala.inline
  implicit class ResponsivePopupOptionsOps[Self <: ResponsivePopupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasTip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasTip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTip")(js.undefined)
        ret
    }
  }
  
}

