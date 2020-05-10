package typingsSlinky.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoLocationPoint extends js.Object {
  /**
    * A required floating-point number that expresses the latitude in degrees using the WGS84 datum. For details on this encoding, see the National Imagery
    * and Mapping Agency's Technical Report TR8350.2.
    */
  var latitude: js.UndefOr[Double] = js.native
  /**
    * A required floating-point number that expresses the longitude in degrees using the WGS84 datum. For details on this encoding, see the National Imagery
    * and Mapping Agency's Technical Report TR8350.2.
    */
  var longitude: js.UndefOr[Double] = js.native
}

object GeoLocationPoint {
  @scala.inline
  def apply(): GeoLocationPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoLocationPoint]
  }
  @scala.inline
  implicit class GeoLocationPointOps[Self <: GeoLocationPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(js.undefined)
        ret
    }
    @scala.inline
    def withLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(js.undefined)
        ret
    }
  }
  
}

