package typingsSlinky.ivViewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sliders extends js.Object {
  var imageSlider: js.UndefOr[Slider] = js.native
  var snapSlider: js.UndefOr[Slider] = js.native
  var zoomSlider: js.UndefOr[Slider] = js.native
}

object Sliders {
  @scala.inline
  def apply(): Sliders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sliders]
  }
  @scala.inline
  implicit class SlidersOps[Self <: Sliders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageSlider(value: Slider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSlider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageSlider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSlider")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapSlider(value: Slider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapSlider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapSlider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapSlider")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomSlider(value: Slider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomSlider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomSlider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomSlider")(js.undefined)
        ret
    }
  }
  
}

