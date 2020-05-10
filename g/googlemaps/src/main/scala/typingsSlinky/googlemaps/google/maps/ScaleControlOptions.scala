package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for the rendering of the scale control. */
@js.native
trait ScaleControlOptions extends js.Object {
  /** Style id. Used to select what style of scale control to display. */
  var style: js.UndefOr[ScaleControlStyle] = js.native
}

object ScaleControlOptions {
  @scala.inline
  def apply(): ScaleControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleControlOptions]
  }
  @scala.inline
  implicit class ScaleControlOptionsOps[Self <: ScaleControlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyle(value: ScaleControlStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

