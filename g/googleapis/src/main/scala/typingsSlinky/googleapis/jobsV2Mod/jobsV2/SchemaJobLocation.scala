package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  A resource that represents a location with full geographic
  * information.
  */
@js.native
trait SchemaJobLocation extends js.Object {
  /**
    * An object representing a latitude/longitude pair.
    */
  var latLng: js.UndefOr[SchemaLatLng] = js.native
  /**
    * The type of a location, which corresponds to the address lines field of
    * PostalAddress. For example, &quot;Downtown, Atlanta, GA, USA&quot; has a
    * type of LocationType#NEIGHBORHOOD, and &quot;Kansas City, KS, USA&quot;
    * has a type of LocationType#LOCALITY.
    */
  var locationType: js.UndefOr[String] = js.native
  /**
    * Postal address of the location that includes human readable information,
    * such as postal delivery and payments addresses. Given a postal address, a
    * postal service can deliver items to a premises, P.O. Box, or other
    * delivery location.
    */
  var postalAddress: js.UndefOr[SchemaPostalAddress] = js.native
  /**
    * Radius in meters of the job location. This value is derived from the
    * location bounding box in which a circle with the specified radius
    * centered from LatLng coves the area associated with the job location. For
    * example, currently, &quot;Mountain View, CA, USA&quot; has a radius of
    * 7885.79 meters.
    */
  var radiusMeters: js.UndefOr[Double] = js.native
}

object SchemaJobLocation {
  @scala.inline
  def apply(): SchemaJobLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobLocation]
  }
  @scala.inline
  implicit class SchemaJobLocationOps[Self <: SchemaJobLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatLng(value: SchemaLatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latLng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatLng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latLng")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationType")(js.undefined)
        ret
    }
    @scala.inline
    def withPostalAddress(value: SchemaPostalAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusMeters(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusMeters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusMeters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusMeters")(js.undefined)
        ret
    }
  }
  
}

