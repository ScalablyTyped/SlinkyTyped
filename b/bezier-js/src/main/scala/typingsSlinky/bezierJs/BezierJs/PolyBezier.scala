package typingsSlinky.bezierJs.BezierJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Poly Bezier
  * @param {[type]} curves [description]
  */
@js.native
trait PolyBezier extends js.Object {
  var _3d: js.Any = js.native
  var curves: js.Array[Bezier] = js.native
  var points: js.Array[Point] = js.native
  def addCurve(curve: Bezier): Unit = js.native
  def bbox(): BBox = js.native
  def curve(idx: Double): Bezier = js.native
  def length(): Double = js.native
  def offset(d: Double): PolyBezier = js.native
}

object PolyBezier {
  @scala.inline
  def apply(
    _3d: js.Any,
    addCurve: Bezier => Unit,
    bbox: () => BBox,
    curve: Double => Bezier,
    curves: js.Array[Bezier],
    length: () => Double,
    offset: Double => PolyBezier,
    points: js.Array[Point]
  ): PolyBezier = {
    val __obj = js.Dynamic.literal(_3d = _3d.asInstanceOf[js.Any], addCurve = js.Any.fromFunction1(addCurve), bbox = js.Any.fromFunction0(bbox), curve = js.Any.fromFunction1(curve), curves = curves.asInstanceOf[js.Any], length = js.Any.fromFunction0(length), offset = js.Any.fromFunction1(offset), points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyBezier]
  }
  @scala.inline
  implicit class PolyBezierOps[Self <: PolyBezier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_3d(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_3d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddCurve(value: Bezier => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCurve")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBbox(value: () => BBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCurve(value: Double => Bezier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCurves(value: js.Array[Bezier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOffset(value: Double => PolyBezier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPoints(value: js.Array[Point]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

