package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Generator
import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrowFunctionExpressionBuilder extends StObject {
  
  def apply(params: js.Array[PatternKind], body: BlockStatementKind): ArrowFunctionExpression = js.native
  def apply(params: js.Array[PatternKind], body: BlockStatementKind, expression: Boolean): ArrowFunctionExpression = js.native
  def apply(params: js.Array[PatternKind], body: ExpressionKind): ArrowFunctionExpression = js.native
  def apply(params: js.Array[PatternKind], body: ExpressionKind, expression: Boolean): ArrowFunctionExpression = js.native
  
  def from(params: Generator): ArrowFunctionExpression = js.native
}
