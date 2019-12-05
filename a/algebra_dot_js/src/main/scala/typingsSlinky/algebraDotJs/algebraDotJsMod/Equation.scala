package typingsSlinky.algebraDotJs.algebraDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("algebra.js", "Equation")
@js.native
class Equation protected ()
  extends typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Equation {
  def this(lhs: typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression, rhs: Double) = this()
  def this(
    lhs: typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression,
    rhs: typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression
  ) = this()
  def this(
    lhs: typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression,
    rhs: typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Fraction
  ) = this()
  /* CompleteClass */
  override var lhs: typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  /* CompleteClass */
  override var rhs: typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  /* CompleteClass */
  override def solveFor(variable: String): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Fraction | (js.Array[Double | typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Fraction]) = js.native
}

