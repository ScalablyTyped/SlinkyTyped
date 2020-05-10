package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for the rendering of the fullscreen control. */
@js.native
trait FullscreenControlOptions extends js.Object {
  /**
    * Position id. Used to specify the position of the control on the map.
    * The default position is RIGHT_TOP.
    */
  var position: js.UndefOr[ControlPosition] = js.native
}

object FullscreenControlOptions {
  @scala.inline
  def apply(): FullscreenControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullscreenControlOptions]
  }
  @scala.inline
  implicit class FullscreenControlOptionsOps[Self <: FullscreenControlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

