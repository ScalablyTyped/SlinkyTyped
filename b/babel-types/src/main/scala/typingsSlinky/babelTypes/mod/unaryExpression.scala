package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.Exclamationmark
import typingsSlinky.babelTypes.babelTypesStrings.Plussign
import typingsSlinky.babelTypes.babelTypesStrings.PlussignPlussign
import typingsSlinky.babelTypes.babelTypesStrings.Tilde
import typingsSlinky.babelTypes.babelTypesStrings.`--`
import typingsSlinky.babelTypes.babelTypesStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "unaryExpression")
@js.native
object unaryExpression extends js.Object {
  def apply(): UnaryExpression_ = js.native
  def apply(operator: Exclamationmark): UnaryExpression_ = js.native
  def apply(operator: Exclamationmark, argument: Expression): UnaryExpression_ = js.native
  def apply(operator: Exclamationmark, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
  def apply(operator: Plussign): UnaryExpression_ = js.native
  def apply(operator: PlussignPlussign): UnaryExpression_ = js.native
  def apply(operator: PlussignPlussign, argument: Expression): UnaryExpression_ = js.native
  def apply(operator: PlussignPlussign, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
  def apply(operator: Plussign, argument: Expression): UnaryExpression_ = js.native
  def apply(operator: Plussign, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
  def apply(operator: Tilde): UnaryExpression_ = js.native
  def apply(operator: Tilde, argument: Expression): UnaryExpression_ = js.native
  def apply(operator: Tilde, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
  def apply(operator: `--`): UnaryExpression_ = js.native
  def apply(operator: `--`, argument: Expression): UnaryExpression_ = js.native
  def apply(operator: `--`, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
  def apply(operator: `-_`): UnaryExpression_ = js.native
  def apply(operator: `-_`, argument: Expression): UnaryExpression_ = js.native
  def apply(operator: `-_`, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
}

