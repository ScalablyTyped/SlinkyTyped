package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Equation extends js.Object {
  var a: Double = js.native
  var b: Double = js.native
  var bi: Body = js.native
  var bj: Body = js.native
  var enabled: Boolean = js.native
  var eps: Double = js.native
  var id: Double = js.native
  var jacobianElementA: JacobianElement = js.native
  var jacobianElementB: JacobianElement = js.native
  var maxForce: Double = js.native
  var minForce: Double = js.native
  def addToWlamda(deltalambda: Double): Double = js.native
  def computeB(a: Double, b: Double, h: Double): Double = js.native
  def computeC(): Double = js.native
  def computeGW(): Double = js.native
  def computeGWlamda(): Double = js.native
  def computeGiMGt(): Double = js.native
  def computeGiMf(): Double = js.native
  def computeGq(): Double = js.native
  def setSpookParams(stiffness: Double, relaxation: Double, timeStep: Double): Unit = js.native
}

object Equation {
  @scala.inline
  def apply(
    a: Double,
    addToWlamda: Double => Double,
    b: Double,
    bi: Body,
    bj: Body,
    computeB: (Double, Double, Double) => Double,
    computeC: () => Double,
    computeGW: () => Double,
    computeGWlamda: () => Double,
    computeGiMGt: () => Double,
    computeGiMf: () => Double,
    computeGq: () => Double,
    enabled: Boolean,
    eps: Double,
    id: Double,
    jacobianElementA: JacobianElement,
    jacobianElementB: JacobianElement,
    maxForce: Double,
    minForce: Double,
    setSpookParams: (Double, Double, Double) => Unit
  ): Equation = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], addToWlamda = js.Any.fromFunction1(addToWlamda), b = b.asInstanceOf[js.Any], bi = bi.asInstanceOf[js.Any], bj = bj.asInstanceOf[js.Any], computeB = js.Any.fromFunction3(computeB), computeC = js.Any.fromFunction0(computeC), computeGW = js.Any.fromFunction0(computeGW), computeGWlamda = js.Any.fromFunction0(computeGWlamda), computeGiMGt = js.Any.fromFunction0(computeGiMGt), computeGiMf = js.Any.fromFunction0(computeGiMf), computeGq = js.Any.fromFunction0(computeGq), enabled = enabled.asInstanceOf[js.Any], eps = eps.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jacobianElementA = jacobianElementA.asInstanceOf[js.Any], jacobianElementB = jacobianElementB.asInstanceOf[js.Any], maxForce = maxForce.asInstanceOf[js.Any], minForce = minForce.asInstanceOf[js.Any], setSpookParams = js.Any.fromFunction3(setSpookParams))
    __obj.asInstanceOf[Equation]
  }
  @scala.inline
  implicit class EquationOps[Self <: Equation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddToWlamda(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addToWlamda")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBi(value: Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBj(value: Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bj")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComputeB(value: (Double, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeB")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withComputeC(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeC")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withComputeGW(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeGW")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withComputeGWlamda(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeGWlamda")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withComputeGiMGt(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeGiMGt")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withComputeGiMf(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeGiMf")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withComputeGq(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeGq")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJacobianElementA(value: JacobianElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jacobianElementA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJacobianElementB(value: JacobianElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jacobianElementB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxForce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxForce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinForce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minForce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetSpookParams(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSpookParams")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

