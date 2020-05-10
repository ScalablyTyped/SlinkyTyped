package typingsSlinky.leafletLoading.mod

import typingsSlinky.leaflet.mod.ControlOptions
import typingsSlinky.leaflet.mod.Control_.Zoom
import typingsSlinky.leafletLoading.AnonLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadingOptions extends ControlOptions {
  var delayIndicator: js.UndefOr[Double] = js.native
  var separate: js.UndefOr[Boolean] = js.native
  var spin: js.UndefOr[AnonLength] = js.native
  var spinjs: js.UndefOr[Boolean] = js.native
  var zoomControl: js.UndefOr[Zoom] = js.native
}

object LoadingOptions {
  @scala.inline
  def apply(): LoadingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadingOptions]
  }
  @scala.inline
  implicit class LoadingOptionsOps[Self <: LoadingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelayIndicator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separate")(js.undefined)
        ret
    }
    @scala.inline
    def withSpin(value: AnonLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spin")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinjs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinjs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinjs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinjs")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomControl(value: Zoom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomControl")(js.undefined)
        ret
    }
  }
  
}

