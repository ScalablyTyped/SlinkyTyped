package typingsSlinky.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rectangular area on a map, defined by coordinates of the rectangle's
  * northeast and southwest corners.
  */
@js.native
trait BoundingRegion extends js.Object {
  /**
    * The east longitude of the bounding region.
    */
  var eastLongitude: Double = js.native
  /**
    * The north latitude of the bounding region.
    */
  var northLatitude: Double = js.native
  /**
    * The south latitude of the bounding region.
    */
  var southLatitude: Double = js.native
  /**
    * The west longitude of the bounding region.
    */
  var westLongitude: Double = js.native
  /**
    * Returns a copy of the calling bounding region.
    */
  def copy(): BoundingRegion = js.native
  /**
    * Returns the coordinate region that corresponds to the calling bounding region.
    */
  def toCoordinateRegion(): CoordinateRegion = js.native
}

object BoundingRegion {
  @scala.inline
  def apply(
    copy: () => BoundingRegion,
    eastLongitude: Double,
    northLatitude: Double,
    southLatitude: Double,
    toCoordinateRegion: () => CoordinateRegion,
    westLongitude: Double
  ): BoundingRegion = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), eastLongitude = eastLongitude.asInstanceOf[js.Any], northLatitude = northLatitude.asInstanceOf[js.Any], southLatitude = southLatitude.asInstanceOf[js.Any], toCoordinateRegion = js.Any.fromFunction0(toCoordinateRegion), westLongitude = westLongitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingRegion]
  }
  @scala.inline
  implicit class BoundingRegionOps[Self <: BoundingRegion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopy(value: () => BoundingRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEastLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eastLongitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNorthLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("northLatitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSouthLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("southLatitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToCoordinateRegion(value: () => CoordinateRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toCoordinateRegion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWestLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("westLongitude")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

