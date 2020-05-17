package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Solver extends js.Object {
  var equations: js.Array[Equation] = js.native
  var iterations: Double = js.native
  def addEquation(eq: Equation): Unit = js.native
  def removeAllEquations(): Unit = js.native
  def removeEquation(eq: Equation): Unit = js.native
  def solve(dy: Double, world: World): Double = js.native
}

object Solver {
  @scala.inline
  def apply(
    addEquation: Equation => Unit,
    equations: js.Array[Equation],
    iterations: Double,
    removeAllEquations: () => Unit,
    removeEquation: Equation => Unit,
    solve: (Double, World) => Double
  ): Solver = {
    val __obj = js.Dynamic.literal(addEquation = js.Any.fromFunction1(addEquation), equations = equations.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], removeAllEquations = js.Any.fromFunction0(removeAllEquations), removeEquation = js.Any.fromFunction1(removeEquation), solve = js.Any.fromFunction2(solve))
    __obj.asInstanceOf[Solver]
  }
  @scala.inline
  implicit class SolverOps[Self <: Solver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEquation(value: Equation => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEquation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEquations(value: js.Array[Equation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveAllEquations(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAllEquations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveEquation(value: Equation => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEquation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSolve(value: (Double, World) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solve")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

