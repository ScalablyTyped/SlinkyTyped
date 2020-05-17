package typingsSlinky.phaser.spine.webgl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vector3 extends js.Object {
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  def add(v: Vector3): Vector3 = js.native
  def cross(v: Vector3): Vector3 = js.native
  def distance(v: Vector3): Double = js.native
  def dot(v: Vector3): Double = js.native
  def length(): Double = js.native
  def multiply(matrix: Matrix4): Vector3 = js.native
  def normalize(): Vector3 = js.native
  def project(matrix: Matrix4): Vector3 = js.native
  def scale(s: Double): Vector3 = js.native
  def set(x: Double, y: Double, z: Double): Vector3 = js.native
  def setFrom(v: Vector3): Vector3 = js.native
  def sub(v: Vector3): Vector3 = js.native
}

object Vector3 {
  @scala.inline
  def apply(
    add: Vector3 => Vector3,
    cross: Vector3 => Vector3,
    distance: Vector3 => Double,
    dot: Vector3 => Double,
    length: () => Double,
    multiply: Matrix4 => Vector3,
    normalize: () => Vector3,
    project: Matrix4 => Vector3,
    scale: Double => Vector3,
    set: (Double, Double, Double) => Vector3,
    setFrom: Vector3 => Vector3,
    sub: Vector3 => Vector3,
    x: Double,
    y: Double,
    z: Double
  ): Vector3 = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), cross = js.Any.fromFunction1(cross), distance = js.Any.fromFunction1(distance), dot = js.Any.fromFunction1(dot), length = js.Any.fromFunction0(length), multiply = js.Any.fromFunction1(multiply), normalize = js.Any.fromFunction0(normalize), project = js.Any.fromFunction1(project), scale = js.Any.fromFunction1(scale), set = js.Any.fromFunction3(set), setFrom = js.Any.fromFunction1(setFrom), sub = js.Any.fromFunction1(sub), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vector3]
  }
  @scala.inline
  implicit class Vector3Ops[Self <: Vector3] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: Vector3 => Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCross(value: Vector3 => Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cross")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDistance(value: Vector3 => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDot(value: Vector3 => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMultiply(value: Matrix4 => Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiply")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNormalize(value: () => Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withProject(value: Matrix4 => Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScale(value: Double => Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: (Double, Double, Double) => Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetFrom(value: Vector3 => Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFrom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSub(value: Vector3 => Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

