package typingsSlinky.openlayers.mod.olx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameState extends js.Object {
  var pixelRatio: Double = js.native
  var time: Double = js.native
  var viewState: ViewState = js.native
}

object FrameState {
  @scala.inline
  def apply(pixelRatio: Double, time: Double, viewState: ViewState): FrameState = {
    val __obj = js.Dynamic.literal(pixelRatio = pixelRatio.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], viewState = viewState.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameState]
  }
  @scala.inline
  implicit class FrameStateOps[Self <: FrameState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewState(value: ViewState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

