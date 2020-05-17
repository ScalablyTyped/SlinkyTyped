package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bounds extends js.Object {
  var maxX: Double = js.native
  var maxY: Double = js.native
  var minX: Double = js.native
  var minY: Double = js.native
  def containsBounds(bounds: Bounds): Boolean = js.native
  def containsPoint(point: Point): Boolean = js.native
  def equals(other: Bounds): Boolean = js.native
  def extend(point: Point): Unit = js.native
  def getCenter(): Point = js.native
  def getNorthEast(): Point = js.native
  def getSouthWest(): Point = js.native
  def intersects(other: Bounds): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def toSpan(): Point = js.native
}

object Bounds {
  @scala.inline
  def apply(
    containsBounds: Bounds => Boolean,
    containsPoint: Point => Boolean,
    equals: Bounds => Boolean,
    extend: Point => Unit,
    getCenter: () => Point,
    getNorthEast: () => Point,
    getSouthWest: () => Point,
    intersects: Bounds => Boolean,
    isEmpty: () => Boolean,
    maxX: Double,
    maxY: Double,
    minX: Double,
    minY: Double,
    toSpan: () => Point
  ): Bounds = {
    val __obj = js.Dynamic.literal(containsBounds = js.Any.fromFunction1(containsBounds), containsPoint = js.Any.fromFunction1(containsPoint), equals = js.Any.fromFunction1(equals), extend = js.Any.fromFunction1(extend), getCenter = js.Any.fromFunction0(getCenter), getNorthEast = js.Any.fromFunction0(getNorthEast), getSouthWest = js.Any.fromFunction0(getSouthWest), intersects = js.Any.fromFunction1(intersects), isEmpty = js.Any.fromFunction0(isEmpty), maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], toSpan = js.Any.fromFunction0(toSpan))
    __obj.asInstanceOf[Bounds]
  }
  @scala.inline
  implicit class BoundsOps[Self <: Bounds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainsBounds(value: Bounds => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsBounds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContainsPoint(value: Point => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsPoint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEquals(value: Bounds => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExtend(value: Point => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCenter(value: () => Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCenter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNorthEast(value: () => Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNorthEast")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSouthWest(value: () => Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSouthWest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIntersects(value: Bounds => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersects")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMaxX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToSpan(value: () => Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSpan")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

