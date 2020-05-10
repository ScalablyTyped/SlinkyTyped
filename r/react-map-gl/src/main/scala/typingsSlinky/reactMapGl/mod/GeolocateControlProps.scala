package typingsSlinky.reactMapGl.mod

import typingsSlinky.mapboxGl.mod.FitBoundsOptions
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeolocateControlProps extends BaseControlProps {
  var className: js.UndefOr[String] = js.native
  var fitBoundsOptions: js.UndefOr[FitBoundsOptions] = js.native
  var label: js.UndefOr[String] = js.native
  var onGeolocate: js.UndefOr[js.Function1[/* options */ PositionOptions, Unit]] = js.native
  var onViewStateChange: js.UndefOr[ViewStateChangeHandler] = js.native
  var onViewportChange: js.UndefOr[ViewportChangeHandler] = js.native
  var positionOptions: js.UndefOr[typingsSlinky.mapboxGl.mod.PositionOptions] = js.native
  var showUserLocation: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var trackUserLocation: js.UndefOr[Boolean] = js.native
}

object GeolocateControlProps {
  @scala.inline
  def apply(): GeolocateControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeolocateControlProps]
  }
  @scala.inline
  implicit class GeolocateControlPropsOps[Self <: GeolocateControlProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
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
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGeolocate(value: /* options */ PositionOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGeolocate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGeolocate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGeolocate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnViewStateChange(value: /* info */ ViewStateChangeInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewStateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnViewStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewStateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnViewportChange(value: /* viewState */ ViewportProps => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewportChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnViewportChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewportChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionOptions(value: typingsSlinky.mapboxGl.mod.PositionOptions): Self = {
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
    def withStyle(value: CSSProperties): Self = {
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

