package typingsSlinky.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoLocation extends js.Object {
  /**
    * The location confidence level, as an integer percentage, may be required, depending on the regulatory domain. When the parameter is optional and not
    * provided, its value is assumed to be 95. Valid values range from 0 to 99, since, in practice, 100-percent confidence is not achievable. The confidence
    * value is meaningful only when geolocation refers to a point with uncertainty.
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * If present, indicates that the geolocation represents a point. Paradoxically, a point is parameterized using an ellipse, where the center represents
    * the location of the point and the distances along the major and minor axes represent the uncertainty. The uncertainty values may be required, depending
    * on the regulatory domain.
    */
  var point: js.UndefOr[GeoLocationEllipse] = js.native
  /** If present, indicates that the geolocation represents a region. Database support for regions is optional. */
  var region: js.UndefOr[GeoLocationPolygon] = js.native
}

object GeoLocation {
  @scala.inline
  def apply(): GeoLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoLocation]
  }
  @scala.inline
  implicit class GeoLocationOps[Self <: GeoLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(js.undefined)
        ret
    }
    @scala.inline
    def withPoint(value: GeoLocationEllipse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: GeoLocationPolygon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
  }
  
}

