package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.ExpressionExtra
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAsExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSAsExpressionBuilder extends StObject {
  
  def apply(expression: ExpressionKind, typeAnnotation: TSTypeKind): TSAsExpression = js.native
  
  def from(params: ExpressionExtra): TSAsExpression = js.native
}
