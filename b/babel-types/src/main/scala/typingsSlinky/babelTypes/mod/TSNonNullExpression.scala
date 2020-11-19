package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSNonNullExpression
  extends Node
     with Expression {
  
  var expression: Expression = js.native
  
  @JSName("type")
  var type_TSNonNullExpression: typingsSlinky.babelTypes.babelTypesStrings.TSNonNullExpression = js.native
}
@JSImport("babel-types", "TSNonNullExpression")
@js.native
object TSNonNullExpression extends js.Object {
  
  def apply(expression: Expression): TSNonNullExpression = js.native
}
