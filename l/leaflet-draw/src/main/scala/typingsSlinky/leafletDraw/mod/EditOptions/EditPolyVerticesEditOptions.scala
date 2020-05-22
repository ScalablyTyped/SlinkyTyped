package typingsSlinky.leafletDraw.mod.EditOptions

import typingsSlinky.leaflet.mod.DivIcon_
import typingsSlinky.leaflet.mod.IconOptions
import typingsSlinky.leaflet.mod.Icon_
import typingsSlinky.leafletDraw.mod.DrawOptions.DrawErrorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditPolyVerticesEditOptions extends js.Object {
  var drawError: js.UndefOr[DrawErrorOptions] = js.undefined
  var icon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.undefined
  var touchIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.undefined
}

object EditPolyVerticesEditOptions {
  @scala.inline
  def apply(
    drawError: DrawErrorOptions = null,
    icon: Icon_[IconOptions] | DivIcon_ = null,
    touchIcon: Icon_[IconOptions] | DivIcon_ = null
  ): EditPolyVerticesEditOptions = {
    val __obj = js.Dynamic.literal()
    if (drawError != null) __obj.updateDynamic("drawError")(drawError.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (touchIcon != null) __obj.updateDynamic("touchIcon")(touchIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditPolyVerticesEditOptions]
  }
}

