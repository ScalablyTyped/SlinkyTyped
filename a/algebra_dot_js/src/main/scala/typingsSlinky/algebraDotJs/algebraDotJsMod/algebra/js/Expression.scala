package typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js

import typingsSlinky.algebraDotJs.algebraDotJsMod.Term
import typingsSlinky.algebraDotJs.algebraDotJsMod.Union
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expression extends js.Object {
  var constants: js.Array[typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Fraction] = js.native
  var terms: js.Array[Term] = js.native
  def add(other: Union): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def add(other: Union, simplify: Boolean): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def add(other: typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def add(other: typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression, simplify: Boolean): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def constant(): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Fraction = js.native
  def divide(other: Double): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def divide(other: Double, simplify: Boolean): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def divide(other: typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Fraction): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def divide(other: typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Fraction, simplify: Boolean): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def eval(p: js.Object): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def eval(p: js.Object, simplify: Boolean): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def multiply(other: Union): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def multiply(other: Union, simplify: Boolean): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def multiply(other: typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def multiply(other: typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression, simplify: Boolean): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def pow(p: Double): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def pow(p: Double, simplify: Boolean): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def simplify(): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def subtract(other: Union): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def subtract(other: Union, simplify: Boolean): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def subtract(other: typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def subtract(other: typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression, simplify: Boolean): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def summation(variable: String, lower: Double, upper: Double): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def summation(variable: String, lower: Double, upper: Double, simplify: Boolean): typingsSlinky.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
}

