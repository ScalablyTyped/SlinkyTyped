package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.LeftLoc
import typingsSlinky.astTypes.astTypesStrings.AmpersandAmpersand
import typingsSlinky.astTypes.astTypesStrings.QuestionmarkQuestionmark
import typingsSlinky.astTypes.astTypesStrings.VerticallineVerticalline
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.LogicalExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogicalExpressionBuilder extends StObject {
  
  def apply(operator: AmpersandAmpersand, left: ExpressionKind, right: ExpressionKind): LogicalExpression = js.native
  def apply(operator: QuestionmarkQuestionmark, left: ExpressionKind, right: ExpressionKind): LogicalExpression = js.native
  def apply(operator: VerticallineVerticalline, left: ExpressionKind, right: ExpressionKind): LogicalExpression = js.native
  
  def from(params: LeftLoc): LogicalExpression = js.native
}
