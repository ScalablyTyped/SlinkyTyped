package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Curve3 extends js.Object {
  var _computeLength: js.Any = js.native
  var _length: js.Any = js.native
  var _points: js.Any = js.native
  /**
    * Returns a new instance of Curve3 object : var curve = curveA.continue(curveB);
    * This new Curve3 is built by translating and sticking the curveB at the end of the curveA.
    * curveA and curveB keep unchanged.
    * @param curve the curve to continue from this curve
    * @returns the newly constructed curve
    */
  def continue(curve: DeepImmutable[Curve3]): Curve3 = js.native
  /**
    * @returns the Curve3 stored array of successive Vector3
    */
  def getPoints(): js.Array[Vector3] = js.native
  /**
    * @returns the computed length (float) of the curve.
    */
  def length(): Double = js.native
}

object Curve3 {
  @scala.inline
  def apply(
    _computeLength: js.Any,
    _length: js.Any,
    _points: js.Any,
    continue: DeepImmutable[Curve3] => Curve3,
    getPoints: () => js.Array[Vector3],
    length: () => Double
  ): Curve3 = {
    val __obj = js.Dynamic.literal(_computeLength = _computeLength.asInstanceOf[js.Any], _length = _length.asInstanceOf[js.Any], _points = _points.asInstanceOf[js.Any], continue = js.Any.fromFunction1(continue), getPoints = js.Any.fromFunction0(getPoints), length = js.Any.fromFunction0(length))
    __obj.asInstanceOf[Curve3]
  }
  @scala.inline
  implicit class Curve3Ops[Self <: Curve3] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_computeLength(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_computeLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_length(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_points(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContinue(value: DeepImmutable[Curve3] => Curve3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPoints(value: () => js.Array[Vector3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPoints")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

