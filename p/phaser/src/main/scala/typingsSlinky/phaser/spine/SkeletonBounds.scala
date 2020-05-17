package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkeletonBounds extends js.Object {
  var boundingBoxes: js.Array[BoundingBoxAttachment] = js.native
  var maxX: Double = js.native
  var maxY: Double = js.native
  var minX: Double = js.native
  var minY: Double = js.native
  var polygonPool: js.Any = js.native
  var polygons: js.Array[ArrayLike[Double]] = js.native
  def aabbCompute(): Unit = js.native
  def aabbContainsPoint(x: Double, y: Double): Boolean = js.native
  def aabbIntersectsSegment(x1: Double, y1: Double, x2: Double, y2: Double): Boolean = js.native
  def aabbIntersectsSkeleton(bounds: SkeletonBounds): Boolean = js.native
  def containsPoint(x: Double, y: Double): BoundingBoxAttachment = js.native
  def containsPointPolygon(polygon: ArrayLike[Double], x: Double, y: Double): Boolean = js.native
  def getHeight(): Double = js.native
  def getPolygon(boundingBox: BoundingBoxAttachment): ArrayLike[Double] = js.native
  def getWidth(): Double = js.native
  def intersectsSegment(x1: Double, y1: Double, x2: Double, y2: Double): BoundingBoxAttachment = js.native
  def intersectsSegmentPolygon(polygon: ArrayLike[Double], x1: Double, y1: Double, x2: Double, y2: Double): Boolean = js.native
  def update(skeleton: Skeleton, updateAabb: Boolean): Unit = js.native
}

object SkeletonBounds {
  @scala.inline
  def apply(
    aabbCompute: () => Unit,
    aabbContainsPoint: (Double, Double) => Boolean,
    aabbIntersectsSegment: (Double, Double, Double, Double) => Boolean,
    aabbIntersectsSkeleton: SkeletonBounds => Boolean,
    boundingBoxes: js.Array[BoundingBoxAttachment],
    containsPoint: (Double, Double) => BoundingBoxAttachment,
    containsPointPolygon: (ArrayLike[Double], Double, Double) => Boolean,
    getHeight: () => Double,
    getPolygon: BoundingBoxAttachment => ArrayLike[Double],
    getWidth: () => Double,
    intersectsSegment: (Double, Double, Double, Double) => BoundingBoxAttachment,
    intersectsSegmentPolygon: (ArrayLike[Double], Double, Double, Double, Double) => Boolean,
    maxX: Double,
    maxY: Double,
    minX: Double,
    minY: Double,
    polygonPool: js.Any,
    polygons: js.Array[ArrayLike[Double]],
    update: (Skeleton, Boolean) => Unit
  ): SkeletonBounds = {
    val __obj = js.Dynamic.literal(aabbCompute = js.Any.fromFunction0(aabbCompute), aabbContainsPoint = js.Any.fromFunction2(aabbContainsPoint), aabbIntersectsSegment = js.Any.fromFunction4(aabbIntersectsSegment), aabbIntersectsSkeleton = js.Any.fromFunction1(aabbIntersectsSkeleton), boundingBoxes = boundingBoxes.asInstanceOf[js.Any], containsPoint = js.Any.fromFunction2(containsPoint), containsPointPolygon = js.Any.fromFunction3(containsPointPolygon), getHeight = js.Any.fromFunction0(getHeight), getPolygon = js.Any.fromFunction1(getPolygon), getWidth = js.Any.fromFunction0(getWidth), intersectsSegment = js.Any.fromFunction4(intersectsSegment), intersectsSegmentPolygon = js.Any.fromFunction5(intersectsSegmentPolygon), maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], polygonPool = polygonPool.asInstanceOf[js.Any], polygons = polygons.asInstanceOf[js.Any], update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[SkeletonBounds]
  }
  @scala.inline
  implicit class SkeletonBoundsOps[Self <: SkeletonBounds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAabbCompute(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aabbCompute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAabbContainsPoint(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aabbContainsPoint")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAabbIntersectsSegment(value: (Double, Double, Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aabbIntersectsSegment")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withAabbIntersectsSkeleton(value: SkeletonBounds => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aabbIntersectsSkeleton")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBoundingBoxes(value: js.Array[BoundingBoxAttachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingBoxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainsPoint(value: (Double, Double) => BoundingBoxAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsPoint")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withContainsPointPolygon(value: (ArrayLike[Double], Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsPointPolygon")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPolygon(value: BoundingBoxAttachment => ArrayLike[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPolygon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIntersectsSegment(value: (Double, Double, Double, Double) => BoundingBoxAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectsSegment")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withIntersectsSegmentPolygon(value: (ArrayLike[Double], Double, Double, Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectsSegmentPolygon")(js.Any.fromFunction5(value))
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
    def withPolygonPool(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonPool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolygons(value: js.Array[ArrayLike[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: (Skeleton, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

