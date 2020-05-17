package typingsSlinky.mapboxGl.anon

import typingsSlinky.mapboxGl.mod.PositionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FitBoundsOptions extends js.Object {
  var fitBoundsOptions: js.UndefOr[typingsSlinky.mapboxGl.mod.FitBoundsOptions] = js.native
  var positionOptions: js.UndefOr[PositionOptions] = js.native
  var showAccuracyCircle: js.UndefOr[Boolean] = js.native
  var showUserLocation: js.UndefOr[Boolean] = js.native
  var trackUserLocation: js.UndefOr[Boolean] = js.native
}

object FitBoundsOptions {
  @scala.inline
  def apply(): FitBoundsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FitBoundsOptions]
  }
  @scala.inline
  implicit class FitBoundsOptionsOps[Self <: FitBoundsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFitBoundsOptions(value: typingsSlinky.mapboxGl.mod.FitBoundsOptions): Self = {
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

