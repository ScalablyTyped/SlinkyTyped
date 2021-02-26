package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.AlternateComments
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ConditionalExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalExpressionBuilder extends StObject {
  
  def apply(test: ExpressionKind, consequent: ExpressionKind, alternate: ExpressionKind): ConditionalExpression = js.native
  
  def from(params: AlternateComments): ConditionalExpression = js.native
}
