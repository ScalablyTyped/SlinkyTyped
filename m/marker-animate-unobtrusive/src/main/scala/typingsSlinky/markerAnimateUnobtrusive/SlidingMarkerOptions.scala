package typingsSlinky.markerAnimateUnobtrusive

import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.Marker
import typingsSlinky.googlemaps.google.maps.MarkerOptions
import typingsSlinky.markerAnimateUnobtrusive.jQuery.easing.IEasingType
import typingsSlinky.markerAnimateUnobtrusive.markerAnimateUnobtrusiveStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlidingMarkerOptions extends MarkerOptions {
  var animateFunctionAdapter: js.UndefOr[
    js.Function4[
      /* marker */ Marker, 
      /* destPoint */ LatLng, 
      /* easing */ linear | IEasingType, 
      /* duration */ Double, 
      Unit
    ]
  ] = js.native
  var duration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[IEasingType] = js.native
}

object SlidingMarkerOptions {
  @scala.inline
  def apply(): SlidingMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlidingMarkerOptions]
  }
  @scala.inline
  implicit class SlidingMarkerOptionsOps[Self <: SlidingMarkerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimateFunctionAdapter(
      value: (/* marker */ Marker, /* destPoint */ LatLng, /* easing */ linear | IEasingType, /* duration */ Double) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateFunctionAdapter")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAnimateFunctionAdapter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateFunctionAdapter")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: IEasingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
  }
  
}

