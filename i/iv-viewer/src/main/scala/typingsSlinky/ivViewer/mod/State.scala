package typingsSlinky.ivViewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var containerDim: js.UndefOr[Dim] = js.native
  var imageDim: js.UndefOr[Dim] = js.native
  var loaded: js.UndefOr[Boolean] = js.native
  var snapHandleDim: js.UndefOr[Dim] = js.native
  var snapImageDim: js.UndefOr[Dim] = js.native
  var snapViewVisible: js.UndefOr[Boolean] = js.native
  var zoomSliderLength: js.UndefOr[Double] = js.native
  var zoomValue: js.UndefOr[Double] = js.native
  var zooming: js.UndefOr[Boolean] = js.native
}

object State {
  @scala.inline
  def apply(): State = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerDim(value: Dim): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerDim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerDim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerDim")(js.undefined)
        ret
    }
    @scala.inline
    def withImageDim(value: Dim): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageDim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDim")(js.undefined)
        ret
    }
    @scala.inline
    def withLoaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapHandleDim(value: Dim): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapHandleDim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapHandleDim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapHandleDim")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapImageDim(value: Dim): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapImageDim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapImageDim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapImageDim")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapViewVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapViewVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapViewVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapViewVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomSliderLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomSliderLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomSliderLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomSliderLength")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomValue")(js.undefined)
        ret
    }
    @scala.inline
    def withZooming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zooming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZooming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zooming")(js.undefined)
        ret
    }
  }
  
}

