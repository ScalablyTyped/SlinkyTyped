package typingsSlinky.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoLocationEllipse extends js.Object {
  /** A required geo-spatial point representing the center of the ellipse. */
  var center: js.UndefOr[GeoLocationPoint] = js.native
  /**
    * A floating-point number that expresses the orientation of the ellipse, representing the rotation, in degrees, of the semi-major axis from North towards
    * the East. For example, when the uncertainty is greatest along the North-South direction, orientation is 0 degrees; conversely, if the uncertainty is
    * greatest along the East-West direction, orientation is 90 degrees. When orientation is not present, the orientation is assumed to be 0.
    */
  var orientation: js.UndefOr[Double] = js.native
  /**
    * A floating-point number that expresses the location uncertainty along the major axis of the ellipse. May be required by the regulatory domain. When the
    * uncertainty is optional, the default value is 0.
    */
  var semiMajorAxis: js.UndefOr[Double] = js.native
  /**
    * A floating-point number that expresses the location uncertainty along the minor axis of the ellipse. May be required by the regulatory domain. When the
    * uncertainty is optional, the default value is 0.
    */
  var semiMinorAxis: js.UndefOr[Double] = js.native
}

object GeoLocationEllipse {
  @scala.inline
  def apply(): GeoLocationEllipse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoLocationEllipse]
  }
  @scala.inline
  implicit class GeoLocationEllipseOps[Self <: GeoLocationEllipse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: GeoLocationPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withSemiMajorAxis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semiMajorAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSemiMajorAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semiMajorAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withSemiMinorAxis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semiMinorAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSemiMinorAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semiMinorAxis")(js.undefined)
        ret
    }
  }
  
}

