package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Blocks
import typingsSlinky.astTypes.kindsMod.ComprehensionBlockKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComprehensionExpressionBuilder extends StObject {
  
  def apply(body: ExpressionKind, blocks: js.Array[ComprehensionBlockKind]): ComprehensionExpression = js.native
  def apply(body: ExpressionKind, blocks: js.Array[ComprehensionBlockKind], filter: ExpressionKind): ComprehensionExpression = js.native
  
  def from(params: Blocks): ComprehensionExpression = js.native
}
