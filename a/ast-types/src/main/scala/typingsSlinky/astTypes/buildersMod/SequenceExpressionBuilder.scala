package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Expressions
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SequenceExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequenceExpressionBuilder extends StObject {
  
  def apply(expressions: js.Array[ExpressionKind]): SequenceExpression = js.native
  
  def from(params: Expressions): SequenceExpression = js.native
}
