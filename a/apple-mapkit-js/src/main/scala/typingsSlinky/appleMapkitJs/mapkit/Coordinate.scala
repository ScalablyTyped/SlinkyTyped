package typingsSlinky.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object representing the latitude and longitude for a point on the
  * Earth's surface.
  */
@js.native
trait Coordinate extends js.Object {
  /**
    * The latitude in degrees.
    */
  var latitude: Double = js.native
  /**
    * The longitude in degrees.
    */
  var longitude: Double = js.native
  /**
    * Returns a copy of the coordinate.
    */
  def copy(): Coordinate = js.native
  /**
    * Returns a Boolean value indicating whether two coordinates are equal.
    */
  def equals(anotherCoordinate: Coordinate): Boolean = js.native
  /**
    * Returns the map point that corresponds to the coordinate.
    */
  def toMapPoint(): MapPoint = js.native
  /**
    * Returns the unwrapped map point that corresponds to the coordinate.
    */
  def toUnwrappedMapPoint(): MapPoint = js.native
}

object Coordinate {
  @scala.inline
  def apply(
    copy: () => Coordinate,
    equals: Coordinate => Boolean,
    latitude: Double,
    longitude: Double,
    toMapPoint: () => MapPoint,
    toUnwrappedMapPoint: () => MapPoint
  ): Coordinate = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), equals = js.Any.fromFunction1(equals), latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], toMapPoint = js.Any.fromFunction0(toMapPoint), toUnwrappedMapPoint = js.Any.fromFunction0(toUnwrappedMapPoint))
    __obj.asInstanceOf[Coordinate]
  }
  @scala.inline
  implicit class CoordinateOps[Self <: Coordinate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopy(value: () => Coordinate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEquals(value: Coordinate => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
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
    @scala.inline
    def withToMapPoint(value: () => MapPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toMapPoint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToUnwrappedMapPoint(value: () => MapPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toUnwrappedMapPoint")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

