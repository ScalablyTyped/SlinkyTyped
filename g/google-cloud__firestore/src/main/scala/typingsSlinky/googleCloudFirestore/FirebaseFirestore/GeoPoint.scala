package typingsSlinky.googleCloudFirestore.FirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoPoint extends js.Object {
  val latitude: Double = js.native
  val longitude: Double = js.native
  /**
    * Returns true if this `GeoPoint` is equal to the provided one.
    *
    * @param other The `GeoPoint` to compare against.
    * @return true if this `GeoPoint` is equal to the provided one.
    */
  def isEqual(other: GeoPoint): Boolean = js.native
}

object GeoPoint {
  @scala.inline
  def apply(isEqual: GeoPoint => Boolean, latitude: Double, longitude: Double): GeoPoint = {
    val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction1(isEqual), latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoPoint]
  }
  @scala.inline
  implicit class GeoPointOps[Self <: GeoPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsEqual(value: GeoPoint => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEqual")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

