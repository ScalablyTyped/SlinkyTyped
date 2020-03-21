package typingsSlinky.algebraJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("algebra.js", "Equation")
@js.native
class Equation protected ()
  extends typingsSlinky.algebraJs.mod.algebra.js.Equation {
  def this(lhs: typingsSlinky.algebraJs.mod.algebra.js.Expression, rhs: Double) = this()
  def this(
    lhs: typingsSlinky.algebraJs.mod.algebra.js.Expression,
    rhs: typingsSlinky.algebraJs.mod.algebra.js.Expression
  ) = this()
  def this(
    lhs: typingsSlinky.algebraJs.mod.algebra.js.Expression,
    rhs: typingsSlinky.algebraJs.mod.algebra.js.Fraction
  ) = this()
  /* CompleteClass */
  override var lhs: typingsSlinky.algebraJs.mod.algebra.js.Expression = js.native
  /* CompleteClass */
  override var rhs: typingsSlinky.algebraJs.mod.algebra.js.Expression = js.native
  /* CompleteClass */
  override def solveFor(variable: String): typingsSlinky.algebraJs.mod.algebra.js.Fraction | (js.Array[Double | typingsSlinky.algebraJs.mod.algebra.js.Fraction]) = js.native
}

