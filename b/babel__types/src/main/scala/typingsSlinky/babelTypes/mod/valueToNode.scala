package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/types", "valueToNode")
@js.native
object valueToNode extends js.Object {
  
  def apply(): Expression = js.native
  def apply(value: js.UndefOr[scala.Nothing]): Identifier_ = js.native
  def apply(value: String): Expression = js.native
  def apply(value: js.Array[js.UndefOr[Boolean | Null | String | Double | js.RegExp | js.Object]]): ArrayExpression_ = js.native
  def apply(value: js.Object): ObjectExpression_ = js.native
  def apply(value: Boolean): BooleanLiteral_ = js.native
  def apply(value: Double): NumericLiteral_ | BinaryExpression_ | UnaryExpression_ = js.native
  def apply(value: Null): NullLiteral_ = js.native
  def apply(value: js.RegExp): RegExpLiteral_ = js.native
}
