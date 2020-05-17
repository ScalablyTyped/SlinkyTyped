package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectCollisionMatrix extends js.Object {
  var matrix: js.Array[Double] = js.native
  def get(i: Double, j: Double): Double = js.native
  def reset(): Unit = js.native
  def set(i: Double, j: Double, value: Double): Unit = js.native
  def setNumObjects(n: Double): Unit = js.native
}

object ObjectCollisionMatrix {
  @scala.inline
  def apply(
    get: (Double, Double) => Double,
    matrix: js.Array[Double],
    reset: () => Unit,
    set: (Double, Double, Double) => Unit,
    setNumObjects: Double => Unit
  ): ObjectCollisionMatrix = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), matrix = matrix.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction3(set), setNumObjects = js.Any.fromFunction1(setNumObjects))
    __obj.asInstanceOf[ObjectCollisionMatrix]
  }
  @scala.inline
  implicit class ObjectCollisionMatrixOps[Self <: ObjectCollisionMatrix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMatrix(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetNumObjects(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNumObjects")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

