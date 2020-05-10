package typingsSlinky.materialMenuSurface

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonANCHORTOMENUSURFACEWIDTHRATIO extends js.Object {
  var ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO: Double = js.native
  var MARGIN_TO_EDGE: Double = js.native
  var TRANSITION_CLOSE_DURATION: Double = js.native
  var TRANSITION_OPEN_DURATION: Double = js.native
}

object AnonANCHORTOMENUSURFACEWIDTHRATIO {
  @scala.inline
  def apply(
    ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO: Double,
    MARGIN_TO_EDGE: Double,
    TRANSITION_CLOSE_DURATION: Double,
    TRANSITION_OPEN_DURATION: Double
  ): AnonANCHORTOMENUSURFACEWIDTHRATIO = {
    val __obj = js.Dynamic.literal(ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO = ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO.asInstanceOf[js.Any], MARGIN_TO_EDGE = MARGIN_TO_EDGE.asInstanceOf[js.Any], TRANSITION_CLOSE_DURATION = TRANSITION_CLOSE_DURATION.asInstanceOf[js.Any], TRANSITION_OPEN_DURATION = TRANSITION_OPEN_DURATION.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonANCHORTOMENUSURFACEWIDTHRATIO]
  }
  @scala.inline
  implicit class AnonANCHORTOMENUSURFACEWIDTHRATIOOps[Self <: AnonANCHORTOMENUSURFACEWIDTHRATIO] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withANCHOR_TO_MENU_SURFACE_WIDTH_RATIO(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMARGIN_TO_EDGE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MARGIN_TO_EDGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRANSITION_CLOSE_DURATION(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_CLOSE_DURATION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRANSITION_OPEN_DURATION(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_OPEN_DURATION")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

