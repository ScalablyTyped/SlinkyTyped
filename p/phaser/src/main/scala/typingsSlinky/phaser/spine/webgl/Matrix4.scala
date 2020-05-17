package typingsSlinky.phaser.spine.webgl

import typingsSlinky.phaser.spine.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matrix4 extends js.Object {
  var temp: js.typedarray.Float32Array = js.native
  var values: js.typedarray.Float32Array = js.native
  def copy(): Matrix4 = js.native
  def determinant(): Double = js.native
  def identity(): Matrix4 = js.native
  def invert(): Matrix4 = js.native
  def lookAt(position: Vector3, direction: Vector3, up: Vector3): this.type = js.native
  def multiply(matrix: Matrix4): Matrix4 = js.native
  def multiplyLeft(matrix: Matrix4): Matrix4 = js.native
  def ortho(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): Matrix4 = js.native
  def ortho2d(x: Double, y: Double, width: Double, height: Double): Matrix4 = js.native
  def projection(near: Double, far: Double, fovy: Double, aspectRatio: Double): Matrix4 = js.native
  def set(values: ArrayLike[Double]): Matrix4 = js.native
  def translate(x: Double, y: Double, z: Double): Matrix4 = js.native
  def transpose(): Matrix4 = js.native
}

object Matrix4 {
  @scala.inline
  def apply(
    copy: () => Matrix4,
    determinant: () => Double,
    identity: () => Matrix4,
    invert: () => Matrix4,
    lookAt: (Vector3, Vector3, Vector3) => Matrix4,
    multiply: Matrix4 => Matrix4,
    multiplyLeft: Matrix4 => Matrix4,
    ortho: (Double, Double, Double, Double, Double, Double) => Matrix4,
    ortho2d: (Double, Double, Double, Double) => Matrix4,
    projection: (Double, Double, Double, Double) => Matrix4,
    set: ArrayLike[Double] => Matrix4,
    temp: js.typedarray.Float32Array,
    translate: (Double, Double, Double) => Matrix4,
    transpose: () => Matrix4,
    values: js.typedarray.Float32Array
  ): Matrix4 = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), determinant = js.Any.fromFunction0(determinant), identity = js.Any.fromFunction0(identity), invert = js.Any.fromFunction0(invert), lookAt = js.Any.fromFunction3(lookAt), multiply = js.Any.fromFunction1(multiply), multiplyLeft = js.Any.fromFunction1(multiplyLeft), ortho = js.Any.fromFunction6(ortho), ortho2d = js.Any.fromFunction4(ortho2d), projection = js.Any.fromFunction4(projection), set = js.Any.fromFunction1(set), temp = temp.asInstanceOf[js.Any], translate = js.Any.fromFunction3(translate), transpose = js.Any.fromFunction0(transpose), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matrix4]
  }
  @scala.inline
  implicit class Matrix4Ops[Self <: Matrix4] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopy(value: () => Matrix4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeterminant(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("determinant")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIdentity(value: () => Matrix4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInvert(value: () => Matrix4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invert")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLookAt(value: (Vector3, Vector3, Vector3) => Matrix4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookAt")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMultiply(value: Matrix4 => Matrix4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiply")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMultiplyLeft(value: Matrix4 => Matrix4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplyLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOrtho(value: (Double, Double, Double, Double, Double, Double) => Matrix4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ortho")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withOrtho2d(value: (Double, Double, Double, Double) => Matrix4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ortho2d")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withProjection(value: (Double, Double, Double, Double) => Matrix4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSet(value: ArrayLike[Double] => Matrix4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTemp(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslate(value: (Double, Double, Double) => Matrix4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTranspose(value: () => Matrix4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transpose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValues(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

