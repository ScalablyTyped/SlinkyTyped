package typingsSlinky.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rectangular area on a map defined by a center coordinate and a span,
  * expressed in degrees of latitude and longitude.
  */
@js.native
trait CoordinateRegion extends js.Object {
  /**
    * The center point of the region.
    */
  var center: Coordinate = js.native
  /**
    * The horizontal and vertical span representing the amount of map to display.
    */
  var span: CoordinateSpan = js.native
  /**
    * Returns a copy of the calling coordinate region.
    */
  def copy(): CoordinateRegion = js.native
  /**
    * Returns a Boolean value indicating whether two regions are equal.
    */
  def equals(anotherRegion: CoordinateRegion): Boolean = js.native
  /**
    * Returns the bounding region that corresponds to the calling coordinate region.
    */
  def toBoundingRegion(): BoundingRegion = js.native
  /**
    * Returns the map rectangle that corresponds to the calling coordinate region.
    */
  def toMapRect(): MapRect = js.native
}

object CoordinateRegion {
  @scala.inline
  def apply(
    center: Coordinate,
    copy: () => CoordinateRegion,
    equals: CoordinateRegion => Boolean,
    span: CoordinateSpan,
    toBoundingRegion: () => BoundingRegion,
    toMapRect: () => MapRect
  ): CoordinateRegion = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], copy = js.Any.fromFunction0(copy), equals = js.Any.fromFunction1(equals), span = span.asInstanceOf[js.Any], toBoundingRegion = js.Any.fromFunction0(toBoundingRegion), toMapRect = js.Any.fromFunction0(toMapRect))
    __obj.asInstanceOf[CoordinateRegion]
  }
  @scala.inline
  implicit class CoordinateRegionOps[Self <: CoordinateRegion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: Coordinate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopy(value: () => CoordinateRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEquals(value: CoordinateRegion => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSpan(value: CoordinateSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToBoundingRegion(value: () => BoundingRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBoundingRegion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToMapRect(value: () => MapRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toMapRect")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

