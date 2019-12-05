package typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Equation extends js.Object {
  var lhs: typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression
  var rhs: typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression
  def solveFor(variable: String): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Fraction | (js.Array[Double | typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Fraction])
}

object Equation {
  @scala.inline
  def apply(
    lhs: typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression,
    rhs: typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression,
    solveFor: String => typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Fraction | (js.Array[Double | typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Fraction])
  ): Equation = {
    val __obj = js.Dynamic.literal(lhs = lhs.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any], solveFor = js.Any.fromFunction1(solveFor))
  
    __obj.asInstanceOf[Equation]
  }
}

