package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Heightfield extends Shape {
  var cacheEnabled: Boolean = js.native
  var data: js.Array[js.Array[Double]] = js.native
  var elementSize: Double = js.native
  var maxValue: Double = js.native
  var minValue: Double = js.native
  var pillarConvex: ConvexPolyhedron = js.native
  var pillarOffset: Vec3 = js.native
  def getConvexTrianglePillar(xi: Double, yi: Double, getUpperTriangle: Boolean): Unit = js.native
  def getIndexOfPosition(x: Double, y: Double, result: js.Array[_], clamp: Boolean): Boolean = js.native
  def getRectMinMax(iMinX: Double, iMinY: Double, iMaxX: Double, iMaxY: Double, result: js.Array[_]): Unit = js.native
  def setHeightValueAtIndex(xi: Double, yi: Double, value: Double): Unit = js.native
  def update(): Unit = js.native
  def updateMaxValue(): Unit = js.native
  def updateMinValue(): Unit = js.native
}

object Heightfield {
  @scala.inline
  def apply(
    boundingSphereRadius: Double,
    cacheEnabled: Boolean,
    calculateLocalInertia: (Double, Vec3) => Vec3,
    collisionResponse: Boolean,
    data: js.Array[js.Array[Double]],
    elementSize: Double,
    getConvexTrianglePillar: (Double, Double, Boolean) => Unit,
    getIndexOfPosition: (Double, Double, js.Array[_], Boolean) => Boolean,
    getRectMinMax: (Double, Double, Double, Double, js.Array[_]) => Unit,
    maxValue: Double,
    minValue: Double,
    pillarConvex: ConvexPolyhedron,
    pillarOffset: Vec3,
    setHeightValueAtIndex: (Double, Double, Double) => Unit,
    `type`: Double,
    update: () => Unit,
    updateBoundingSphereRadius: () => Double,
    updateMaxValue: () => Unit,
    updateMinValue: () => Unit,
    volume: () => Double
  ): Heightfield = {
    val __obj = js.Dynamic.literal(boundingSphereRadius = boundingSphereRadius.asInstanceOf[js.Any], cacheEnabled = cacheEnabled.asInstanceOf[js.Any], calculateLocalInertia = js.Any.fromFunction2(calculateLocalInertia), collisionResponse = collisionResponse.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], elementSize = elementSize.asInstanceOf[js.Any], getConvexTrianglePillar = js.Any.fromFunction3(getConvexTrianglePillar), getIndexOfPosition = js.Any.fromFunction4(getIndexOfPosition), getRectMinMax = js.Any.fromFunction5(getRectMinMax), maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], pillarConvex = pillarConvex.asInstanceOf[js.Any], pillarOffset = pillarOffset.asInstanceOf[js.Any], setHeightValueAtIndex = js.Any.fromFunction3(setHeightValueAtIndex), update = js.Any.fromFunction0(update), updateBoundingSphereRadius = js.Any.fromFunction0(updateBoundingSphereRadius), updateMaxValue = js.Any.fromFunction0(updateMaxValue), updateMinValue = js.Any.fromFunction0(updateMinValue), volume = js.Any.fromFunction0(volume))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Heightfield]
  }
  @scala.inline
  implicit class HeightfieldOps[Self <: Heightfield] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElementSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetConvexTrianglePillar(value: (Double, Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConvexTrianglePillar")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetIndexOfPosition(value: (Double, Double, js.Array[_], Boolean) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndexOfPosition")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetRectMinMax(value: (Double, Double, Double, Double, js.Array[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRectMinMax")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPillarConvex(value: ConvexPolyhedron): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pillarConvex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPillarOffset(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pillarOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetHeightValueAtIndex(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeightValueAtIndex")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateMaxValue(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMaxValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateMinValue(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMinValue")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

