package typingsSlinky.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/bezierutils.html
  *
  *
  */
@js.native
trait bezierutils extends js.Object {
  /**
    * Returns the length of the given bezier curve.
    *
    * @param points The bezier points. Should be [p1x, p1y, c1x, c1y, c2x, c2y, p2x, p2y] for a cubicbezier curve or [p1x, p1y, cx, cy, p2x, p2y] for a quadratic bezier curve.
    */
  def computeLength(points: js.Array[Double]): Double = js.native
  /**
    * Returns the distance between the specified points.
    *
    * @param x1
    * @param y1
    * @param x2
    * @param y2
    */
  def distance(x1: js.Any, y1: js.Any, x2: js.Any, y2: js.Any): js.Any = js.native
  /**
    *
    * @param points
    * @param t
    */
  def splitBezierAtT(points: js.Any, t: js.Any): js.Any = js.native
  /**
    * Returns the t corresponding to the given length for the specified bezier curve.
    *
    * @param points The bezier points. Should be [p1x, p1y, c1x, c1y, c2x, c2y, p2x, p2y] for a cubicbezier curve or [p1x, p1y, cx, cy, p2x, p2y] for a quadratic bezier curve.
    * @param length The length.
    */
  def tAtLength(points: js.Array[Double], length: Double): Double = js.native
}

object bezierutils {
  @scala.inline
  def apply(
    computeLength: js.Array[Double] => Double,
    distance: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    splitBezierAtT: (js.Any, js.Any) => js.Any,
    tAtLength: (js.Array[Double], Double) => Double
  ): bezierutils = {
    val __obj = js.Dynamic.literal(computeLength = js.Any.fromFunction1(computeLength), distance = js.Any.fromFunction4(distance), splitBezierAtT = js.Any.fromFunction2(splitBezierAtT), tAtLength = js.Any.fromFunction2(tAtLength))
    __obj.asInstanceOf[bezierutils]
  }
  @scala.inline
  implicit class bezierutilsOps[Self <: bezierutils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputeLength(value: js.Array[Double] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDistance(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSplitBezierAtT(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitBezierAtT")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTAtLength(value: (js.Array[Double], Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tAtLength")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

