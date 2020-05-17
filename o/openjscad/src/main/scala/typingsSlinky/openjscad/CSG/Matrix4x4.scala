package typingsSlinky.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matrix4x4 extends js.Object {
  var elements: js.Array[Double] = js.native
  def isMirroring(): Boolean = js.native
  def leftMultiply1x2Vector(v: Vector2D): Vector2D = js.native
  def leftMultiply1x3Vector(v: Vector3D): Vector3D = js.native
  def minus(m: Matrix4x4): Matrix4x4 = js.native
  def multiply(m: Matrix4x4): Matrix4x4 = js.native
  def plus(m: Matrix4x4): Matrix4x4 = js.native
  def rightMultiply1x2Vector(v: Vector2D): Vector2D = js.native
  def rightMultiply1x3Vector(v: Vector3D): Vector3D = js.native
}

object Matrix4x4 {
  @scala.inline
  def apply(
    elements: js.Array[Double],
    isMirroring: () => Boolean,
    leftMultiply1x2Vector: Vector2D => Vector2D,
    leftMultiply1x3Vector: Vector3D => Vector3D,
    minus: Matrix4x4 => Matrix4x4,
    multiply: Matrix4x4 => Matrix4x4,
    plus: Matrix4x4 => Matrix4x4,
    rightMultiply1x2Vector: Vector2D => Vector2D,
    rightMultiply1x3Vector: Vector3D => Vector3D
  ): Matrix4x4 = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], isMirroring = js.Any.fromFunction0(isMirroring), leftMultiply1x2Vector = js.Any.fromFunction1(leftMultiply1x2Vector), leftMultiply1x3Vector = js.Any.fromFunction1(leftMultiply1x3Vector), minus = js.Any.fromFunction1(minus), multiply = js.Any.fromFunction1(multiply), plus = js.Any.fromFunction1(plus), rightMultiply1x2Vector = js.Any.fromFunction1(rightMultiply1x2Vector), rightMultiply1x3Vector = js.Any.fromFunction1(rightMultiply1x3Vector))
    __obj.asInstanceOf[Matrix4x4]
  }
  @scala.inline
  implicit class Matrix4x4Ops[Self <: Matrix4x4] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElements(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMirroring(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMirroring")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLeftMultiply1x2Vector(value: Vector2D => Vector2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftMultiply1x2Vector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLeftMultiply1x3Vector(value: Vector3D => Vector3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftMultiply1x3Vector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMinus(value: Matrix4x4 => Matrix4x4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMultiply(value: Matrix4x4 => Matrix4x4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiply")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPlus(value: Matrix4x4 => Matrix4x4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRightMultiply1x2Vector(value: Vector2D => Vector2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightMultiply1x2Vector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRightMultiply1x3Vector(value: Vector3D => Vector3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightMultiply1x3Vector")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

