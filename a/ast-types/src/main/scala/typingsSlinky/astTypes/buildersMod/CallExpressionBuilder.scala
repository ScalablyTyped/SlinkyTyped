package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Callee
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SpreadElementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.CallExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallExpressionBuilder extends StObject {
  
  def apply(callee: ExpressionKind, argumentsParam: js.Array[ExpressionKind | SpreadElementKind]): CallExpression = js.native
  
  def from(params: Callee): CallExpression = js.native
}
