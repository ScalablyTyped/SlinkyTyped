package typingsSlinky.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GSSolver extends Solver {
  
  var tolerance: Double = js.native
}
object GSSolver {
  
  @scala.inline
  def apply(
    addEquation: Equation => Unit,
    equations: js.Array[Equation],
    iterations: Double,
    removeAllEquations: () => Unit,
    removeEquation: Equation => Unit,
    solve: (Double, World) => Double,
    tolerance: Double
  ): GSSolver = {
    val __obj = js.Dynamic.literal(addEquation = js.Any.fromFunction1(addEquation), equations = equations.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], removeAllEquations = js.Any.fromFunction0(removeAllEquations), removeEquation = js.Any.fromFunction1(removeEquation), solve = js.Any.fromFunction2(solve), tolerance = tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[GSSolver]
  }
  
  @scala.inline
  implicit class GSSolverMutableBuilder[Self <: GSSolver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
  }
}
