package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.ExpressionLoc
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.JSXEmptyExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXExpressionContainerBuilder extends StObject {
  
  def apply(expression: ExpressionKind): JSXExpressionContainer = js.native
  def apply(expression: JSXEmptyExpressionKind): JSXExpressionContainer = js.native
  
  def from(params: ExpressionLoc): JSXExpressionContainer = js.native
}
