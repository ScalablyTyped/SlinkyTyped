package typingsSlinky.mapboxGl

import typingsSlinky.mapboxGl.mod.FitBoundsOptions
import typingsSlinky.mapboxGl.mod.PositionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFitBoundsOptions extends js.Object {
  var fitBoundsOptions: js.UndefOr[FitBoundsOptions] = js.native
  var positionOptions: js.UndefOr[PositionOptions] = js.native
  var showAccuracyCircle: js.UndefOr[Boolean] = js.native
  var showUserLocation: js.UndefOr[Boolean] = js.native
  var trackUserLocation: js.UndefOr[Boolean] = js.native
}

object AnonFitBoundsOptions {
  @scala.inline
  def apply(): AnonFitBoundsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFitBoundsOptions]
  }
  @scala.inline
  implicit class AnonFitBoundsOptionsOps[Self <: AnonFitBoundsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFitBoundsOptions(value: FitBoundsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitBoundsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFitBoundsOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitBoundsOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionOptions(value: PositionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAccuracyCircle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAccuracyCircle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAccuracyCircle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAccuracyCircle")(js.undefined)
        ret
    }
    @scala.inline
    def withShowUserLocation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showUserLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowUserLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showUserLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackUserLocation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackUserLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackUserLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackUserLocation")(js.undefined)
        ret
    }
  }
  
}

