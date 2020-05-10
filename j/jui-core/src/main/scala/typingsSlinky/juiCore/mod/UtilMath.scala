package typingsSlinky.juiCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UtilMath extends js.Object {
  def angle(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  /**
    * convert radian to degree
    *
    * @return degree
    */
  def degree(radian: Double): Double = js.native
  def div(a: Double, b: Double): Double = js.native
  /**
    * a, b 의 중간값 계산을 위한 callback 함수 만들기
    *
    * @param a	first value
    * @param b 	second value
    */
  def interpolateNumber(a: Double, b: Double): js.Function0[Unit] = js.native
  // 중간값 round 해서 계산하기
  def interpolateRound(a: Double, b: Double): js.Function0[Unit] = js.native
  def inverseMatrix3d(a: js.Array[_]): js.Array[_] = js.native
  def matrix[T](a: js.Array[T], b: js.Array[T]): js.Array[T] = js.native
  def matrix3d[T](a: js.Array[T], b: js.Array[T]): js.Array[T] = js.native
  def minus(a: Double, b: Double): Double = js.native
  def multi(a: Double, b: Double): Double = js.native
  /**
    * 특정 구간의 값을 자동으로 계산
    */
  def nice(min: Double, max: Double, ticks: Double, isNice: Boolean): js.Any = js.native
  def plus(a: Double, b: Double): Double = js.native
  /**
    * convert degree to radian
    *
    * @return radian
    */
  def radian(degree: Double): Double = js.native
  def remain(a: Double, b: Double): Double = js.native
  def resize(maxWidth: Double, maxHeight: Double, objectWidth: Double, objectHeight: Double): js.Any = js.native
  /**
    * 2d rotate
    *
    * @param radian	roate 할 radian
    * @return return.x  변환된 x
    * @return return.y  변환된 y
    *
    */
  def rotate(x: Double, y: Double, radian: Double): js.Any = js.native
  def round(num: Double, fixed: Double): Double = js.native
}

object UtilMath {
  @scala.inline
  def apply(
    angle: (Double, Double, Double, Double) => Double,
    degree: Double => Double,
    div: (Double, Double) => Double,
    interpolateNumber: (Double, Double) => js.Function0[Unit],
    interpolateRound: (Double, Double) => js.Function0[Unit],
    inverseMatrix3d: js.Array[_] => js.Array[_],
    matrix: (js.Array[js.Any], js.Array[js.Any]) => js.Array[js.Any],
    matrix3d: (js.Array[js.Any], js.Array[js.Any]) => js.Array[js.Any],
    minus: (Double, Double) => Double,
    multi: (Double, Double) => Double,
    nice: (Double, Double, Double, Boolean) => js.Any,
    plus: (Double, Double) => Double,
    radian: Double => Double,
    remain: (Double, Double) => Double,
    resize: (Double, Double, Double, Double) => js.Any,
    rotate: (Double, Double, Double) => js.Any,
    round: (Double, Double) => Double
  ): UtilMath = {
    val __obj = js.Dynamic.literal(angle = js.Any.fromFunction4(angle), degree = js.Any.fromFunction1(degree), div = js.Any.fromFunction2(div), interpolateNumber = js.Any.fromFunction2(interpolateNumber), interpolateRound = js.Any.fromFunction2(interpolateRound), inverseMatrix3d = js.Any.fromFunction1(inverseMatrix3d), matrix = js.Any.fromFunction2(matrix), matrix3d = js.Any.fromFunction2(matrix3d), minus = js.Any.fromFunction2(minus), multi = js.Any.fromFunction2(multi), nice = js.Any.fromFunction4(nice), plus = js.Any.fromFunction2(plus), radian = js.Any.fromFunction1(radian), remain = js.Any.fromFunction2(remain), resize = js.Any.fromFunction4(resize), rotate = js.Any.fromFunction3(rotate), round = js.Any.fromFunction2(round))
    __obj.asInstanceOf[UtilMath]
  }
  @scala.inline
  implicit class UtilMathOps[Self <: UtilMath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: (Double, Double, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withDegree(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degree")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDiv(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("div")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInterpolateNumber(value: (Double, Double) => js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolateNumber")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInterpolateRound(value: (Double, Double) => js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolateRound")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInverseMatrix3d(value: js.Array[_] => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverseMatrix3d")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMatrix(value: (js.Array[js.Any], js.Array[js.Any]) => js.Array[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrix")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMatrix3d(value: (js.Array[js.Any], js.Array[js.Any]) => js.Array[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrix3d")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMinus(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minus")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMulti(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNice(value: (Double, Double, Double, Boolean) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nice")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withPlus(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plus")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRadian(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radian")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemain(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remain")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withResize(value: (Double, Double, Double, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withRotate(value: (Double, Double, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRound(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

