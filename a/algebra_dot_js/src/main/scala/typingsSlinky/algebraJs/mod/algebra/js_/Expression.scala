package typingsSlinky.algebraJs.mod.algebra.js_

import typingsSlinky.algebraJs.mod.Term
import typingsSlinky.algebraJs.mod.Union
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expression extends js.Object {
  
  def add(other: Union): Expression = js.native
  def add(other: Union, simplify: Boolean): Expression = js.native
  def add(other: Expression): Expression = js.native
  def add(other: Expression, simplify: Boolean): Expression = js.native
  
  def constant(): Fraction = js.native
  
  var constants: js.Array[Fraction] = js.native
  
  def divide(other: Double): Expression = js.native
  def divide(other: Double, simplify: Boolean): Expression = js.native
  def divide(other: Fraction): Expression = js.native
  def divide(other: Fraction, simplify: Boolean): Expression = js.native
  
  def eval(p: js.Object): Expression = js.native
  def eval(p: js.Object, simplify: Boolean): Expression = js.native
  
  def multiply(other: Union): Expression = js.native
  def multiply(other: Union, simplify: Boolean): Expression = js.native
  def multiply(other: Expression): Expression = js.native
  def multiply(other: Expression, simplify: Boolean): Expression = js.native
  
  def pow(p: Double): Expression = js.native
  def pow(p: Double, simplify: Boolean): Expression = js.native
  
  def simplify(): Expression = js.native
  
  def subtract(other: Union): Expression = js.native
  def subtract(other: Union, simplify: Boolean): Expression = js.native
  def subtract(other: Expression): Expression = js.native
  def subtract(other: Expression, simplify: Boolean): Expression = js.native
  
  def summation(variable: String, lower: Double, upper: Double): Expression = js.native
  def summation(variable: String, lower: Double, upper: Double, simplify: Boolean): Expression = js.native
  
  var terms: js.Array[Term] = js.native
}
