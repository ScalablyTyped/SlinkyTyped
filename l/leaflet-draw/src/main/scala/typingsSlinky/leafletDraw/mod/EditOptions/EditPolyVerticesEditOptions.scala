package typingsSlinky.leafletDraw.mod.EditOptions

import typingsSlinky.leaflet.mod.DivIcon_
import typingsSlinky.leaflet.mod.IconOptions
import typingsSlinky.leaflet.mod.Icon_
import typingsSlinky.leafletDraw.mod.DrawOptions.DrawErrorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditPolyVerticesEditOptions extends js.Object {
  var drawError: js.UndefOr[DrawErrorOptions] = js.native
  var icon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
  var touchIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
}

object EditPolyVerticesEditOptions {
  @scala.inline
  def apply(): EditPolyVerticesEditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditPolyVerticesEditOptions]
  }
  @scala.inline
  implicit class EditPolyVerticesEditOptionsOps[Self <: EditPolyVerticesEditOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawError(value: DrawErrorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawError")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: Icon_[IconOptions] | DivIcon_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchIcon(value: Icon_[IconOptions] | DivIcon_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchIcon")(js.undefined)
        ret
    }
  }
  
}

