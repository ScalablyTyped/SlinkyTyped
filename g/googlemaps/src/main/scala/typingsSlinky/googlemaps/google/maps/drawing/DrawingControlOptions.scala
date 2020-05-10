package typingsSlinky.googlemaps.google.maps.drawing

import typingsSlinky.googlemaps.google.maps.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawingControlOptions extends js.Object {
  var drawingModes: js.UndefOr[js.Array[OverlayType]] = js.native
  var position: js.UndefOr[ControlPosition] = js.native
}

object DrawingControlOptions {
  @scala.inline
  def apply(): DrawingControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawingControlOptions]
  }
  @scala.inline
  implicit class DrawingControlOptionsOps[Self <: DrawingControlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawingModes(value: js.Array[OverlayType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawingModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawingModes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawingModes")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: ControlPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
  }
  
}

