package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.CommentsExpressionLoc
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.TypeAnnotationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeCastExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeCastExpressionBuilder extends StObject {
  
  def apply(expression: ExpressionKind, typeAnnotation: TypeAnnotationKind): TypeCastExpression = js.native
  
  def from(params: CommentsExpressionLoc): TypeCastExpression = js.native
}
