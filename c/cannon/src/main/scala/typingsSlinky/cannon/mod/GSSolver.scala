package typingsSlinky.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "GSSolver")
@js.native
class GSSolver ()
  extends typingsSlinky.cannon.CANNON.GSSolver {
  /* CompleteClass */
  override var equations: js.Array[typingsSlinky.cannon.CANNON.Equation] = js.native
  /* CompleteClass */
  override var iterations: Double = js.native
  /* CompleteClass */
  override var tolerance: Double = js.native
  /* CompleteClass */
  override def addEquation(eq: typingsSlinky.cannon.CANNON.Equation): Unit = js.native
  /* CompleteClass */
  override def removeAllEquations(): Unit = js.native
  /* CompleteClass */
  override def removeEquation(eq: typingsSlinky.cannon.CANNON.Equation): Unit = js.native
  /* CompleteClass */
  override def solve(dy: Double, world: typingsSlinky.cannon.CANNON.World): Double = js.native
}

