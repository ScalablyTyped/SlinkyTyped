package typingsSlinky.leafletDraw.mod.EditOptions

import typingsSlinky.leaflet.mod.DivIcon_
import typingsSlinky.leaflet.mod.IconOptions
import typingsSlinky.leaflet.mod.Icon_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditSimpleShapeOptions extends js.Object {
  var moveIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
  var resizeIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
  var touchMoveIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
  var touchResizeIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
}

object EditSimpleShapeOptions {
  @scala.inline
  def apply(): EditSimpleShapeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditSimpleShapeOptions]
  }
  @scala.inline
  implicit class EditSimpleShapeOptionsOps[Self <: EditSimpleShapeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMoveIcon(value: Icon_[IconOptions] | DivIcon_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeIcon(value: Icon_[IconOptions] | DivIcon_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchMoveIcon(value: Icon_[IconOptions] | DivIcon_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchMoveIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchMoveIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchMoveIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchResizeIcon(value: Icon_[IconOptions] | DivIcon_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchResizeIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchResizeIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchResizeIcon")(js.undefined)
        ret
    }
  }
  
}

